package rest3

class Customer {
    String name
    Integer age

    static hasMany = [order: ProductOrder]

    static constraints = {
    }
}
