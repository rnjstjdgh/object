import discount.DiscountPolicy

/***
 * 영화
 */
class Movie(
    private val title: String,  // 제목
    private val viewingTime: String,    // 관람시간
    val price: Long,   // 가격
    private val discountPolicy: DiscountPolicy, // 할인정책
)