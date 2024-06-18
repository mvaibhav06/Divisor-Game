class Solution {
    public boolean divisorGame(int n) {
        while(true){
            int temp = 0;
            for(int i=1; i<n; i++){
                if(n%i==0){
                    temp = i;
                    break;
                }
            }
            if(temp > 0){
                n = n-temp;
            }else{
                return false;
            }
            int temp1 = 0;

            for(int i=1; i<n; i++){
                if(n%i==0){
                    temp1 = i;
                    break;
                }
            }

            if(temp1 > 0){
                n = n-temp;
            }else{
                return true;
            }
        }
        
    }
}
