<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Backend - Kochbuch APP</title>
</head>
<body>

    <h3>Rezepte verwalten</h3>
    <p><a href="/recipe/add" class="btn btn-outline-primary"><i class="fa fa-plus"></i> Neues Rezept</a></p>

    <g:if test="${flash.success}">
        <div class="alert alert-success alert-dismissible fade show">
            ${flash.success}
            <button type="button" class="close" data-dismiss="alert">
                <span>&times;</span>
            </button>
        </div>
    </g:if>

    <g:if test="${flash.danger}">
        <div class="alert alert-danger alert-dismissible fade show">
            ${flash.danger}
            <button type="button" class="close" data-dismiss="alert">
                <span>&times;</span>
            </button>
        </div>
    </g:if>

    <table class="table table-sm table-striped admin">
        <tbody>
            <g:each in="${recs}" var="rec">
                <tr>
                    <td>${rec.title}</td>
                    <td>${rec.category}</td>
                    <td class="text-right">
                        <a class="btn btn-outline-secondary btn-sm" href="/recipe/edit?id=${rec.id}"><i class="fa fa-pencil"></i></a>
                        <a class="btn btn-outline-danger btn-sm" href="/recipe/delete?id=${rec.id}"><i class="fa fa-trash"></i></a>
                    </td>
                </tr>
            </g:each>
        </tbody>
    </table>

</body>
</html>
