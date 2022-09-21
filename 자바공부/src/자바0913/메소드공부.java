package 자바0913;

public class 메소드공부 {

	public static int 더하기(int x,int y) {
		return x+y;
	}
	public static int 빼기(int x,int y) {
		return x-y;
	}
	public static int 나누기(int x,int y) {
		return x/y;
	}
	public static int 곱하기(int x,int y) {
		return x*y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드 : 무언가를 수행하는 기능
		//() : 파라미터 or 매개변수
		//public static : 몰라도됨
		//int : 리턴타입
		//더하기 : 메소드 이름(기능이름)
		int result = 더하기(20,10);
		int result1 = 빼기(30,5);
		int result2 = 나누기(50,10);
		int result3 = 곱하기(10,10);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
