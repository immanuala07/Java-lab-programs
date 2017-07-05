import java.io.*;
import java.text.ParseException;
class Purchase
{
  public String pdate;
  public String pitem;
  public int amt;
  public byte qty;
  public Double total;
  public String retailplace;

        public void cart()
        {
          System.out.println("\n------------------------------");
          System.out.println("             Cart             ");
          System.out.println("------------------------------");
          System.out.println("Purchase date : 19-June-2017 11:52 AM ");
          System.out.println("Purchased Item : Carry bag");
          System.out.println("Amount : Rs 5 /-");
          System.out.println("Quantity : 1 ");
          // clatotal=qty * amt;
          System.out.println("Total : Rs 5.00 /-");
          System.out.println("Retail Place : Bengaluru ");
          System.out.println("------------------------------\n");
        }

        public void read()throws IOException
        {
            BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
            String date;


            System.out.println("Enter the Coupon name :");
            pitem=re.readLine();

            cart(pitem);
        }

        public void read1()throws IOException
        {
            BufferedReader re=new BufferedReader(new InputStreamReader(System.in));


            System.out.println("Enter the purchased item name :");
            pitem=re.readLine();

            System.out.println("Enter the Total :");
            total=Double.parseDouble(re.readLine());

            cart(pitem,total);
        }


      public void cart(String pitem) throws IOException
    {

      System.out.println("\n------------------------------");
      System.out.println("             Cart             ");
      System.out.println("------------------------------");
      //System.out.println("Purchase date : 19-June-2017 11:52 AM ");
      System.out.println("Purchased Item : "+pitem);
      System.out.println("Amount : Rs 200 ");
      System.out.println("Quantity : 1");
      System.out.println("Total : Rs 200.0 ");
      System.out.println("Retail Place : Bengaluru");
      System.out.println("------------------------------\n");
    }

    public void cart(String pitem, Double total) throws IOException
  {

    System.out.println("\n------------------------------");
    System.out.println("             Cart             ");
    System.out.println("------------------------------");
    System.out.println("Purchase date : 19-June-2017 11:52 AM ");
    System.out.println("Purchased Item : "+pitem);
    System.out.println("Quantity : 1");
    System.out.println("Total : "+total);
    System.out.println("Retail Place : Bengaluru");
    System.out.println("------------------------------\n");
  }
}

  public class Functionoverload
  {
      public static void main (String[] args) throws IOException
      {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        boolean ch=true;
        byte res;
        Purchase obj[]= new Purchase[1];
        System.out.println("\n----------------------");
        System.out.println("Online Shopping Portal");
        System.out.println("----------------------");
        System.out.println("Customer Name : Dasa");
        System.out.println("Customer ID : 125");
        System.out.println("Age : 22");
        System.out.println("Gender : M");
        System.out.println("Mobile no : +91-35 95 214789");
        System.out.println("Customer Pancard Number : s1dee3fvf5");
        System.out.println("----------------------\n\n");
        while(ch)
        {


            System.out.println("\nEnter the options for item you purchased");
            System.out.println("1. Carry Bag");
            System.out.println("2. Discount Coupon @ Rs 200 /-");
            System.out.println("3. Any other items");
            System.out.println("4. Exit\n");

            System.out.println("Enter your choice\n");
            res=Byte.parseByte(b.readLine());
            switch(res)
            {
              case 1:for(byte i=0;i<1;i++)
                      {
                        obj[i]=new Purchase();
                        obj[i].cart();

                      }
                      break;

              case 2:for(byte i=0;i<1;i++)
                      {
                        obj[i].read();

                      }
                      break;
              case 3:for(byte i=0;i<1;i++)
                      {
                        obj[i].read1();

                      }
                      break;
              case 4: ch=false;

            } //end of outer
        }
      }
  }
