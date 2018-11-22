package com.FirstSeason.JavaBased;
import java.util.Scanner;
public class Demo01 {
/*示例1：加分前成绩为53，加分后成绩为60，并统计加分次数；
 * 
 * 使用Scanner工具类来获取用户输入的成绩信息；
 * Scanner类位于java.util包中，使用时需要导入此包；

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//创建Scanner对象
		System.out.print("请输入考试成绩信息:");
		int score=input.nextInt();//获取用户输入的成绩信息，并赋值给变量；
		//int score=53;//赋值
		int count=0;
		System.out.println("加分前成绩为："+score);
		while(score<60) {
			score++;
			count++;
		}
		System.out.println("加分后成绩为："+score);
		System.out.println("共加分次数为："+count);
	}*/
	public static void main(String[] args) {
		//示例2：求取三个班的各4名学生分别的平均成绩；
		int classNum=3;
		int stuNum=4;
		double sum=0;
		double avg=0;
		for(int i=1;i<=classNum;i++) {
			sum=0;
			System.out.println("***请输入第"+i+"个班级学员成绩***");
			for(int j=1;j<=stuNum;j++) {
				Scanner input=new Scanner(System.in);//创建Scanner对象
				System.out.print("请输入第"+j+"个学员的成绩：");
				int score=input.nextInt();
				sum+=score;//成绩累加
			}
			avg=sum/stuNum;
			System.out.println("第"+i+"班级学员平均成绩为："+avg);
		}
	}
} 
