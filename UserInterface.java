package day4;
import java.util.Scanner;
public interface Userinterface {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Country country = new Country();

	        while (true) {
	            System.out.println("1.Add\n2.Search\n3.Exit");
	            System.out.println("Enter your choice");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter the country name");
	                    String countryName = scanner.next();
	                    System.out.println("Enter the capital name");
	                    String capitalName = scanner.next();
	                    country.add(countryName, capitalName);
	                    break;
	                case 2:
	                    System.out.println("Enter the country name");
	                    String searchCountry = scanner.next();
	                    String capital = country.search(searchCountry);
	                    System.out.println(capital);
	                    break;
	                case 3:
	                    System.out.println("Thank you for using the application");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
	    }
	}


