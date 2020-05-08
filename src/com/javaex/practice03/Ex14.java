package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;

		System.out.print("숫자를 입력하세요:");
		num = sc.nextInt();
		sc.close();
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			if (i < num) {
				System.out.print("+");
			}
			sum=sum+i;
		}
		System.out.println("\n합계:"+sum);
	}

}
