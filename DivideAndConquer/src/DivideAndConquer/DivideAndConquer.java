package DivideAndConquer;

import java.util.*;

public class DivideAndConquer
{


    public int DivideAndConquer(int[] a, int[] b, int n)
    {
        int l = 0;
        int r = 0;
        int result =0;
        int side=1;

        if (n==0)
            if (a[0] <= b[0])
                result=a[0];
            else
                result =b[0];
        else
        {
            for (int i = 0; i < n; i++)
            {
                System.out.println("LEFT"+l);
                System.out.println("RIGHT"+r);

                if ((b.length < (r)) || (a.length < (l)))
                {
                    System.out.println("RIGHT"+r+"LEFT"+l);
                    if (b.length < (r))
                    {
                        l++;
                        side=0;
                    }
                    else
                    {
                        r++;
                        side=1;
                    }


                }
                else if (a[l] >= b[r])
                {
                    System.out.println("RIGHT test");
                    r++;
                    side = 1;
                }
                else if (a[l] > b[r])
                {
                    System.out.println("LEFT test");
                    l++;
                    side = 0;
                }
                System.out.println(side);
            }
            System.out.println("done");
            System.out.println(side);
            System.out.println(r);
            if (side == 0)
            {
                result = a[l-1];
                System.out.println("a");
            }

            else if (side ==1)
            {
                result = b[r-1];
                System.out.println("b");
            }
        }
        return result;
    }


}