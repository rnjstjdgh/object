import java.time.LocalDate

class Screenings(
    private val screenings: List<Screening>
) {
    fun getScreening(date: LocalDate, order: Long): Screening? {
        return screenings.find { it.isTargetScreening(date, order) }
    }
}