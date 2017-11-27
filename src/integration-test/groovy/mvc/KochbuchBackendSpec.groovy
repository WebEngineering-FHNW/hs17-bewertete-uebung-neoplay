package mvc

import grails.test.mixin.integration.Integration

import geb.spock.*

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class KochbuchBackendSpec extends GebSpec {

    void "visit backend"() {
        when:"The 'settings' button is clicked"
            go '/'
            $('i.fa-cog').parent().click()
        then:"Redirect to backend"
            title == "Backend - Kochbuch APP"
            $('table.admin tr').size() == 7
    }

    void "add new recipe"() {
        when:"click on 'Neues Rezept'"
            go '/recipe/list'
            $('a.btn.btn-outline-primary').click()
        then:"redirect to 'add recipient' form"
            $('h3')[0].text() == "Rezept erfassen"
        when:"form is submitted"
            $('.container-fluid form').title = 'Test-Rezept'
            $('.container-fluid form').numPeople = 4
            $('.container-fluid form').preparation = 'Alle Zutaten gut verrühren.'
            $('.container-fluid form button.btn.btn-block.btn-primary[type="submit"]').click()
        then:"new recipe should be added"
            $('table.admin tr').size() == 8
    }

    void "edit recipe"() {
        when:"click on 'edit recipe'"
            go '/recipe/list'
            $('table.admin tr a.btn.btn-outline-secondary.btn-sm')[7].click()
        then:"redirect to 'edit recipient' form"
            $('h3')[0].text() == "Rezept bearbeiten"
        when:"form is submitted"
            $('.container-fluid form').title = 'Test-Rezept edited'
            $('.container-fluid form button.btn.btn-block.btn-primary[type="submit"]').click()
        then:"check edited recipe"
            $('table.admin tr').size() == 8
            $('table.admin tr td:first-child')[7].text() == 'Test-Rezept edited'
    }

    void "delete recipe"() {
        when:"click on 'delete recipe'"
            go '/recipe/list'
            $('table.admin tr a.btn.btn-outline-danger.btn-sm')[7].click()
        then:"recipe is deleted"
            $('table.admin tr').size() == 7
    }

}