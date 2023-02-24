
public class MginPeople {

	public static void main(String[] args) {
		
		
		Person p1 = new Person("Arial", 37);
		
		Person p2 = new Person("Joseph", 15);
		
		if(p1.getEdad()==p2.getEdad()) 
		{
			
			System.out.print(p1.getName() + "is the same age as" + p2.getName());
           
		}
		
		else {
			
			System.out.print(p1.getName() + "is NOT the same age as" + p2.getName());
		}
	}
	
}
