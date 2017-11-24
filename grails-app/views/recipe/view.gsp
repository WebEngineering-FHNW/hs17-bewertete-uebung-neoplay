<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>${rec.title} Rezept - Kochbuch APP</title>
</head>
<body>

    <div class="detail-img mb-4">
        <asset:image src="rezepte/${rec.photo}" class="img-fluid" alt="${rec.title}"/>
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
            <i class="fa fa-sign-language"></i> ${rec.preparationTime} Min.
        </div>
        <div class="col-6">
            <i class="fa fa-fire"></i> ${rec.cookingTime} Min.
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

    <h5 class="mt-4">Zubereitung</h5>

    <%-- TODO linebreaks replacen mit step --%>
    ${rec.preparation}

    <div class="step">1.</div> Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet.
    <div class="clearfix"></div>

    <div class="step">2.</div> At vero eos et accusam et justo duo dolores et ea rebum.
    <div class="clearfix"></div>

    <div class="step">3.</div> No sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.
    <div class="clearfix"></div>

    <a href="/" class="btn btn-outline-primary mt-4 mb-4"><i class="fa fa-chevron-left"></i> zurück</a>


</body>
</html>
