class Fibonacci{
 public static void main(String[] args){
  int num=12;
  int f=0;
  int s=1;
  int t;

  System.out.print("0 1 ");

  for(int i=3; i<=num; i++){
   t=f+s;
   System.out.print(t+" ");
   f=s;
   s=t;
  }
 }
}
   