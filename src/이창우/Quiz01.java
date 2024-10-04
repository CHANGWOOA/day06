package 이창우;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
	// Q. 수를 입력 받아 짝, 홀 구분하는 프로그램 생성
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("수 입력");
	num=input.nextInt();
	if(num%2==0) {
		System.out.println(num+" : 짝");
	}
	if(num%2==1) {
		System.out.println(num+" : 홀");
	}
	
	
}
}
