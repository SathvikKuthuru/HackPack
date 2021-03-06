class TowersOfHanoi {
	public static void main(String[] args) {
		int n;
		solve(n, 'A', 'B', 'C');
	}
	static void solve(int n, char start, char medium, char end){
		if(n == 1){
			System.out.printf("%c->%c%n", start, end);
		}
		else{
			solve(n - 1, start, end, medium);
			System.out.printf("%c->%c%n", start, end);
			solve(n - 1, medium, start, end);
		}
	}
}
