package com.javaex.practice03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int remain = 0;
		int x = 1;
		System.out.println("숫자를 입력하세요");
		num= sc.nextInt();
		sc.close();
		while(x<=num) {
			remain=num%x;
			if(remain==0) {
				System.out.print(x+" ");
			}
			x++;
		}
		
	}

}
