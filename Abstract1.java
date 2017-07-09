import java.io.*;

abstract class User
{
public String title="Online Shopping Portal";

public abstract void display();

}

class RegUser extends User
{
public String custname;
public byte age;
public long pancard;
public long mobno;
public char gender;

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
                  System.out.println("Customer Name : "+custname);
                  System.out.println("Age : "+age);
                  System.out.println("Gender : "+gender);
                  System.out.println("Mobile no : "+mobno);
                  System.out.println("Customer Pancard Number : "+pancard);
                  System.out.println("-----------------------");
                  System.out.println("Tollfree No: 1800-200-6633");
                  System.out.println("Thanks for using our service");
                  System.out.println("-----------------------");
              }
}

class Abstract1
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

// casting instance of RegUser type to User reference, we are hiding the complexity of RegUser type under User
        User u=new RegUser(custname,age,pancard,mobno,gender);
        u.display();
     

	}
}