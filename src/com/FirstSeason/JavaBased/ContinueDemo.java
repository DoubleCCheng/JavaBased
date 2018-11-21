package com.FirstSeason.JavaBased;
//通过continue结束本次循环，直接进行下一次循环
public class ContinueDemo {
	public static void main(String[] args) {
		//求 1 到 10 之间的所有偶数的和
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				continue;
			}
			sum+=i;
		}
		System.out.println("1 到 10 之间的所有偶数的和为:"+sum);
	}
}
