//This program will allow someone to book a room on a cruise line. It will display a graphical picture of the ship
//to allow the customer to choose their desired room, and it will provide the user with a range of excursion options.
//The program will also give the customer the option to book multiple rooms for multiple people.
//Author: Thao-Nguyen Vu
//Date Created: 10/6/14

import java.util.Scanner;
import java.text.DecimalFormat;
import java.awt.*;
import javax.swing.*;

class Project2_ThaoNguyenVu{
  public static void main(String[]args){
    
    //Creates objects from the imported classes to use within the program.
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("0.##");
    JFrame frame = new JFrame("Murracruise");
    
    //Declared and initialized variables
    String exit_loop = "no";
    String fName, lName, city, state;
    int capacityCount, diningTime /*cabCost = getCabCost()*/;
    
    //Uses constructor method from Ports class.
    Ports port1 = new Ports("Falmouth, Jamaica", "Sunday, November 2", 9, "AM", 4, "PM");
    Ports port2 = new Ports("Cayman, Cayman Islands", "Monday, November 3", 8, "AM", 4, "PM");
    Ports port3 = new Ports("Cozumel, Mexico", "Tuesday, November 4", 10, "AM", 6, "PM");
    
    //Uses constructor method from Excursions class.
    Excursions excursion1 = new Excursions("Swimming with dolphins", 56.75);
    Excursions excursion2 = new Excursions("Deep sea diving", 114.50);
    Excursions excursion3 = new Excursions("Surfing lessons", 69.25);
    Excursions excursion4 = new Excursions("2 hour tour", 84.25);
    Excursions excursion5 = new Excursions("River rafting", 99.75);
    Excursions excursion6 = new Excursions("Nothing", 0);
    
    System.out.println("Welcome to Murracruise Limited");
    System.out.println("Your wonderful cruise experience is about to begin");
    System.out.println("Here are the ports that this ship will be visiting: ");
    System.out.println("Port 1: " + port1);
    System.out.println("Port 2: " + port2);
    System.out.println("Port 3: " + port3);
    System.out.println();
    
    //Loop starts here
    while (exit_loop.equals("no")){
    System.out.println("Here are the available outside cabins on Deck 11");
    //Method for the ShipPanel Class.
    JFrame frames = new JFrame("Murracruise Limited");
    frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ShipPanel primary = new ShipPanel();
    frames.getContentPane().add(primary);
    
    frames.pack();
    frames.setVisible(true);
    
    System.out.println();
    System.out.println("Please provide the first name for the passenger in this room.");
    fName = scan.nextLine();
    System.out.println("Please provide the last name for the passenger in this room.");
    lName = scan.nextLine();
    System.out.println("How many people will be staying in this cabin?");
    capacityCount = scan.nextInt();
    System.out.println("What city is this passenger from?");
    city = scan.next(); 
    System.out.println("What state is this passenger from?");
    state = scan.next();
    System.out.println("Here are the two dining times that are available for this trip: 7PM or 9PM");
    System.out.println("Please input 7 or 9 for your desired time");
    diningTime = scan.nextInt();
    
    System.out.println();
    System.out.println("Here are the excursions that are available at the first port:");
    System.out.println("1.) " + excursion2);
    
    
    System.out.println("Would you like to book another room?  ");
    String decision = scan.next();
    if (decision.equals("y") || decision.equals("yes"))
          exit_loop = "no";
    else 
          exit_loop = "yes"; 
    
    }//Ends loop
    System.out.println("Here is your cruise receipt:");
    //System.out.println(ShipPanel.getCabCost);
    
  }//Ends main method.
  
  
  
}//Ends class.