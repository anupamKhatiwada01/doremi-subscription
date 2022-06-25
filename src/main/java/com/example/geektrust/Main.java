package com.example.geektrust; 

import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) throws Exception{


        String topupType = "TEN_DEVICE";
        Integer topupMonths = Integer.parseInt("5");

      
        // Sample code to read from file passed as command line argument
        // try {
        //     // the file to be opened for reading
        //     FileInputStream fis = new FileInputStream(args[0]);
        //     Scanner sc = new Scanner(fis); // file to be scanned
        //     // returns true if there is another line to read
        //     while (sc.hasNextLine()) {
        //        //Add your code here to process input commands
        //     }
        //     sc.close(); // closes the scanner
        // } catch (IOException e) {
        // }

   
      
        



      // Lets  directly create objects and not bother about using complex structures
      List topupList = new ArrayList<Topup>();
      topupList.add(new Topup("FOUR_DEVICE",4,1,50));
      topupList.add(new Topup("TEN_DEVICE",10,1,100));


      Subscriber user = new Subscriber();
      // Add topup for user if it exists
      if(!topupType.equals("")){

              ArrayList arr = (ArrayList)topupList.stream().filter(a->a.getType().toUpperCase().equals(topupType.toUpperCase())).collect(Collectors.toList());
          
          Topup userTopup = (Topup)arr.get(0);
          userTopup.setTotalPrice(topupMonths);
          if(user.addTopUp(userTopup)==false){
            throw new Exception("Topup cannot be added as one is already active");
          }
      }

      // Add plans for the user
      
      
      

      

      
      

      
      
      

     
      

      
    }
}
