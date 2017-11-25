package mvc

import org.springframework.dao.DataIntegrityViolationException

// controller inspired by http://grails.asia/grails-tutorial-for-beginners-scaffolding/

class RecipeController {

    // Show all (Frontend)
    def index() {
        def recs = Recipe.list()
        [recs: recs]
    }

    // Show one (Frontend)
    def view() {
        def rec = Recipe.get(params.id)

        // split content of textarea every two linebreaks
        // EXTERNAL https://stackoverflow.com/questions/31608678/javaandroid-how-to-i-split-a-string-by-every-two-line-breaks
        def preparationArr = rec.preparation.split("\\r\\n\\r\\n|\\n\\n")

        [rec: rec, preparationArr: preparationArr]
    }

    // Show all (Backend)
    def list() {
        def recs = Recipe.list()
        [recs: recs]
    }

    // Add (Backend)
    def add() {
        def rec = new Recipe(params)

        if(request.post) {
            if (rec.save(flush: true)) {
                flash.success = "Rezept erfolgreich gespeichert"
                redirect(action: "list")
            }
        }

        render(view: "form", model: [rec: rec])
    }

    // Edit (Backend)
    def edit() {
        def rec = Recipe.get(params.id)
        if (!rec) {
            flash.danger = "Rezept nicht gefunden"
            redirect(action: "list")
        }

        if(request.post) {
            // merge
            rec.properties = params
            // remove ingredients
            rec.ingredients.eachWithIndex{ v,i ->
                if( params['ingredients[' + i + '].deleted'] == 'true' ) {
                    v.deleted = true
                }
            }
            rec.ingredients.removeAll{ it.deleted }
            // validate & persist
            if (rec.save(flush: true)) {
                flash.success = "Rezept erfolgreich gespeichert"
                redirect(action: "list")
            }
        }

        render(view: "form", model: [rec: rec])
    }

    // Delete (Backend)
    def delete() {
        def rec = Recipe.get(params.id)
        if (!rec) {
            flash.danger = "Rezept nicht gefunden"
        } else {
            try {
                rec.delete(flush: true)
                flash.success = "Rezept geloescht"
            } catch (DataIntegrityViolationException e) {
                flash.danger = "Rezept konnte nicht geloescht werden"
            }
        }
        redirect(action: "list")
    }
}