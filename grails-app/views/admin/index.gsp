<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Kochbuch APP - Backend - Übersicht</title>
</head>
<body>

    <h3>Rezepte verwalten</h3>
    <p><a href="/admin/form" class="btn btn-outline-primary"><i class="fa fa-plus"></i> Neues Rezept</a></p>

    <div class="alert alert-danger alert-dismissible fade show">
        Rezept gelöscht
        <button type="button" class="close" data-dismiss="alert">
            <span>&times;</span>
        </button>
    </div>

    <table class="table table-sm table-striped admin">
        <tbody>
        <tr>
            <td>Rezept 1</td>
            <td>Dessert</td>
            <td class="text-right">
                <a class="btn btn-outline-secondary btn-sm" href="/admin/form"><i class="fa fa-pencil"></i></a>
                <a class="btn btn-outline-danger btn-sm" href="/admin"><i class="fa fa-trash"></i></a>
            </td>
        </tr>
        <tr>
            <td>Rezept 2</td>
            <td>Hauptspeise</td>
            <td class="text-right">
                <a class="btn btn-outline-secondary btn-sm" href="/admin/form"><i class="fa fa-pencil"></i></a>
                <a class="btn btn-outline-danger btn-sm" href="/admin"><i class="fa fa-trash"></i></a>
            </td>
        </tr>
        </tbody>
    </table>

</body>
</html>
