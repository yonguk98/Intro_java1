public class casting{
	public static void main(String[] args) {
		
		double a = (int)1.1;
		int b = (int)1.1;
		System.out.println(b);
		System.out.println(a);
		
		String f = Integer.toString(1);
		System.out.println(f);
		System.out.println(f.getClass()); 
	}
}