public class HollowSquare {
	public static void main(String[] args) {
		int i, j;
		int size = 10; // size should >=2
		char c = '*';
		
		// top part
		for(i=0; i<size; i++){
			System.out.print(c+" ");
		}
		// center part
		for(i=0; i<size-2; i++){
			System.out.print("\n"+c);
			for(j=1; j<(size*2)-2; j++){
				System.out.print(" ");
			}
			System.out.print(c);
		}
		System.out.println();
		// bottom
		for(i=0; i<size; i++){
			System.out.print(c+" ");
		}
		System.out.println();
	}
}