package rest3.v2

import grails.rest.RestfulController
import org.restapidoc.annotation.RestApi
import org.restapidoc.annotation.RestApiMethod
import org.restapidoc.annotation.RestApiParam
import org.restapidoc.annotation.RestApiParams
import org.restapidoc.pojo.RestApiParamType
import org.springframework.http.HttpStatus
import rest3.Person

@RestApi(name = "Person API", description = "Methods for managing person")
class PersonController extends RestfulController {
    static namespace = "v2"
    static responseFormats = ['json', 'xml']

    PersonController() {
        super(Person)
    }

    @RestApiMethod(description="Get a book")
//    @RestApiParams(params=[
//            @RestApiParam(name="id", type="long", paramType = RestApiParamType.PATH, description = "The book id")
//    ])
    def index() {
        println("This is v2 person controller")
        respond(Person.list())
        HttpStatus.OK

    }

    @RestApiMethod(description="Get a book")
    @RestApiParams(params=[
            @RestApiParam(name="id", type="long", paramType = RestApiParamType.PATH, description = "The person id")
    ])
    def show() {
        respond(Person.read(params.long('id')))
    }
}
