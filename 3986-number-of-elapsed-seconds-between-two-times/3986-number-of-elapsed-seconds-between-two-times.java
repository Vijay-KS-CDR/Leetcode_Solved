class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] time1=startTime.split(":");
        String[] time2=endTime.split(":");
        int sum=0;
        sum+=(Integer.parseInt(time2[0]) - Integer.parseInt(time1[0]))*60*60;
        sum+=(Integer.parseInt(time2[1]) - Integer.parseInt(time1[1]))*60;
        sum+=Integer.parseInt(time2[2]) - Integer.parseInt(time1[2]);
        return sum;
    }
}