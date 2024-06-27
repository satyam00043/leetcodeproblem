public class rotate{

    public  void reverse(int[] arr, int left, int right){
          if(arr == null || arr.length == 1)
          return;
          while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
          }
    }
    public void rotate(int a[],int o){
        reverse(a,0,o-1);
        reverse(a,o,a.length-1);
        reverse(a,0,a.length-1);
      
    
    }

public static void main(String[] args){
  Scanner sc =new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++){
  a[i]=sc.nextInt();
  
  }
  rotate r=new rotate();


}




}
