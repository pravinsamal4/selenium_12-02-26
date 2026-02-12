package sept_2025_selenium;

public class C10_try_catch {
	public void test(int a, int b) {
		
		try{
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Wrong input");
		}
	}
	public static void main(String[] args) {
		C10_try_catch a=new C10_try_catch();
		a.test(5, 0);
		System.out.println("thank you for using later");
	}

}
