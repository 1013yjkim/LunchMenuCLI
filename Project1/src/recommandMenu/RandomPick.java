package recommandMenu;
import java.util.*;
import java.lang.*;
/**
 * 
 * @author kimyejoo
 * 프로그램의 기능들을 모아놓은 class
 */
public class RandomPick {
    /**
	 * 먹고싶지않은 메뉴를 삭제하는 메소드입니다.
	 * @param hs main에 있는 기본 음식리스트를 저장한 테이블입니다.
	 * 
	 */
	public static void deleteMenu(Hashtable<String, Food> hs) {
		//메뉴 삭제 API
		Scanner sc = new Scanner(System.in);//스캐너로 입력받기 
		System.out.println("어떤 음식을 뺄까요? 입력해주세요!>>");
		String delFood = sc.nextLine();
		String str;
		if(!hs.containsKey(delFood)) {
			
			str = "├┴┬┴┬┴┬┴┬┴┤•ᴥ•ʔ├┬┴┬┴┬┴┬┴┬┤\n"
					+ "├   리스트에 없는 음식이에요!  ┤\n"
					+ "├┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┬┴┬┴┬┴┤\n"
					+ "   아무키. 메뉴로 돌아가기     \n"
					+ "   9. 여기서 종료하기    \n";
			System.out.println(str);
		}
		else {
			hs.remove(delFood);
			str = "├┴┬┴┬┴┬┴┬┴┤•ᴥ•ʔ├┬┴┬┴┬┴┬┴┬┴┤\n"
					+ "├\t"+delFood+"(을)를 삭제했어요! \t┤\n"
					+ "├┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┴┬┬┴┬┴┬┴┬┴┤\n"
					+ "   아무키. 메뉴로 돌아가기     \n"
					+ "   9. 여기서 종료하기    \n";
			System.out.println(str);
		}

		
	}
    	/**
	 * 고민되는 음식 메뉴 선택지를 추가하는 메소드입니다.
	 * @param hs main에 있는 기본 음식리스트를 저장한 테이블입니다.
	 * @throws NotSupportedMenuCategory 현재 한식, 양식, 중식, 일식의 카테고리만 지원하므로 다른음식 카테고리를 추가하려 할 경우 예외를 반환합니다.
	 */
	public static void addMenu(Hashtable<String, Food> hs) throws NotSupportedMenuCategory{
		//메뉴추가 API
		String[] Category = {"한식", "양식", "중식", "일식"};
		Scanner sc = new Scanner(System.in);//스캐너로 입력받기 
		String cate = null;
		String foodName;
		
		
		System.out.println("어느 카테고리의 음식인가요?\n한식, 중식, 양식, 일식 중에 고르세요");
		while(cate == null) {
			cate = sc.next();
			if(cate.equals(Category[0]) || cate.equals(Category[1]) || cate.equals(Category[2]) || cate.equals(Category[3])) {
				String str = "┌──────────────────────┐\n"
						+ "   음식 이름을 입력해주세요!\n"
						+ "└──────────────────────┘\n"
						+ "　　ᕱ ᕱ ||\n"
						+ "　 ( ･ω･ ||\n"
						+ "　 /　つΦ\n"
						+ "-----------------------";
				System.out.println(str);
				System.out.println();
				foodName = sc.next();
				Food addFood = new Food(cate, foodName);
				hs.put(addFood.foodName, addFood);
				
			}
			else {
				cate = null;
				throw new NotSupportedMenuCategory();// 한식 중식 양식 일식중에고르지 ㅣ않았을때 
			}
		}
	}
    /**
	 * 메뉴의 숫자 또는 아무키를 선택하여 메뉴로 돌아가거나 프로그램을 종료하는 메소드입니다.
	 * @return 종료를 선택하는 숫자나 아무키를 누른경우 1234를 반환합니다.
	 */
	public static int pickNum() {
		Scanner sc = new Scanner(System.in);//스캐너로 입력받기 
		int c;
		try {
			c = sc.nextInt();
		}catch(InputMismatchException e) {
			c = 1234;// outer else에 들어가게 하기 
		}
		return c;
	}
    /**
	 * 현재 음식 리스트를 보여주는 메소드입니다.
	 * @param hs main에 있는 기본 음식리스트를 저장한 테이블입니다.
	 */
	public static void showFoodList(Hashtable<String, Food> hs) {
		Object[] foodMenu = hs.keySet().toArray();
		String str = "＿人人人人人人메뉴판人人人人人人＿\n";
		for(int i = 0; i < hs.size(); i++) {
			str += "＞\t"+(hs.get(foodMenu[i].toString())).getFoodName()+"\t＜\n";
		}
		str+= "￣^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y￣\n"
				+ "   아무키. 메뉴로 돌아가기     \n"
				+ "   9. 여기서 종료하기    \n";
		System.out.println(str);
				
	}
}
