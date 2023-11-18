package com.learn.scope;

public class Student {

	static String greet= Student.getGreeting();
	static {
		System.out.println("inside first static block");
	}

	public static void main(String[] args) {

		// if we try to call non-static method without using instance from static method it will get error || Non-static method 'getName()' cannot be referenced from a static context
		// getName();
		Student student = new Student();
		student.greet("Knoldus");
		student.sayBye();
		String result = Student.getGreeting();
		System.out.println("Inside Main:"+result);
		System.out.println(Student.greet);
	}
	public void greet(String name) {
		System.out.println("Hello " + name);
		sayBye();
	}


	public void sayBye(){
		System.out.println("Bye Bye ");
		System.out.println(Student.getGreeting());
	}
	public static String getGreeting() {
		System.out.println("inside Greeting");
		return "Have a nice day...!!!";
	}
	static {
		System.out.println("inside second static block");
	}
}
//by Jatin Sharma
