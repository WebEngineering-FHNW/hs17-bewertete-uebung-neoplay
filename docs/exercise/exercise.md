# WebEngineering Module, Graded Exercise

## Commit Proposal

Matriculation Number: 13-267-661

Project idea short description:

**Kochbuch-Webapp**  
Simple CRUD-Applikation mit 'Frontend' und 'Backend' (mobile first)  

Frontend
* Rezepte-Übersicht mit Rezeptname, Bild, Metadaten und Link zur Detail-Ansicht
* Mögliche Erweiterungen:
  * Suchfunktion nach Rezeptname
  * "Mehr laden"-Button (dynamisches Nachladen)
  * Mengen-Umrechner für Zutaten auf Rezept
* Detail-Ansicht mit Rezeptname, Bild, Metadaten, Zutaten-Liste und Zubereitung

Backend
* Add/Edit/Delete von Rezepten und deren Zutaten (1:n)
* Mögliche Erweiterungen:
  * Bild-Upload (ansonsten Auswahl einiger Default-Bilder)
  
Zusätzliche Abhängigkeiten: Bootstrap, jQuery

## Project confirmation

Confirmed.

Sounds delicious! Can't wait to see the bootstrap data :-)

## Project delivery

**Hinweis**: Die Applikation ist für Smartphones/Tablets optimiert. Bitte Fensterbreite reduzieren.

How to start the project: `grailsw run-app`

How to test the project: `grailsw test-app`

Project description: Auf [GitHub Pages](https://webengineering-fhnw.github.io/hs17-bewertete-uebung-neoplay/)

External contributions:

Other comments: 

I'm particular proud of:
* Dynamisches Nachladen weiterer Rezepte auf der Übersicht
* Dynamisches Hinzufügen von Zutaten im Formular (1:n)
* Foto-Upload bei Rezept
* Eigene TagLib für spezielle Formular-Felder

## Project grading 

Nice description HTML. Good use of semantic tags, minor warning in validator: article should come with a heading.
The program works very nicely. Great responsive design. Minor issue with file upload:
```
java.io.FileNotFoundException
Caused by
/var/folders/88/cz3jknpx4n52zb0wrnrqlyf00000gp/T/./grails-app/assets/images/rezepte/5a60cc09-bad6-48c9-af55-9ad3643e7891.jpg (No such file or directory)
Around line 33 of grails-app/services/mvc/FileUploadService.groovy
30:
31:        // Store file
32:        if (!file.isEmpty()) {
33:            file.transferTo(new File("${storagePath}/${name}"))
```
(this probably needs some config that I did not provide. Anyway, one should be more
defensive any time when it comes to file access.)

Functionality contains basic navigation (nicely hidden from the user for most part).
Recipe capture features user input and validation.
Validation is nicely interactive and comes with a popper.js bubble right at the point of violation.
Layout and loading is interactive.
Data management and CRUD features for a small domain (6) plus search (3).

Reasonable commit log over 4 days.
Good integration tests, unit tests are missing.
HTML is good.
Comments are sparse but the code is rather self-explaining.
Some views would profit from more comments, e.g. the template could list the used model/properties.
Controller comments could have used javadoc (groovydoc) comments instead of line commments.
Naming is ok.
Duplication is nicely resolved through the use of layout and template.
BTW: it is better to not to use markup inside markup as in list.gsp (13)
```
<i class="fa fa-star<g:if test="${rec.stars <= num}">-o</g:if>"></i>
                    ^^^^ 
```
but replace with function call - or in this case ternary ?: expression.

Dependency to fontawesome and popper.js is ok.

I award three extra points for the dynamic nature of the really well-designed, responsive UI.
Since we hit the ceiling anyway, I spare the work of grading more extra points.

Congratulations!
This is a piece of work that you can put into your portfolio when applying for a job.
Most professional web developers would find it difficult to achieve the same
"finish" within the given time constraints.

Grade: 6.0

P.S. I'll now try one of the recipes...