package 계란삶기타이머;

import javax.swing.JOptionPane;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task extends TimerTask{
	public void run() {
		System.out.println("계란 삶는 중");	
	}
}
class Task2 implements Runnable{
	public void run() {
		JOptionPane.showMessageDialog(null, "계란 삶기 완료");	
	}	
}

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		//task를 1000ms(1초) 간격으로 반복
		timer.scheduleAtFixedRate(new Task(), 5000, 5000);
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task2(), 30, 30, TimeUnit.SECONDS);
	}
}
