package interFace;

public class One_Interface_One_Class_Implements
{

	public static void main(String[] args)
	{
		
		Beta obj=new Beta();
		obj.disp();

	}

}
interface Papa
{
	public static final int mark=101;
	int roll=131;
	void disp();
}
class Beta implements Papa
{
	int mark1=200;
	int sum=Papa.mark+mark1;
	public void disp()
	{
		System.out.println("Mark= "+sum);
		System.out.println("Roll= "+Papa.roll);

	}

}
