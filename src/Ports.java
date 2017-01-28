//This class holds information for the ports from the main program.
//Author: Thao-Nguyen Vu
//Date Created: 10/6/14

public class Ports
{
  private String portName, dayName, start_amORpm, end_amORpm;
  private int startTime, endTime;
  

  public Ports(String port, String day, int sTime, String s_aORp, int eTime, String e_aORp)
  {
   portName = port;
   dayName = day;
   startTime = sTime;
   start_amORpm = s_aORp;
   endTime = eTime;
   end_amORpm = e_aORp;
  }//Ends constructor
  
  public String getPort(){
    return portName;}
  
  public String getDay(){
    return dayName;}
  
  public int getSTime(){
    return startTime;}
  
  public int getETime(){
    return endTime;}
  
  public String toString()
  {
    return portName + " on " + dayName + " at " + startTime + start_amORpm + 
      " until " + endTime + end_amORpm + ".";
    
  }
  
}
