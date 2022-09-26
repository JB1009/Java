package 자바0913;

public class 메소드공부7 {

	public static int getSum(int x , String y) {//파라미터에는 모든 데이터 타입 가능
		return 0;
	}
	public static int getNum(int x ,String y,String z) {
		return 10;
	}
	
	public static boolean isTrue(boolean x , String y) {
		return true;
	}
	public static String getStr() {
		return "피자빵";
	}
	
	
	public static int 돈을인출하다(int 돈,String 계좌) {
		
		if(계좌.equals("농협")){
			return 돈;
		}
		if(계좌.equals("카카오페이")){
			return 돈;
		}
		return 0;
	}
	public static int 섯다패를돌리다(String 결과) {
		if(결과.equals("장땡")) {
			return 500;
		}
		if(결과.equals("38")) {
			return 1000;
		}
	return 0;	
	}
	public static int 돈을해외로송금하다(int 금액,String 해외) {
		if(해외.equals("수리남")) {
			return 500;
		}
		return 금액;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = getNum(10, "붕어빵","가격");
		System.out.println(x);
		boolean y = isTrue(true,"a");
		System.out.println(y);
		String z = getStr();
		System.out.println(z);
		int 돈 = 돈을인출하다(3000,"카카오페이");
		System.out.println(돈);
		int 금액 = 돈을해외로송금하다(300,"이탈리아");
		System.out.println(금액);
		int 섯다결과 = 섯다패를돌리다("39");
		System.out.println(섯다결과);
	}

}
