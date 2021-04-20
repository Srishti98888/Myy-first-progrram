public class Myclasss{
static int arr[]={0,1,2,3,4,5,6,7,7,8,9,10};
static int sum=0,sum1=0,result=0;
static int n=arr.length;

 public static void main(String []args){
        for(int i=0;i<arr.length;i++){
           sum=sum+arr[i];
       }
      
   for(int i=0;i<arr.length-1;i++){
           sum1=sum1+i;
       }
       
        System.out.println(""+(sum-sum1));
     }
}
