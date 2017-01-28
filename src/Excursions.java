//This class holds and displays the information for the excursions for the cruise trip.
//Author: Thao-Nguyen Vu
//Date Created: 10/6/14

public class Excursions
{
  private String activityName;
  private double price;
  
  //*************************************************************************************************
  //Constructor mehod to display the available excursion at each destination.
  //*************************************************************************************************
  
  public Excursions(String activity, double cost){
    activityName = activity;
    price = cost;
  }

  public String getActivity(){
    return activityName;}
  public double getCost(){
    return price;}
  
  public String toString(){
    return activityName + " for " + price;
  }
}