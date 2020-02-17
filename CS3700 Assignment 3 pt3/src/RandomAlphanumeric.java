/*import java.util.Random;

public class RandomAlphanumeric {
	private final String letters = "abcdefghijklmnopqrstuvwxyz";
	private final char[] alphanumeric = (letters.toUpperCase().toCharArray());

	public String generateAlphaNumeric(int length) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < length; i++) {
			result.append(alphanumeric[new Random().nextInt(alphanumeric.length)]);
		}
		return result.toString();
	}
}
*/