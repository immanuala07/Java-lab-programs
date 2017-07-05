import java.io.*;

class User
{
public static String title="abc";
public static long custID;
public String custname;
public byte age;
public long pancard;
public long mobno;
public char gender;
public String address;

static
{
	custID=100;
}

public User()
{
	custID++;
}


/*static void head()
{
	String title="Online Shopping Portal\n";
}       */

    public void read() throws IOException
    {	
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter the Customer Name:");
        custname = br.readLine();

        System.out.println("Enter your age : ");
        age=Byte.parseByte(br.readLine());

        System.out.println("Enter the Customer pan card no:");
        pancard= Long.parseLong(br.readLine());

       

        System.out.println("Enter the Customer mobile number:");
        mobno=Long.parseLong(br.readLine());

        System.out.println("Enter the Address:");
        address = br.readLine();

        System.out.println("Enter the Gender (M / F):");
        gender=(char)br.read();
    }       

              public void display() throws IOException
              {
                  System.out.println("\n----------------------");
                  //head();
                  System.out.println(title);
                  System.out.println("----------------------");
                  System.out.println("Customer ID : "+custID);                  
                  System.out.println("Customer Name : "+custname);
                  System.out.println("Age : "+age);
                  System.out.println("Address : "+address);
                  System.out.println("Gender : "+gender);
                  System.out.println("Mobile no : "+mobno);
                  System.out.println("Customer Pancard Number : "+pancard);
                  System.out.println("-----------------------\n");
                  
              }



              		static class Inner
              		{
              			static void msg()
              			{
              				System.out.println("Thanks for using our service\n");
              			}
              		}

}
					
						

class Static
{
	public static void main(String arg[]) throws IOException
	{
			//  String custname,byte age,long pancard,long mobno,char gender,String address
			
      User c[] = new User[3];
			   
			for (int i=0;i<2;i++)
                      {
                        //User.head();
                        c[i]=new User();
                        c[i].read();
						            c[i].display();   
                     // head();
                      }

            User.Inner c1 = new User.Inner();
            c1.msg();
	}
}