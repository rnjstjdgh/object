package discount

import Screening

/***
 * 금액할인정책
 */
class AmountDiscountPolicy(
    private val discountAmount: Long,   // 할인금액
): DiscountPolicy {

    override fun applyDiscount(screening: Screening): Long {
        return screening.getMoviePrice() - discountAmount
    }
}