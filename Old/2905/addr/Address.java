public class Address
{
    private String city;
    private int pin;

    public Address() { city = ""; }
    public Address(String city, int pin){
      this.city = city;
      this.pin = pin;
    }

    public String getCity() { return city;}
    public int getPin() { return pin;}
    public void setCity(String city ) { this.city = city;}
    public void setPin(int pin) { this.pin = pin;}

}