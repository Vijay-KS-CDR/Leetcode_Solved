class Solution {
    public int maxNumberOfFamilies(int n, int[][] res) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int a[]:res){
            map.putIfAbsent(a[0],new ArrayList<>());
            map.get(a[0]).add(a[1]);
        }
        int ans1=0;
        for(int x:map.keySet()){
            ArrayList<Integer> lst=map.get(x);
            int temp=0;
            if(!lst.contains(2) && !lst.contains(3) && !lst.contains(4) && !lst.contains(5)){
                temp++;
                lst.add(2);
                lst.add(3);
                lst.add(4);
                lst.add(5);
            }
            if(!lst.contains(4) && !lst.contains(5) && !lst.contains(6) && !lst.contains(7)){
                temp++;
                lst.add(4);
                lst.add(5);
                lst.add(6);
                lst.add(7);
            }
            if(!lst.contains(6) && !lst.contains(7) && !lst.contains(8) && !lst.contains(9)){
                temp++;
                
            }
            ans1+=temp;
        }
        return (n-map.size())*2+ans1;
    }
}