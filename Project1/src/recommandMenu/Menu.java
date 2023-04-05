package recommandMenu;
/**
 * 음식의 카테고리를 담는 추상클래스입니다.
 * @author kimyejoo
 *
 */
abstract class Menu{
	String cate;
	abstract void setCate(String cate);
	abstract String getCate();
}
