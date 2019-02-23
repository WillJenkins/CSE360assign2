/*
 * AUTHOR: William Jenkins
 * main file for code testing, not part of submission
 * git repo: https://github.com/WillJenkins/CSE360assign2
 */
package cse360assign2;

public class Main {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.add(4);
		calc.multiply(2);
		System.out.println(calc.getTotal() + "\n");
		calc.divide(2);
		System.out.println(calc.getTotal() + "\n");
		System.out.println(calc.getHistory());
		
	}

}
