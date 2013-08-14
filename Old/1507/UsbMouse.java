package in.abc;

public class UsbMouse extends Mouse
{
   private int version;

   public UsbMouse() {}
   public UsbMouse(int version) { this.version = version;} 
   public int getVersion() { return version;}
   public void setVersion(int version) { this.version= version;}
}