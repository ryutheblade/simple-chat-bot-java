import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int as = 0;
        int ds = 0;
        int eq = 0;
        int n = sc.nextInt();
        int a;
        int num = sc.nextInt();
        for(int  i = 1 ;i < n ; i++)
        {
            a = sc.nextInt();
            while(a != 0)
            {
                if (a < num)                 ////// descending order
                {
                    num = a;
                    ds = 1;
                    break;
                }

                else if ( a == num )                 ////////equal
                {
                    eq = 1;
                    break;
                }

                else                                        //////////ascending order
                {
                    num = a;
                    as = 1;
                    break;
                }


            }
        }
        if(ds == 1 && as ==1 && eq==1 )
        {
            System.out.println("false");
        }
        else if ( (as == 1 && eq ==1) || ds ==0)
        {
            System.out.println("true");
        }
        else if (eq== 1 || as ==0)
        {
            System.out.println("true");
        }
    }
}