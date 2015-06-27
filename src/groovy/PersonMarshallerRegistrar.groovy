import grails.converters.JSON
import rest3.Person

import javax.annotation.PostConstruct

class PersonMarshallerRegistrar {
    @PostConstruct
    void registerMarshallers() {
        JSON.registerObjectMarshaller(Person) {
            def map= [:]
            map['firstName'] = it.firstName
            map['lastName'] = it.lastName
            return map
        }
    }
}