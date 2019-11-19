package DivideAndConquer;



public class Client
{
    public static void main(String[] args)
    {
        int[] a = {2,3,5,7,34};
        int[] b = {7,13,20};
        int n = 2;
        int nth = new DivideAndConquer().DivideAndConquer(a,b,n);

        //if (nth = null)
            //System.out.println("There are not "+ n + " elements in both arrays.");
        //else
            System.out.println("The "+n+"th term is "+ nth);

    }
}

