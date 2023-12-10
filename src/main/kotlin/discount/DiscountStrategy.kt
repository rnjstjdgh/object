package discount

import Screening

interface DiscountStrategy {

    fun calculateDiscountPrice(screening: Screening): Long
}