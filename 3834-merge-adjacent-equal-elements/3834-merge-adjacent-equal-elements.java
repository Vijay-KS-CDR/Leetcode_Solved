class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> lst=new ArrayList<>();
        Stack<Long> stk=new Stack<>();
        for(int i=0;i<nums.length;i++){
            long s=nums[i];
            while(!stk.isEmpty() && (s==stk.peek())){
                s=s+stk.pop();
            }
            stk.push(s);
            lst.add(s);
        }
        return new ArrayList<>(stk);
    }
}