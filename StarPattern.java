//Creating public class
public class StarPattern {
    //Main method
    public static void main(String[] args) {
        //Nested for loop
        for(int i=1; i<=4; i++) { //Outer for loop responsible for columns
            for(int j=1; j<=i; j++) { //Inner for loop responsible for rows
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
