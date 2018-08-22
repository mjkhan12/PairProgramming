import java.util.ArrayList;

public class DoggoCompetition {

	public static void main(String[] args) {
		// System.out.println(placeFinish(30));
		// System.out.println(placeFinish2(30));

		placeFinish3(30);
	}

	public static String placeFinish(int place) {

		String finishPlaces = "";

		for (int i = 1; i <= 100; i++) {

			if (i == place) {
				continue;
			} else {
				finishPlaces = finishPlaces + i;
				switch (i % 10) {

				case 1:
					if (i == 11) {
						finishPlaces = finishPlaces + "th, ";
					} else {
						finishPlaces = finishPlaces + "st, ";
					}
					break;
				case 2:
					if (i == 12) {
						finishPlaces = finishPlaces + "th, ";
					} else {
						finishPlaces = finishPlaces + "nd, ";
					}
					break;
				case 3:
					if (i == 13) {
						finishPlaces = finishPlaces + "th, ";
					} else {
						finishPlaces = finishPlaces + "rd, ";
					}

					break;
				default:
					finishPlaces = finishPlaces + "th, ";
					break;
				}
			}
		}
		return finishPlaces;
	}

	public static String placeFinish2(int place) {

		ArrayList<Integer> placeList = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			placeList.add(i);
		}

		placeList.remove(place);

		String finishPlaces = "";

		for (int i = 0; i < placeList.size(); i++) {

			finishPlaces = finishPlaces + placeList.get(i);
			switch (placeList.get(i) % 10) {

			case 1:
				if (placeList.get(i) == 11) {
					finishPlaces = finishPlaces + "th, ";
				} else {
					finishPlaces = finishPlaces + "st, ";
				}
				break;
			case 2:
				if (placeList.get(i) == 12) {
					finishPlaces = finishPlaces + "th, ";
				} else {
					finishPlaces = finishPlaces + "nd, ";
				}
				break;
			case 3:
				if (placeList.get(i) == 13) {
					finishPlaces = finishPlaces + "th, ";
				} else {
					finishPlaces = finishPlaces + "rd, ";
				}
				break;
			default:
				finishPlaces = finishPlaces + "th, ";
				break;
			}
		}

		return finishPlaces;
	}

	public static void placeFinish3(int place) {

		ArrayList<Integer> placeList = new ArrayList<>();
		ArrayList<String> placeListend = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			placeList.add(i);
		}

		placeList.remove(place - 1);

		for (int i = 0; i < placeList.size(); i++) {
			switch (placeList.get(i) % 10) {
			case 1:
				if (placeList.get(i) == 11) {
					placeListend.add(placeList.get(i) + "th, ");
				} else {
					placeListend.add(placeList.get(i) + "st, ");
				}
				break;
			case 2:
				if (placeList.get(i) == 12) {
					placeListend.add(placeList.get(i) + "th, ");
				} else {
					placeListend.add(placeList.get(i) + "nd, ");
				}
				break;
			case 3:
				if (placeList.get(i) == 13) {
					placeListend.add(placeList.get(i) + "th, ");
				} else {
					placeListend.add(placeList.get(i) + "rd, ");
				}

				break;
			default:
				placeListend.add(placeList.get(i) + "th, ");
				break;
			}
		}
		for (int i = 0; i < placeListend.size(); i++) {
			
			System.out.print(placeListend.get(i));
		}
	}
}
