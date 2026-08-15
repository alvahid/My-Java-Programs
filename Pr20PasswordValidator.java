import java.util.Scanner;
public class Pr20PasswordValidator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean valid = true;

        //using do while loop for validation
        do {
            System.out.println("Enter your password: ");
            String pass = sc.nextLine();
            //initializing boolean for checking conditions
            boolean countInt=false, countSpecChar=false, countUCase=false, countLCase=false, countSpace=false, charCount=true;
            char ch;
            for(int i=0; i<pass.length(); i++) {
                //extracting character from string at position i to check for the datatype
                ch = pass.charAt(i);
                if (Character.isDigit(ch)) {
                    countInt=true;
                }
                else if(Character.isUpperCase(ch)) {
                    countUCase=true;
                }
                else if(Character.isLowerCase(ch)) {
                    countLCase=true;
                }
                else if(Character.isWhitespace(ch)) {
                    countSpace=true;
                }
                else {
                    countSpecChar=true;
                }
            }
            //final checking of all conditions for password
            if(pass.length()<8 || pass.length()>16) {
                System.out.println("Password length should be between 8 and 16 characters");
                charCount = false;
            }
            if(!countInt) {
                System.out.println("Password should have a digit");
            }
            if(!countLCase) {
                System.out.println("Password should have a lowercase letter");
            }
            if(!countUCase) {
                System.out.println("Password should have a uppercase letter");
            }
            if(countSpace) {
                System.out.println("Password should not have space");
            }
            if(!countSpecChar) {
                System.out.println("Password should have a special digit");
            }
            //if the conditions are true the password is valid
            if(countInt && countLCase && !countSpace && countUCase && countSpecChar && charCount) {
                System.out.println("Password valid");
                System.exit(0);
            }
            System.out.println();
        } while(valid == true);
    }
}
