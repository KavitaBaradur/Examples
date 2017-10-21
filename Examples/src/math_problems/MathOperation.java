package math_problems;

import java.util.ArrayList;

public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "MATH 5 + 6";
		
		ArrayList values = new ArrayList();
		
		String [] splitValues=input.split(" ");
		for(int i=0;i<splitValues.length;i++) {
			System.out.println(splitValues[i]);
		}
		String operator=splitValues[2];
		int no1=Integer.parseInt(splitValues[1].trim());
		int no2=Integer.parseInt(splitValues[3].trim());
		int result=0;
		switch(operator) {
		case "+":
			result = no1 + no2;
			break;
			default:
				//do nothing
		}
		System.out.println(result);
	}

}
