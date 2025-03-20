package JavaPrograms;

public class DataTypeConversation {

	public static void main(String[] args) {
		byte b;
		int i = 178;
		double d = 147.983;
		
		System.out.println("Converstion of int to byte");
		System.out.println("---------------------------");
		b = (byte)i;
		System.out.println("int is - " + i +" and byte is- " +b);
		
		System.out.println("Conversation of double to int");
		System.out.println("------------------------------");
		i = (int) d;
		System.out.println("int is - "+i+ " And double is - "+d );
		
		System.out.println("Conversation of Double to Byte");
		System.out.println("---------------------------");b 
		d = (byte)b;
		System.out.println("int is - "+i+ " And double is - "+d );
		
	}

}
