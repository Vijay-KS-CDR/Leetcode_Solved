class pair{
    int number,setbits;
    pair(int a,int b){
        number=a;
        setbits=b;
    }
}
class Solution {
    public int[] sortByBits(int[] arr) {
        ArrayList<pair>lst=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            lst.add(new pair(arr[i],Integer.bitCount(arr[i])));
        }
        Collections.sort(lst,(a,b)-> {
            if(a.setbits==b.setbits){
                return a.number-b.number;
            }        
            return a.setbits-b.setbits;
     });
        int arrnew[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arrnew[i]=lst.get(i).number;
        }
        return arrnew;
    }
}