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
}
