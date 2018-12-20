
public class InvoiceTest
{
  public static void main(String[] args)
  {
    Invoice myInvoice = new Invoice("82","This is a story book",10,29);
    
    System.out.println("Invoice Amount :" + myInvoice.getInvoiceAmount());
  }
}