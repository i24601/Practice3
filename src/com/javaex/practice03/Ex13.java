package com.javaex.practice03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("숫자를 입력하세요");
		num=sc.nextInt();
		sc.close();
		if(num%2==0) {
			System.out.println((num+1)*(num/2));
		}
		
		else {
			System.out.println((num+1)*(num/2)+num);
		}
		
	}

}
