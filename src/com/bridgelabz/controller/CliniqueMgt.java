package com.bridgelabz.controller;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.service.ImplCliniqueUtil;

public class CliniqueMgt {
	public static void main(String[] args)throws JsonParseException, JsonMappingException, IOException, InterruptedException {
 
		ImplCliniqueUtil service = new ImplCliniqueUtil();

		// reading json

		service.readJson();

		// creating menu list

		//boolean exit = false;

		Scanner scanner = new Scanner(System.in);
        int choice;
		    do
		    {
			
		    	System.out.println("\nSelect option from menu\n");
		    	System.out.println("1. Add Doctor Record\n2.Add patient Record\n3.save record\n4.add appointment \n5.search Doctor by id\n6. search Doctor by name\n7. search Doctor by specialization"
					+ "\n8. search doctor by availability\n9. search patient by id\n10. search patient by name"
					+ "\n11. search patient by number\n12.show records\n13.see popular doctor\n14.print doctor Record\n.15.exit");
		    	
		    	//System.out.println("\nSelect option from menu\n");
		    	
					/*System.out.println("1.Add Doctor Record\n2.Add patient Record\n3.save record\n4.add appointment\n5.search Doctor\n6.search patient\n7.show records\n8.see popular doctor\n9.exit");*/
		    	  System.out.println("Enter your choice:");
		    	  choice=scanner.nextInt();
			switch (choice)
			{
			case 1:
				// add doctor
		 
				Doctor doctor = service.getDoctor();
				service.addDoctor(doctor);
				
				break;
			case 2:
				// add patient
		 
				Patient patient = service.getPatient();
				service.addPatient(patient);
			 
			 
				break;
				
			case 3:
				// save all objects into json 
				service.save();
				break;
				
			case 4:
				// add appointment		
				service.addAppointment();
				 break;
			case 5:
				// search doctor by id
			     
				 service.searchDoctorById();
				/*int choice1;
				{
				do
				{
					System.out.println("\nSelect option from menu\n1.search Doctor by id\n2.search Doctor by name\n3.search Doctor by specialization\n.4.search doctor by availability\n.5.exit ");
					System.out.println("\nEnter your choice:");
					choice1=scanner.nextInt();
					switch(choice1)
					{
					case 1:
						service.searchDoctorById();
						break;
					case 2:
						service.searchDoctorByName();
						break;
					case 3:
					   	String drname = service.getDoctorName();
						service.searchDoctorBySpecialization(drname);
						 
						break;
					case 4:

						System.out.println("Enter doctor date:  ");
						String str = scanner.next();
						System.out.println("Enter time from");
						int time = scanner.nextInt();

						service.searchDoctorByAvailability(str, time);
					 
						break;
					case 5:
						break;
					}
					
					
					
				}while(choice1!=6);*/
				 
				 break;
				
			case 6:
				// search doctor by name		
				service.searchDoctorByName();
				 
				break;
			case 7:
				// search doctor by specialization
				 
			 
				String drname = service.getDoctorName();
				service.searchDoctorBySpecialization(drname);
				 
 
				break;
			case 8:
				// search doctor by availability
			 
			 
				System.out.println("Enter doctor date:  ");
				String str = scanner.next();
				System.out.println("Enter time from");
				int time = scanner.nextInt();
				service.searchDoctorByAvailability(str, time);
			 
				break;
			case 9:
				// search patient by id
				 
				System.out.println("\n------- search patient by id----------\n");
				//System.out.println("Instruction->Patient id starts from 1000 range");
				System.out.println("Enter patient id to search: ");
				 int num = scanner.nextInt();

				service.searchPatientById(num);
				 
				break;
			case 10:
				// search patient by name
			      service.searchPatientByName();
				 
				break;
			case 11:
				// search patient by mobile
				service.searchPatientByMobile();
				 
				break;
			 case 12:
				// show records
				service.showAllRecords();
				break;
			case 13:
				service.showPopularDoctor();
				break;
			case 14:
				service.showDrRecord();
				break;
			
			case 15:
				 
				System.out.println("Thank you for your time...");
				 
				break;
			default:
				System.out.println("Please select valid option");
			}
		}while(choice!=16);

		scanner.close();

	}

}
