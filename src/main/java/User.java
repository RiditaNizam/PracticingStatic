public class User {

	// Don't have to create instances to get these
	public static int nextID = 0; // Changes when you increment
	public static int lastUserCreated = -1;

	// Each User gets this set of variables
	public int myScore;
	public int myID;

	public User() {
		myScore = 0;
		myID = nextID; // Set to static class variable
		nextID++;
		lastUserCreated = myID;
	}

	public static int getLastUserCreated() {
		return lastUserCreated;
	}

}