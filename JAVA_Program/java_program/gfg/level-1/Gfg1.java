public class Gfg1 {
    public static void main(String[] args) {

        int [] arr={10,20,15,2,23,90,67};

        for (int i=0;i<arr.length-1;i++)
        {
            int j=i+1;

            if ((arr[j]>arr[i]) && (arr[j]>arr[j+1]))
            {
                System.out.println("output is="+arr[j]);
            }
        }
    }
}
