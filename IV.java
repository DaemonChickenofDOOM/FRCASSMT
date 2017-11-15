/*
Lesson _04
In this exercise you will use for loops to create a refrigerator program 
You are going to use this program cool some food to a cretain temperature
 */

/*
 * @author Surya
 */

public class Exercise 
{
	public static void main(String[]args)
	{
	    double coolingSpeed = 10; //Temperature of object decreases 10 degrees per hours
	    double initialTempOfFood = 81;
	    double tempRequired = 51;
	    double time;//should be in hours
	    double currentTemp = initialTempOfFood;
	    
	    while(initialTempOfFood > tempRequired) {
		currentTemp-=coolingSpeed;
		System.out.println("Current temperature is: "+currentTemp + ", cooling...");
	    }

	}
}
