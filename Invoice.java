public class Invoice
{
  private String part_number;
  private String part_description;
  private int quantity_purchased = 0;
  private double price = 0.0;
  
  public Invoice(String part_number, String part_description, int quantity_purchased, double price)
  {
    this.part_number = part_number;
    this.part_description = part_description;
    this.quantity_purchased = quantity_purchased;
    this.price = price;
  }
  
  //set
  public void setpart_number(String part_number)
  {
    this.part_number = part_number;
  }
  
  //get
  public String getpart_number()
  {
    return part_number;
  }
  
  //set
  public void setpart_description(String part_description)
  {
    this.part_description = part_description;
  }
  
  //get
  public String getpart_description()
  {
    return part_description;
  }
  
  //set
  public void setquantity_purchased(int quantity_purchased)
  {
    this.quantity_purchased = quantity_purchased;
  }
  
  //get
  public int getquantity_purchased()
  {
    return quantity_purchased;
  }
  
  //set
  public void setprice(double price)
  {
    this.price = price;
  }
  
  //get
  public double getprice()
  {
    return price;
  }
  
  //method
  public double getInvoiceAmount()
  {
    if(quantity_purchased() < 0)
      quantity = 0;
    if(quantity_purchased() < 0)
      price = 0.0;
    
    return (quantity_purchased() * price());
  }
  
}