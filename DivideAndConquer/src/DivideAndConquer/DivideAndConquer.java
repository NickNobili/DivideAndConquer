package DivideAndConquer;

import java.util.*;

public class DivideAndConquer
{


    public int DivideAndConquer(int[] a, int[] b, int n)
    {
        //initializing the variables
        int l = 0;
        int r = 0;
        int result =0;
        int side=1;

        //in the case that n is 0
        if (n==0)
            if (a[0] <= b[0])
                result=a[0];
            else
                result =b[0];
        else
        {
            for (int i = 0; i < n; i++)
            {
                //if one of the lists runs out on one of the sides
                if ((b.length < (r)) || (a.length < (l)))
                {
                    //if the left still has numbers
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
                else
                {
                    //if the right is smaller or the same as the left
                    if (a[l] >= b[r])
                    {

                        r++;
                        side = 1;
                    }
                    else
                    {

                        l++;
                        side = 0;
                    }
                }

            }
            //if the left was the last number
            if (side == 0)
            {
                result = a[l-1];

            }
            //if the right was the last number
            else if (side ==1)
            {

                result = b[r-1];

            }
        }
        return result;
    }


}