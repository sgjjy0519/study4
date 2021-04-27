//다중for이용해서 모양을 만드시오
//             1
//            123
//           12345
//          1234567
//         123456789
//          1234567
//           12345
//            123
//             1

//            *
//           * *
//          *   *
//           * *
//            *  

//         **********
//         *        *
//         *        *
//         *        *
//         **********    

public class ex1 {

	public static void main(String[] args) {
		int k;
		
		for(int i=-4;i<=4;i++) {        // i = -4,-3,-2,-1,0,1,2,3,4
			k = i < 0 ? -i:i;			// i가 0보다 작으면 -i 크면 i	
			for(int j=k;j>0;j--) {	
				System.out.print(" ");
			}
			for(int j=1;j<=9-2*k;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=-2;i<=2;i++) {
			k = i < 0 ? -i:i;
			for(int j=k;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=5-2*k;j++) {
				if(j==1 || j==5-2*k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				if(i==1 || i==5)
					System.out.print("*");
				else {
					if(j==1 || j==10)
					System.out.print("*");
				else
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
	}
}
