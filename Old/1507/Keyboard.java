package in.abc;

public class Keyboard extends Input
{
   private int keys;

   public Keyboard() {}
   public Keyboard(int keys) { this.keys = keys;} 
   public int getKeys() { return keys;}
   public void setKeys(int keys) { this.keys= keys;}
}