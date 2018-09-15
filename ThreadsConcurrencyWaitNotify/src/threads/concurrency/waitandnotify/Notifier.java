package threads.concurrency.waitandnotify;

public class Notifier implements Runnable {
	
	private Message message;
	
	public Notifier(Message message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try {
			Thread.sleep(1000);
			synchronized(message) {
				message.setMessage(name + "Notifier work done");
				
				//*** Is important test with notify() and notifyAll()
				//message.notify();
				message.notifyAll();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
