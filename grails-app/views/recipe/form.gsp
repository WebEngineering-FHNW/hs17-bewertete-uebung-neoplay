<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Kochbuch APP - Backend - Form</title>
</head>
<body>

    <h3>Rezept erfassen/bearbeiten</h3>

    <g:form action="form" id="${rec.id}" class="mb-3">
        <div class="form-group">
            <label for="title">Titel</label>
            <g:textField name="title" id="title" class="form-control" value="${rec.title}"/>
        </div>
        <div class="form-group">
            <label for="category">Kategorie</label>
            <g:select name="category" id="category" class="form-control" from="${categories}" value="${rec.category}" />
        </div>
        <div class="form-group">
            <label for="zubereitungszeit">Zubereitungszeit</label>
            <mvc:timeField id="preparationTime" name="preparationTime" class="form-control" value="${rec.preparationTime}" min="0" max="1000" />
        </div>
        <div class="form-group">
            <label for="kochzeit">Kochzeit</label>
            <mvc:timeField id="cookingTime" name="cookingTime" class="form-control" value="${rec.cookingTime}" min="0" max="1000" />
        </div>
        <div class="form-group">
            <label for="difficulty">Schwierigkeit</label>
            <g:select name="difficulty" id="difficulty" class="form-control" from="${difficulties}" value="${rec.difficulty}" />
        </div>
        <div class="form-group">
            <label for="numPeople">Anzahl Personen</label>
            <mvc:numericField id="numPeople" name="numPeople" class="form-control" value="${rec.numPeople}" min="0" max="100" />
        </div>
        <%-- TODO zutaten --%>
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
            <label for="preparation">Zubereitung</label>
            <g:textArea class="form-control" id="zubereitung" name="zubereitung" value="${rec.preparation}" rows="8"/>
            <small class="form-text text-muted">Zwei Zeilenumbrüche entspricht einem Zubereitungsschritt</small>
        </div>
        <div class="form-group">
            <label for="stars">Bewertung</label>
            <g:select name="stars" id="stars" class="form-control" from="${starsDropdown}" optionKey="key" optionValue="value" value="${rec.stars}" />
        </div>
        <button type="submit" class="btn btn-block btn-primary">Speichern</button>
    </g:form>

    <p>
        <a href="/recipe/list" class="btn btn-outline-primary"><i class="fa fa-chevron-left"></i> zurück</a>
    </p>

</body>
</html>
