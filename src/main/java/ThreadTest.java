
public class ThreadTest {
	
	public volatile static int countter = 0;
	
	public static void inc() {
		try {
			Thread.sleep(1);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		countter++;
	}
	
	public static void main(String args[]) {
		for(int i=0;i<1000;i++) {
			new Thread(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					ThreadTest.inc();
				}
			}.start();
		}
		System.out.println("运行结果:Counter.count=" + ThreadTest.countter);
	}
}
