public class sortcolours {
    public static void sortc(int[] nums){
        for(int i=0; i<=nums.length-2; i++){
            int min =i;
            for(int j=i; j<=nums.length-1;j++){
                if(nums[j]<nums[min]){
                    min = j;
                }
            }

            int temp = nums[min];
                    nums[min]= nums[i];
                    nums[i]= temp;
        }

        System.out.println("SORTED ARRAY:");
        for(int i : nums){
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args){
        sortc(new int[]{0,1,2,1,2,1});
    }
}
