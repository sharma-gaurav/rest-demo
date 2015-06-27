import rest3.*
import grails.converters.*

class BootStrap {

    def init = { servletContext ->
        new Customer(name: "Gaurav", age: 23)
                .addToOrder(new ProductOrder(product: "sdhafjk", quantity: 2))
                .save(flush: true)


        new Person(firstName: "Gaurav", lastName: "Sharma", username: "gaurav", password: "password1").save(flush: true)
        new Person(firstName: "Gagan", lastName: "Sharma", username: "gagan", password: "password2").save(flush: true)

//        XML.registerObjectMarshaller Person, { Person person, XML xml ->
//            xml.attribute 'id', person.username
//            xml.build {
//                username(person.username)
//                firstName(person.firstName)
//                lastName(person.lastName)
//            }
//        }
//
//        JSON.registerObjectMarshaller(Person) {
//            def map= [:]
//            map['username'] = it.username
//            map['firstName'] = it.firstName
//            map['lastName'] = it.lastName
//            return map
//        }

        User u = new User("gaurav", "password").save(flush: true)
        Role r = new Role("ROLE_USER").save(flush: true)
        new UserRole(u, r).save(flush: true)
    }
    def destroy = {
    }
}
