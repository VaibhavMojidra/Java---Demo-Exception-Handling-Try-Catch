
public class Demo {

	public static void main(String[] args) {
		int n1=23;
		int n2=0;
		
		
		
		try {
			int res=n1/n2;
			System.out.println(res);
		} catch (Exception e) {
			System.out.println("Number cannot be divide by zero");
		}
		

	}

}
