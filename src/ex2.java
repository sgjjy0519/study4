//main()함수에서 각각 호출하고 계산된 결과를 return 받아서 main()에서 출력
//더하기 : 8
//빼  기 : 5
//곱하기 : 20
//나누기 : 2.33

public class ex2 {

	public static void main(String[] args) {
		System.out.println("더하기 : "+sum(3,5));
		System.out.println("빼   기 : "+sub(7,2));
		System.out.println("곱하기 : "+mul(4,5));
		System.out.printf("나누기 : %.2f\n",div(7,3));

	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static double div(int a, int b) {
		return (double)a/b;
	}
}
