package rest3

class ProductOrder {

    String product
    Integer quantity

    static belongsTo = [customer: Customer]

    static constraints = {
    }
}
