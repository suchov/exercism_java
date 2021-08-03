public class Twofer {
    public String twofer(String name) {
	// Option 1 slow with String.format method
	// return String.format("One for %s, one for me.", name == null ? "you" : name);
	// An alternative to the ternary operator solution
	// String you_name = java.util.Optional.ofNullable(name).orElse("you");
	// return "One for " + you_name + ", one for me.";	
	// short one with the concatenation
	return "One for " + (name != null ? name : "you") + ", one for me.";	
    }
}
