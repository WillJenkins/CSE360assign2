/*
 * AUTHOR: William Jenkins jr
 * CLASS ID: 422
 * ASSIGNMENT 2
 * DESCRIPTION: Simple integer calculator class that operates via arithmetic 
 *   methods and stores results in an integer variable. 
 */

package cse360assign2;

/**
 * Basic integer calculator. All methods operate on one stored integer
 * variable. Results are returned via the getTotal method.
 *
 */

public class Calculator {

	private int total;
	
	/**
	 * Default constructor. Total initialized to 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * 
	 *  @return total  results of arithmetic.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the input value to total.
	 * @param value  integer to be added to total
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * Subtracts the input value from total
	 * @param value  integer to subtract from total
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * Multiplies the input value with total.
	 * @param value  integer to multiply by total
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * Performs integer division on the total by the input integer.
	 * Entering zero will result in the total being zero
	 * @param value  integer to divide total by.
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	/**
	 * Returns a String of all operations performed since initializing
	 * the Calculator object.
	 * @return string of all operations
	 */
	public String getHistory () {
		return "";
	}
}