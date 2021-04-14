import java.util.Scanner;
import java.util.ArrayList;
public class frontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opInt=0;
		Scanner scan= new Scanner(System.in);
		UserProfileDAO ProfileDAO = new UserProfileDAO();
		while(opInt!=6) {
			
			System.out.println("Pick an operation");
			System.out.println("1. Add User");
			System.out.println("2. Display All Users");
			System.out.println("3. Display User at index");
			System.out.println("4. Delete User at index");
			System.out.println("5. Update User at index");
			System.out.println("6.Exit");
			
			opInt = scan.nextInt();
			
			switch(opInt) {
			case 1:
				//add
				UserProfile newUser = new UserProfile();
				String firstName;
				String lastName;
				String email;
				String password;
				System.out.println("Enter first name:");
				firstName= scan.next();
				newUser.setFirstName(firstName);
				System.out.println("Enter last name: ");
				lastName = scan.next();
				newUser.setLastName(lastName);
				System.out.println("Enter email:");
				email = scan.next();
				newUser.setEmail(email);
				System.out.println("Enter password");
				password = scan.next();
				newUser.setPassword(email);
				ProfileDAO.addUser(newUser);
				break;
			case 2:
				//displayAll
				ProfileDAO.displayAllUser();
				break;
			case 3:
				//displayAt
				int index=0;
				System.out.println("Enter index to display");
				index = scan.nextInt();
				ProfileDAO.displayUserAt(index);
				break;
			case 4:
				//deleteAt
				index=0;
				System.out.println("Enter index to delete");
				index = scan.nextInt();
				ProfileDAO.deleteUserAt(index);
			case 5:
				//updateAt
				index=0;
				System.out.println("Enter index to update");
				index = scan.nextInt();
				System.out.println("Enter first name:");
				firstName= scan.nextLine();
				System.out.println("Enter last name: ");
				lastName = scan.nextLine();
				System.out.println("Enter email:");
				email = scan.nextLine();
				ProfileDAO.updateUserAt(index, firstName, lastName, email);
				break;
			case 6:
				break;
			default:
				System.out.println("Pick a valid number");
				
			}
			
		}
	}

}
