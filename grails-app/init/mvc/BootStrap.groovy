package mvc

import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        if (Environment.current == Environment.PRODUCTION) {
            return
        }

        // Dessert: Zwetschgenwähe
        Recipe r001 = save(new Recipe(category: "Dessert", photo: "001.jpg", title: "Zwetschgenwähe",
                preparationTime: 30, cookingTime: 45, difficulty: "mittel",
                numPeople: 8, stars: 4, preparation: "Für die Zwetschgenwähe Mehl und Butter verbröseln, salzen, nach und nach Wasser beigeben und zu einem Teig verarbeiten.\r\n\r\nTeig dünn auswallen und auf ein gefettetes Blech oder Springform legen.\r\n\r\nDanach die Zwetschgen halbieren und die Kerne entfernen und mit der Schnittfläche nach oben auf den Teig legen.\r\n\r\nDie Löffelbiskuits fein reiben und auf dem Teig über den Zwetschgenstücken verteilen.\r\n\r\nFür den Guss den Schlagrahm, Milch, Eier, Puderzucker, Vanillezucker und Mehl verrühren und über die Wähe giessen.\r\n\r\nIm vorgeheizten Backofen bei 170 Grad etwa 45 Minuten backen."))
        save(new Ingredient(quantity: new BigDecimal(80), unit: "g", name: "Butter", recipe: r001))
        save(new Ingredient(quantity: new BigDecimal(5), unit: "Stk", name: "Löffelbiskuits", recipe: r001))
        save(new Ingredient(quantity: new BigDecimal(200), unit: "g", name: "Mehl", recipe: r001))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "Prise", name: "Salz", recipe: r001))
        save(new Ingredient(quantity: new BigDecimal(100), unit: "ml", name: "Wasser", recipe: r001))
        save(new Ingredient(quantity: new BigDecimal(500), unit: "g", name: "Zwetschgen", recipe: r001))
        save(new Ingredient(quantity: new BigDecimal(2), unit: "Stk", name: "Eier", recipe: r001))
        save(new Ingredient(quantity: new BigDecimal(2), unit: "EL", name: "Mehl", recipe: r001))
        save(new Ingredient(quantity: new BigDecimal(200), unit: "ml", name: "Milch", recipe: r001))
        save(new Ingredient(quantity: new BigDecimal(60), unit: "g", name: "Puderzucker", recipe: r001))
        save(new Ingredient(quantity: new BigDecimal(200), unit: "g", name: "Schlagrahm", recipe: r001))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "Pk", name: "Vanillezucker", recipe: r001))

        // Hauptspeise (vegetarisch): Älpler Makronen
        Recipe r002 = save(new Recipe(category: "Hauptspeise (vegetarisch)", photo: "002.jpg", title: "Älpler Makronen",
                preparationTime: 15, cookingTime: 40, difficulty: "einfach",
                numPeople: 4, stars: 5, preparation: "Die Kartoffeln schälen und grob raspeln. Die Maccaroni in Salzwasser kochen und mit den Kartoffeln vermischen.\r\n\r\nÖl in einer Pfanne erhitzen und die Masse unter leichtem schwenken goldbraun anbraten. Den Käse reiben und unterrühren.\r\n\r\nAlles mit Pfeffer, Salz und Muskatnuss abschmecken und mit Salat servieren."))
        save(new Ingredient(quantity: new BigDecimal(500), unit: "g", name: "Kartoffel", recipe: r002))
        save(new Ingredient(quantity: new BigDecimal(80), unit: "g", name: "Käse", recipe: r002))
        save(new Ingredient(quantity: new BigDecimal(180), unit: "g", name: "Maccaroni", recipe: r002))
        save(new Ingredient(quantity: new BigDecimal(2), unit: "EL", name: "Öl", recipe: r002))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "Prise", name: "Salz & Pfeffer", recipe: r002))

        // Hauptspeise (Fleisch): Schweizer Wurstsalat
        Recipe r003 = save(new Recipe(category: "Hauptspeise (Fleisch)", photo: "003.jpg", title: "Schweizer Wurstsalat",
                preparationTime: 15, cookingTime: 0, difficulty: "einfach",
                numPeople: 4, stars: 3, preparation: "Für die Wurstsalat-Marinade Essig, Öl, Salz und Pfeffer in eine Schüssel geben und verrühren.\r\n\r\nDie Zwiebel schälen und fein würfeln, in die Marinade geben und mit Salz und Pfeffer kräftig würzen.\r\n\r\nDanach die Wurst schälen in kleine feine Streifen (oder Stücke) schneiden. Den Käse auch schneiden, mit der Wurst und der Marinade vermischen.\r\n\r\nDie Gurken in kleine Stücke schneiden und zum Wurstsalat hinzufügen.\r\n\r\nNochmals alles gut durchmischen und im Kühlschrank mindestens 1 Stunde durchziehen lassen."))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "kg", name: "Cervalat (Wurst)", recipe: r003))
        save(new Ingredient(quantity: new BigDecimal(150), unit: "g", name: "Emmentaler", recipe: r003))
        save(new Ingredient(quantity: new BigDecimal(2), unit: "Tasse", name: "Essig", recipe: r003))
        save(new Ingredient(quantity: new BigDecimal(2), unit: "Stk", name: "Essiggurken", recipe: r003))
        save(new Ingredient(quantity: new BigDecimal(2), unit: "EL", name: "Öl", recipe: r003))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "Prise", name: "Salz & Pfeffer", recipe: r003))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "Stk", name: "Zwiebel", recipe: r003))

        // Suppe: Kürbissuppe
        Recipe r004 = save(new Recipe(category: "Suppe", photo: "004.jpg", title: "Kürbissuppe",
                preparationTime: 15, cookingTime: 30, difficulty: "mittel",
                numPeople: 2, stars: 4, preparation: "Für die cremige Kürbissuppe den Kürbis schälen und in Würfel schneiden. Die Kartoffeln roh fein raspeln.\r\n\r\nDanach die Zwiebel schälen und fein hacken und in einem grossen Topt in erhitzter Butter glasig anschwitzen. Den Kürbis, fein geraspelte Kartoffel, sowie die Knoblauchzehen beigeben und mit Wasser aufgiessen und etwa 30 Minuten köcheln lassen.\r\n\r\nAbschliessend die Kürbissuppe mit einem Mixstab pürieren und mit Salz würzen. Zuletzt die Sauermilch unterrühren, kurz aufkochen und anrichten."))
        save(new Ingredient(quantity: new BigDecimal(20), unit: "g", name: "Butter", recipe: r004))
        save(new Ingredient(quantity: new BigDecimal(2), unit: "Stk", name: "Kartoffel, geraspelt", recipe: r004))
        save(new Ingredient(quantity: new BigDecimal(3), unit: "Stk", name: "Knoblauchzehen, geschält", recipe: r004))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "Stk", name: "Kürbis (ca. 1 kg)", recipe: r004))
        save(new Ingredient(quantity: new BigDecimal(10), unit: "g", name: "Kürbiskerne, geröstet", recipe: r004))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "Prise", name: "Liebstöckel, gehackt", recipe: r004))
        save(new Ingredient(quantity: new BigDecimal(150), unit: "g", name: "Sauermilch", recipe: r004))
        save(new Ingredient(quantity: new BigDecimal(400), unit: "ml", name: "Wasser", recipe: r004))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "Stk", name: "Zwiebel", recipe: r004))

        // Hauptspeise (Fleisch): Berner Rösti
        Recipe r005 = save(new Recipe(category: "Hauptspeise (Fleisch)", photo: "005.jpg", title: "Berner Rösti",
                preparationTime: 45, cookingTime: 20, difficulty: "mittel",
                numPeople: 4, stars: 3, preparation: "Für die Berner Rösti zuerst die Kartoffeln im Salzwasser bissfest kochen, abgiessen, abschrecken und schälen. In einen Topf geben, zudecken und über Nacht ruhen lassen.\r\n\r\nAm nächsten Tag die Kartoffeln auf der groben Seite einer Röstiraffel raspeln.\r\n\r\nNun den würfelig geschnittenen Speck in einer Pfanne auslassen. Die gerspalten Kartoffeln hineingeben und unter Rühren anbraten, bis die Raspel leicht braun sind. Diese mit einem Pfannenwender zu einem Kuchen formen.\r\n\r\nDanach 2 EL Milch über die Rösti träufeln lassen und die Herdplatte auf die kleinste Stufe zurück drehen. Die Röstioberseite mit Teller abdecken und für etwa 15-20 Minuten eine knusprige Kruste anbraten lassen. Wer es rundum knusprig mag, einfach nach 10 Minunten den Rösti einmal wenden.\r\n\r\nMit Hilfe eines grossen Tellers die Rösti wenden, weiter braten, bis auch die Unterseite goldbraun ist. Rösti aus der Pfanne geben und auf eine Platte stürzen und heiss servieren."))
        save(new Ingredient(quantity: new BigDecimal(800), unit: "g", name: "Kartoffeln (fest kochend)", recipe: r005))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "Prise", name: "Salz", recipe: r005))
        save(new Ingredient(quantity: new BigDecimal(150), unit: "g", name: "Speck", recipe: r005))

        // Vorspeise: Schinkengipfeli
        Recipe r006 = save(new Recipe(category: "Vorspeise", photo: "006.jpg", title: "Schinkengipfeli",
                preparationTime: 20, cookingTime: 25, difficulty: "mittel",
                numPeople: 4, stars: 2, preparation: "Für die Schinkengipfeli Zwiebel und gewaschenen Peterli fein hacken und in einer Pfanne mit einem Esslöffel Butter anschwitzen.\r\n\r\nSchinken würfelig schneiden und in eine Schüssel geben. Die Zwiebel-Peterli-Mischung beigeben und mit Salz, Pfeffer, Senf und Rahm gut vermengen.\r\n\r\nDen ausgerollten Blätterteig in gleichmässige Dreiecke schneiden, mit der Fülle bestreichen und gut einrollen.\r\n\r\nDie Gipfeli auf ein mit Backpapier belegtes Blech geben und mit Eigelb bepinseln.\r\n\r\nIm vorgeheizten Backrohr bei 190 °C (Ober-Unterhitze) etwa 25 Minuten backen."))
        save(new Ingredient(quantity: new BigDecimal(400), unit: "g", name: "Blätterteig", recipe: r006))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "EL", name: "Butter", recipe: r006))
        save(new Ingredient(quantity: new BigDecimal(2), unit: "Stk", name: "Eigelb, zum Bestreichen", recipe: r006))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "Bund", name: "Peterli", recipe: r006))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "Prise", name: "Pfeffer & Salz", recipe: r006))
        save(new Ingredient(quantity: new BigDecimal(2), unit: "EL", name: "Sauerrahm", recipe: r006))
        save(new Ingredient(quantity: new BigDecimal(200), unit: "g", name: "Schinken, würzig", recipe: r006))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "TL", name: "Senf", recipe: r006))
        save(new Ingredient(quantity: new BigDecimal(2), unit: "Stk", name: "Zwiebel", recipe: r006))

        // Getränk: Erdbeer-Rhabarber-Bowle
        Recipe r007 = save(new Recipe(category: "Getränk", photo: "007.jpg", title: "Erdbeer-Rhabarber-Bowle",
                preparationTime: 15, cookingTime: 0, difficulty: "einfach",
                numPeople: 20, stars: 3, preparation: "Erdbeeren waschen, putzen und je nach Größe vierteln oder halbieren. Die Erdbeerstücke in ein Bowlegefäß füllen. Zitronensäure, Vanillin-Zucker, Zucker und Wein dazugeben und mind. 2 Std. kalt stellen.\r\n\r\nDen Ansatz mit Rhabarbernektar und Sekt oder Prosecco aufgießen. Die Bowle kalt servieren."))
        save(new Ingredient(quantity: new BigDecimal(1), unit: "kg", name: "Erdbeeren", recipe: r007))
        save(new Ingredient(quantity: new BigDecimal(2), unit: "Pk", name: "Zitronensäure", recipe: r007))
        save(new Ingredient(quantity: new BigDecimal(4), unit: "Pk", name: "Vanillin-Zucker", recipe: r007))
        save(new Ingredient(quantity: new BigDecimal(60), unit: "g", name: "Zucker", recipe: r007))
        save(new Ingredient(quantity: new BigDecimal(7.5), unit: "dl", name: "Weisswein", recipe: r007))
        save(new Ingredient(quantity: new BigDecimal(1.5), unit: "l", name: "Rhabarbernektar", recipe: r007))
        save(new Ingredient(quantity: new BigDecimal(7.5), unit: "dl", name: "Sekt oder Prosecco", recipe: r007))

    }

    static save(domainObject) {
        domainObject.save(failOnError: true)
    }

    def destroy = {
    }
}
