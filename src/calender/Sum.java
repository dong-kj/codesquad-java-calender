package calender;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//입력: 키보드로 두 수의 입력을 받음
		//출력: 화면에 두 수의 합을 출력
		System.out.println("두 수를 입력: ");
		Scanner sc=new Scanner(System.in);
		String nums = sc.nextLine();
		String[] val=nums.split(" ");
		int val1=Integer.parseInt(val[0]);
		int val2=Integer.parseInt(val[1]);
		
		System.out.printf("두 수의 합은 %d입니다.",val1+val2);
				
		
		
	}
}
