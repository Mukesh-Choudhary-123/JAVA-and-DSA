public class Basic{

    public static void action(int arr[],int i,int val){
       
       if(i==arr.length){       //Base case
        arrprint(arr);
        return;
       }
        
       arr[i]=val;
       action(arr, i+1, val+1); //recursion 
       arr[i]=arr[i]-2;        //Backtracking
    }

    public static void arrprint(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= new int[5];
        action(arr,0,1);
        arrprint(arr);
    }
}