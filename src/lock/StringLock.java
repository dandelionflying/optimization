package lock;

public class StringLock {

	public void testSynchronized(String string ) throws InterruptedException {
		String lock = buildLock(string);
		synchronized (lock) {
			System.err.println(lock.hashCode());
			System.err.println(Thread.currentThread().getName()+"进来了");
			Thread.sleep(4000);
			System.err.println(Thread.currentThread().getName()+"结束了");
		}
	}
	
	private String buildLock(String string) {
//		StringBuilder sb = new StringBuilder();
//		sb.append(string);
//		String lock = sb.toString().intern();
		String lock = string.toString().intern();
		System.err.println("[" + Thread.currentThread().getName() + "]构建了锁[" + lock + "]");
		return lock;
	}
}

