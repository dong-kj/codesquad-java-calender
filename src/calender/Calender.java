package calender;

import java.util.Scanner;

public class Calender {
	
	
	private static final int[] MAX_DAYS	= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public void printSampleCalender() {
		System.out.println("Hello,Calender");
		System.out.println("----------------------------------------------------");
		System.out.println(" 1\t 2\t 3\t 4\t 5\t 6\t 7");
		System.out.println(" 8\t 9\t10\t11\t12\t13\t14");
		System.out.println("15\t16\t17\t18\t19\t20\t21");
		System.out.println("22\t23\t24\t25\t26\t27\t28");
	}

	public static void main(String[] args) {
		

		//숫자 입력받아 해당하는 달의 최대일수를 출력하는 프로그램
		Scanner sc=new Scanner(System.in);
		Calender cal = new Calender();
		System.out.print("입력할 달을 선택:");
		int month=sc.nextInt();
		
		System.out.printf("%d 월은 %d 일까지 있습니다.\n", month,cal.maxDaysOfMonth(month));
		cal.printSampleCalender();
		sc.close();
		
	}

}
