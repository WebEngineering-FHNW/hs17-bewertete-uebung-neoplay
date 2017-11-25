<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Leckere Rezepte - Kochbuch APP</title>
</head>
<body>

    <div class="row">
        <g:each in="${recs}" var="rec">
            <div class="col-sm-12 col-md-6 col-lg-4">
                <div class="card mb-3">
                    <a href="/recipe/view?id=${rec.id}">
                        <asset:image src="rezepte/${rec.photo}" class="card-img-top" alt="${rec.title}"/>
                    </a>
                    <div class="img-stars">
                        <g:each in="${[0,1,2,3,4]}" var="num">
                            <i class="fa fa-star<g:if test="${rec.stars <= num}">-o</g:if>"></i>
                        </g:each>
                    </div>
                    <div class="card-body">
                        <h4><a href="/recipe/view?id=${rec.id}">${rec.title}</a></h4>
                        <h6>${rec.category}</h6>
                        <div class="row">
                            <div class="col-6">
                                <p><i class="fa fa-sign-language" title="Zubereitungszeit" data-toggle="tooltip"></i> ${rec.preparationTime} Min.</p>
                            </div>
                            <div class="col-6">
                                <p><i class="fa fa-fire" title="Kochzeit" data-toggle="tooltip"></i> ${rec.cookingTime} Min.</p>
                            </div>
                        </div>
                        <a href="/recipe/view?id=${rec.id}" class="btn btn-outline-primary">Zum Rezept</a>
                    </div>
                </div>
            </div>
        </g:each>
    </div>

    <%-- TODO load more --%>

    <div class="spinner">
        <div class="rect1"></div>
        <div class="rect2"></div>
        <div class="rect3"></div>
        <div class="rect4"></div>
        <div class="rect5"></div>
    </div>

    <a href="#" class="btn btn-outline-primary btn-block">MEHR LADEN <i class="fa fa-chevron-down"></i></a>

</body>
</html>
