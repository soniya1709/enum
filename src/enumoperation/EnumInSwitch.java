package enumoperation;


enum Month{
	JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE;
}
public class EnumInSwitch {
	public static void main(String[] args) {
		Month mon=Month.APRIL;
		switch(mon) {
		case JANUARY:
			System.out.println("JANUARY");
			break;
		case FEBRUARY:
			System.out.println("FEBRUARY");
			break;
		case MARCH:
			System.out.println("MARCH");
			break;
		case APRIL:
			System.out.println("APRIL");
			break;
		case MAY:
			System.out.println("MAY");
			break;
		case JUNE:
			System.out.println("JUNE");
			break;
			
		}
	}
}
