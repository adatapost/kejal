public class Point
{
   private int x,y;

   public Point() { } 
   public Point(int x,int y){
     this.x=x;
     this.y=y;
   }
   //Passing object reference
   public Point(Point p){
     this.x = p.x;
     this.y = p.y;
   }

   public int getX() { return x;}
   public int getY() { return y;}
   public void setX(int x) { this.x=x;}
   public void setY(int y) { this.y=y;}

  public void set(int x,int y){ 
       this.x=x;
       this.y=y;
   }

   public void set(Point point){
      this.x=point.x;
      this.y=point.y;
   }
 public boolean pointEqual(Point point){

       return this.x == point.x && 
                 this.y == point.y;
   }
    
  
  //Return an object reference
   public Point addPoint(int value){

      //Create temporary object
      Point newPoint = new Point();
      //set value to temp object

      newPoint.x = x + value;
      newPoint.y = y + value;

      return newPoint; //return temp object ref
   }

  public Point addPoint(int x,int y){

      //Create temporary object
      Point newPoint = new Point();
      //set value to temp object

      newPoint.x = this.x + x;
      newPoint.y = this.y + y;

      return newPoint; //return temp object ref
   }

 public Point addPoint(Point point){

      //Create temporary object
      Point newPoint = new Point();
      //set value to temp object

      newPoint.x = this.x + point.x;
      newPoint.y = this.y + point.y;

      return newPoint; //return temp object ref
   }
}

class PointTest
{
   public static void main(String []args)
   {
        Point one=new Point(10,20);
        Point two = new Point(2,5);

        Point r = one.addPoint(6);
        System.out.println(r.getX() + " " + r.getY());
        r = one.addPoint(11,22);
        System.out.println(r.getX() + " " + r.getY());
        r = one.addPoint(two);
        System.out.println(r.getX() + " " + r.getY());


    }
}