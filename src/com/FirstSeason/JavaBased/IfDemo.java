package com.FirstSeason.JavaBased;

public class IfDemo {
	public static void main(String[] args) {
		//判断one的值是否为偶数；(if)
		int one=20;
		if(one%2==0){
			System.out.println("one是偶数");
		}
/*		//如果年龄大于等于 18 岁，则提示成年了，否则提示未成年(if...else)
		int age=28;
		if(age>18) {
			System.out.println("成年了");
		}else {
			System.out.println("未成年");
		}*/
/*		//假设年龄大于 60 岁，则提示“老年”；如果年龄介于 40 岁至 60 岁之间，则提示“中年”；如果年龄介于 18 岁至 40 岁之间，则提示“少年”； 18 岁以下则提示“童年”(多重if)
		int age=28;
		if(age>60) {
			System.out.println("老年");
		}else if(age>40) {
			System.out.println("中年");
		}else if(age>18) {
			System.out.println("少年");
		}else {
			System.out.println("童年");
		}*/
		//预赛成绩大于 80 分的可进入决赛，然后根据性别再划分为男子组决赛和女子组决赛。(嵌套if)
		int score=92;
		String sex="女";
		if(score>80) {
			if(sex.equals("女")) {
				System.out.println("进入女子组决赛");
			}else {
				System.out.println("进入男子组决赛");
			}
		}else {
			System.out.println("淘汰");
		}
	}
}
