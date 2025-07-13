package Test_Questions;

public class String003_performancedifference {
    public static void main(String[] args) {
        long start_time;
        long end_time;
        String str="";
        int iterations=1000;
        start_time=System.currentTimeMillis();
        for (int i=0;i<iterations;i++)
        {
            str=str+"a";
        }
        end_time=System.currentTimeMillis();
        System.out.println("Time taken by concat function "+(end_time-start_time));
        StringBuilder sb=new StringBuilder();
        start_time=System.currentTimeMillis();
        for (int i=0;i<iterations;i++)
        {
            sb.append("a");
        }
        end_time=System.currentTimeMillis();
        System.out.println("Time taken by string builder "+(end_time-start_time));
        StringBuffer sbr=new StringBuffer();
        start_time=System.currentTimeMillis();
        for (int i=0;i<iterations;i++)
        {
            sbr.append("a");
        }
        end_time=System.currentTimeMillis();
        System.out.println("Time taken by string buffer "+(end_time-start_time));



    }
}
