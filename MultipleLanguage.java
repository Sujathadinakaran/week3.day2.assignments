package Week3.day2.assignments;

//Assignment 1 - Abstraction - abstract class MultipleLanguage implements

public abstract class MultipleLanguage implements Language, TestTool
{
	public void python() {
		System.out.println("Python - MultipleLanguage");
	}
	
	public abstract void ruby();
}
