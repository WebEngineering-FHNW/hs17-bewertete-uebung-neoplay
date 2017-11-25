<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>${rec.title} Rezept - Kochbuch APP</title>
</head>
<body>

    <div class="detail-img mb-4">
        <asset:image src="rezepte/${rec.photo}" alt="${rec.title}"/>
        <div class="img-stars">
            <g:each in="${[0,1,2,3,4]}" var="num">
                <i class="fa fa-star<g:if test="${rec.stars <= num}">-o</g:if>"></i>
            </g:each>
        </div>
    </div>

    <h3>${rec.title}</h3>
    <h6>${rec.category}</h6>

    <div class="row">
        <div class="col-6">
            <i class="fa fa-sign-language" title="Zubereitungszeit" data-toggle="tooltip"></i> ${rec.preparationTime} Min.
        </div>
        <div class="col-6">
            <i class="fa fa-fire" title="Kochzeit" data-toggle="tooltip"></i> ${rec.cookingTime} Min.
        </div>
    </div>
    <div class="row">
        <div class="col-6">
            <i class="fa fa-flash"></i> ${rec.difficulty}
        </div>
        <div class="col-6">
            <i class="fa fa-users"></i> ${rec.numPeople} Person<g:if test="${rec.numPeople != 1}">en</g:if>
        </div>
    </div>

    <h5 class="mt-4">Zutaten</h5>
    <g:if test="${rec.ingredients.size() > 0}">
        <table class="table table-sm zutaten">
            <tbody>
                <g:each in="${rec.ingredients}" var="ing">
                    <tr>
                        <td>${ing.quantity}</td>
                        <td>${ing.unit}</td>
                        <td>${ing.name}</td>
                    </tr>
                </g:each>
            </tbody>
        </table>
    </g:if>
    <g:else>
        <div class="alert alert-secondary">Keine Zutaten</div>
    </g:else>

    <g:if test="${preparationArr.size() > 0}">
        <h5 class="mt-4">Zubereitung</h5>
        <g:each in="${preparationArr}" var="step" status="cnt">
            <div class="step">${cnt+1}.</div> ${step}
            <div class="clearfix"></div>
        </g:each>
    </g:if>

    <a href="/" class="btn btn-outline-primary mt-4 mb-4"><i class="fa fa-chevron-left"></i> zurück</a>

</body>
</html>
