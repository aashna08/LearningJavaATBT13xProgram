package Interview;

public class Questions {

    public void maxDifference(int[] arr)
    {
        int diff=-999;
        int temp;
        for (int i=0;i<arr.length-1;i++)
        {
            temp=arr[i]-arr[i+1];
            if(temp>diff)
            {
                diff=temp;
            }
        }
        System.out.println(diff);
    }

    public static void main(String[] args) {
        int[] arr={5,2,3,4,1};
        Questions q=new Questions();
        q.maxDifference(arr);


    }
}
