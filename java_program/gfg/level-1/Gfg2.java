public class Gfg2 {
    public static void main(String[] args) {
        int []arr={12,1234,45,67,1};
        int count=arr.length;
        int min=0,max=0,temp=0;

        for (int i=0;i< arr.length-1;i++)
        {
            if (arr[i]>arr[i+1])
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

        }
        min=arr[0];
        max=arr[arr.length-1];

        System.out.println("mim is="+min+" max is="+max);
    }
}
