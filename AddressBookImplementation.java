package com.bridgelabz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookImplementation implements IAddressBook {
	
	Scanner scanner = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	List<Person> personList = new ArrayList<Person>();
	
	public void add() {
	    System.out.println("Enter your first name");
	    String firstName = scanner.nextLine();
	    System.out.println("Enter your last name");
	    String lastName = scanner.nextLine();
	    System.out.println("Enter your address");
	    String address = scanner.nextLine();
	    System.out.println("Enter your city");
	    String city = scanner.nextLine();
	    System.out.println("Enter your state");
	    String state = scanner.nextLine();
	    System.out.println("Enter your phone");
	    long mobileNo = scanner.nextLong();
	    System.out.println("Enter your zip code");
	    int zip = scanner.nextInt();
	        
	    Person person1 = new Person(firstName, lastName, address, city, state, mobileNo, zip);
	    personList.add(person1);
	    System.out.println("Contact added successfully");
         }
	
	 public void display() {
	      for(int i = 0; i< personList.size(); i++) {
	           Person person = personList.get(i);
	    	   System.out.println("FirstName:"+person.getFirstName()+"\n"+"LastName:"+person.getLastName()+"\n"+"Adress:"+person.getAddress()+"\n"
				      +"City:"+person.getCity()+"\n"+"State:"+person.getCity()+"Phone-Number:"+person.getMobileNo()+"\n"+"Pin-code:"+person.getPincode());
	    	}
	 }
	
	 public void edit(String firstName) {
             for (int i = 0; i < personList.size(); i++) {
            	Person person = personList.get(i);
            	Scanner scanner = new Scanner(System.in);

            	System.out.println("Hi " + person.getFirstName() + " please enter your  new Address");
                String address = scanner.nextLine();
                person.setAddress(address);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new city");
                String city = scanner.nextLine();
                person.setCity(city);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new state");
                String state = scanner.nextLine();
                person.setState(state);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new Zip Code");
                int zip = scanner.nextInt();
                person.setPincode(zip);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new Phone No");
                int PhoneNo = scanner.nextInt();
                person.setMobileNo(PhoneNo);

                System.out.println("Hi " + person.getFirstName() + " you have sucessfully updated");
          }
            
        }
	
	 public void delete(String name) {
            for (int i = 0; i < personList.size(); i++) {
            	if(personList.get(i).getFirstName().equals(name)) {
            		Person person = personList.get(i);
            		personList.remove(person);
            	}
            }
         }

	public void addMultiplePerson() {
        	 
             System.out.println("Enter a person Name:");
             String firstName = sc.nextLine();
             for(int i = 0; i <  personList.size(); i++) {
        	        Person person = personList.get(i);
			if(personList.get(i).getFirstName().equals(firstName)) {
        		System.out.println("Duplicate");
        	  	}	
		}
	}
	   
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		 
		AddressBookImplementation adressBookImplementation =new AddressBookImplementation();
	        boolean condition = true;
	     
	        while (condition == true) {
	    	     Scanner scanner= new Scanner(System.in);
	    	     Scanner option = new Scanner(System.in);
	             System.out.println("1.Add Person"+"\n"+"2.Display"+"\n"+"3.Edit person"+"\n"+"4."+"Delete Person"+"\n"+"5.Add Multiple Person");
	         
                     switch(option.nextInt()) {
	                 case 1:adressBookImplementation.add();
	                       break;
	             	 case 2:adressBookImplementation.display(); 
                               break;
	                 case 3:System.out.println("Enter the firstName:");
	                       String firstName = scanner.nextLine();
	            	       adressBookImplementation.edit(firstName);
	            	       break;
			 case 4:System.out.println("Enter the Name of the person do you wants to delete");
	                       String name = scanner.nextLine();
	            	       adressBookImplementation.delete(name);
	            	       break;
			 case 5:adressBookImplementation.addMultiplePerson();
	                       break;
			default:System.out.println("Thank You");
			}
		}
	}
}