public class method {
	public String name;
	public String family;
	public int age;

	public method(String name, String family, int age) {
		this.name = name;
		this.family = family;
		this.age = age;
	}
	public static void main(String [] String) {
		method id = new method("John", "Doe", 56);
		
		System.out.println(id.name + id.family + id.age);
	}
}



	// public static void main(String [] String) {
	// 	fname("John");
	// }
	// private static void fname (String recipient) {
	// 	System.out.println(recipient + " Doe" );
	// 	System.out.println(recipient + " Mayer" );
	// 	System.out.println(recipient + " Travolta" );
	// }
	
	

