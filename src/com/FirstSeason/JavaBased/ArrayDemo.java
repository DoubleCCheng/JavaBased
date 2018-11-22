package com.FirstSeason.JavaBased;
import java.util.Arrays;
/*
 * 使用 Arrays 类操作 Java 中的数组
 * 在 java.util 包中，可直接实现数组的排序、搜索等；
 * 升序：Arrays.sort(数组名);
 * 将数组转换为字符串：  Arrays.toString(数组名);
 * 可以使用 toString( ) 方法将一个数组转换成字符串，该方法按顺序把多个数组元素连接在一起，多个元素之间使用逗号和空格隔开；
 */
public class ArrayDemo {
/*	public static void main(String[] args) {
		//示例1：
		//1、定义一个整型数组，并赋初值 61, 23, 4, 74, 13, 148, 20
		//2、 定义变量分别保存最大值、最小值、累加值和平均值，并假设数组中的第一个元素既为最大值又为最小值
		int[] scores= {61, 23, 4, 74, 13, 148, 20};
		int max=scores[0];//假设第一个值为最大值
		int min=scores[0];//假设第一个值为最小值
		double sum=0;
		double avg=0;
		for(int i=0;i<scores.length;i++) {
			max=max<scores[i]?scores[i]:max;
			min=min>scores[i]?scores[i]:min;
			sum+=scores[i];
		}
		avg=sum/scores.length;
		System.out.println("数组中最大值为："+max);
		System.out.println("数组中最小值为："+min);
		System.out.println("数组中总和为："+sum);
		System.out.println("数组中平均值为："+avg);
	}*/
	public static void main(String[] args) {
		/*示例2：
		 *  [ game , movie , sports ]
		 * 实现使用 Arrays 类对数组进行排序并转换输出
		 */
		String[] hobbies= {"sports","game","movie"};
		Arrays.sort(hobbies);//对数组进行排序
		//对数组进行转换并输出
		System.out.println("输出排序并数组转换元素为："+Arrays.toString(hobbies));
	}
}
