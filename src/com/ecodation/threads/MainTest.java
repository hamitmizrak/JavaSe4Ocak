package com.ecodation.threads;

public class MainTest {

	public static void isimsizThread() {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("İsimsiz Thread");

			}
		});
	}

	public static void main(String[] args) {
		KalitimThread kalitimThread = new KalitimThread();
		kalitimThread.start();

		System.out.println(kalitimThread.getName());
		kalitimThread.setName("Thread adı bu olsun");
		System.out.println(kalitimThread.getName());

		String result = kalitimThread.isAlive() ? "yaşıyor" : "yaşamıyor";
		System.out.println(result);

		isimsizThread();

		// ınterface
		Thread thread = new Thread(new InterfaceThread());
		thread.start();

	}
}
