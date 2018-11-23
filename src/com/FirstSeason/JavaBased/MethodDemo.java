package com.FirstSeason.JavaBased;
import java.util.Arrays;
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
		//调用带参无返回值的calcAvg2()方法；
		mothod.caleAvg2(98, 86);
		//调用带参无返回值的printArray()方法；
		int[] scores= {84,91,78,68};
		mothod.printArray(scores);
		//调用带参带返回值calcPrint()方法；
		int[] scores2= {79,52,98,81};
		int count=scores2.length;
		mothod.calcPrint(scores2);
		System.out.println("共有"+count+"个成绩信息");
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
	//定义带参无返回值的方法，eg1：计算两门课程考试成绩的平均分
	public void caleAvg2(int java2,int php2) {
		double avg2=(java2+php2)/2;
		System.out.println("两门课程考试成绩平均分为："+avg2);
	}
	//eg2:定义一个带参无返回值的方法，实现数组按字符串方式输出；
	public void printArray(int[] scores) {
		System.out.println("数组转换字符串输出为："+Arrays.toString(scores));
	}
	//定义带参带返回值的方法，eg1:将考试成绩排序并输出，返回成绩的个数
	//考试成绩为{79,52,98,81}
	public int calcPrint(int[] scores2) {
		Arrays.sort(scores2);
		System.out.println("考试成绩排序并字符串输出为："+Arrays.toString(scores2));
		return scores2.length;
	}
}
