import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
class details
{
public String custname;
public long pancard;
private byte custage;
private long mobno;
private char gender;
public String custid;

    public void read() throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        // Second method for BufferedReader
        /* InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(y);
        Scanner sc=new Scanner(System.in); */

        System.out.println("Enter the Customer Name:\t");
        custname = br.readLine();

        System.out.println("Enter the Customer pan card no:");
        pancard= Long.parseLong(br.readLine());

        System.out.println("Enter the Customer age:");
        custage= Byte.parseByte(br.readLine());

        System.out.println("Enter the Customer mobile number:");
        mobno=Long.parseLong(br.readLine());

        System.out.println("Enter the Gender (M / F):");
        gender=(char)br.read();

        System.out.println("Enter the customer Id");
        custid=br.readLine();
      }

              public void display() throws IOException
              {
                  System.out.println("----------------------");
                  System.out.println("Online Shopping Portal");
                  System.out.println("----------------------");
                  System.out.println("Customer Name : "+custname);
                  System.out.println("Customer ID : "+custid);
                  System.out.println("Age : "+custage);
                  System.out.println("Gender : "+gender);
                  System.out.println("Mobile no : "+mobno);
                  System.out.println("Customer Pancard Number : "+pancard);
                  System.out.println("----------------------");
              }

}


                                            class purchase
                                            {
                                              public String pdate;
                                              public String pitem;
                                              public int amt;
                                              public byte qty;
                                              public Double total;
                                              public String retailplace;

                                                    public void read1()throws IOException
                                                    {
                                                        BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
                                                        String date;
                                                        System.out.println("Enter the purchase date (dd-MMM-yyyy) :");
                                                        date=re.readLine();
                                                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                                                        Date pdate=null;
                                                        try
                                                        {
                                                          //Parsing the String
                                                          pdate = dateFormat.parse(date);
                                                        }
                                                        catch(ParseException e)
                                                        {
                                                          e.printStackTrace();
                                                        }

                                                        System.out.println("Enter the purchased item name :");
                                                        pitem=re.readLine();

                                                        System.out.println("Enter the Amount :");
                                                        amt=Integer.parseInt(re.readLine());

                                                        System.out.println("Enter the qty :");
                                                        qty=Byte.parseByte(re.readLine());

                                                        System.out.println("Enter the Total :");
                                                        total=Double.parseDouble(re.readLine());

                                                        System.out.println("Enter the Retail place :");
                                                        retailplace=re.readLine();

                                                    }


                                                  public void display1() throws IOException
                                                {
                                                  System.out.println("------------------------------");
                                                  System.out.println("-------------Cart-------------");
                                                  System.out.println("------------------------------");
                                                  System.out.println("Purchase date : " +pdate);
                                                  System.out.println("Purchased Item : "+pitem);
                                                  System.out.println("Amount : "+amt);
                                                  System.out.println("Quantity : "+qty);
                                                  System.out.println("Total : "+total);
                                                  System.out.println("Retail Place : "+retailplace);
                                                }
                                            }

                        class customer
                        {
                            public static void main(String args[]) throws IOException
                            {
                              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                              boolean ch=true;
                              byte res;
                              details obj[]= new details[1];
                              purchase ob[]= new purchase[1];
                              while(ch)
                              {
                                  System.out.println("Enter the number of students");
                                  System.out.println("1. Read data");
                                  System.out.println("1. Display data");
                                  System.out.println("1. Exit");

                                  System.out.println("Enter your choice\n");
                                  res=Byte.parseByte(br.readLine());
                                  switch(res)
                                  {
                                    case 1:for(byte i=0;i<1;i++)
                                            {
                                              obj[i]=new details();
                                              ob[i]=new purchase();
                                              obj[i].read();
                                              ob[i].read1();
                                            }
                                            break;

                                    case 2:for(byte i=0;i<1;i++)
                                            {
                                              obj[i].display();
                                              ob[i].display1();
                                            }
                                            break;
                                    case 3: ch=false;

                                  } //end of outer
                              }
                            }
                        }
