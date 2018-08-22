
public class DoggoCompetition {

	public static void main(String[] args) {
		System.out.println(placeFinish(30));
	}
	public static String placeFinish(int place) {
		
		String finishPlaces = "";
		
		for(int i = 1; i <= 100; i++ ) {
			
			if (i == place) {
				continue;
			} else {
				finishPlaces = finishPlaces + i;
				switch(i%10) {
				
					case 1:
						finishPlaces = finishPlaces +"st, ";
						break;
					case 2:
						finishPlaces = finishPlaces +"nd, ";
						break;
					case 3:
						finishPlaces = finishPlaces +"rd, ";
						break;
					default:	
						finishPlaces = finishPlaces +"th, ";
						break;
				}	
			}
		}
		return finishPlaces;
	}
}
