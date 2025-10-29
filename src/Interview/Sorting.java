package Interview;

public class Sorting {

    //start with second element and compare it with previous ones.
    //example 12,13,11 first key will be 13 and it will be compared with 12
    // then key will be 11 it will be compared with 12,13
    public static void insertionSort(int[] arr)
    {
        int key;
        int j;
        for (int i=1;i<arr.length;i++)
        {
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
    }

    public static void bubbleSort(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printArray(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void merge(int[] arr,int l,int h,int mid)
    {
        int i=l;
        int j=mid+1;
        int k=l;
        int[] temp=new int[arr.length];
        while(i<=mid && j<=h)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i>mid)
        {
            while(j<=h)
            {
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        else {
            while(i<=mid)
            {
                temp[k]=arr[i];
                i++;
                k++;
            }
        }
        for(k=l;k<=h;k++)
        {
            arr[k]=temp[k];
        }
    }

    public static void mergeSort(int[] arr,int l,int h)
    {
        if(l<h) {
            int mid = (l + h) / 2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,h);
            merge(arr,l,h,mid);
        }
    }



    public static void main(String[] args) {
        int[] arr ={12,11,13,5,6};
        //insertionSort(arr);
        //bubbleSort(arr);
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
