/**
In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty. 

There is at least one empty seat, and at least one person sitting.

Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 

Return that maximum distance to closest person.
*/

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