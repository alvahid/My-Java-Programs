
public class Demo {

	public static void main(String[]args) {
		//Creating objects of previously made classes 
		
		NurseryStudent nur = new NurseryStudent();
		HighSchoolStudent high = new HighSchoolStudent();
		
		//Entering values into variables of objects
		high.setFirstName("Al-Vahid");
		high.setLastName("Vadgaonkar");
		high.setRollNo(24);
		
		high.setHouse("Cygnus");
		nur.setClasses (String.valueOf(10));
		nur.setSection('A');
		HighSchoolStudent.setHeadGirlOrBoy ("Tammana");
		System.out.println("First Name: "+high.firstName+'\n'+"Last name: "+high.lastName+'\n'+"STD: "+ nur.classes+'\n'+"Section"+ nur.section+"Roll No: "+high.rollNo+'\n'+"Head G/B: " +high.headGirlOrBoy+'\n'+"House: "+high.house);
		
		//Entering values into variables of objects
		high.setFirstName("Mayank");
		high.setLastName("Kukreja");
		high.setRollNo(16);
		
		high.setHouse("Aquila");
		nur.setClasses (String.valueOf(10));
		nur.setSection('B');
		System.out.println('\n'+"First Name: "+high.firstName+'\n'+"Last name: "+high.lastName+'\n'+"STD: "+ nur.classes+'\n'+"Section"+ nur.section+"Roll No: "+high.rollNo+'\n'+"Head G/B: " +high.headGirlOrBoy+'\n'+"House: "+high.house);
		
	}
}
