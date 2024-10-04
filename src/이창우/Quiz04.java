package 이창우;

import java.util.Scanner;

public class Quiz04 {
public static void main(String[] args) {
	// Q. 세 수를 입력 받아 가장 큰 수, 두번째 큰 수 , 마지막 수 출력
	
	Scanner input = new Scanner(System.in);

	int i, o, u;
	System.out.println("세 가지 수 입력");
	i = input.nextInt();
	o = input.nextInt();
	u = input.nextInt();
	
	if(i>o&&i>u) {
		if(o>u) {
		System.out.println("가장 큰 수 : "+i);
		System.out.println("두 번 째 큰 수 : "+o);
		System.out.println("마지막 수 : "+u);
		
		}
		else if(u>o) {
			System.out.println("가장 큰 수 : "+i);
			System.out.println("두 번 째 큰 수 : "+u);
			System.out.println("마지막 수 : "+o);
		}
	}
	
	else if(o>i&&o>u) {
		if(i>u) {
			System.out.println("가장 큰 수 : "+o);
			System.out.println("두 번 째 큰 수 : "+i);
			System.out.println("마지막 수 : "+u);
		}
		else if(u>i) {
			System.out.println("가장 큰 수 : "+o);
			System.out.println("두 번 째 큰 수 : "+u);
			System.out.println("마지막 수 : "+i);
		}
	}
	
	else if(u>i&&u>o) {
		if(i>o) {
			System.out.println("가장 큰 수 : "+u);
			System.out.println("두 번 째 큰 수 : "+i);
			System.out.println("마지막 수 : "+o);
		}
		else if(o>i) {
			System.out.println("가장 큰 수 : "+u);
			System.out.println("두 번 째 큰 수 : "+o);
			System.out.println("마지막 수 : "+i);
		}
	}
	
}
}