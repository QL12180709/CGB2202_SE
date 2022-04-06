package homework.h06;

public class Test01 {
	public static void main(String[] args) {
		MyRunnable run = new MyRunnable();
		Thread t = new Thread(run);
		t.start();
	}
}

class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("你好!");
		}
	}
}




