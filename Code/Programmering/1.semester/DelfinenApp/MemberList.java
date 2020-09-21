/*
This class needs to view a list of members
*/

import java.io.*; // for File
import java.util.*;


public class MemberList{

   FileHolder fileHolder = new FileHolder();
 
   ArrayList<String> competetiveList = new ArrayList<String>();
   ArrayList<String> motionistList = new ArrayList<String>();

   public void loadFile(){
   
   
   
      try{
         Scanner s = new Scanner(new File("MotionistList.txt"));
      
         while (s.hasNext()){
            motionistList.add(s.next());
         }
         s.close();
      
      Scanner x = new Scanner(new File("CompetetiveList.txt"));
      
         while (x.hasNext()){
            competetiveList.add(x.next());
         }
         x.close();

               
      
      }
      catch(Exception e){
      
         System.out.println("List not loaded");
      
      }
   
   }
               
                                             
   public void addMotionist(String name){
                     
      motionistList.add(name);
      
       //Smider navne fra array i filen, så vi kan loade dem fra filen til Arraylist
      fileHolder.writeFile("MotionistList", name);
   
                     
   }
                     
   public void getMotionist(){
                     
      System.out.println("Motionist:");
      for(int i = 0; i < motionistList.size();i++){
         System.out.println((i+1) + "." + motionistList.get(i));
         
      }
   
                     
   }
                     
   public void addCompetetive(String name){
                     
      competetiveList.add(name);
       
       //Smider navne fra array i filen, så vi kan loade dem fra filen til Arraylist
      fileHolder.writeFile("CompetetiveList", name);
      
   
                     
   }
                     
   public void getCompetetive(){
                     
      System.out.println("Competetive:");
      for(int i = 0; i < competetiveList.size();i++){
         System.out.println((i+1) + "." + competetiveList.get(i));
         
      }
   
                     
   }





}