package rest3

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.RestfulController

@Secured(["ROLE_USER"])
class CustomerController extends RestfulController {
    static responseFormats = ['json', 'xml']

    CustomerController() {
        super(Customer)
    }

    def index() {
        println "I have done something new"
        respond(Customer.list())
    }

}
