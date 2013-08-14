public class Rect
{

   private Point location; 
   private Point size;

   /* Constructors */

   public Rect() {
      location = new Point();
      size = new Point(); 
   }
   public Rect(Point location,Point size){
     this.location = location;
     this.size = size;
   }
   
   /* Getter/Setter */

    public Point getLocation() { 
         return location;
    }
    public Point getSize() {
         return size;
    }
    public void setLocation(Point location) {
       this.location =location;
    }
     public void setSize(Point size) {
       this.size = size;
     }
}