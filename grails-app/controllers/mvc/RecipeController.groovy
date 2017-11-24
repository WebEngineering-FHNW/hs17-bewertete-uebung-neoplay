package mvc

// controller inspired by https://medium.com/@victortorres/create-your-first-grails-application-without-scaffold-7e4c85c76156
// gsp doc: https://gsp.grails.org/latest/guide/index.html

class RecipeController {

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

    // Add/Edit (Backend)
    def form() {
        def rec = Recipe.get(params.id)
        def categories = ["Vorspeise","Suppe","Salat","Snack","Hauptspeise (Fleisch)","Hauptspeise (vegetarisch)","Dessert","Getränk"]
        def difficulties = ["einfach","mittel","schwer"]
        def starsDropdown = [1:'\u2605\u2606\u2606\u2606\u2606',2:'\u2605\u2605\u2606\u2606\u2606',3:'\u2605\u2605\u2605\u2606\u2606',4:'\u2605\u2605\u2605\u2605\u2606',5:'\u2605\u2605\u2605\u2605\u2605']
        [rec: rec, categories: categories, difficulties: difficulties, starsDropdown: starsDropdown]
    }

    // Delete (Backend)
    def delete() {
        redirect(action: "list")
    }
}