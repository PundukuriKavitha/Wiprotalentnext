package abstractclass;
abstract class Compartment{
	abstract String notice();
}
class FirstClass extends Compartment{
	String notice() {
		return "FirstClass";
	}
}
class Ladies extends Compartment{
	String notice() {
		return "Ladies";
	}
}
class General extends Compartment{
	String notice() {
		return "General";
	}
}
class Luggage extends Compartment{
	String notice() {
		return "Luggage";
	}
}
public class Abstractq1 {

	public static void main(String[] args) {
		Compartment[] compart=new Compartment[10];
		for(int i=0;i<10;i++) {
			int randNum=(int)(Math.random()*4)+1;
			switch(randNum) {
			case 1:
				compart[i]=new FirstClass();
				break;
			case 2:
				compart[i]=new Ladies();
				break;
			case 3:
				compart[i]=new General();
				break;
			case 4:
				compart[i]=new Luggage();
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println("Compartment"+(i+1)+":"+compart[i].notice());
		}
               
	}

}

