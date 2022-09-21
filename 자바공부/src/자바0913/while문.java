package 자바0913;

public class while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문은 for문처럼 반복문 중 하나.
		//for문에 비해 사용빈도는 낮으나 가끔 사용됨
		//while문은 for문처럼 조건없이 계속 실행됨
//		int count = 0;
//		while(true) {
//			++count;
//			System.out.println("안녕");
//			if(count == 20) {
//				break;
//			}
//		}
		int count = 0;
		int sum = 0;
		while(true) {
			++count;
			sum = sum + count;
			System.out.println(sum);
			if(count == 10) {	
				break;
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
