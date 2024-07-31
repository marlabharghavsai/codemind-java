import java.util.*;
public class name{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        float a,b,c;
        a=read.nextFloat();
        b=read.nextFloat();
        c=read.nextFloat();
        System.out.printf("%.2f
%.2f
",a*0.12,(a*0.12)+a+b+c);
    }
}