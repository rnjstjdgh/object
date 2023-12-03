import discount.DiscountConditions
import discount.DiscountPolicy

/***
 * 영화
 */
class Movie(
    private val title: String,  // 제목
    val price: Long,   // 가격
    private val viewingTime: String,    // 관람시간
    val discountPolicy: DiscountPolicy, // 할인정책
    val discountConditions: DiscountConditions, // 할인조건들
    private val screenings: Screenings,
)