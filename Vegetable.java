public class Vegetable
{
   /*
   Attributes
   */
   
   /** the type of vegetable */
   private String name;
   /** colour of the skin */
   private String colour;
   /** the smell of the vegetable */
   private String smell;
   /** the amount of calories recived for digestion*/
   private int calories;
   /** the weight in grams */
   private double weight;
   /** whether the vegetable has peel or not */
   private boolean hasPeel;
   
   /*
   Constructor
   */
   public Vegetable(String name, String colour, String smell, int calories, double weight, boolean hasPeel) 
   {
      this.name = name;
      this.colour = colour;
      this.smell = smell;
      
      if(calories < 0)
      {
         this.calories = 1;
      }
      else
      {
         this.calories  = calories;
      }
      
      this.hasPeel = hasPeel;
      
      if(!hasPeel)
      {
         if(weight < 0)
      {
         this.weight = 1;
      }
      else
      {
         this.weight  = weight;
      }
      }
      else
      {
         if(weight <= 20)
         {
            this.weight  = 21;
         }
         else
         {
            this.weight  = weight;
         }
      }
      
   }
}