package com.javaex.practice03;

public class Ex06 {

	public static void main(String[] args) {
		int num1 = 5, count1 = 1, multi1 = 1;
		int num2 = 7, count2 = 1, multi2 = 1;
		int i = 1;
		
		multi1=num1*count1;
		multi2=num2*count2;

		while(multi1!=multi2) {
			
			if(multi1>multi2) {
				multi2=num2*count2++;
			}
			else if (multi1<multi2){
				multi1=num1*count1++;
			}
			
		}
		while(35*i<100) {
		System.out.println(multi1*i++);
		}
	}
}
