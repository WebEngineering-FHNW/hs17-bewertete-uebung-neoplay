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

    }

    // Add/Edit (Backend)
    def form() {

    }

    // Delete (Backend)
    def delete() {
        redirect(action: "list")
    }
}