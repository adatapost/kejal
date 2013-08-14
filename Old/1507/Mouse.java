package in.abc;

public class Mouse extends Input
{
   private int buttons;

   public Mouse() {}
   public Mouse(int buttons) { this.buttons = buttons;} 
   public int getButtons() { return buttons;}
   public void setButtons(int buttons) { this.buttons= buttons;}
}