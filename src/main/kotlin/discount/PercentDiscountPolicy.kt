package discount

import Screening

/***
 * 비율할인정책
 */
class PercentDiscountPolicy(
    private val percent: Double   // 비율
) : DiscountPolicy {

    override fun applyDiscount(screening: Screening): Long {
        return (screening.getMoviePrice() * percent).toLong()
    }
}