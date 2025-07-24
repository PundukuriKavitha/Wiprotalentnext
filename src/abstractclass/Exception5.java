package abstractclass;
class ValueException extends Exception{
	public ValueException(){
		System.out.println("Age is more than 18 and less than 60");
	}
	ValueException(int msg){
		super();
	}
}
public class Exception5 {
    void checkAge(String name,int age)throws ValueException{
    	if(!(age>=18&&age<60)) {
    		throw new ValueException();
    	}
    	System.out.println(name);
    	System.out.println(age);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Exception5 ag=new Exception5();
     String name=args[0];
     int age=Integer.parseInt(args[1]);
     try {
    	 ag.checkAge(name,age);
     }catch(Exception e) {
    	 e.getMessage();
     }
   	}

}