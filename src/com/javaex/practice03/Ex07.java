package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		
		
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자:");
		num = sc.nextInt();
		
		
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
		
		sc.close();
	}
}
