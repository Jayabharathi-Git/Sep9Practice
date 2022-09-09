package sep9Practice;

public class Swap2NumWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 10;
		System.out.println("Before Swap: a = " + a + " b =" + b);
		int c = 0;

		c = a;
		a = b;
		b = c;

		System.out.println("After Swap: a = " + a + " b =" + b);

	}

}
