<!doctype html>
<html>
    <head>
        <title><g:if env="development">Grails Runtime Exception</g:if><g:else>Kochbuch APP - Error</g:else></title>
        <meta name="layout" content="main">
        <g:if env="development"><asset:stylesheet src="errors.css"/></g:if>
    </head>
    <body>
        <g:if env="development">
            <g:if test="${Throwable.isInstance(exception)}">
                <g:renderException exception="${exception}" />
            </g:if>
            <g:elseif test="${request.getAttribute('javax.servlet.error.exception')}">
                <g:renderException exception="${request.getAttribute('javax.servlet.error.exception')}" />
            </g:elseif>
            <g:else>
                <div class="alert alert-danger">
                    An error has occurred<br/>
                    Exception: ${exception}<br/>
                    Message: ${message}<br/>
                    Path: ${path}
                </div>
            </g:else>
        </g:if>
        <g:else>
            <div class="alert alert-danger">
               An error has occurred
            </div>
        </g:else>
    </body>
</html>
