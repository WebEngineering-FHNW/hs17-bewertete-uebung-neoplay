<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Kochbuch APP - Backend - Form</title>
</head>
<body>

    <h3>Rezept erfassen/bearbeiten</h3>

    <form action="/admin/form" method="post" class="mb-3">
        <div class="form-group">
            <label for="titel">Titel</label>
            <input type="text" class="form-control" id="titel" name="titel">
        </div>
        <div class="form-group">
            <label for="kategorie">Kategorie</label>
            <select class="form-control" id="kategorie" name="kategorie">
                <option value="Vorspeise">Vorspeise</option>
                <option value="Hauptspeise">Hauptspeise</option>
                <option value="Dessert">Dessert</option>
            </select>
        </div>
        <div class="form-group">
            <label for="zubereitungszeit">Zubereitungszeit</label>
            <div class="input-group">
                <input type="number" class="form-control" id="zubereitungszeit" name="zubereitungszeit">
                <div class="input-group-addon">Min.</div>
            </div>
        </div>
        <div class="form-group">
            <label for="kochzeit">Kochzeit</label>
            <div class="input-group">
                <input type="number" class="form-control" id="kochzeit" name="kochzeit">
                <div class="input-group-addon">Min.</div>
            </div>
        </div>
        <div class="form-group">
            <label for="schwierigkeit">Schwierigkeit</label>
            <select class="form-control" id="schwierigkeit" name="schwierigkeit">
                <option value="einfach">einfach</option>
                <option value="mittel">mittel</option>
                <option value="schwer">schwer</option>
            </select>
        </div>
        <div class="form-group">
            <label for="personen">Anzahl Personen</label>
            <input type="number" class="form-control" id="personen" name="personen">
        </div>
        <div class="form-row">
            <div class="form-group col-3 mb-0">
                <label>Menge</label>
            </div>
            <div class="form-group col-3 mb-0">
                <label>Einheit</label>
            </div>
            <div class="form-group col-6 mb-0">
                <label>Zutat</label>
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-3">
                <input type="number" class="form-control">
            </div>
            <div class="form-group col-3">
                <select class="form-control">
                    <optgroup label="Gramm">
                        <option value="g">g</option>
                        <option value="kg">kg</option>
                    </optgroup>
                    <optgroup label="Löffel">
                        <option value="EL">EL</option>
                        <option value="TL">TL</option>
                        <option value="Prise">Prise</option>
                    </optgroup>
                    <optgroup label="Liter">
                        <option value="ml">ml</option>
                        <option value="cl">cl</option>
                        <option value="dl">dl</option>
                        <option value="l">l</option>
                    </optgroup>
                </select>
            </div>
            <div class="form-group col-6">
                <input type="text" class="form-control">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-3">
                <input type="number" class="form-control">
            </div>
            <div class="form-group col-3">
                <select class="form-control">
                    <optgroup label="Gramm">
                        <option value="g">g</option>
                        <option value="kg">kg</option>
                    </optgroup>
                    <optgroup label="Löffel">
                        <option value="EL">EL</option>
                        <option value="TL">TL</option>
                        <option value="Prise">Prise</option>
                    </optgroup>
                    <optgroup label="Liter">
                        <option value="ml">ml</option>
                        <option value="cl">cl</option>
                        <option value="dl">dl</option>
                        <option value="l">l</option>
                    </optgroup>
                </select>
            </div>
            <div class="form-group col-6">
                <input type="text" class="form-control">
            </div>
        </div>
        <div class="form-group">
            <label for="zubereitung">Zubereitung</label>
            <textarea class="form-control" id="zubereitung" name="zubereitung" rows="8"></textarea>
            <small class="form-text text-muted">Zwei Zeilenumbrüche entspricht einem Zubereitungsschritt</small>
        </div>
        <div class="form-group">
            <label for="bewertung">Bewertung</label>
            <select class="form-control" id="bewertung" name="bewertung">
                <option value="1">&#9733;&#9734;&#9734;&#9734;&#9734;</option>
                <option value="2">&#9733;&#9733;&#9734;&#9734;&#9734;</option>
                <option value="3">&#9733;&#9733;&#9733;&#9734;&#9734;</option>
                <option value="4">&#9733;&#9733;&#9733;&#9733;&#9734;</option>
                <option value="5">&#9733;&#9733;&#9733;&#9733;&#9733;</option>
            </select>
        </div>
        <button type="submit" class="btn btn-block btn-primary">Speichern</button>
    </form>

    <p>
        <a href="/admin" class="btn btn-outline-primary"><i class="fa fa-chevron-left"></i> zurück</a>
    </p>

</body>
</html>
