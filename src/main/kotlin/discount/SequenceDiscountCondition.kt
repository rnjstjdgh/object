package discount

import Screening

/***
 * 순서할인조건
 */
class SequenceDiscountCondition(
    private val order: Long
): DiscountCondition {

    override fun isDiscountCondition(screening: Screening): Boolean {
        return screening.isSameSequence(this.order)
    }
}