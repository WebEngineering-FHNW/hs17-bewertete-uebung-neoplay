package mvc

class Ingredient {
    BigDecimal quantity
    String unit
    String name

    static hasOne = [recipe: Recipe]

    static constraints = {
        quantity(scale: 6)
        unit(blank: false)
        name(blank: false)
    }
}
