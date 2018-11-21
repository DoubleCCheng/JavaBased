package com.FirstSeason.JavaBased;

public class FDemo {

	public static void main(String[] args) {
		//计算 1 到 100 之间不能被 3 整除的数之和
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%3!=0) {
				sum=sum+i;
			}
		}
		System.out.println("1到100之间不能被3整除之和为："+sum);
	}

}
