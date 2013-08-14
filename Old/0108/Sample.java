interface Printer
{
   void print();
}
interface Screen
{
   void preview();
}
class Doc implements Printer, Screen
{
    public void create() { }
    public void preview() { System.out.println("DOC Printing...");}
    public void print(){
      System.out.println("DOC Printing...");
    }
}
class Excel implements Printer,Screen{
  public void create() { }
    public void preview() {System.out.println("Sheet :: Printing...");}
    public void print(){
      System.out.println("Sheet :: Printing...");
    }
}

class Sample
{
    public static void main(String []args)
     {
           Doc doc = new Doc();

       Printer p  = doc;  /* assign ref of doc.print to p.print */ 
           p.print();
           Screen s = doc; /* assign ref of doc.preview to s.preview */
           s.preview(); 
    s= new Excel(); /* assign ref of excel.preview to s.preview */
           s.preview();
      }
}
 