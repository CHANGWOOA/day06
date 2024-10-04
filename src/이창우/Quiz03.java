package 이창우;

import java.util.Scanner;

public class Quiz03 {
public static void main(String[] args) {
	// Q. 수를 입력 받아 입력 받은 수가 2의 배수이면서 3의 배수면 출력. 아니면 2의 배수가 아닌지 3의 배수가 아닌지 또는 둘 다 아닌지 출력
	
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("수 입력");
	num=input.nextInt();
	
	if(num%2==0&&num%3==0) {
	System.out.println("입력한 숫자가 2의 배수이면서 3의 배수입니다.");
	}
	else if(num%2==0&&num%3!=0) {
		System.out.println("3의 배수가 아닙니다.");
	}
	else if(num%2!=0&&num%3==0) {
		System.out.println("2의 배수가 아닙니다.");
	}
	else if(num%2!=0&&num%3!=0) {
		System.out.println("2의 배수, 3의 배수 모두 아닙니다.");
	}
}
}
