package mvc

class RecipeController {

    // Show all (Frontend)
    def index() {

    }

    // Show one (Frontend)
    def view() {

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