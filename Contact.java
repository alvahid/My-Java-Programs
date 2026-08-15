import java.util.Scanner;

public class Contact {
    String first, last;
    Long contact1, contact2;
    //Creating createContact method for first condition
    public void createContact(String fName, long num) {
        first = fName;
        contact1 = num;
    }
    //Creating createContact method for second condition
    public void createContact(String fName, long num, String lastName) {
        first = fName;
        last = lastName;
        contact1 = num;
    }
    //Creating createContact method for third condition
    public void createContact(String fName, long num1, long num2) {
        first = fName;
        contact1 = num1;
        contact2 = num2;

    }
    //Creating createContact method for fourth condition
    public void createContact(String fName,String lastName, long num1, long num2) {
        first = fName;
        last = lastName;
        contact1 = num1;
        contact2 = num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creating object of class Contact and passing values in it's methods
        System.out.println("Enter first contact details: ");
        System.out.println("First Name");
        String name1 = sc.next();
        System.out.println("Enter the number: ");
        long con1 = sc.nextLong();
        Contact contact1 = new Contact();
        contact1.createContact(name1, con1);
        System.out.println();

        //Creating object of class Contact and passing values in it's methods
        System.out.println("Enter second contact details: ");
        System.out.println("First Name");
        String name2 = sc.next();
        System.out.println("Last Name");
        String lname1 = sc.next();
        System.out.println("Enter the number: ");
        long con2 = sc.nextLong();
        Contact contact2 = new Contact();
        contact2.createContact(name2, con2, lname1);
        System.out.println();

        //Creating object of class Contact and passing values in it's methods
        System.out.println("Enter Thrid contact details: ");
        System.out.println("First Name");
        String name3 = sc.next();
        System.out.println("Enter the first number: ");
        long con3 = sc.nextLong();
        System.out.println("Enter the second number: ");
        long con4 = sc.nextLong();
        Contact contact3 = new Contact();
        contact3.createContact(name3, con3, con4);
        System.out.println();

        //Creating object of class Contact and passing values in it's methods
        System.out.println("Enter fourth contact details: ");
        System.out.println("First Name");
        String name4 = sc.next();
        System.out.println("Last Name");
        String lname2 = sc.next();
        System.out.println("Enter the first number: ");
        long con5 = sc.nextLong();
        System.out.println("Enter the second number: ");
        long con6 = sc.nextLong();
        Contact contact4 = new Contact();
        contact4.createContact(name4, lname2, con5, con6);
        System.out.println();

        //Printing all the contacts
        System.out.println("Success contacts created!"+'\n');
        System.out.println("Contact 1: "+'\n'+"First Name: "+contact1.first+'\n'+"Contact number: "+contact1.contact1+'\n');
        System.out.println("Contact 2: "+'\n'+"First Name: "+contact2.first+'\n'+"Last name: "+contact2.last+'\n'+"Contact number: "+contact2.contact1+'\n');
        System.out.println("Contact 3: "+'\n'+"First Name: "+contact3.first+'\n'+"Contact number 1 : "+contact3.contact1+'\n'+"Contact number 2: "+contact3.contact2+'\n');
        System.out.println("Contact 4: "+'\n'+"First Name: "+contact4.first+'\n'+"Last name : "+contact4.last+'\n'+"Contact number 1: "+contact4.contact1+'\n'+"Contact number 2: "+contact4.contact2+'\n');
    }
}

