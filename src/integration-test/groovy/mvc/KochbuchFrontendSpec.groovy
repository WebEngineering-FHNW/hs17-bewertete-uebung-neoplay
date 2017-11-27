package mvc

import grails.test.mixin.integration.Integration

import geb.spock.*

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class KochbuchFrontendSpec extends GebSpec {

    void "application has started"() {
        when:"The home page is visited"
            go '/'
        then:"The title is 'Leckere Rezepte - Kochbuch APP'"
            title == "Leckere Rezepte - Kochbuch APP"
    }

    void "loading recipes on index"() {
        when:"The home page is visited"
            go '/'
        then:"There should be 4 recipies"
            $("#recipeContainer").size() == 1
            $("#recipeContainer").children().size() == 4
    }

    // TODO make this unit test working
    /*void "loading more recipes (AJAX)"() {
        when:"The 'load more' button is clicked"
            go '/'
            $('[data-action="load-more"]').click();
        then:"There should now be 7 recipes"
            waitFor { $("body").hasClass('gebAjaxCompleted') }
            $("#recipeContainer").children().size() == 7
    }*/

    void "visit recipe details"() {
        when:"The third recipe is viewed"
            go '/'
            $('.card-body > a')[2].click()
        then:"Recipe 'Schweizer Wurstsalat' should be visible"
            title == 'Schweizer Wurstsalat Rezept - Kochbuch APP'
            $('h3')[0].text() == 'Schweizer Wurstsalat'
            $('h6')[0].text() == 'Hauptspeise (Fleisch)'
            $('table.zutaten tr').size() == 7
        when:"Navigate back to home"
            $('a.btn.btn-outline-primary').click()
        then:"display homepage"
            title == "Leckere Rezepte - Kochbuch APP"
    }

}