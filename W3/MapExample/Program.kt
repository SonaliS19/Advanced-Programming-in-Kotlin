data class DiscountCoupon(val percentage: Int, val minimumOrderAmount: Int)

val orderAmount = 134

val discountCouponList =
        listOf(
                DiscountCoupon(10, 150),
                DiscountCoupon(5, 75),
                DiscountCoupon(8, 100),
                DiscountCoupon(6, 90)
        )

fun main() {

    val discountValueList =
            discountCouponList.map { discountCoupon ->
                if (orderAmount >= discountCoupon.minimumOrderAmount) {
                    orderAmount * discountCoupon.percentage / 100
                } else {
                    0
                }
            }

    println(
            discountValueList
    ) // This will print the discount amount for each coupon - [0, 6, 10, 8]
}
