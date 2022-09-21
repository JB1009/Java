package 자바0913;

public class 문자열공부 {

	public static void main(String[] args) {
//		String name = "황정민";
//		String name2 = "하정우";
//		// 자바에서 문자를 비교할때는 ==를 사용하지 않는다. 
//		boolean isCheck = name.equals(name2);// name과 name2를 비교함
//		//자바에서는 문자를 == 연산자로 비교하지 않고
//		//equals 를 사용하는 이유는 자바에서 문자열은 클래스이기 때문에
//		// == 연산자로 비교하게되면 문자를 비교하는게 아니라 클래스를 비교하는 것 이다.
//		System.out.println("name하고 name2를 비교한 결과 => " +isCheck);
//		// boolean = true 또는 false 만 표현할 수 있다.
//		//2. 문자 길이 알아내기
//		String 비밀번호 = "12341234";
//		int 문자길이 = 비밀번호.length();
//		System.out.println("문자길이는 =>" + 문자길이);
//		
//		//3. 문자자르기
//		String 핸드폰번호 = "010-8888-1222";
//		String 배열[] = 핸드폰번호.split("-");
//		System.out.println(배열[0]);
//		System.out.println(배열[1]);
//		System.out.println(배열[2]);
//		
//		//4. 특정문자만 추출하기
//		String 영화제목 = "어벤져스 인피니티 워 ";
//		String 결과는 = 영화제목.substring(0,4);
//		System.out.println(결과는);
//		
		String name[] = {"brian","kim"};
		
		/* 문제) 배열 name에 잇는 원소중 kim의 위치를 찾아
		 * kim은 x에 있습니다 출력나오게 로직 구현하기
		 * 정답 kim은 배열 1번째에 있으므로 kim 1번째에 있습니다. 
		 */
		int i;
		for(i=0;i<name.length;i++){
			if(name[i].equals("kim")){
				System.out.println(name[i] +"은 " + i + "번째에 있습니다.");
			}
		}
//			/*문제2 홍길동 번호는 010 3333 9999 입니다. 길동이는 개인정보 유출을 생각해
//			 * 핸드폰번호를 010 **** ****로 보이게 하고싶습니다.
//			 * 
//			 */
			String 홍길동번호 = "010-3333-9999";
			String 번호[] = 홍길동번호.split("-");
			
			
			for(int j=0;j<번호.length;j++) {
				if(j >= 1 && j < 3) {
					번호[j] = "****";
				}
			}System.out.println(번호[0]+"-"+번호[1]+"-"+번호[2]);
		
			for(int j=1;j<번호.length;j++){
				번호[i] = "****";
					
			}System.out.println(번호[0]+"-"+번호[1]+"-"+번호[2]);
	
		
	}//public

}//public class 문자열공부
