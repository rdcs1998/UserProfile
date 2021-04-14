import java.util.ArrayList;
public class UserProfileDAO {
	
	ArrayList<UserProfile> UserProfileList = new ArrayList();
	
	public void addUser(UserProfile user) {
		UserProfileList.add(user);
	}
	
	public void displayAllUser() {
		for(int i = 0; i<UserProfileList.size();i++) {
			
			System.out.println("Name:"+UserProfileList.get(i).getFirstName());
			System.out.println("Last Name:"+UserProfileList.get(i).getLastName());
			System.out.println("E-mail:"+UserProfileList.get(i).getEmail());
		}
	}
	
	public void displayUserAt(int index) {
		System.out.println("Name:"+UserProfileList.get(index).getFirstName());
		System.out.println("Last Name:"+UserProfileList.get(index).getLastName());
		System.out.println("E-mail:"+UserProfileList.get(index).getEmail());
	}
	
	public void updateUserAt(int index,String firstName, String lastName, String email) {
	UserProfileList.get(index).setFirstName(firstName);
	UserProfileList.get(index).setLastName(lastName);
	UserProfileList.get(index).setEmail(email);
	}
	
	public void deleteUserAt(int index) {
		UserProfileList.remove(index);
	}

}
