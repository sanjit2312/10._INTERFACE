package interFace;

public class More_Than_One_Interface_Implemented_In_Single_Class 
{

	public static void main(String[] args)
	{
		
		Daughter obj=new Daughter();
		obj.disp();
		obj.add();

	}

}
interface PapaG
{
	public static final int mark=101;
	int roll=131;
	void disp();
}
interface Mother
{
	int mark1=121;
	void add();
}	
class Daughter implements PapaG,Mother
{
	int sum=PapaG.mark+Mother.mark1;
	public void disp()
	{
		System.out.println("Roll= "+PapaG.roll);
	}
	public void add()
	{
		System.out.println("Total Matk= "+sum);
	}
	
}
