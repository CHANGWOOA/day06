package 이창우;

import java.util.Scanner;

public class Quiz02 {
public static void main(String[] args) {
	// Q. 두 수를 입력 받아 두 수의 합이 짝수이고 3의 배수면 출력, 아니면 아님 출력
	Scanner input = new Scanner(System.in);
	
	int i, o;
	System.out.println("두 수 입력");
	i = input.nextInt();
	o = input.nextInt();
	
	if((i+o)%2==0&&(i+o)%3==0) {
		System.out.println((i+o)+" :두 수의 합이 짝수이고 3의 배수입니다.");
	}
	else {
		System.out.println("아님");
	}

}
}
