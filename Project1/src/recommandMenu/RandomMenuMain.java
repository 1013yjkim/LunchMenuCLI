package recommandMenu;
import java.util.*;
/**
 * 현대인들의 고뇌를 덜어주는 점심메뉴 추천 프로그램 
 * @author kimyejoo
 * 
 */
public class RandomMenuMain {
    public static void main(String[] args) throws Exception{
		Hashtable<String, Food> menuList = RandomPick.basicMenu();//기본 메뉴 


		outer : while(true) {//종료 선택할 때까지 반복 showMenu가 계속 뜨는 거 막으려고 outer
			RandomPick.showMenu();//1번 선택 
			int c = RandomPick.pickNum();
			inner : while(true) {
				if(c == 9) {//9를 선택시 종
					RandomPick.quitSystem();
					break outer;//종료 
				}
				else if(c==1) {// 카테고리 추천 
					System.out.println("size : "+menuList.size());
					System.out.println(menuList.keySet());
					System.out.println("------------------");
					RandomPick.pickMenu(menuList);// 메뉴골라주기   
					c = RandomPick.pickNum();
					if(c == 9) {
						RandomPick.quitSystem();
						break outer;
					}
					else {
						System.out.println("메뉴로 돌아갑니다!");
						break inner;
					}
				}
				else if(c == 2) {//음식 선택지 추가하기 
					RandomPick.addMenu(menuList);
					System.out.println(menuList.size());
					System.out.println(menuList.keySet());
					break inner;
				}
				else if(c == 3) {//음식 선택지 삭제하기 
					System.out.println(menuList.size());
					System.out.println(menuList.keySet());
					
					
					RandomPick.deleteMenu(menuList);
					c = RandomPick.pickNum();
					System.out.println("-----------");
					System.out.println(menuList.size());
					System.out.println(menuList.keySet());
					if(c == 9) {
						RandomPick.quitSystem();
						break outer;
					}
					else {
						System.out.println("메뉴로 돌아갑니다!");
						break inner;
					}
					
				}
				else if(c == 4) {// 음식 선택지 보기 
					RandomPick.showFoodList(menuList);
					c = RandomPick.pickNum();
					if(c == 9) {
						RandomPick.quitSystem();
						break outer;
					}
					else {
						System.out.println("메뉴로 돌아갑니다!");
						break inner;
					}
				}
				else if(c == 1234) break inner;
				else {
					System.out.println("메뉴에 있는 숫자를 선택해주세요!");
					break inner;
				}
			}

			
			
			
		}
		

	}

}
