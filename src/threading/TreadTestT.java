package threading;

class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	private int x;

	ThreadDemo(String name, int y) {
		threadName = name;
		x = y;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);
		System.out.println("Thread Priority"+t.getPriority());
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				// Let the thread sleep for a while.
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.setPriority(x);
			t.start();
		}
	}
}

public class TreadTestT {

	public static void main(String args[]) {
		ThreadDemo T1 = new ThreadDemo("Thread-1", 10);
		T1.start();

		ThreadDemo T2 = new ThreadDemo("Thread-2", 5);
		T2.start();
	}
}
