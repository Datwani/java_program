public class Q6 {
    public static void main(String[] args) {
        int num1=102,num2=90,num3=14;

        if ((num1>num2) && (num1>num3))
        {
            System.out.println("num1 ="+num1);
        }
        else if ((num1<num2) && (num2>num3))
        {
            System.out.println("num2 ="+num2);
        }else
        {
            System.out.println("num3="+num3);
        }
    }
}
