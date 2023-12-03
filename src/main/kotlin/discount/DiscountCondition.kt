package discount

import Screening

interface DiscountCondition {

    /***
     * 상영이 할인조건에 해당되는지 확인한다
     */
    fun isDiscountCondition(screening: Screening): Boolean
}