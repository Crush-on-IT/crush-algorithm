package saem;
import java.util.Scanner;

public class SWEA_3499_퍼펙트셔플 {

	// 입력받기, 테케
	// 자연수
	// 두개로 찢은 다음에
	// 하나 새로 만들어서
	// 교차하면서 넣어주기..?

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int t = 1; t <= test; t++) {
			int n = sc.nextInt();
			int a = 0, b = 0;
			if(n % 2 == 1) {
				a = n/2 + 1;
				b = n/2;
			}
			else {
				a = n/2;
				b = n/2;
			}
			
			String[] arr1 = new String[a];
			String[] arr2 = new String[b];
			
			for(int i  = 0; i < a; i++) {
				arr1[i] = sc.next();
			}
			for(int i = 0; i < b; i++) {
				arr2[i] = sc.next();
			}
			
			String[] arr3 = new String[n];
			
			for(int i = 0; i < n; i++) {
				if(i % 2 == 0) {
					arr3[i] = arr1[i / 2];
				}
				else {
					arr3[i] = arr2[i / 2];
				}
			}
			System.out.print("#" + t + " ");	
			for(int i = 0; i < n; i++) {
				System.out.print(arr3[i] + " ");
			}
			System.out.println();
			
		}
	}
}
