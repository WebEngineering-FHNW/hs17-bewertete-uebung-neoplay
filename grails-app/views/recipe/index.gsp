<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Leckere Rezepte - Kochbuch APP</title>
</head>
<body>

    <g:if test="${params.search}">
        <div class="alert alert-warning">
            <span class="float-right"><a href="/" class="text-warning">alle anzeigen</a></span>
            Suche nach '${raw(params.search)}'
        </div>
    </g:if>

    <div class="row" id="recipeContainer">
        <g:render template="recipe_box" collection="${recs}" var="rec" />
    </div>

    <div class="spinner">
        <div class="rect1"></div>
        <div class="rect2"></div>
        <div class="rect3"></div>
        <div class="rect4"></div>
        <div class="rect5"></div>
    </div>

    <a href="javascript:void(0);" class="btn btn-outline-primary btn-block" data-action="load-more">MEHR LADEN <i class="fa fa-chevron-down"></i></a>

    <br>

</body>
</html>
