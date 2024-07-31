import java.util.*;
public class name 
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a;
        a=read.nextInt();
        System.out.println(a/60+" Hour(s) "+(a%60)+" Minute(s)");
    }
}