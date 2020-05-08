package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, in_num = 0, k = 1, j = 0, sum = 0;
		System.out.println("숫자를 입력하세요");
		in_num=sc.nextInt();
		sc.close();
		if(in_num%2==0) {
			while(num!=in_num) {
				num=2*k;
				System.out.print(num+" ");
				k++;
				sum=sum+num;
			}
		}
		
		if(in_num%2==1) {
			while(num!=in_num) {
				num=2*j+1;
				System.out.print(num+" ");
				j++;
				sum=sum+num;
			}
		}
		
		System.out.println("\n"+sum);
		
	}

}
