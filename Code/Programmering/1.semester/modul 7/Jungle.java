public class Jungle{

//PROGRAM

   public static void main(String[]args){
   
   //opret obejkt for hunter
      Hunter hunter1 = new Hunter("Hunter");
   
   
   
   // Opretter objekter af Animal
      Animal dyr1 = new Animal("Hund");
      Animal dyr2 = new Animal("Elefant");
      Animal dyr3 = new Animal("Tiger");
      Animal dyr4 = new Animal("Kat");
      Animal dyr5 = new Animal("Giraf");
      
      
      
      System.out.println("Welcome to the Jungle\n");
   
      
      // lav loop som finder hunter
      for(int x = 1;x<=100; x++){
      
         for(int y = 1; y <=100; y++){
         
         
            if(hunter1.isHunterHere(x,y)){
               System.out.println("Hunter is on position x = " + x + " , y = " + y + "\n");
            }
         
         
         }
      
      }
      
      
    
    
    //Lav double loop for at finde dyret position
    
      for(int x = 1; x<=100; x++){
      
         for(int y = 1; y<=100;y++){
         
         
         //Finder dyr1
            if(dyr1.isAnimalHere(x, y)){
            
               System.out.println(dyr1.getArt() + " er på position x = " + x + ", y = " + y );
                         
            //Tjekker om Hunter er tæt på dyret
               if(hunter1.isWithInRange(x,y)){
               
                  System.out.println("\n||" + hunter1.getName() + " has shot " + dyr1.getArt() + "||\n");
               
               }
            }  
            
              //Finder dyr2
            if(dyr2.isAnimalHere(x, y)){
            
               System.out.println(dyr2.getArt() + " er på position x = " + x + ", y = " + y );
               
               //Tjekker om Hunter er tæt på dyret
               if(hunter1.isWithInRange(x,y)){
               
                  System.out.println("\n||" + hunter1.getName() + " has shot " + dyr2.getArt() + "||\n");
               
               }
            
            }  
            
            //Finder dyr3
            if(dyr3.isAnimalHere(x, y)){
            
               System.out.println(dyr3.getArt() + " er på position x = " + x + ", y = " + y );
               
               //Tjekker om Hunter er tæt på dyret
               if(hunter1.isWithInRange(x,y)){
               
                  System.out.println("\n||" + hunter1.getName() + " has shot " + dyr3.getArt() + "||\n");
               
               }
            
            }  
            
            // finder dyr4
            
            if(dyr4.isAnimalHere(x, y)){
               System.out.println(dyr4.getArt() + " er på position x = " + x + ", y = " + y );
            
            //Tjekker om Hunter er tæt på dyret
               if (hunter1.isWithInRange(x,y)){
               
                  System.out.println("\n||" + hunter1.getName() + " has shot " + dyr4.getArt() + "||\n");
               
               
               }
            
            }
            
            //finder dyr5
            
            if(dyr5.isAnimalHere(x, y)){
            
               System.out.println(dyr4.getArt() + " er på position x = " + x + ", y = " + y );
            
            //Tjekker om Hunter er tæt på dyret
               if (hunter1.isWithInRange(x, y))
               
                  System.out.println("\n||" + hunter1.getName() + " has shot " + dyr5.getArt() + "||\n");
            
            }
         
         
         }
         
      }
      
      
      
     /* En anden måde at gør det, ved at lave en loop til hver dyr
      //Finder dyr2
      for(int x = 1; x<=100; x++){
      
         for(int y = 1; y<=100;y++){
         
            if(dyr2.isAnimalHere(x, y)){
            
               System.out.println("Dyr 2: " + dyr2.getArt() + " er på position x = " + x + ", y = " + y );
               
               break;
            }  
         }
      }
   
   //Finder dyr3
      for(int x = 1; x<=100; x++){
      
         for(int y = 1; y<=100;y++){
         
            if(dyr3.isAnimalHere(x, y)){
            
               System.out.println("Dyr 3: " + dyr3.getArt() + " er på position x = " + x + ", y = " + y );
               
               break;
            }  
         }
      }
      */
   }
}