<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Kochbuch APP - Frontend - Übersicht</title>
</head>
<body>

    <div class="row">
        <div class="col-sm-12 col-md-6 col-lg-4">
            <div class="card mb-3">
                <a href="/details">
                    <asset:image src="rezepte/example-1.jpg" class="card-img-top" alt="Card image cap"/>
                </a>
                <div class="img-stars">
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star-o"></i>
                    <i class="fa fa-star-o"></i>
                </div>
                <div class="card-body">
                    <h4><a href="/details">Rezepttitel</a></h4>
                    <h6>Kategorie</h6>
                    <div class="row">
                        <div class="col-6">
                            <p><i class="fa fa-clock-o"></i> 25 Min.</p>
                        </div>
                        <div class="col-6">
                            <p><i class="fa fa-clock-o"></i> 30 Min.</p>
                        </div>
                    </div>
                    <a href="/details" class="btn btn-outline-primary">Zum Rezept</a>
                </div>
            </div>
        </div>
    </div>

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
