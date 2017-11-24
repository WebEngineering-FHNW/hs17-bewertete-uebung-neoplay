package mvc

// Author: Urs Gürtler (urs.guertler@students.fhnw.ch)

class KochbuchTagLib {

    static defaultEncodeAs = 'raw'
    static namespace = "mvc"

    def numericField = {attrs ->
        out << "<input type=\"number\" class=\"${attrs.class}\" id=\"${attrs.id}\" name=\"${attrs.name}\" value=\"${attrs.value}\" min=\"${attrs.min}\" max=\"${attrs.max}\">"
    }

    def timeField = {attrs ->
        out << "<div class=\"input-group\">"
        out << numericField(attrs)
        out << "<div class=\"input-group-addon\">Min.</div>"
        out << "</div>"
    }

}