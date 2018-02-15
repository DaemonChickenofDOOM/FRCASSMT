package team3647robotPackage;

public class Motors 
{
	public static Spark left = new Spark(2);
	public static Spark right = new Spark(1);

	public void stop(){
		Motors.left.set(0);
		Motors.right.set(0);
	}
}
