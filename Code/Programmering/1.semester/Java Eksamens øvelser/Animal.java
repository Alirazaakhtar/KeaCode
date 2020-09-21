public abstract class Animal{

   String name = "";
   int age;

   public Animal(String name, int age){
   
      this.name = name;
      this.age = age;
   
   }


   public void eat(){
   
   
   }
   
   public void run(){
   
      System.out.println("Run");
   }
   
   public void swim(){
      System.out.println("Swim now");
   }
   
   public String getName(){
   
      return name;
   
   }
   
   public int getAge(){
   
      return age;
   
   }
   
   
   public void getInfo(String x){
   
      if(x.equals("name")){
      System.out.println("Name:" + name);
      }else if(x.equals("age"))
      System.out.println("Age:" + age);

            
   }



}