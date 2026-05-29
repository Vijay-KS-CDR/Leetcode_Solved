class Solution {
    public long calculateScore(String[] inst, int[] values) {
        long score=0;
        String vst="visited";
        for(int i =0;i<inst.length && i>=0;i++){
            if(inst[i].equals(vst)){
                break;
            }
            if(inst[i].equals("add")){
                score+=values[i];
                inst[i]=vst;
            }
            else if(inst[i].equals("jump")){
                inst[i]=vst;
                i+=values[i]-1;
            }
        }
        return score;
    }
}