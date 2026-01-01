class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<names.length-1;i++){
            for(int j=0;j<names.length-i-1;j++){
                if(heights[j]<heights[j+1]){
                    String temp=names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp;

                    int temp1=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp1;
                }
            }
        }
        return names;
    }
}