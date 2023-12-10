import discount.Discounter

/***
 * 영화
 */
class Movie(
    private val title: String,  // 제목
    val price: Long,   // 가격
    private val viewingTime: String,    // 관람시간
    private val discounter: Discounter?,
    private val screenings: Screenings,
) {

    fun calculatePrice(screening: Screening): Long {
        return discounter?.calculateDiscountPrice(screening) ?: price
    }
}