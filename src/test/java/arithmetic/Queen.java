package arithmetic;

/**
 * 八皇后问题
 * @author hujian
 *
 */
public class Queen {
	
	int num = 8;
	int[] array = new int[num];
	int count = 0;
	
	void out() {  
		count++;
		System.out.print("第"+count+"条："); 
	    for(int i=0; i<num; i++) { 
	    	System.out.print(array[i]+" "); 
	    }
	    
		System.out.println(); 
	}  
	
	public void display(int pos) {
		for(int i=0; i<pos-1; i++) {
			int off = array[i] - array[pos-1];
			if(off==0 || off==pos-1-i || -off==pos-1-i) {
				return;
			}
		}
		
		if(pos == num) {
			out();
			return;
		}
		
		for(int i=0; i<num; i++) {
			array[pos] = i;
			display(pos+1);
		}
	}
	
	public static void main(String args[]) {
		Queen queen = new Queen();
		queen.display(0);
		System.out.println("总共："+queen.count);
	}
}
