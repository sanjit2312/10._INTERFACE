package interFace;

public class Multiple_Inheritance_Using_Interface
{

	public static void main(String[] args) 
	{
		
		Son obj=new Son();
		obj.disp();

	}

}
class Father1                   // super class
{
	int a=10;                   // instance variable
	int add(int y)              // method with parameter
	{
		int b=y;               // local variable
		return(a+b); 
	}
}
interface Mother1             //  interface
{
	int c=30;                 // public static final
	void disp();              //  abstract method
}
class Son extends Father1 implements Mother1      
{
	int m=a*Mother1.c;                 // accessing class and interface variable
	int sum=add(30);                   // calling method
	public void disp()                 // defining interface abstract class
	{
		System.out.println("Addition= "+sum);
		System.out.println("Multiplication= "+m);
	}
}