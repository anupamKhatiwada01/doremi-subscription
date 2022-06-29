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
      List<Topup> topupList = new ArrayList<Topup>();
      topupList.add(new Topup("FOUR_DEVICE",4,1,50));
      topupList.add(new Topup("TEN_DEVICE",10,1,100));

      Map<String,Map<String,Integer[]>> planMap = new HashMap<String,Map<String,Integer[]>>();

        Map<String,Integer[]> musicCategoryMap = new HashMap<String, Integer[]>();
        Integer[][] musicArr ={{0,1},{100,1},{250,3}}; 
        musicCategoryMap.put("free",musicArr[0]);
        musicCategoryMap.put("personal",musicArr[1]);
        musicCategoryMap.put("premium",musicArr[2]);
        planMap.put("music",musicCategoryMap);

        Map<String,Integer[]> videoCategoryMap = new HashMap<String, Integer[]>();
        Integer[][] videoArr ={{0,1},{200,1},{500,3}};
        videoCategoryMap.put("free",videoArr[0]);
        videoCategoryMap.put("personal",videoArr[1]);
        videoCategoryMap.put("premium",videoArr[2]);
        planMap.put("video",videoCategoryMap);

        Map<String,Integer[]> podcastCategoryMap = new HashMap<String, Integer[]>();
        Integer[][] podcastArr ={{0,1},{100,1},{300,3}};
        podcastCategoryMap.put("free",podcastArr[0]);
        podcastCategoryMap.put("personal",podcastArr[1]);
        podcastCategoryMap.put("premium",podcastArr[2]);
        planMap.put("podcast",podcastCategoryMap);
        // System.out.println("This is the plan map:");
        // System.out.println(planMap);


      // List<HashMap<String,String>>  planList= new ArrayList<HashMap<String,String>>();
      Map<String,String> selectedPlans = new HashMap<String,String>();
      // Hard coded plans for development
      selectedPlans.put("music","personal");
      selectedPlans.put("video","premium");
      selectedPlans.put("podcast","free");

      Subscriber user = new Subscriber();
      
      // Add plans for the user
      
      
      // Add topup for user if it exists
      if(!topupType.equals("")){
          List<Topup> arr = topupList.stream().filter(a->a.getCategory().toUpperCase().equals(topupType.toUpperCase())).collect(Collectors.toList());
          Topup userTopup = (Topup)arr.get(0);
          userTopup.setTotalPrice(topupMonths);
          if(user.addTopUp(userTopup)==false){
            throw new Exception("Topup cannot be added.");
          }
      }

    }
}
