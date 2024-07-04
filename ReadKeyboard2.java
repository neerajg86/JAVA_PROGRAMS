import java.lang.*;
import java.util.*;

public class ReadKeyboard2
{	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int X,Y,Z;
		System.out.println("Enter Values X,Y and Z:");
		 X=sc.nextInt();
		 Y=sc.nextInt();
		 Z=sc.nextInt();
		System.out.println("Values OF X is : "+X+" Values OF Y is : "+Y+" Values OF Z is: "+Z);		
		int A;
		System.out.println("Total_Value: "+(X+Y+Z));
	}
}