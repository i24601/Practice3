package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int fac = 1;
		System.out.print("숫자를 입력하세요\n숫자:");
		num = sc.nextInt();
		sc.close();
		for(int i=1;i<=num;i++) {
			fac=fac*i;
		}
		System.out.println(fac);
	}

}
