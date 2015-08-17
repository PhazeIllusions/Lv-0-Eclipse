public class Methods {
	 public static void main(String[] arg){
		 

	// numbers(1000, 1);

	// }

	// static void numbers(int start, int end) {
	// if (start < end) {

	// for (int i = start; i <= end; i++) {
	// System.out.println(i);
	// }
	// } else {
	// for (int i = start; i >= end; i--) {
	// System.out.println(i);
	// }
	// }
	// }
System.out.println(exponents(3,6));}
	

	static int exponents(int base, int exp) {
		int ans = 1;
		for (int i = 1; i <= exp; i++) {
			ans *= base;
		}
		return ans;
	}
}
