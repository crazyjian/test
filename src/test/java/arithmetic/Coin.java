package arithmetic;

public class Coin {
	
	public int put() {
		int[] money = {1, 3, 5};
		int sum = 11;
		int[] db = new int[sum+1];
		
		for(int i=0;i<db.length;i++) {
			db[i] = i;
		}
		
		for(int i=0; i<db.length; i++) {
			for(int j=0; j<money.length; j++) {
				if(i>=money[j] && db[i-money[j]]+1<db[i]) {
					db[i] = db[i-money[j]]+1;
				}
			}
		}
		
		return db[sum];
	}
	
	public static void main(String args[]) {
		Coin coin = new Coin();
		System.out.println("需要最少的硬币数量为："+coin.put());
	}
	
}
