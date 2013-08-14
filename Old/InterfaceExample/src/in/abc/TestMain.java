package in.abc;

 
interface Actor
{
  public abstract  void act(); // public abstract void act();
}

class HappyActor implements Actor
{
   @Override
   public void act()
   {
     System.out.println("Happy acting");
    }
}
class SadActor implements Actor
{ 
    @Override
    public void act()
   {
     System.out.println("Sad acting");
    }
}   

class TestMain
{
    static void play(Actor actor)
     {
          actor.act();
     }
     public static void main(String []args)
     {
          HappyActor shah=new HappyActor();
          SadActor dilip = new SadActor();


          //Assign act() reference to Actor.act 

          //Interface reference variable
          Actor a = shah; //HappyActor.act() reference
          a.act();
          a=dilip; //SadActor.act() reference
          a.act();

         //or you can pass object reference to "play()" method
          play(dilip);
          play(shah);
          play(new HappyActor());
       }
 }
 
 