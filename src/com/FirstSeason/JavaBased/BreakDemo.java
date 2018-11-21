package com.FirstSeason.JavaBased;
//使用 break 语句退出指定的循环，直接执行循环后面的代码
public class BreakDemo {
	public static void main(String[] args) {
		//循环将 1 到 10 之间的整数相加，如果累加值大于 20，则跳出循环，并输出当前的累加值。
		int sum=0;
		for(int i=1;1<=10;i++) {
			sum+=i;
			if(sum>20) {
				System.out.println("当前的累加值为:"+sum);
				break;//
			}
		}
	}
}
