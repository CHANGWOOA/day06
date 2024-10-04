package 이창우;

import java.util.Scanner;

public class Quiz05 {
public static void main(String[] args) {
	// 국,영,수학 점수를 입력 받아 평균이 60점 이상이고 각 점수가 40점 이상이면 합격
	//아니면 평균 불합격인지 과목 불합격인지 사유를 출력하고
	//평균이 90이상이면 ‘A’, 80 이상‘B’, 70이상 ’C’, 60이상 ‘D’, 60미만이면 ‘F’ 를 출력하시오
	//- (출력 : 불합격 또는 합격 ,국,영,수,합계,평균,등급 )
	
	Scanner input = new Scanner(System.in);
	
	int i, o, u, sum;
	
	System.out.println("국어 점수 입력");
	i=input.nextInt();
	System.out.println("영어 점수 입력");
	o=input.nextInt();
	System.out.println("수학 점수 입력");
	u=input.nextInt();
	
	sum=i+o+u;
	
	while(true) {
		if((sum/3)>=60&&i>=40&&o>=40&&u>=40) {
			System.out.println("합격");
			break;
		}
		else if(true) {
			if((sum/3)<60&&i>=40&&o>=40&&u>=40) {
				System.out.println("평균 불합격");
				break;
			}
		}
		else if(true) {
			if((sum/3)>=60&&i<40||o<40||u<40) {
				System.out.println("과목 불합격");
				break;
			}
		}
	}
	
	while(true) {
		
		System.out.println("국어 점수 : "+i);
		System.out.println("영어 점수 : "+o);
		System.out.println("수학 점수 : "+u);
		System.out.println("합계 점수 : "+sum);
		System.out.println("평균 점수 : "+(sum/3));
		
		
		
		if((sum/3)>=90) {
			System.out.println("평균90이상 등급 : A");
		}
		else if((sum/3)>=80&&(sum/3)<90) {
			System.out.println("평균80이상 등급 : B");
	}
		else if((sum/3)>=70&&(sum/3)<80) {
			System.out.println("평균80이상 등급 : C");
		}
		else if((sum/3)>=60&&(sum/3)<70) {
			System.out.println("평균80이상 등급 : D");
		}
		else if((sum/3)<60) {
			System.out.println("평균80이상 등급 : F");
		}
		break;
		
		}
	
	
	
	
}
}
