package mvc

class Recipe {
    String category
    int preparationTime
    int cookingTime
    String difficulty
    int numPeople
    int stars

    static hasMany = [ingredients: Ingredient]

    static constraints = {
        category(blank: false, size: 50)
        preparationTime(min: 0, max: 1000)
        cookingTime(min: 0, max: 1000)
        difficulty(blank: false, size: 20)
        numPeople(min: 1, max: 100)
        stars(min: 1, max: 5)
    }
}
