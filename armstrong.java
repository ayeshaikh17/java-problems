class armstrong{
    public static void main(String[] args){
        int c=0,a,temp;
        int n=153;
        temp=n;
        //Ayesha Shaikh IT-B 117
        while(n>0)
        {
          a=n%10;
          n=n/10;
          c=c+(a*a*a);
        }
        if(temp==c)
        {
            System.out.println("Armstrong Number");

        }
        else{
            System.out.println("Not Armstrong Number");

        }
    }
}