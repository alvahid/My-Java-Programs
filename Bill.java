
public class Bill {

	int bno;
	String name;
	int call;
	double amt;
	
	Bill() {
		bno = 0;
		name = "Cust name";
		call = 0;
	}
	Bill(int billNo, String custName, int noOfCalls) {
		bno = billNo;
		name = custName;
		call = noOfCalls;
	}
	double Calculate(int call){
		if(call<=100) {
			amt = call*0.6;
		}
		else if(call>100 && call<=200) {
			int n = call-100;
			amt = (100*0.6)+(n*0.8);
		}
		else if(call>200 && call<=300) {
			int n = call-200;
			amt = (100*0.6)+(100*0.8)+(n*1.2);
		}
		else if(call>300) {
			int n = call-300;
			amt = (100*0.6)+(100*0.8)+(100*1.2)+(n*1.5);
		}
		return amt;
	}
	void Display() {
		System.out.println('\t'+name+"'s BILL");
		System.out.println("Customer's Name: "+'\t'+name);
		System.out.println("Bill No: "+'\t'+'\t'+bno);
		System.out.println("Number of calls made: "+'\t'+call);
		System.out.println("Amount of Bill: "+'\t'+amt);
	}
}
