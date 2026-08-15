import java.util.Scanner;
public class PrePaidTaxi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tno;
        float dis;

        System.out.print("Enter taxi number: ");
        tno = in.next();

        System.out.print("Enter distance travelled by the taxi: ");
        dis = in.nextFloat();

        System.out.println('\n'+"Bill:");
        System.out.println("Taxi No.                          : "+tno);
        System.out.println("Distance covered                  : "+dis);
        if (dis<=5) {
            System.out.println("Amount                            : Rs.100");
        }
        else if (dis>5 && dis<=10) {
            System.out.println("Amount                            : Rs."+(10*dis));
        }
        else if (dis>10 && dis<=25) {
            System.out.println("Amount                            : Rs."+(8*dis));
        }
        else if (dis>25) {
            System.out.println("Amount                            : Rs."+(5*dis));
        }
    }
}
