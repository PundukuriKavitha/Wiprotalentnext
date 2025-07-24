package Collections;
interface myReff{
	int count(int n);
}
public class Methodq2 {
   public static int digitCount(int n) {
	   int cou=0;
	   while(n>0) {
	   n=n/10;
	   cou++;
	   }
	   return cou;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       myReff rf=Methodq2::digitCount;
       System.out.println(rf.count(123));
	}

}