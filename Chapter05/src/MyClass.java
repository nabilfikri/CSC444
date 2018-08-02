/**
 * @author Muhammad Nabil Fikri Jamaluddin
 * @version 1.0
 * @since 2016
 * 
 * This is my class
 *
 */

public class MyClass {

	/**
	 * This is my default constructor
	 */
	public MyClass() {
		
	}
	
	/**
	 * This function is use to calculate BMI
	 * @param w Value for weight
	 * @param h Value for height
	 * @return Calculated value of BMI
	 */
	public double calcBMI(float w, float h){
		double bmi = w * w / h;
		return bmi;
	}
}
