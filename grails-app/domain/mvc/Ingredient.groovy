package mvc

class Ingredient {
    BigDecimal quantity
    String unit
    String name
    boolean deleted

    static transients = ['deleted']

    static hasOne = [recipe: Recipe]

    static constraints = {
        quantity(scale: 6, range:0..1000)
        unit(blank: false)
        name(blank: false)
    }
}
