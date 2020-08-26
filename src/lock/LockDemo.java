package lock;
/**
 * @description 
 * @createDate 2020年8月26日 下午1:31:09
 * @modifyDate 2020年8月26日
 * @modifiedBy zzx
 * @author zzx
 *
 */
public class LockDemo {
	public static void main(String[] args) {
		new Thread(new Runnable() {

			StringLock lockUtil = new StringLock();
			@Override
			public void run() {
				try {
					lockUtil.testSynchronized("hh");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(new Runnable() {
			StringLock lockUtil = new StringLock();
			@Override
			public void run() {
				try {
					lockUtil.testSynchronized("hh");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}

