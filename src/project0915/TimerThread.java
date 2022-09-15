package project0915;

import java.awt.*;
import javax.swing.*;

public class TimerThread extends Thread {
	JLabel timerLabel; // 타이머 값 출력 라벨
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
		
	// thread 코드. run()이 종료하면 스레드 종료
	public void run() {
		int n = 0;
		while(true) { // 무한루프
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); // 1초동안
			} catch (InterruptedException e) {return;}
		}
	}
	public static void main(String[] args) {
		new ThreadTimerExRun();
	}
}

class TimerThread3 implements Runnable {
	JLabel timerLabel; // 타이머 값 출력 라벨
	public TimerThread3(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
		
	// thread 코드. run()이 종료하면 스레드 종료
	public void run() {
		int n = 0;
		while(true) { // 무한루프
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(100); // 1초동안
			} catch (InterruptedException e) {return;}
		}
	}
}

class ThreadTimerExRun extends JFrame {
	public ThreadTimerExRun() {
			setTitle("스레드를 상속받은 타이머 스레드 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// 컨테이너가 뭐지? -> 생성된 컴포넌트들을 담는것
			Container container = getContentPane();
			container.setLayout(new FlowLayout());
			
			JLabel timerLabel=new JLabel();
			timerLabel.setFont(new Font("Gothic",Font.ITALIC,120));		
			container.add(timerLabel);
			
			TimerThread3 run = new TimerThread3(timerLabel);
			Thread th = new Thread(run);
			setSize(250, 150);
			setVisible(true);
			th.start();			
		}
	}

	





