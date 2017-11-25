<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Backend - Kochbuch APP</title>
</head>
<body>

    <h3>Rezept ${actionName == 'add' ? 'erfassen' : 'bearbeiten'}</h3>

    <g:hasErrors bean="${rec}">
        <div class="alert alert-danger">
            <ul>
                <g:eachError var="error" bean="${rec}">
                    <li><g:message error="${error}"/></li>
                </g:eachError>
            </ul>
        </div>
    </g:hasErrors>

    <form action="" method="POST" class="mb-3" enctype="multipart/form-data">
        <div class="form-group">
            <label for="title">Titel</label>
            <g:textField name="title" id="title" class="form-control ${hasErrors(bean: rec, field: 'title', 'is-invalid')}" value="${rec.title}"/>
        </div>
        <div class="form-group">
            <label for="category">Kategorie</label>
            <g:select name="category" id="category" class="form-control ${hasErrors(bean: rec, field: 'category', 'is-invalid')}" from="${rec.constrainedProperties.category.inList}" value="${rec.category}" />
        </div>
        <div class="form-group">
            <label for="preparationTime">Zubereitungszeit</label>
            <mvc:timeField id="preparationTime" name="preparationTime" class="form-control ${hasErrors(bean: rec, field: 'preparationTime', 'is-invalid')}" value="${rec.preparationTime}" min="0" max="1000" />
        </div>
        <div class="form-group">
            <label for="cookingTime">Kochzeit</label>
            <mvc:timeField id="cookingTime" name="cookingTime" class="form-control ${hasErrors(bean: rec, field: 'cookingTime', 'is-invalid')}" value="${rec.cookingTime}" min="0" max="1000" />
        </div>
        <div class="form-group">
            <label for="difficulty">Schwierigkeit</label>
            <g:select name="difficulty" id="difficulty" class="form-control ${hasErrors(bean: rec, field: 'difficulty', 'is-invalid')}" from="${rec.constrainedProperties.difficulty.inList}" value="${rec.difficulty}" />
        </div>
        <div class="form-group">
            <label for="numPeople">Anzahl Personen</label>
            <mvc:numericField id="numPeople" name="numPeople" class="form-control ${hasErrors(bean: rec, field: 'numPeople', 'is-invalid')}" value="${rec.numPeople}" min="0" max="100" />
        </div>
        <h5>Zutaten</h5>
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
        <g:each in="${rec.ingredients}" var="ing" status="i">
            <div class="form-row">
                <g:hiddenField name='ingredients[${i}].id' value='${ing.id}'/>
                <div class="form-group col-3">
                    <input type="text" name="ingredients[${i}].quantity" class="form-control" value="<g:formatNumber number="${ing.quantity}" format="0.#" />"/>
                </div>
                <div class="form-group col-3">
                    <select class="form-control" name="ingredients[${i}].unit">
                        <optgroup label="Gramm">
                            <option value="g" ${ing.unit.equals("g") ? "selected='selected'" : ""}>g</option>
                            <option value="kg" ${ing.unit.equals("kg") ? "selected='selected'" : ""}>kg</option>
                        </optgroup>
                        <optgroup label="Löffel">
                            <option value="EL" ${ing.unit.equals("EL") ? "selected='selected'" : ""}>EL</option>
                            <option value="TL" ${ing.unit.equals("TL") ? "selected='selected'" : ""}>TL</option>
                            <option value="Prise" ${ing.unit.equals("Prise") ? "selected='selected'" : ""}>Prise</option>
                        </optgroup>
                        <optgroup label="Liter">
                            <option value="ml" ${ing.unit.equals("ml") ? "selected='selected'" : ""}>ml</option>
                            <option value="cl" ${ing.unit.equals("cl") ? "selected='selected'" : ""}>cl</option>
                            <option value="dl" ${ing.unit.equals("dl") ? "selected='selected'" : ""}>dl</option>
                            <option value="l" ${ing.unit.equals("l") ? "selected='selected'" : ""}>l</option>
                        </optgroup>
                        <optgroup label="Andere">
                            <option value="Stk" ${ing.unit.equals("Stk") ? "selected='selected'" : ""}>Stk</option>
                        </optgroup>
                    </select>
                </div>
                <div class="form-group col-6">
                    <div class="input-group">
                        <input type="text" class="form-control" name="ingredients[${i}].name" value="${ing.name}">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button" data-action="remove" data-index="${i}"><i class="fa fa-trash" title="Entfernen" data-toggle="tooltip"></i></button>
                        </span>
                    </div>
                </div>
            </div>
        </g:each>
        <div id="newIngredients"></div>
        <p><button class="btn btn-default" data-action="add" data-count="${rec.ingredients ? rec.ingredients.size() : 0}"><i class="fa fa-plus"></i> Neue Zutat</button></p>
        <div class="form-group">
            <label for="preparation">Zubereitung</label>
            <g:textArea class="form-control ${hasErrors(bean: rec, field: 'preparation', 'is-invalid')}" id="preparation" name="preparation" value="${rec.preparation}" rows="8"/>
            <small class="form-text text-muted">Zwei Zeilenumbrüche entspricht einem Zubereitungsschritt</small>
        </div>
        <div class="form-group">
            <label for="stars">Bewertung</label>
            <g:select name="stars" id="stars" class="form-control ${hasErrors(bean: rec, field: 'stars', 'is-invalid')}" from="${rec.constrainedProperties.stars.inList}" value="${rec.stars}" />
        </div>
        <div class="form-group">
            <input type="hidden" name="photo" value="${!rec.photo ? '_default.jpg' : rec.photo}"/>
            <label for="photoup">Neues Foto</label>
            <input type="file" name="photoup" id="photoup" class="form-control">
            <small class="form-text text-muted">Nur .jpg-Dateien, empfohlene Grösse 900 x 600 Pixel</small>
        </div>
        <button type="submit" class="btn btn-block btn-primary">Speichern</button>
    </form>

    <p>
        <a href="/recipe/list" class="btn btn-outline-primary"><i class="fa fa-chevron-left"></i> zurück</a>
    </p>

</body>
</html>
