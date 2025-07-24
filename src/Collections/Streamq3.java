package Collections;
import java.util.*;
class Studentt{
	int rollNo;
	String name;
	int marks;
	Studentt(int rollNo,String name,int marks){
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
}
public class Streamq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Studentt> li=new ArrayList<>();
     li.add(new Studentt(1,"Teju",90));
     li.add(new Studentt(2,"Jyosh",40));
     li.add(new Studentt(3,"vaish",85));
     li.add(new Studentt(4,"sweety",42));
     li.add(new Studentt(5,"mokshi",88));
     long c=li.stream().filter(s->s.marks>50).count();
     System.out.println(c);
	}

}