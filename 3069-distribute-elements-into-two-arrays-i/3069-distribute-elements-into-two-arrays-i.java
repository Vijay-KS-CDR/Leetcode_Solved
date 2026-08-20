class Solution {
    public int[] resultArray(int[] nums) {
        int result[]=new int[nums.length];
        ArrayList<Integer> lst1=new ArrayList<>();
        ArrayList<Integer> lst2=new ArrayList<>();
        lst1.add(nums[0]);
        System.out.println(nums[0]+" in lst1");
        lst2.add(nums[1]);
        System.out.println(nums[1]+" in lst1");
        int l1=0,l2=0;
        for(int i=2;i<nums.length;i++){
            if(lst1.get(l1)>lst2.get(l2)){
                lst1.add(nums[i]);
                System.out.println(nums[i]+" in lst1");
                l1++;
            }else{
                lst2.add(nums[i]);
                System.out.println(nums[i]+" in lst2");
                l2++;
            }
        }
        int j=0;
        if(lst1.size()!=0){
            for(int x:lst1){
                result[j++]=x;
            }
        }
        if(lst2.size()!=0){
            for(int x:lst2){
                result[j++]=x;
            }
        }
        return result;
    }
}