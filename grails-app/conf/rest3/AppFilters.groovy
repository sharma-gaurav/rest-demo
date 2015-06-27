package rest3

class AppFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                println "Request URL: $request.requestURI, Method: $request.method, params: $params"
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
