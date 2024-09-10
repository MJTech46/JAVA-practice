public class FullSquare {
	public static void main(String[] args) {
		int i, j;
		int size = 10;
		char c = '*';
		
		for(i=0; i<size; i++){
			for(j=0; j<size; j++){
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}