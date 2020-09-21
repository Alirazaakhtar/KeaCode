public class Return{

   private double sales; 
   private double buy; 
   private String companyName; 
   private double profit;
   private double square;

// konstruktør with paramter
   public Return(String companyName){
   
      this.companyName = companyName;
   }


// overloading without parameter
   public Return(){
      companyName = "IMB";
   }

//set method

   public void setSales(double sales){
   // anvender this kommandoen
      this.sales = sales;
   
   }

   public void setBuy (double buy){
   
      this.buy = buy;
   
   }
   
   //get method's
   public double getsales(){
      return sales;
   
   }
   
   public double getBuy(){
      return buy;
   
   }
   
   // Profit method
   public void showProfit(){
   
      profit = sales - buy;
   
      System.out.println("Profit earned in " + companyName + ":" + profit+"kr");
   //Math
   square = Math.sqrt(profit);
   
   System.out.println("sqrt of (" + profit + ") = " + square);
   
   }

   

}