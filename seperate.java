public class CN_2_Seperate_0_1 {

    public static void seperate(int arr[],int n){
        int p = -1;

        for(int i = 0;i<n;i++){
             if(arr[i]==0){
                 p++;
                 int t = arr[i];
                 arr[i] = arr[p];
                 arr[p] = t;
             }
        }
    }
}
