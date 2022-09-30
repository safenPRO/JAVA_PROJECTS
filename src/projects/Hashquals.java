 package projects;

import java.util.HashSet;
import java.util.Set;

public class Hashquals {
// global variables
	public String name;
	public int id;

// constructor
	public Hashquals(String name, int id) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
// create emp objects with same data.
		Hashquals emp1 = new Hashquals("sofiane", 10);
		Hashquals emp2 = new Hashquals("sofiane", 10);
		System.out.println("emp1 name is : " + emp1.name + " and the id is : " + emp1.id);
		System.out.println("emp2 name is : " + emp2.name + " and the id is : " + emp2.id);
		System.out.println("equality between emp1 and emp2 is: " + emp1.equals(emp2));
		System.out.println("emp1 object hashcode is: " + emp1.hashCode());
		System.out.println("emp2 object hashcode is: " + emp2.hashCode());
	
		Set<Hashquals> Hashqual = new HashSet<Hashquals>();
		Hashqual.add(emp1);
		Hashqual.add(emp2);
		System.out.println(Hashqual);
	}
 //override equals
	@Override 
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		Hashquals emp = (Hashquals)obj;
		return(emp.name == this.name && emp.id == this.id);
	}
 //override hashCode 
	@Override
	public int hashCode() {
		final int number = 31;
		int result = 1;
		result = result*number + this.id;
		return result;
		
	}

}
