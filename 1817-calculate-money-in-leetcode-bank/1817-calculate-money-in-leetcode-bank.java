class Solution {
    public int totalMoney(int n) {
        int week=n/7;
        int amount=0;
        amount=findweekamount(week);
        int remDays=n%7;
        amount+=(week+1)*(remDays)+((remDays-1)*remDays)/2;
        return amount;
    }
    public int findweekamount(int week){
        if(week==0){
            return 0;
        }
        if(week==1){
            return 28;
        }
        int currentSum=28+(week-1)*7;
        int amount=currentSum+findweekamount(week-1);
        return amount;
    }
}