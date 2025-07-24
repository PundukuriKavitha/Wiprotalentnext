package abstractclass;
class foundation{
	private int var1;
	int var2;
	protected int var3;
	public int var4;
}
public class Package2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     foundation found=new foundation();
     System.out.println("Var2"+found.var2);
     System.out.println("Var3"+found.var3);
     System.out.println("Var4"+found.var4);
     //System.out.println("Var1"+found.var1);
     
	}

}