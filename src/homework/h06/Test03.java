package homework.h06;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Test03 {
	public static void main(String[] args) {
		while(true) {
			Date date = new Date();
			SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

			System.out.println("当前时间为: " + ft.format(date));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
