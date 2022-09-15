package project0915;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class vibrationEx extends JFrame implements Runnable {
	Thread th;
	public vibrationEx() {
		// 윈도우 창틀 정의하기
		setTitle("진동 생성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setLocation(300, 300);
		setVisible(true);
		
		// 마우스에 반응을 하기 위한 코드 생성
		getContentPane().addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				// 만약에 스레드가 살아있다면
				if(!th.isAlive()) {
					return;
				}
				// 마우스 누르면 멈춤
				th.interrupt();					
				}
			});
			th=new Thread(this);
			th.start();
	}
	public void run() {
		// 무작위 추출
		Random r = new Random();
		while(true) {
			try {
				Thread.sleep(20);
			} catch(Exception e) {
				return;
			}
			// 왜 4 범위 안에서만 움직이지?
			int x = getX()+r.nextInt()%5;
			int y = getY()+r.nextInt()%5;
			setLocation(x, y);
		}
	}
	public static void main(String[] args) {
		// 스레드 아이디를 가져옴
		long id=Thread.currentThread().getId();
		// 스레드 이름을 가져옴
		String name = Thread.currentThread().getName();
		// 스레드 우선순위
		int priority = Thread.currentThread().getPriority();
		// 스레드 상태
		Thread.State s = Thread.currentThread().getState();
		
		// 스레드 아이디 이름 우선순위 스레드 상태 알아보기
		System.out.println("스레드 아이디 : " + id);
		System.out.println("스레드 이름 : " + name);
		System.out.println("스레드 우선순위 : " + priority);
		System.out.println("스레드 상태 : " + s);
		new vibrationEx();

	}

}
