public class MyContact{

   private String name;
   private int age; 
   private int phone;
   private String mail; 

   public MyContact(String name, int age, int phone, String mail){
   
      this.name = name;
      this.age = age; 
      this.phone = phone; 
      this.mail = mail;
   
   
   }

   public String toString(){
   
      return "\nName: " + name + " Age: " + age + " Phone: " + phone + " Mail: " + mail;
   
   }



}