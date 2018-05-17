

/*
 * Answers to the last two questions:
 * 1) BubbleSort:
 * 	-- > f(x) = n * n;
 *	--> g(x) = n^2
 * 
 * 2) 
 * 
 * 
 * Answers to Part I:
 * 
 * 1) Answer: Log(n)
 * 
 * 2) Answer: n^4
 * 
 * 3) Answer: n^3
 * 
 * 4) Answer: n^5
 * 
 * 5) Answer: n^2
 * 
 * 6) Answer: n log(n)
 * 
 * */
public class BigONotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * Number of operations = 1;
	 * f(x) = 1; c == 0, k = >-1 && >1
	 * O(1)
	 * */
	public static boolean isEmpty() {
		return head == null;
	}

	/*
	 * Number of operations = 4;
	 * f(x) = c + 2n, c >= 1, k >= 1
	 * O(2n)
	 * */
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

	/*
	 * Number of operations = 2;
	 * f(x) = n + n, c <= infinity?, k >= 1
	 * O(2n)
	 * */
	public static void c(int n) { //three loops
		for(int a = 0; a < n; a++) {
			System.out.println( a * a);
		}
		num_occurrences(n);
	}

	/*
	 * Number of operations = 5?
	 * f(x) = n, c <= ??? what is C?, k >= 3
	 * O(n)
	 * */
	public static boolean isPrime(int n) {
		if(n == 1) return false;
		for(int i = 2; i <n; i++) {
			if( n % i == 0 ) {
				return false;
			}
		}
		return true;
	}
}
