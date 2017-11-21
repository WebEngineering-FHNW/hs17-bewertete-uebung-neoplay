package mvc

import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        if (Environment.current == Environment.PRODUCTION) {
            return
        }

        // recipes
        Recipe r1 = save(new Recipe(category: "Vorspeise", photo: "example-1.jpg", title: "Lasagne", preparationTime: 10, cookingTime: 30, difficulty: "einfach", numPeople: 2, stars: 3, preparation: "blubb"))
        Recipe r2 = save(new Recipe(category: "Hauptspeise", photo: "example-2.jpg", title: "Spaghetti", preparationTime: 35, cookingTime: 20, difficulty: "schwer", numPeople: 4, stars: 2, preparation: "blaaa"))

        // ingredients
        Ingredient i1 = save(new Ingredient(quantity: new BigDecimal(1), unit: "Stk", name: "Ei", recipe: r1))
        Ingredient i2 = save(new Ingredient(quantity: new BigDecimal(500), unit: "g", name: "Mehl", recipe: r1))
        Ingredient i3 = save(new Ingredient(quantity: new BigDecimal(375), unit: "ml", name: "Milch", recipe: r1))
        Ingredient i4 = save(new Ingredient(quantity: new BigDecimal(2.5), unit: "dl", name: "Rahm", recipe: r1))
        Ingredient i5 = save(new Ingredient(quantity: new BigDecimal(150), unit: "g", name: "Zucker", recipe: r2))
        Ingredient i6 = save(new Ingredient(quantity: new BigDecimal(755), unit: "ml", name: "Wasser", recipe: r2))

    }

    static save(domainObject) {
        domainObject.save(failOnError: true)
    }

    def destroy = {
    }
}
