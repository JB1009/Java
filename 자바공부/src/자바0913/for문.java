package 자바0913;

public class for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 0;
//		for(i=0;i<10;i++) {
//		}
//		System.out.println(i);
//	}
	/* 문제1번 num 값을 입력받았을 때 n을 x로 나눈나머지가 1이되도록 하는 가장 작은 자연수 n을 출력하시오
	 * ex) num이 10이라고 가정하면 가장 작은 자연수는 3입니다.
	 * 제한사항 num은 3<= num <= 1000 입니다. 
	 * */
//		
		int num = 5;
		if(3 <= num  && num <= 1000) {
			for(int x=1;x<=1000;x++){
				if(num % x == 1){
					System.out.println(x);
					break;
				}
			}
		}	
		else{System.out.println("값이 아닙니다.");}
		
	/*
	 * 문제 2 3부터 6까지 숫자총합
	 * */
	int i = 0;
	int sum = 0;
	for(i=3;i<7;i++) {
		sum = sum + i;	
	}System.out.println(sum);
	
	
	
	
			
	}}

