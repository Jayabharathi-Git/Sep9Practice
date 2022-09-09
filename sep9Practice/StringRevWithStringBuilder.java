package sep9Practice;

public class StringRevWithStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Reverse";
		StringBuilder revInput = new StringBuilder();
		revInput.append(input);
		revInput = revInput.reverse();
		System.out.println(revInput);

	}

}
