package 이창우;

import java.util.Scanner;

public class Quiz07 {
public static void main(String[] args) {
	
	//10 ~ 20사이의 숫자만 입력 받아 1부터 입력 받은 수까지의 합을 구하시오.
	//만약 10미만 또는 20초과 수를 입력하면 다시 입력받게 만들고 10~20사이 수를 입력 받으면 합을 구하고 출력하면 됩니다.

	Scanner input=new Scanner(System.in);
	int num, sum=0;
	while(true) {
		System.out.println("10~20 사이 숫자 입력");
		num=input.nextInt();
		if(num>=10&&num<=20) {
			break;
		}
		else if(num<10||num>20) {
			System.out.println("범위 초과! 다시 입력해주세요");
			continue;
		}
	}
	
	int i=0;
	for(; i<=num; i++) {
		sum += i;
	}
	System.out.println("1부터"+num+"까지의 합 : "+sum);





}
}
