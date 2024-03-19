import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double mile=0.621371;
        System.out.print("Enter kilometers:");
        double km=sc.nextInt();

        double sum= km*mile;

        System.out.println(sum);
    }
}
