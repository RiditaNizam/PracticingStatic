public class Runner {
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();

		System.out.println("user1 id: " + user1.myID);
		System.out.println("user2 id: " + user2.myID);
		System.out.println("user3 id: " + user3.myID);

		int last = User.getLastUserCreated(); // User is the class
		System.out.println("Last user created has ID: " + last);
	}
}