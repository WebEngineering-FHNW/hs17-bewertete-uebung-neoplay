package mvc

// controller inspired by https://medium.com/@victortorres/create-your-first-grails-application-without-scaffold-7e4c85c76156
// and http://grails.asia/grails-tutorial-for-beginners-scaffolding/
// gsp doc: https://gsp.grails.org/latest/guide/index.html

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
        [rec: rec]
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