public class StackTest2 {
	public static void main(String[] args) {
		
	//Testcase:
		//String message = "A(B)C(D)"
		//String message = "A((B)C(D)"
		String message = "A(B))C(D)";
		StackArrayBased stacks = new StackArrayBased(message.length());
		boolean isBalance = true; // Assume the parentheses is balance
		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i); // Get each character in message
			if (letter == '(') { // If the character is (, push in stack
				stacks.push(letter);
			} else if (letter == ')') { // If the character is )
				if (!stacks.isEmpty()) {
					stacks.pop();
				} else {
					isBalance = false;
					break;
				}
			}
		}
		if (!stacks.isEmpty()) {
			isBalance = true;
		}
		System.out.println(isBalance);
	}
}