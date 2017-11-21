package mvc

class Ingredient {
    BigDecimal quantity
    String unit
    String name

    static hasOne = [recipe: Recipe]

    static constraints = {
        quantity(scale: 6)
        unit(blank: false, size: 20)
        name(blank: false, size: 2..50)
    }
}
