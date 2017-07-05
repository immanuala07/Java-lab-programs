import java.io.*;


                        public class Cla
                        {
                            public static void main (String[] arg) throws IOException
                            {
                              BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
                              System.out.println("\n----------------------------------");
                              System.out.println("      Online Shopping Portal      ");
                              System.out.println("----------------------------------\n");
                              System.out.println("Customer Name : "+arg[0]);
                              System.out.println("Customer ID : "+arg[1]);
                              System.out.println("Age : "+arg[2]);
                              System.out.println("Gender : "+arg[3]);
                              System.out.println("Mobile no : "+arg[4]);
                              System.out.println("Customer Pancard Number : "+arg[5]);
                              System.out.println("Purchased Item : "+arg[6]);
                              System.out.println("Amount : "+arg[7]);
                              System.out.println("\n----------------------------------\n");
                            }
                        }
