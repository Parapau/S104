package N1E2;

public class CalculDNI {
	
	public static char calculDNI(int num) {
		char car;
		switch (num%23) {
		case 0:
			car = 'T';
			break;
		case 1:
			car = 'R';
			break;
		case 2:
			car = 'W';
			break;
		case 3:
			car = 'A';
			break;
		case 4:
			car = 'G';
			break;
		case 5:
			car = 'M';
			break;
		case 6:
			car = 'Y';
			break;
		case 7:
			car = 'F';
			break;
		case 8:
			car = 'P';
			break;
		case 9:
			car = 'D';
			break;
		case 10:
			car = 'X';
			break;
		case 11:
			car = 'B';
			break;
		case 12:
			car = 'N';
			break;
		case 13:
			car = 'J';
			break;
		case 14:
			car = 'Z';
			break;
		case 15:
			car = 'S';
			break;
		case 16:
			car = 'Q';
			break;
		case 17:
			car = 'V';
			break;
		case 18:
			car = 'H';
			break;
		case 19:
			car = 'L';
			break;
		case 20:
			car = 'C';
			break;
		case 21:
			car = 'K';
			break;
		case 22:
			car = 'E';
			break;
		default:
			System.out.println("El programador es estupid");
			car = '!';
		}
		
		
		return car;
		
	}
	
	
	
	
	
}






























