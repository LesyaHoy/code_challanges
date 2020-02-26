class Solution {
    public int maxDistToClosest(int[] seats) {       
        int distance = 0;
        for(int i = 0; i< seats.length; i++){
            int stepStart = i;
            while(stepStart < seats.length && seats[stepStart] != 0)
            {
                stepStart++;
            }
    
            int stepEnd = stepStart + 1;        
            while(stepEnd < seats.length && seats[stepEnd] != 1)
            {
                stepEnd++;
            }
            
            if(stepStart == 0 || stepEnd == seats.length){
                distance = Math.max(stepEnd - stepStart, distance);
            }
            else{
                int addition = (stepEnd - stepStart)%2 > 0? 1:0;
                distance = Math.max((stepEnd - stepStart)/ 2 + addition, distance);
            } 
            i = stepEnd;
        }
        
        return distance;
    }
}