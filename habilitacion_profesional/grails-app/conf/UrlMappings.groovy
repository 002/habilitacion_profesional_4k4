class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/sample/list"(controller: "sampleCalculator", parseRequest: true) {
            action = [GET: 'list']
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
