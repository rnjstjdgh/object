import java.time.LocalDate
import java.time.LocalDateTime

/****
 * 상영
 */
class Screening(
    private val movie: Movie,   // 어떤 영화에 대한 상영인지
    private val time: LocalDate, // 상영일자
    private val count: Long,    // 그날의 몇번째 상영인지
    private val startTime: LocalDateTime,   // 상영시작시간
    private val endTime: LocalDateTime,     // 상영종료시간
)