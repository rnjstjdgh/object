package discount

import Screening
import java.time.LocalDateTime

/***
 * 기간할인조건
 */
class PeriodDiscountCondition(
    private val startTime: LocalDateTime,   // 상영시작조건 출발시간
    private val endTime: LocalDateTime,     // 상영시작조건 끝시간
): DiscountCondition {

    override fun isDiscountCondition(screening: Screening): Boolean {
        return screening.startTime.isAfter(startTime) && screening.startTime.isBefore(endTime)
    }
}