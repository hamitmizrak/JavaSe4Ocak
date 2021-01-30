package com.ecodation.threads;

public class MainTest2 {

	public static void main(String[] args) throws InterruptedException {
		KalitimThread kalitimThread = new KalitimThread();
		KalitimThread kalitimThread2 = new KalitimThread();
		KalitimThread kalitimThread3 = new KalitimThread();

		kalitimThread.setPriority(Thread.MIN_PRIORITY);
		kalitimThread3.setPriority(Thread.MAX_PRIORITY);
		kalitimThread2.setPriority(Thread.NORM_PRIORITY);

		kalitimThread.start();
		kalitimThread2.start();
		kalitimThread3.start();

		kalitimThread.join();
		kalitimThread2.join();
		kalitimThread3.join();

		kalitimThread.wait();
		kalitimThread2.wait();
		kalitimThread3.wait();

		kalitimThread.notify();
		kalitimThread2.notify();

		kalitimThread.notifyAll();

	}
}
