public class TrapRain {
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int result = MaxWater(height);
        System.out.println("total trapped water = " + result);
    }

    public static int MaxWater(int arr[]){
        int n = arr.length;
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];

        for (int i=1;i<n;i++) {
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }

        int rightMax[] = new int[n];

        rightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);

        }
        
        int totalTrappedWater = 0;

        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            totalTrappedWater += waterLevel-arr[i];
        }
        return totalTrappedWater;
    }
}
