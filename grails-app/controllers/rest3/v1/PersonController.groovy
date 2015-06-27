package rest3.v1

import grails.rest.RestfulController
import rest3.Person

class PersonController extends RestfulController {
    static namespace = "v1"

    static responseFormats = ['json', 'xml']

    PersonController() {
        super(Person)
    }

    def index() {
        println("This is v1 person controller")
        respond(Person.list())
    }
}
