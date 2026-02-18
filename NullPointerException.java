
class NullPointerException{
    public static void main(String [] args){
        try{
            int [] arr=new int[5];
            for(int i=0;i<args.length;i++){
                arr[i]=Integer.parseInt(args[i]);
            }
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
}