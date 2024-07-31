import java.util.*;
public class name{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a,b;
        a=read.nextInt();
        b=read.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}