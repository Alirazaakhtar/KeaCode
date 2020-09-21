import java.util.Scanner;

public abstract class Member{
   private String name;
   private int age;
   private String adress;
   private String tlf;
   private String email;
   private int kontingent;
   
   Scanner input = new Scanner(System.in);
  

   public Member(){
   
   }
   
   public void createMember(){
   
      FileHolder files = new FileHolder();
   
   
      while (true){
      
         try{
         
                     
            System.out.println("\n|Type member Information|");
         
            System.out.print("Name: ");
            String name = input.nextLine();
         
            System.out.print("Age: ");
            int age = input.nextInt();
         
            System.out.print("Adress: ");
            String adress = input.next();
         
            System.out.print("Tlf Nr: ");
            String tlf = input.next();
         
            System.out.print("Email: ");
            String email = input.next();
            
            System.out.print("1.Activ or 2.passiv: ");
            int activ = input.nextInt();
            
            if(activ == 1){
            //kontingent
            Kontingent kon = new Kontingent();
            // i kontingent klassen har vi defineret en metode som ud fra alderen bestemmer kontingenten.
            this.kontingent = kon.kontingent(age);
            } else{
            //hvis medlem ikke er aktiv
            this.kontingent = 500;
            
            }
            
           
            
            this.name = name;
            this.age = age;
            this.adress = adress;
            this.tlf = tlf;
            this.email = email;
            
            
            
            //Opretter en fil med medlems navn
            files.createFile(name);
         
            files.writeFile(name, memberInfo());
            
            
                           
         
         
            break;
         }
         catch(Exception e){
         
            System.out.println("Wrong input! Please try again");
         
         }
      }
      
   }
   public String memberInfo(){
      
      String info = "\nName: " + name + "\nAge: " + age + "\nAdress: " + adress + "\nPhone: " + tlf + "\nEmail: "+ email + "\nContingent: " + kontingent + " DKK\n\n";
      
      return info;
   }
   
   public String getName(){
   
      return name;
   
   }
   
   public int getAge(){
      return age;
   }
   
}