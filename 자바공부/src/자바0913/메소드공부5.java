package 자바0913;

public class 메소드공부5 {

	public static int getSum(int x,int y) {
		return x+y;
	}
	public static boolean isLogin(boolean isLogin) {
		return isLogin;
	}
	/*
	 * public static : 접근 제어자
	 * String = 리턴 타입
	 * getWord = 함수 이름
	 * Stirng word = 피라미터 타입
	 */
	public static String getWord(String word) {
		return word;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getSum(10,10);
		System.out.println(result);
		boolean isResult = isLogin(true);
		System.out.println(isResult);
		String word = getWord("치즈돈가스");
		System.out.println(word);
	}

}
