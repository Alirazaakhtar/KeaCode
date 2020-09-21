public class Cha{

   public static void main(String[]args){
   
   Pattern pattern1 = new Pattern();
   
   pattern1.writeCh('=', 20);
   
   
   
   for(int i = 1; i <=10; i++){
   pattern1.writeCh('>',i);
   pattern1.writeCh('<',i);
   System.out.println();
   }
   
   
   }


}