package com.FirstSeason.JavaBased;
import java.util.Arrays;
/*示例1：
 * 将学员成绩数组{ 89, 72, 64, 58, 93 }排序的方式顺序输出
 */
public class ForeachDemo {
	public static void main(String[] args) {
		int[] scores={89,72,64,58,93};
		Arrays.sort(scores);
		System.out.println("输出结果为：");
		for(int score:scores) {//类似for循环方式，依次执行
			System.out.println(score);
		}
	}
}
