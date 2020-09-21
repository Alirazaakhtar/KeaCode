package PackMine;

import java.util.*;
public class Player{

   private String name;
   private int positionX; 
   private int positionY;

   Scanner scan = new Scanner(System.in);
   Random random = new Random();
   

   ArrayList<Mine> mineList = new ArrayList<Mine>();

//Create Mine
   Mine mine1 = new Mine();
   Mine mine2 = new Mine();
   Mine mine3 = new Mine();
   Mine mine4 = new Mine();
   Mine mine5 = new Mine();
   Mine mine6 = new Mine();
   Mine mine7 = new Mine();
   Mine mine8 = new Mine();
   Mine mine9 = new Mine();



   public Player(String name){
   
      this.name = name; 
   }
   
   
   public void movePlayer(){
   
   
      mineList.add(mine1);
      mineList.add(mine2);
      mineList.add(mine3);
      mineList.add(mine4);
      mineList.add(mine5);
      mineList.add(mine6);
      mineList.add(mine7);
      mineList.add(mine8);
      mineList.add(mine9);
    
   
      try{
      
      
         do{
            String input = scan.next();
         
         
            if(input.equals("w")){
              
               if(positionY < 10){
                  positionY++;
                  playerPlacement();
               }else{
                  System.out.println("Out of boundry");
               }
            }
         
            if(input.equals("s")){
            
               if(positionY > 0){
                  positionY--;
                  playerPlacement();
               }else{
                  System.out.println("Out of boundry");
               }
            
            }
         
            if(input.equals("d")){
            
               if(positionX < 10){
                  positionX++;
                  playerPlacement();
               }else{
                  System.out.println("Out of boundry");
               }
            
            }
         
            if(input.equals("a")){
            
               if(positionX > 0){
                  positionX--;
                  playerPlacement();
               }else{
                  System.out.println("Out of boundry");
               }
            
            }
            
            
            
         
            if(positionX == 10 && positionY == 10){
            
               break;
               
            }
            
            for(int i = 0; i < mineList.size(); i++){
               if(mineList.get(i).warning(positionX, positionY)){
                  System.out.println("Warning BOMB is close");
               }
            }
            
            for(int i = 0; i < mineList.size();i++){
            
               if(mineList.get(i).isOnMine(positionX,positionY)){
               
                  System.out.println("BOOM mine exploded");
                  break;
               }
               
            }
            
            for(int i = 0; i < mineList.size(); i++){
               mineList.get(i).printMine();
            }
         
                        
         }while(true);
      }
      catch(Exception e){
      
         System.out.println("Wrong input. Please try again");
      
      }
   }
   
   public void playerPlacement(){
   
      System.out.println("The" + name + "is on position: (" + positionX + "," + positionY + ")");
   
   }
   
   
}