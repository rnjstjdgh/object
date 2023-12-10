import java.time.LocalDate
import java.time.LocalDateTime

/****
 * 상영
 */
class Screening(
    private val movie: Movie,   // 어떤 영화에 대한 상영인지
    private val sequence: Long,    // 그날의 몇번째 상영인지
    private val date: LocalDate, // 상영일자
    val startTime: LocalDateTime,   // 상영시작시간
    private val endTime: LocalDateTime,     // 상영종료시간
) {

    fun reserve(
        peopleCount: Long
    ): Reservation {
        return Reservation(
            screening = this,
            peopleCount = peopleCount,
            originalPrice = calculateOriginalPrice(peopleCount),
            paymentAmount = calculatePrice(peopleCount),
        )
    }

    fun isTargetScreening(date: LocalDate, order: Long): Boolean {
        return this.date == date && this.sequence == order
    }

    fun getMoviePrice() = this.movie.price

    fun isSameSequence(order: Long): Boolean {
        return this.sequence == order
    }

    private fun calculateOriginalPrice(peopleCount: Long): Long {
        return this.getMoviePrice() * peopleCount
    }

    private fun calculatePrice(peopleCount: Long): Long {
        return movie.calculatePrice(this) * peopleCount
    }
}