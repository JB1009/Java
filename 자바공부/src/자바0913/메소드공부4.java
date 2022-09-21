package 자바0913;

import java.util.Scanner;

public class 메소드공부4 {

	
	/*
	 * public static : 접근 제어자
	 * int = 리턴 타입
	 * getSum = 함수 이름
	 * int x = 피라미터 타입
	 */
	
	public static int getSum(int x) {
		return x;
	}
	public static String getWord(String x) {
		return x;
	}
	public static boolean isTrue() {
		return true;
	}
	public static int getcount(int startNum,int endNum) {
		if(startNum > endNum) {
			return startNum;}
		if(endNum > startNum) {
			return endNum;}
		return 0;
	}
	public static int 일부터십까지합구하기() {
		int sum = 0;
		int i;
		for(i=1;i<11;i++){
			sum = sum + i;
		}
		return sum;
	}
	
   /*
    * 메소드 사용하는 이유
    * 1. 업무분담
    * 2. 유지보수 편리성
    */
	
	public static int 짝수개수구하기() {
		int count= 0;
		int num = 1;
		for(num=1;num<21;num++) {
			if(num%2 ==0 ) {
				count++;
			}
		}
		
		return count;
	}
	public static int 숫자1개수구하기(int n) {
		int answer =0;
		long x = n;
		if(x == 1) {
			return 0;
		}
			while(x > 1) {
				if(x%2 == 0) {
					x = x/2;
					answer++;
					
				}else if(x%2 == 1) {
					x = x*3 + 1;
					answer++;
					
				}
				if(answer >= 500) {
					return -1;
				}
			}
		
		return answer;
	}
		
	public static int 숫자구하기(int x) {
		int answer = 0;
		if(x == 1) {
			return 0;
		}
		while(true) {
			if(answer == 500) {
				return -1;
			}
			if(x ==1) {
				
				break;
			}
			else if(x%2 == 0) {
				x = x/2;
			}
			else if(x%2 == 1) {
				x = x * 3 + 1;
			}answer++;
		}
		return answer;	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getcount(15,10);
		System.out.println(result);
		int result1 = 일부터십까지합구하기();
		System.out.println(result1);
		int result2 = 짝수개수구하기();
		int res = 숫자1개수구하기(626331);
		System.out.println(result2 + "개");
		System.out.println(res + "번");
		System.out.println(숫자구하기(626331));
	}

}
