public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();
  int pv=1;
  int rev=0;
  while(n>0)
  {
      int fv= n%10;
      n=n/10;
      rev+=pv*(int)Math.pow(10,fv-1);
      pv++;
  }
  System.out.println(rev);
 }
}
