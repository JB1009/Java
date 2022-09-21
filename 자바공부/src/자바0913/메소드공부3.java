package 자바0913;

import java.util.Scanner;

public class 메소드공부3 {

	public static void 캐릭터를생성하다(){
		System.out.println("캐릭터 이름을 입력해주세요");
//		System.out.print("캐릭터 이름 => ");
		Scanner scan = new Scanner(System.in);
		String 캐릭터이름= scan.next();
		System.out.println("캐릭터 이름은" + 캐릭터이름);	
	}
	public static void 직업을선택하다() {
		System.out.println("[1] 전사 [2] 궁수 [3]마법사");
//		System.out.print("직업은 => ");
		Scanner scan = new Scanner(System.in);
		int 직업 = scan.nextInt();
		String[] 직업배열 = {"전사","궁수","마법사"};
		System.out.println("직업은 " + 직업배열[직업-1]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("### 게임 프로그램 시작 ###");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("[1] 캐릭터 생성 [2] 직업 선택 [3] 프로그램 종료");
			System.out.print("이용하실 서비스를 선택해주세요.");
			String menu = scan.next();
			switch (menu) {
				case "1" : System.out.println("### 캐릭터 생성"); 
						   캐릭터를생성하다()	;
						   break;
				case "2" : System.out.println("### 직업 선택"); 
							직업을선택하다();
							break;
				
				case "4" : System.out.println("프로그램 종료 ###"); System.exit(0);;break;
			}
		}
		
		
		
	}

}
