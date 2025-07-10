//creating the object
package cfg.java.classobject;

public class Main {
	public static void main(String[] args) {
		// here i created the obj of the MyClass
		// mc is a reference variable and new keyword is used to create the obj
		MyClass mc = new MyClass(1, "manikanta");
		System.out.println("id: " + mc.id);
		System.out.println("name: " + mc.name);
		mc.display();
		
	}

}
