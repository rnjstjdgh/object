package discount

import Screening

/***
 * 비율할인정책
 */
class RatioDiscountPolicy(
    private val ratio: Double   // 비율
) : DiscountPolicy {

    override fun applyDiscount(screening: Screening): Long {
        return (screening.getMoviePrice() * ratio).toLong()
    }
}