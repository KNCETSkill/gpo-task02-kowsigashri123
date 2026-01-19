import java.util.Scanner;

public class AttendanceStatusEvaluator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        {
            if (a > 85)
                System.out.print("Excellent");
            else if(a >= 60 && a <= 85)
                System.out.print("Satisfactory");
            else if(a < 60)
                System.out.print("Poor");
        }
            sc.close();
    }
}
