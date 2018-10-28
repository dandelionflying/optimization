package thread;

public class PThread extends Thread {
	private ThreadPool pool;
	private Runnable target;
	private boolean isShutdown = false;
	private boolean isIdle = false;//ÏÐÖÃ×´Ì¬

	public PThread(Runnable target, String name, ThreadPool pool) {
		super(name);
		this.pool = pool;
		this.target = target;

	}

	public Runnable getTarget() {
		return target;
	}
	public boolean isIdle() {
		return isIdle;
	}
	@Override
	public void run() {
		while(!isShutdown) {
			isIdle = false;
			if(target!=null) {
				target.run();
			}
			isIdle = true;
			pool.repool(this);
			synchronized(this) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			isIdle = false;
		}
	}
	
	public synchronized void setTarget(java.lang.Runnable newTarget) {
		target = newTarget;
		notifyAll();
	}
	
	public synchronized void shutdown() {
		isShutdown = true;
		notifyAll();
	}
}
