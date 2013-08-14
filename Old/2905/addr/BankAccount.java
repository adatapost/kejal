public class BankAccount
{
  private int no;
  private String name;
  private Address localAddress;
  private Address postalAddress;

  public BankAccount(){
    name = "";
    localAddress = new Address();
    postalAddress = new Address();
  }
  public int getNo() { return no;}
  public String getName() { return name;}
  public Address getLocalAddress() { return localAddress;}
  public Address getPostalAddress() { return postalAddress;}

  public void setNo(int no) { this.no = no;}
  public void setName(String name) { this.name = name;}

  public void setLocalAddress(Address localAddress)
  {

    this.localAddress = localAddress;
   }

  public void setPostalAddress(Address postalAddress)
   {

    this.postalAddress = postalAddress;
    }

}

 