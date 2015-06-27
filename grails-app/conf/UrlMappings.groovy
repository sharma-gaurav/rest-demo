class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')

        "/api/customers"(resources: 'customer'){
            "/order"(resources: 'order')
        }


        //Versioning URL Based
//        "/v1/person"(resources:"person", namespace: "v1")
//        "/v2/person"(resources:"person", namespace: "v2")

        //Versioning Header Based
        "/api/person"(version:'1.0', resources:"person", namespace: "v1")
        "/api/person"(version:'2.0', resources:"person", namespace: "v2")


    }
}
