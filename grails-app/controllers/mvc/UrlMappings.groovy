package mvc

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/admin"(view:"/admin/index") // TODO: temp
        "/admin/form"(view:"/admin/form") // TODO: temp
        "/details"(view:"/details/index") // TODO: temp
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
