class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int fivebill = 0, tenbill = 0, twentybill = 0;
        if(n < 1) {
            return false;
        }

        for(int i=0; i<n; i++) {
            if(bills[i] == 5) {
                fivebill++;
            } else if(bills[i] == 10) {
                if(fivebill > 0) {
                    fivebill--;
                    tenbill++;
                } else  {
                    return false;
                }
            } else {
                if(fivebill > 0 && tenbill > 0) {
                    fivebill--;
                    tenbill--;
                    twentybill++;
                } else if (fivebill > 2){
                    fivebill -= 3;
                } else {
                    return false;
                }

            }
        }
        return true;
    }
}