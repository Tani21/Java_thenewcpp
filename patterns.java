package project;

public class project {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("loops");
		System.out.println("Printing a rectangle, part 1");
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("Printing hollow rectangle, part 2, 4*5 (rows*column)");
		System.out.println("imp: remember the boundary concept");
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<5; j++)
			{
				if((i==0 || j==0) || (i==3 || j==4)){
					System.out.print("* ");
				}
				
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("traingle of stars");
		for(int i=1; i<=4; i++){
			for(int j=1; j<i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Inverted traingles");
		for(int i=3; i>=0; i-- ){
			for(int j=i+1; j>0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Inverted half pyramid");
		
		
		
		
		

	}

}
