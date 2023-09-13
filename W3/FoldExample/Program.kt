data class OrderItemClass(val name: String, val amount: Int, val quantity: Int)

val orderItemList =
        listOf(
                OrderItemClass("Burger", 6, 2),
                OrderItemClass("Fries", 2, 1),
                OrderItemClass("Soda", 3, 3)
        )

fun main() {

    val totalAmount =
            orderItemList.fold(0) { totalOrderAmount, orderItem ->
                totalOrderAmount + (orderItem.amount * orderItem.quantity)
            }

    println(totalAmount) // This will print 23
}
