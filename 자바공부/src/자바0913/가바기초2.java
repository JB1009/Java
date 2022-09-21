package 자바0913;

import java.util.Scanner;

public class 가바기초2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int x = 10;
//		if(x == 10) {
//			System.out.println("A");
//		}
//		if(x != 10) {
//			System.out.println("B");
//		}
//		
//		//a
//		
//		if(3 == 4) {
//			System.out.println("if 실행");
//		}
//		else {
//			System.out.println("else 실행");
//		}
//		
//		if(x == 10) {
//			int y = 0;
//			System.out.println(y);
//			}   
//		int a = 3;// a 시작
//		if(x > 3) {
//			a = 10;
//			int b = 20;//b 시작
//		}//b 끝
//		
//		int xy = 20;
//		if(20 == 20) {
//			++xy;
//		}
//		else {
//			xy = xy+xy;
//		}
//		
//		
//		
//		}
//		
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요 => ");
		int num = scan.nextInt();
		System.out.println("값은 "+ num);
		
		
		if((num%2) == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		
		
	}

}
