package rest3

import grails.rest.RestfulController

class OrderController extends RestfulController {

    def responseFormats = ['json']

    OrderController() {
        super(ProductOrder)
    }

    def index() {
        respond ProductOrder.findAllByCustomer(Customer.read(params.long('customerId')))
    }
}
