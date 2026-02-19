class singleLevelInheritance
{
    int rate ;
    int intrest ;
    int amount ;
    singleLevelInheritance(int rate , int intrest ,int amount)
    {
        this.rate=rate;
        this.intrest=intrest;
        this.amount=amount;
    }
    public int calcIntrest()
    {
        return (rate*intrest*amount)/100;
    }
}
class B extends singleLevelInheritance{

    int intrest =10;
    B(){
        super(10,20,30);
    }
    public int calcIntrest()
    {
        int d = (rate * intrest * amount) / 100;  // uses child's interest
        System.out.println(super.calcIntrest());  // parent method
        return d;
    }


}
class key
{
    public static void main(String[] args) {
        B obj =new B();
        int result =obj.calcIntrest();
        System.out.println(result);
    }
}
