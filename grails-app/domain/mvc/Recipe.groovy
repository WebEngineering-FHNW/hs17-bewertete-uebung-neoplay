package mvc

class Recipe {
    String category
    String title
    String photo
    int preparationTime
    int cookingTime
    String difficulty
    int numPeople
    int stars
    String preparation

    static hasMany = [ingredients: Ingredient]

    static mapping = {
        preparation(type: 'text')
    }

    static constraints = {
        title(blank: false)
        photo(blank: true)
        category(blank: false, inList: ["Vorspeise","Suppe","Salat","Snack","Hauptspeise (Fleisch)","Hauptspeise (vegetarisch)","Dessert","Getränk"])
        preparationTime(range: 0..1000)
        cookingTime(range: 0..1000)
        difficulty(blank: false, inList: ["einfach","mittel","schwer"])
        numPeople(range:1..100)
        stars(min: 1, max: 5, inList: [1,2,3,4,5])
        preparation(blank: true) // widget: 'textarea'
    }
}
