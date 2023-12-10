/***
 * 예약정보
 */
class Reservation(
    private val screening: Screening,   // 어떤 상영에 대한 예약인지
    private val peopleCount: Long,  // 예약인원수
    private val originalPrice: Long,  // 원가
    private val paymentAmount: Long,    // 결제금액
)