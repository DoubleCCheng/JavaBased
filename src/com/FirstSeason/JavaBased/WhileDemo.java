package com.FirstSeason.JavaBased;
//while循环语句，do...while 循环语句；
public class WhileDemo {
	public static void main(String[] args) {
		//while循环，先判断，后执行；
		//顺序输出 1 ～ 5 这 5 个数字
		int i=1;
		while(i<=5) {//判断条件
			System.out.println(i);
			i++;//循环操作
		}
/*		//do...while 循环，先执行，后判断，do...while 语句保证循环至少被执行一次；
		//计算 50 以内（包括 50 ）的偶数之和；
		int sum=0;
		int num=2;
		do {
			//循环操作
			sum+=num;
			num=num+2;
		}while(num<=50);//判断条件
		System.out.println("50以内的偶数之和为："+sum);*/
		//判断一个数（小于10位）的位数。多重循环
		int num=999;
		int count=0;
		if(num>=0&&num<=999999999) {
			while(num!=0) {
				count++;
				num/=10;
			}
			System.out.println("它是个"+count+"位的数！");
		}else {
			System.out.println("输入有误！");
		}
	}
}
