package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		int i=1, j=1;
		System.out.println("숫자를 입력하세요");
		num=sc.nextInt();
		sc.close();
		num=num-num%5;
		while(num>i) {
			i=5*j;
			System.out.println(i);
			j++;
			sum=sum+i;
		}
		System.out.println("5의 배수의 개수 :"+--j+"개");
		System.out.println("5의 배수의 합 :"+sum);
	}

}
