package enumoperation;

public class EnumInLoop {
enum size
{
	SMALL,MEDIUM,LARGE;
}
public static void main(String[] args) {
	for(size s:size.values())
	{
		System.out.println(s);
	}
}
}
