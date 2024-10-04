package 이창우;

public class Quiz06 {
public static void main(String[] args) {
	//i=1 부터 시작하여 홀수의 합을 구하면서 홀수의 합이 10000을 넘지 않는 마지막 수(i값)를 구하는 프로그램을 작성하시오.
	// (출력값 : i값과 총합)
	int i=1, sum=0;
	
	
	for(i=1; i>0; i++) {
		
		if(i%2==1) {
			
			if(sum<10000) {
				sum=sum+i;
			System.out.println("i값 : "+i);
			System.out.println("총합 : "+sum);
			}
			}
	}
	
}
}
