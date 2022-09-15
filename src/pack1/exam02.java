package pack1;

public class exam02 {

	public static void main(String[] args) {
		class car extends thread implements Runnable {
			String carName;
			car(String carName) {
				this.carName=carName;
			}
			
			public void run() {
				for(int i=0;i<3;i++) {
					try {
						Thread.sleep(500);
						System.out.println(carName + "은/는 달립니다.");
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	
		car car1 = new car("람보르기니");
		Thread ram1 = new Thread(car1);
		ram1.start();
		
		car car2 = new car("페라리");
		Thread ram2 = new Thread(car2);
		ram2.start();
		
		car car3 = new car("에스턴 마틴");
		Thread ram3 = new Thread(car3);
		ram3.start();

	}

}
