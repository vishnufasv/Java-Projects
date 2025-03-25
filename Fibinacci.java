package basicprograms;

public class Fibinacci {

	public static void main(String[] args) {
		int a =0;
		int b =1;
		int next;
		for(int i =0;i<20;i++) {
			if(a>20) {
				break;
			}
			System.out.print(a+" ");
			next = a+b;
			a=b;
			b=next;
		}

	}

}
