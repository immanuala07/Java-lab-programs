import java.io.*;

class User
{
public String title="Online Shopping Portal";

void Thanks()
{
	System.out.println("Thanks for using our service\n");
}
}

class RegUser extends User
{
//public String title="Online Shopping Portal";
public String custname;
public byte age;
public long pancard;
public long mobno;
public char gender;
//public String address;

RegUser(String custname,byte age,long pancard,long mobno,char gender)
{
//public String title="Online Shopping Portal";
	this.custname=custname;
	this.age=age;
	this.pancard=pancard;
	this.mobno=mobno;
	this.gender=gender;
}     

              public void display() throws IOException
              {
                  System.out.println("\n----------------------");
                  System.out.println(super.title);
                  System.out.println("----------------------");
                //  System.out.println("Customer ID : "+custID);                  
                  System.out.println("Customer Name : "+custname);
                  System.out.println("Age : "+age);
               //   System.out.println("Address : "+address);
                  System.out.println("Gender : "+gender);
                  System.out.println("Mobile no : "+mobno);
                  System.out.println("Customer Pancard Number : "+pancard);
                  System.out.println("-----------------------\n");
                  
              }

              	void Thanks()
				{
					System.out.println("Tollfree No: 1800-200-6633");
					super.Thanks();
				}
}

class ThisSuper
{
	public static void main(String arg[])throws IOException
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


        RegUser u=new RegUser(custname,age,pancard,mobno,gender);
        u.display();
        u.Thanks();

	}
}