package Collections;
interface WordCount{
	int count(String str);
}

public class Lambdaq3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WordCount wc=(str)->{
	   if(str==null||str.trim().isEmpty()) {
		   return 0;
	   }
	   String[] words=str.trim().split("\\s+");
	   return words.length;
   };
   String Sen="Wipro Talent Next";
   int Count=wc.count(Sen);
   System.out.println("No of words "+Count);
	}

}