package discount

import Screening

/***
 * 순서할인조건
 */
class OrderDiscountCondition(
    private val order: Long
): DiscountCondition {

    override fun isDiscountCondition(screening: Screening): Boolean {
        return screening.isSameOrder(this.order)
    }
}