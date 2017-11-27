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

## Project delivery <to be filled by student>

**Vorbereitung**: Damit der Foto-Upload funktioniert, ist es momentan notwendig, einen Pfad in `grails-app/services/mvc/FileUploadService.groovy` anzupassen.

**Hinweis**: Die Applikation ist für Smartphones/Tablets optimiert. Bitte Fensterbreite reduzieren.

How to start the project: `grailsw run-app`

How to test the project: `grailsw test-app`

Project description: (if other than `/index.html`)

External contributions:

Other comments: 

I'm particular proud of:
* Dynamisches Hinzufügen von Zutaten im Formular (1:n)
* Foto-Upload bei Rezept
* Eigene TagLib für spezielle Formular-Felder

## Project grading 

< to be filled by lecturer >
