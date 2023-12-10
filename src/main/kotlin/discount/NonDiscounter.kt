package discount

import Screening

class NonDiscounter: DiscountStrategy {
    override fun calculateDiscountPrice(screening: Screening): Long {
        return screening.getMoviePrice()
    }
}