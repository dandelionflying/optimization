package suanfa;

/**
 * @author dandelion
 *	
 *	≤Â÷µ≤È’“
 */
public class InsertFind {
	
	public int find(int[] data,int value) {
		int low=0;
		int high=data.length-1;
		int mid = 0;
		while(low<high) {
			
			mid = (int) (low+(value-data[low])/(float)(data[high]-data[low])*(high-low));
			if(data[mid]==value) {
				return mid;
			}else if(value>data[mid]) {
				low = mid+1;
			}else
				mid = mid-1;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] d= {1,2,3,4,5,7,8,15,19,20,26,28,39};
		InsertFind inse = new InsertFind();
		System.out.println(inse.find(d,7));
	}
}
