package io.github.lukeeff;

/*
 * This class demonstrates how Lambda functions can
 * be a smart way of checking any object type.
 * 
 * @author: Lukeeff
 * @version 1.0
 */
public class Lambda {

	
	/*
	 * Check if param input is of the correct type.
	 * 
	 * @param input A value passed through of a currently
	 * unknown type. 
	 * @returns true if input is int.
	 */
	interface FuncInterInt {
		boolean isInt(Object input);
	}
	
	/*
	 * Check if param input is of the correct type.
	 * 
	 * @param input A value passed through of a currently
	 * unknown type. 
	 * @returns true if input is string.
	 */
	interface FuncInterStr {
		boolean isString(Object input);
	}
	
	private static boolean isInt(Object input, FuncInterInt isValid) {
		return isValid.isInt(input);
	}
	
	
	public static void main(String[] args) {
		FuncInterInt isValid = (Object input) -> false;
		Object obj = 4;
		checkType(obj, isValid);
	}

	private static void checkType(Object obj, FuncInterInt isValid) {
		if (isInt(obj, isValid)) {
			System.out.println("Returned true.");
		} else {
			System.out.println("Returned false or null.");
		}
		
	}
	
}
