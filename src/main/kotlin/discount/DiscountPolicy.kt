package discount

import Screening

interface DiscountPolicy {

    /***
     * 상영에 대한 할인을 적용한다(할인된 금액을 리턴)
     */
    fun applyDiscount(screening: Screening): Long
}