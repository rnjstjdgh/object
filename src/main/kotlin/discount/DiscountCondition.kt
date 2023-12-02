package discount

import Screening

interface DiscountCondition {

    fun isDiscountCondition(screening: Screening): Boolean
}