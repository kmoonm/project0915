package pack2;
import pack1.Car;
public class Truck extends Car {
	Truck() {
		System.out.println("패키지2의 트럭 생성자");
	}
	
	public static void main(String[] args) {
		Truck truck = new Truck();
		System.out.println(Car.car_name);
		System.out.println(pack1.Car.car_name);
		
	}
}