package sep9Practice;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=10;
		System.out.println("Before Swap: a = "+a+" b ="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap: a = " + a + " b =" + b);

	}

}
