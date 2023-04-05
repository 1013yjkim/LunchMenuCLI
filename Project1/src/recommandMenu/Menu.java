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
/**
 * 음식의 이름을 담는 Menu의 자식클래스입니다.
 * @author kimyejoo
 *
 */
class Food extends Menu{
	String foodName;

	
	public Food(String cate, String foodName) {
		this.cate = cate;
		this.foodName = foodName;

	}//생성자 
	
	public void setName(String foodName) {
		this.foodName = foodName;
	}
	@Override
	void setCate(String cate) {
		this.cate = cate;
	}
	@Override
	String getCate() {
		return cate;
	}
	String getFoodName() {
		return cate+" - "+foodName;
	}
	
}
