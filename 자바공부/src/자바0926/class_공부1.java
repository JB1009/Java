package 자바0926;

//클래스 이름을 만들 때는 항상 앞자리는 대문자로 입력한다.
//클래스 안에 메소드가 위치한다.
//프로젝트 > 패키지 > 클래스 > 메소드(가장작은단위);

class 붕어빵{
	public static String 붕어빵을만들다(String 재료) {
		return "붕어빵을"+재료+"먹었습니다";
	}
	public static int 붕어빵수량을파악하다(int 수량) {
		return 수량;
	}
//	public static void 붕어빵() {
//		System.out.println("팥 붕어빵을 먹었습니다");
//	}
	}


class Pizza{
    /*
     * public static 접근제어자
     * void 리턴 타입
     * 피자를먹다 함수이름
     * () 파라미터 값
     */
	public static void 피자를먹다() {
		System.out.println("백종원피자 냠냠");
	}
	
    /*
     * public static 접근제어자
     * String 리턴타입
     * 피자를주문하다 함수이름
     * String 피자이름 , int 수량 파라미터 값
     */
	
	
	public static String 피자를주문하다(String 피자이름,int 수량 ) {
		return "불고기 피자";
	}
}



public class class_공부1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p = new Pizza();// 피자클래스를 불러온다
		p.피자를먹다();//피자클래스안에있는피자를먹다 메소드호출
//		붕어빵 팥 = new 붕어빵();
//		System.out.println(팥.붕어빵을만들다("팥 "));
		붕어빵 수량 = new 붕어빵();
		System.out.println("붕어빵은 "+수량.붕어빵수량을파악하다(15)+"개 입니다");
	
		
	}

}
