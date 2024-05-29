package Practice;

public class Practice {
	static void siteName() {
		System.out.println("jhansigarneni.com");
	}
	void regularmethod() {
		System.out.println("Testing static and non static methods");
	}

	public static void main(String[] args) {
		Practice.siteName();
		Practice obj = new Practice();
		obj.regularmethod();
	}

}
