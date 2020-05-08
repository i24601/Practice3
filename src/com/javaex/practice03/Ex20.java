package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rnd = (int) (Math.random() * 100 + 1);
		int input = 0;
		char answer;
		System.out.println(rnd);
		while (true) {
			System.out.println(">>");
			input = sc.nextInt();
			if (input > rnd) {
				System.out.println("더낮게");
			} else if (input < rnd) {
				System.out.println("더높게");
			} else {
				System.out.println("맞췄습니다");
				System.out.println("다시하기 y/n");
				answer = sc.next().charAt(0);
				if (answer == 'y') {
					rnd = (int) (Math.random() * 100 + 1);
					System.out.println(rnd);
					continue;
				} else if (answer == 'n') {
					break;
				}
			}
		}
		System.out.println("종료");
		sc.close();
	}

}
