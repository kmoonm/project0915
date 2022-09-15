package pack1;

public class thread {
	
	public static void main(String[] args) {
		
		class car {
			String carName;
			car(String carName) {
				this.carName = carName;
			}
			public void run() {
				for(int i=0; i < 3; i++) {
					try {
						Thread.sleep(500);
						System.out.println(carName+"달립니다.");
					} catch(Exception e) {
						System.out.println("계산 실패");
						e.printStackTrace();
					} 
				}
			}	
		}
			car car1 = new car("슈퍼자동차");
			car1.run();
			
			car car2 = new car("우리자동차");
			car2.run();
			
			car car3 = new car("사랑자동차");
			car3.run();
	}
}

