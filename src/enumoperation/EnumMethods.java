package enumoperation;

public class EnumMethods {
enum size
{
	SMALL,MEDIUM,LARGE
}
public static void main(String[] args){
	System.out.println(size.MEDIUM.compareTo(size.LARGE));
	
	System.out.println("************");
	System.out.println(size.SMALL.toString());
	System.out.println("************");
	System.out.println(size.valueOf("SMALL"));
	
}

}
