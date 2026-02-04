class even_new
{
    public static void main(String []args)
    {
        int a=Integer.parseInt(args[0]);
        if(a%20==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}