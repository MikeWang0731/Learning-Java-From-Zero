package ThreadSync;

public class Test {
	/*
	public synchronized void saveAccount() [Bank.java]
	通过使用"synchronized"关键字来保证在进行存款时，不允许其他线程进行对账户进行操作，
	此时，Bank对象(多个线程共享的对象)被锁定！
	这称为：线程同步 或 线程互斥

	synchronized可以用在：成员方法，静态方法或语句块

	语句块的例子:
	public void drawAccount() {
		synchronized (this) {
		......
		}
	}
	 */
	public static void main(String[] args) {
		// 创建帐户，给定余额为1000
		Bank bank=new Bank("1001",1000);
		//创建线程对象
		SaveAccount sa=new SaveAccount(bank);
		DrawAccount da=new DrawAccount(bank);
		Thread save=new Thread(sa);
		Thread draw=new Thread(da);
		save.start();
		draw.start();
		try {
			draw.join();
			save.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bank);
	}
}
