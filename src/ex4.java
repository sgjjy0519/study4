import java.util.Scanner;

//값을 입력받아 함수호출하여 처리하시오
//조건1)입력받은 값을  compute(item, qty, price)함수에서 처리
//조건2)계산방법 : 금액 = 수량 * 단가
//
//-입력-
//품명 : apple
//수량 : 10
//단가 : 1200
//
//-출력-
//품명 : apple
//금액 : 12000원

public class ex4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("품명:");
		String item = s.next();
		System.out.print("수량:");
		int qty = s.nextInt();
		System.out.print("단가:");
		int price = s.nextInt();
		
		compute(item, qty, price);

	}
	public static void compute(String item, int qty, int price) {
		
		System.out.println("품명 :"+item);
		System.out.println("금액 :"+(qty*price));
	}
}
