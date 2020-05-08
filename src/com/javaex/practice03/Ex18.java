package com.javaex.practice03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int l = 0;
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		sc.close();
		l = num;
		for (int j = 0; j < l; j++) {
			for (int i = 0; i < num; i++) {
				System.out.print("*");
			}
			System.out.println("");
			num--;
		}
		num = 2;
		l--;
		for (int j = 0; j < l; j++) {
			for (int i = 0; i < num; i++) {
				System.out.print("*");
			}
			System.out.println("");
			num++;
		}
	}

}
