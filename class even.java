class even
{
    public static void main (String args[])
    {
        int a,b;
        System.out.println("enter the number");
        scanner in=new scanner(system.in);
        a=in.nextInt();
        b=a%2;
        if(b==0)
        {
            System.out.println("even no");
        }
        else
        {
            System.out.println("odd no");
        }
    }
}

