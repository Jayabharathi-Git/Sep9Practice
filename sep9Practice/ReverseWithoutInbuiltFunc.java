package sep9Practice;

public class ReverseWithoutInbuiltFunc {

	String input = "Selenium";
	String revStr = "";

	public String usingCharArr() {
		System.out.println("---Using Char array------");
		revStr = "";
		char[] inpCharArr = input.toCharArray();
		for (int i = inpCharArr.length - 1; i >= 0; i--) {
			revStr = revStr + inpCharArr[i];
		}
		return revStr;
	}

	public String usingSplit() {
		System.out.println("----Using Split---------");
		revStr = "";
		String[] splitStr=input.split("");
		for(int i=splitStr.length-1;i>=0;i--) {
			revStr=revStr+splitStr[i];
		}
		return revStr;
	}

	public String usingCharAt() {
		System.out.println("----Using charAt----");
		revStr = "";
		for(int i=input.length()-1;i>=0;i--) {
			revStr=revStr+input.charAt(i);
		}
		return revStr;
	}

	public static void main(String[] args) {
		ReverseWithoutInbuiltFunc obj=new ReverseWithoutInbuiltFunc();
		System.out.println(obj.usingCharArr());
		System.out.println(obj.usingSplit());
		System.out.println(obj.usingCharAt());
	}

}
