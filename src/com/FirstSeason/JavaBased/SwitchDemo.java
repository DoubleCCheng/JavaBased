package com.FirstSeason.JavaBased;

public class SwitchDemo {
	public static void main(String[] args) {
		//如果今天是星期一、三、五，则早餐吃包子，如果是星期二、四、六，则早餐吃油条，如果是星期日，则吃“主席套餐”
		char today='日';
		switch(today) {
		case'一':
		case'三':
		case'五':
			System.out.println("早餐吃包子");
			break;
		case'二':
		case'四':
		case'六':
			System.out.println("早餐吃油条");
			break;
		default:
			System.out.println("吃主席套餐");
		}
	}
}
