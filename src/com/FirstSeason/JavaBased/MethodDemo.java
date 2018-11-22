package com.FirstSeason.JavaBased;
/*
 * 注：
 * 无参带返回值方法：
 * 1、如果方法的返回类型为 void ，则方法中不能使用 return 返回值！
 * 2、 方法的返回值最多只能有一个，不能返回多个值
 * 3、 方法返回值的类型必须兼容，例如，如果返回值类型为 int ，则不能返回 String 型值
 * 带参无返回值方法：
 * 1、 调用带参方法时，必须保证实参的数量、类型、顺序与形参一一对应；
 * 2、 调用方法时，实参不需要指定数据类型；
 * 3、 方法的参数可以是基本数据类型，如 int、double 等，也可以是引用数据类型，如 String、数组等
 * 4、 当方法参数有多个时，多个参数间以逗号分隔
 */
public class MethodDemo {
	public static void main(String[] args) {
		//创建对象
		MethodDemo mothod=new MethodDemo();
		//调用无参无返回值的方法
		mothod.showMethod();
		//调用无参带返回值的calcAvg()方法；
		double avg=mothod.calcAvg();
		System.out.println("平均成绩为："+avg);
		//调用无参带返回值的ageMax()方法；
		int max=mothod.ageMax();
		System.out.println("学生年龄的最大值为："+max);
	}
	//定义无参无返回值的方法
	public void showMethod() {
		System.out.println("这是一个无参无返回值的方法");
	}
	//定义无参带返回值的方法，eg1：一个名为 calcAvg 的方法，用来计算两门课程成绩的平均值，并返回结果。
	public double calcAvg() {
		int java=98;
		int php=88;
		double avg=(java+php)/2;
		return avg;
	}
	//eg2：定义一个无参带返回值的方法，实现输出学生年龄的最大值；
	//学生年龄依次为 18 ,23 ,21 ,19 ,25 ,29 ,17；
	public int ageMax() {
		int[] age= {18,23,21,19,25,29,17};
		int max=age[0];
		for(int i=0;i<age.length;i++){
			max=max<age[i]?age[i]:max;
		}
		return max;
	}
}
