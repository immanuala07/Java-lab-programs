import Stackholder.Read;
import Stackholder.Display;
import java.io.*;

abstract class User
{
public final String title="Online Shopping Portal";


public abstract void display();

void Thanks()
{
	System.out.println("Thanks for using our service");
}

 static void head()
        {
         String title="We are happy to Service you\n";
        }
}

class RegUser extends User
{
public String custname;
public byte age;
public long pancard;
public long mobno;
public char gender;
public static long custID;

static
{
	custID=100;
}

public RegUser()
{
	custID++;
}

RegUser(String custname,byte age,long pancard,long mobno,char gender)
{
	this.custname=custname;
	this.age=age;
	this.pancard=pancard;
	this.mobno=mobno;
	this.gender=gender;
}





              public void display()
              {
                  System.out.println("\n----------------------");
                  System.out.println(super.title);
                  System.out.println("----------------------");

                  //System.out.println("----------------------");
                  System.out.println("Customer ID : "+custID);
                  System.out.println("Customer Name : "+custname);
                  System.out.println("Age : "+age);
                  System.out.println("Gender : "+gender);
                  System.out.println("Mobile no : "+mobno);
                  System.out.println("Customer Pancard Number : "+pancard);
                  System.out.println("-----------------------");
                //  System.out.println("Tollfree No: 1800-200-6633");
                  //Thanks();

              }

                 void Thanks()
				{
					System.out.println("Tollfree No: 1800-200-6633");
					super.Thanks();
				}
}
	class memberUser extends RegUser implements Read,Display
	{

			public String password;
			public String name;
			public long bNo;
			public String bName;
			public int cvvNo;

			public void read()
			{
				try
				{
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

				System.out.println("Enter the Bank name : ");
				bName=br.readLine();

				System.out.println("Enter the Bank card number : ");
				bNo=Long.parseLong(br.readLine());

				System.out.println("Enter the name on the card : ");
				name=br.readLine();

				System.out.println("Enter the CVV number : ");
				cvvNo=Integer.parseInt(br.readLine());

				System.out.println("Enter the password : ");
				password=br.readLine();
			}


		catch(IOException e)
		{
			System.out.println(e.toString());
		}
	}

    public void display()
    {
      System.out.println("Bank name : "+bName);
      System.out.println("Name on the card : "+name);
      System.out.println("Card Number : "+bNo);
      System.out.println("CVV Number : "+cvvNo);
      System.out.println("Password : "+password);
    }
	}
	               final class Inner
                  {
                    final void msg()
                    {
                      System.out.println("Thanks for using our service");
                    }
                  }

class Interface_lab
{
	public static void main(String arg[]) throws IOException
	{
		String custname;
		byte age;
		long pancard;
		long mobno;
		char gender;


BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter the Customer Name:");
        custname = br.readLine();

        System.out.println("Enter your age : ");
        age=Byte.parseByte(br.readLine());

        System.out.println("Enter the Customer pan card no:");
        pancard= Long.parseLong(br.readLine());

        System.out.println("Enter the Customer mobile number:");
        mobno=Long.parseLong(br.readLine());

        System.out.println("Enter the Gender (M / F):");
        gender=(char)br.read();
        User u=new RegUser(custname,age,pancard,mobno,gender);  //upcasting

        RegUser.head();

        memberUser r = new memberUser();
        r.read();

        u.display();
        u.Thanks();
        System.out.println("-----------------------");
        System.out.println("You are one among our family");
        System.out.println("-----------------------");
        r.display();


 			Inner c1 = new Inner();
      System.out.println("-----------------------");
            c1.msg();
            System.out.println("-----------------------");
	}
}
