package codechallenge;

public class DuplicateCharString {

	public static void main(String[] args) {
		String[] words = { "bella", "label", "roller" };
		String match = words[words.length-1];
		String temp = "";
		for (int i = words.length-2; i >= 0; i--) {
			for (char c : words[i].toCharArray()) {
				if (match.contains(c + "")) {
					match = match.replaceFirst(c + "", "");
					temp += c;
				}
			}
			match = temp;
			temp = "";
		}
		System.out.println(match.toCharArray());
	}

}
/*
 * Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.
 
Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 */
