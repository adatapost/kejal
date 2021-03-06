public class Point
{
   private int x,y;

   public Point() { }
   public Point(int x,int y) {
     this.x = x;
     this.y = y;
   }
   public Point(Point point){
     this.x = point.x;
     this.y = point.y;
   }

   public int getX() { return x;}
   public int getY() { return y;}

   public void setX(int x) { this.x = x;}
   public void setY(int y) { this.y= y;}

   public Point addPoint(Point obj)
    { 
         
         /*  Point p = new Point();
           p.x = this.x + obj.x;
           p.y = this.y + obj.y;
           return p; */

      return new Point(this.x + obj.x, this.y + obj.y);
     }

}

