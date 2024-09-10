public class Rhombus {
	public static void main(String[] args) {
		int i, j, k;
		int size = 10;
		char c = '*';
		
		for(i=0; i<size; i++){
			for(j=0; j<i; j++)
			System.out.print("  ");
			for(k=0; k<size; k++){
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}