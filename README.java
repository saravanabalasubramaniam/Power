import java.io.*;
import java.util.*;
class Power
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("enter the value of a:");
        long a=input.nextInt();
	System.out.println("enter the value of b:");
	long b=input.nextInt();
        System.out.println(Math.pow(a,b));
	}
}
