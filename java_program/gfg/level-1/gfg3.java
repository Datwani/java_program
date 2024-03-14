public class gfg3 {
    public static void main(String[] args) {
        int [] arr={4,5,1,2};
        int i=0,j=arr.length-1,temp=0;

        while (i!=j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        for (i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
