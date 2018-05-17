
public class BigONotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int num_occurrences(int n) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if( i == j ) continue;
				if(strings[i] == strings[j]) {
					count++;
				}
			}
		}
		return count;
	}	
}
