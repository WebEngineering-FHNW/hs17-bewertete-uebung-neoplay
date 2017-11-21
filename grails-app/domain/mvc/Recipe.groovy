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
        category(blank: false)
        preparationTime(range: 0..1000)
        cookingTime(range: 0..1000)
        difficulty(blank: false)
        numPeople(range:1..100)
        stars(min: 1, max: 5)
        preparation(blank: true)
    }
}
