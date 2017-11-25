package mvc

// controller inspired by http://grails.asia/grails-tutorial-for-beginners-scaffolding/

class RecipeController {

    static categories = ["Vorspeise","Suppe","Salat","Snack","Hauptspeise (Fleisch)","Hauptspeise (vegetarisch)","Dessert","Getränk"]
    static difficulties = ["einfach","mittel","schwer"]
    static starsDropdown = [1:'\u2605\u2606\u2606\u2606\u2606',2:'\u2605\u2605\u2606\u2606\u2606',3:'\u2605\u2605\u2605\u2606\u2606',4:'\u2605\u2605\u2605\u2605\u2606',5:'\u2605\u2605\u2605\u2605\u2605']

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
        def preparationArr = rec.preparation.split("(\\r\\n|"+System.getProperty("line.separator")+")+")

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

        render(
            view: "form",
            model: [
                rec: rec,
                categories: categories,
                difficulties: difficulties,
                starsDropdown: starsDropdown
            ]
        )
    }

    // Edit (Backend)
    def edit() {
        def rec = Recipe.get(params.id)
        if (!rec) {
            flash.danger = "Rezept nicht gefunden"
            redirect(action: "list")
        }

        if(request.post) {
            rec.properties = params
            if (rec.save(flush: true)) {
                flash.success = "Rezept erfolgreich gespeichert"
                redirect(action: "list")
            }
        }

        render(
            view: "form",
            model: [
                rec: rec,
                categories: categories,
                difficulties: difficulties,
                starsDropdown: starsDropdown
            ]
        )
    }

    // Delete (Backend)
    def delete() {
        // TODO delete
        redirect(action: "list")
    }
}