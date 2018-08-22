import java.util.ArrayList;
import java.util.Scanner;

public class Goldilocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//int test[][] = {{30, 130, 90, 150, 120, 200, 110},{50, 60, 60, 85, 70, 200, 100}};
			//goldilocksChairs(test, 100, 80);
			
			ArrayList<Chairs> chairsinput = new ArrayList <Chairs>();
			
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the number of position : ");
			int n = reader.nextInt();
			
			for (int i = 0; i < n ; i++ ) {
				System.out.println("Enter the weight of chairs: ");
				chairsinput.add(new Chairs(reader.nextInt()));
			}
			
			ArrayList<Porridges> weightInput = new ArrayList <Porridges>();
			
			for (int i = 0; i < n ; i++ ) {
				System.out.println("Enter the temp of porridges: ");
				weightInput.add(new Porridges(reader.nextInt()));
			}
			
			
			goldilocksChairs2(chairsinput, weightInput, 100 , 80 );
			
	}
	
	public static void goldilocksChairs(int[][] input, int a , int b ){
				
		
		for(int i = 0 ; i < input[1].length; i++) {
				if (input[0][i] >= a && input[1][i] < b ) {
					System.out.println(i+1);
				} 
		
		}
		
	}
	
public static void goldilocksChairs2(ArrayList<Chairs> ch, ArrayList<Porridges> po, int a , int b ){
				
		
			for (int i = 0; i < ch.size(); i++ ) {
					if (ch.get(i).getWeight() > a && po.get(i).getTemp() < b) {
						System.out.println(i+1);	
					}
			}
		
	}
	
	
	
	
	

}





