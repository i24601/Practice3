package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int k = 5;
		int num[] = new int[k];
		for(int i = 0; i<5; i++ ) {
		System.out.println(i+1+"번째 숫자를 입력하세요");
		num[i]=sc.nextInt();
		}
		sc.close();
		for(int j=0;j<k;j++) {
			if(num[j]>max) {
				max=num[j];
			}
		}
		System.out.println("최댓값은"+max);
	}

}
