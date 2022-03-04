// displays the table
public class week1_problem2{
	public static void main(String[] args) {
		
		int a;
		System.out.println("a     a^2     a^3     a^4");
		
		for(a=1;a<5;a++) {
			System.out.print(a+"\t");
			System.out.print(a*a+"\t");
			System.out.print(a*a*a+"\t");
			System.out.println(a*a*a*a+"\t");
		}
		
	}
}