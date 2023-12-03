package discount

import Screening

class DiscountConditions(
    private val conditions: List<DiscountCondition>
) {
    fun isDiscountCondition(screening: Screening): Boolean {
        return conditions.any { it.isDiscountCondition(screening) }
    }
}