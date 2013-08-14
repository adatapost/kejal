package in.abc;

public class SerialMouse extends Mouse
{
   private int pins;

   public SerialMouse() {}
   public SerialMouse(int pins) { this.pins = pins;} 
   public int getPins() { return pins;}
   public void setPins(int pins) { this.pins= pins;}
}