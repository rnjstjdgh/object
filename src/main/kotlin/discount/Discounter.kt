package discount

import Screening

class Discounter(
    private val discountConditions: DiscountConditions,
    private val discountPolicy: DiscountPolicy
): DiscountStrategy {

    override fun calculateDiscountPrice(screening: Screening): Long {
        return if(discountConditions.isDiscountCondition(screening)) {
            discountPolicy.applyDiscount(screening)
        } else {
            screening.getMoviePrice()
        }
    }
}