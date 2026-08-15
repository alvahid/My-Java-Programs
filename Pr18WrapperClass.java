public class Pr18WrapperClass {

	public static void main(String[] args) {
		
		String intStr = "1211";
		String longStr = "422133111111";
		String floatStr = "1.007";
		String doubleStr = "2253014415.53221";
		
		//Using Parse methods
		int intNum = Integer.parseInt(intStr);
		long longNum = Long.parseLong(longStr);
		float floatNum = Float.parseFloat(floatStr);
		double doubleNum = Double.parseDouble(doubleStr);
		
		//Printing converted values
		System.out.println("Converted values: ");
		System.out.println("Int: "+intNum);
		System.out.println("Long: "+longNum);
		System.out.println("float: "+floatNum);
		System.out.println("Double: "+doubleNum);
		
		//Addition
		long add1 = intNum+longNum;
		double add2 = floatNum+doubleNum;
		String longString = Long.toString(add1);
		String DoubleString = Double.toString(add2);
		
		//Printing final output
		System.out.println("\nAdded values in string");
		System.out.println("Add 1: "+longString);
		System.out.println("Add 2: "+DoubleString);
 	}
}
