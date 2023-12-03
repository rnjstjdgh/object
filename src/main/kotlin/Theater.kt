class Theater(
    private val movies: List<Movie>
) {

    fun booking(
        movie: Movie,
        screening: Screening,
        peopleCount: Long
    ): Booking {
        val discountConditions = movie.discountConditions
        val discountPolicy = movie.discountPolicy

        if (discountConditions.isDiscountCondition(screening)) {
            val discountPrice = discountPolicy.applyDiscount(screening)
            return Booking(
                screening = screening,
                peopleCount = peopleCount,
                originalPrice = movie.price * peopleCount,
                paymentAmount = discountPrice * peopleCount,
            )
        } else {
            return Booking(
                screening = screening,
                peopleCount = peopleCount,
                originalPrice = movie.price * peopleCount,
                paymentAmount = movie.price * peopleCount,
            )
        }
    }
}