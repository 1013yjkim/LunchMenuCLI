package recommandMenu;
/**
 * 지원하지 않는 카테고리를 골랐을 때 반환되는 사용자 생성 예외입니다.
 * @author kimyejoo
 *
 */
public class NotSupportedMenuCategory extends Exception{
	public NotSupportedMenuCategory() {
		super("지원하지 않는 카테고리입니다.\n 한식, 중식, 일식, 양식 중에 선택해주세요");
	}

}