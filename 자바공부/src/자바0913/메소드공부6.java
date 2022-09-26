package 자바0913;

public class 메소드공부6 {

	/*
	 * public static : 접근제어자
	 * int 리턴 방식
	 * getSum 함수이름
	 * int x ,int y 파라미터 타입
	 */
	public static int getSum(int x , int y) {
		return x+y;
	}
	public static void print(String[] args) {
		System.out.println(word);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getSum(30,70);
		System.out.println(result);
		
		String x = print("도시락");
		// 리턴타입이 void인 메소드는 변수에 결과를 대입할 수 없다.
		// return이 없기때문에
		// void는 실무에서 자주사용하지않음
	}

}
