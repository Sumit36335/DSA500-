   public static void main(String[] args) {
     // write your code here  
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     
     
     if(n==0)
     {
        System.out.println(0);
        return;
     }
     while(n>0)
     {
         int rem = n%10;
         System.out.println(rem);
         n=n/10;
     }
     
    }
