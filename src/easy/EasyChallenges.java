package easy;

import java.util.HashMap;
import java.util.Map;

public class EasyChallenges {

    public static int[] twoSums(int[] numbers,int target){
        Map<Integer,Integer> map = new HashMap<>();

        //iterating through each element and subtracting the element from the given target to get the next pair
        for(int i =0; i<numbers.length; i++){
            int otherPair = target - numbers[i];

            //check if the otherPair Exists in the Map
            if (map.containsKey(otherPair)){
              //return both the indices of the other pair and the current one
              return new int[] { map.get(otherPair),i};
            }
            //else adds the current iterated element with its index
            map.put(numbers[i],i );
        }
        //If no solution is found throws exception
        throw new IllegalArgumentException("No two sum solution");
    }
}
