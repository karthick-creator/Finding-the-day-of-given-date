package Codes_in_life;

import java.util.Scanner;

public class Find_the_Day {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date ");
		int date = sc.nextInt();
		System.out.println("Enter the month in the format of number ");
		int month = sc.nextInt();
		System.out.println("Enter the year");
		int year = sc.nextInt();
		
		date = date%7; //4
		switch(month) {
		case 1:
			if(year%4==0) {
				if(year%100==0 && year%400==0) {
					month=0;
				}
				else if(year%4==0 && year%100!=0) {
					month=0;
				}
			}else
			month=1;
			break;
		case 2:
			if(year%4==0) {
				if(year%100==0 && year%400==0) {
					month=3;
				}
				else if(year%4==0 && year%100!=0) {
					month=3;
				}
			}else
			month=4;
			break;
		case 3:
			month=4;
			break;
		case 4:
			month=0;
			break;
		case 5:
			month=2;
			break;
		case 6:
			month=5;
			break;
		case 7:
			month=0;
			break;
		case 8:
			month=3;
			break;
		case 9:
			month=6;
			break;
		case 10:
			month=1;
			break;
		case 11:
			month=4; //4
			break;
		case 12:
			month=6;
			break;
		}
		int year1=year%100; //22
		int year2=year1%7;  //1
		int year3=year1/4;  //5
		int total = (date+month+year2+year3)%7; //0
		if(year>=2000) {
			if(total==0) {
				total=6-total;
			}
			else
			total=total-1;
			}//-1
		switch(total) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 0:
			System.out.println("Saturday");
			break;
		}
	}

}
