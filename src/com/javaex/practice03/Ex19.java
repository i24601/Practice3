package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sel, a = 0, b = 0, c = 0, d = 0;
		int break1 = 0;
		do {
			System.out.println("---------------------------------");
			System.out.print("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("\n---------------------------------");
			System.out.println("선택>");
			sel = sc.nextInt();
			switch (sel) {
			case 1: {
				System.out.print("예금액:");
				a = sc.nextInt();
				c = a + c;
				break;
			}
			case 2: {
				System.out.print("출금액:");
				b = sc.nextInt();
				c = c - b;
				break;
			}
			case 3: {
				System.out.print("잔고액:");
				System.out.println(c);
				break;
			}
			case 4: {
				break1 = 1;
				break;
			}
			default: {
				System.out.println("다시입력해주세요");
				break;
			}
			}
		} while (break1 != 1);
		sc.close();
		System.out.println("프로그램종료");
	}

}
