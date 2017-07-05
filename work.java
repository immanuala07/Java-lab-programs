import java.io.*;
class worker
{
  public String wname;
  public byte hrs_worked_pday;
  public float wage_phr;

    public void read()throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter the Worker Name : ");
        wname=br.readLine();

        System.out.println("Enter the number of hours worked per hour : ");
        hrs_worked_pday=Byte.parseByte(br.readLine());

        System.out.println("Enter the Wage per hour : ");
        wage_phr=Float.parseFloat(br.readLine());
    }

            public void display() throws IOException
            {
                float s=0;
                System.out.println("\nWorker name : "+wname);
                System.out.println("Number of hours worked per hour : "+hrs_worked_pday);
                System.out.println("Wage per hour : "+wage_phr);
                s=totalwage();
                System.out.println("Total Wage : "+s);
            }

                  public float calcwg() throws IOException
                  {
                      float sum;
                      sum = hrs_worked_pday * wage_phr;
                      return sum;
                  }

                      public byte extrawage(float s)throws IOException
                      {
                          //float s=0;

                          if(s<200)
                          {
                            return 1;
                          }
                          else
                            return 0;
                      }

                              public float totalwage()throws IOException
                              {
                                float sum,s;
                                byte e;
                                s=calcwg();
                                sum=s;
                                e=extrawage(s);
                                if (e==1)
                                sum=sum+150;
                                else
                                sum=sum+50;
                                return sum;

                              }
}

    class work
    {
      public static void main(String args[]) throws IOException
      {
        boolean ch=true;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        byte c;

        worker w[] = new worker[2];
         while(ch)
         {
           System.out.println("\n1 Read data");
           System.out.println("2 Display data");
           System.out.println("3 Exit");
           System.out.println("Enter your choice\n");
           c=Byte.parseByte(br.readLine());

           switch(c)
           {
             case 1: for (int i=0;i<2;i++)
                      {
                        w[i]=new worker();
                        w[i].read();
                      }
                      break;

             case 2:for (int i=0;i<2;i++)
                      {
                        w[i].display();
                      }
                      break;
            case 3:ch=false;
                    break;
           }
         }
      }
    }
