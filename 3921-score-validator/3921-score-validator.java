class Solution {
    public int[] scoreValidator(String[] events) {
        int counter=0;
        int score=0;
        String numstr="012346";
        for(int i=0;i<events.length;i++){
            if(numstr.contains(events[i])){
                score+=Integer.parseInt(events[i]);
            }
            if(events[i].equals("WD") || events[i].equals("NB")){
                    score+=1;
            }
            if(events[i].equals("W")){
                   counter+=1;
                if(counter==10){
                    break;
                }
            }
        }
        
        return new int[]{score,counter};
    }
}