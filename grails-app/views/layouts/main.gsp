<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Kochbuch APP"/>
    </title>

    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>
<body>

    <nav class="navbar sticky-top navbar-dark bg-dark mb-3">
        <a class="navbar-brand" href="/">
            <asset:image src="kochbuch-logo.svg" alt="Kochbuch APP"/>
            <span>Kochbuch APP</span>
        </a>
        <span class="navbar-text">
            <a href="/recipe/list" class="btn btn-outline-secondary"><i class="fa fa-cog"></i></a>
            <a href="#" class="btn btn-outline-warning" data-toggle="modal" data-target="#searchModal"><i class="fa fa-search"></i></a>
        </span>
    </nav>

    <div class="container-fluid">

        <g:layoutBody/>

    </div>

    <!-- Modal -->
    <div class="modal fade" id="searchModal" tabindex="-1">
        <div class="modal-dialog">
            <form action="/" method="get">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Suche nach Rezept-Name</h5>
                        <button type="button" class="close" data-dismiss="modal">
                            <span>&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <input type="text" name="search" placeholder="Suche nach..." class="form-control">
                    </div>
                    <div class="modal-footer flex-start">
                        <button type="submit" class="btn btn-warning"><i class="fa fa-search"></i> Suche starten</button>
                    </div>
                </div>
            </form>
        </div>
    </div>

    <asset:javascript src="application.js"/>

</body>
</html>
