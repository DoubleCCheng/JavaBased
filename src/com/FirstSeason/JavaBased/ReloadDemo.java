package com.FirstSeason.JavaBased;
/*判断方法重载的依据：
 * 1、 必须是在同一个类中
 * 2、 方法名相同
 * 3、 方法参数的个数、顺序或类型不同
 * 4、 与方法的修饰符或返回值没有关系
 */
public class ReloadDemo {
	public static void main(String[] args) {
		ReloadDemo reload=new ReloadDemo();
		reload.reloadDemo();
		reload.reloadDemo("double");
		reload.reloadDemo("double1");
		reload.reloadDemo(27,"double2");
		
	}
	public void reloadDemo() {
		System.out.println("welcome");
	}
	public void reloadDemo(String name) {
		System.out.println("************************");
		System.out.println("welcome:"+name);
	}
	public void reloadDemo(String name,int age) {
		System.out.println("************************");
		System.out.println("welcome:"+name);
		System.out.println("age:"+age);
	}
	public void reloadDemo(int age,String name) {
		System.out.println("************************");
		System.out.println("welcome2:"+name);
		System.out.println("age2:"+age);
	}
}
