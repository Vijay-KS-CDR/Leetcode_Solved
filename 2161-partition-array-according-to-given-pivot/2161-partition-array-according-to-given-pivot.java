class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> lst1,lst2;
        lst1=new ArrayList<>();
        lst2=new ArrayList<>();
        int count=0;
        for(int i:nums){
            if(i>pivot){
                lst2.add(i);
            }else if(i<pivot){
                lst1.add(i);
            }else{
                count++;
            }
        }
        int i=0;
        for(int s:lst1){
            nums[i++]=s;
        }
        while(count-->0){
            nums[i++]=pivot;
        }
        for(int s:lst2){
            nums[i++]=s;
        }
        return nums;
    }
}