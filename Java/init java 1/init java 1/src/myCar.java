public class myCar {
	public String carName; // attribut
	public int speed;
	public int regime;

	public myCar(String carName, int speed, int regime) { //public so we need to make a "NEW" class on main
		this.carName = carName; //this.attribut = new attribut value
		this.speed = speed;
		this.regime = regime;
	}
	public static void main(String [] String) {
		myCar car = new myCar("Honda", 250, 100); // creating a new object of the attribute public myCar
		
		System.out.println(car.carName + " car speed " + car.speed + " regime " + car.regime);
	}
}