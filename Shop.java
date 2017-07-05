import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;

class Details
{

public String shopName;
public int shopId;
private long mobno;
public String shopLoc;
public float noEmpl;

    public void read() throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        // Second method for BufferedReader
        /* InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(y);
        Scanner sc=new Scanner(System.in); */

      /* System.out.println("Enter the Shop Name:\t");
         shopName = br.readLine();

        System.out.println("Enter the Shop id:");
        shopId= Integer.parseInt(br.readLine());

        System.out.println("Enter the Shop mob number:");
        mobno=Long.parseLong(br.readLine());

      System.out.println("Enter the Location of shop:\t");
         shopLoc = br.readLine();

        System.out.println("Enter the num of employee");
        noEmpl= Float.parseFloat(br.readLine()); */
        }

              public void display() throws IOException
              {
                  System.out.println("----------------------");
                  System.out.println("Online Shopping Portal");
                  System.out.println("----------------------");
                  System.out.println("Shop Name : "+shopName);
                  System.out.println("Shop ID : "+shopId);
                  System.out.println("Mobile no : "+mobno);
                  System.out.println("Location of Shop : "+shopLoc);
                  System.out.println("Number of Employee : "+noEmpl);
                  System.out.println("----------------------");
              }

	}


                                            class Employee
                                            {
                                              public String empName;
                                              public int empId;
                                              public byte empAge;
                                              public char empGen;
                                              public byte daysworked;
                                              public  int empsalary;


                                                    public void read1()throws IOException
                                                    {
                                                        BufferedReader re=new BufferedReader(new InputStreamReader(System.in));

                                                      /*  String date;
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

                                                       /* System.out.println("Enter the Employee name :");
                                                       empName=re.readLine();

                                                        System.out.println("Enter the  Employee id :");
                                                        empId=Integer.parseInt(re.readLine());

                                                        System.out.println("Enter the age:");
                                                        empAge=Byte.parseByte(re.readLine());
                                                        */
System.out.println("Enter empGen:");
                                                       empGen=(char)re.read();  //.skip(1);
							re.skip(1);


                                                        System.out.println("Enter the daysworked:");
                                                        daysworked=yte.parseByte(re.readLine());

							System.out.println("Enter the Salary:");
                                                        empsalary=Integer.parseInt(re.readLine());

                                                    }


                                                  public void display1() throws IOException
                                                {
                                                  System.out.println("------------------------------");
                                                   System.out.println("Emplo Name : "+empName);
                  				System.out.println("Emp ID : "+empId);
                  				System.out.println("Emp age : "+empAge);
                  				System.out.println("Gender: "+empGen);
                  				System.out.println("Days worked:"+daysworked);
						System.out.println("Salary:" +empsalary);
                  				System.out.println("----------------------");
                                                }
                                            }

                        public class Shop
                        {
                            public static void main (String[] args) throws IOException
                            {
                              BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
                              boolean ch=true;
                              byte res;
                              Details  obj[]= new Details[1];
                               Employee ob[]= new Employee[1];
                              while(ch)
                              {

                                  System.out.println("1. Read data");
                                  System.out.println("2. Display data");
                                  System.out.println("3. Exit");

                                  System.out.println("Enter your choice\n");
                                  res=Byte.parseByte(b.readLine());
                                  switch(res)

                                  {
                                    case 1:for(byte i=0;i<1;i++)

                                            {
                                              obj[i]=new Details();
                                              ob[i]=new Employee();
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
