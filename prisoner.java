import java.util.Arrays;

public class prisoner {
    public static int[] missingprisoner(int [][] prisoners){
        int missing_x=0;
        int missing_y=0;
        for(int []points:prisoners){
           missing_x^=points[0];
           missing_y^=points[1];
        }

        return new int[]{missing_x,missing_y};

    }
   public static void main(String[] args) {
    
    int[][] points1 = {
            {1, 2},
            {1, 5},
            {4, 2}
        };
        int[] result1 = missingprisoner(points1);
        System.out.println("Missing point (Test 1): " + Arrays.toString(result1));

        // Test Case 2: Multiple rectangles (4N - 1 points total)
        int[][] points2 = {
            {0, 0}, {0, 3}, {3, 0}, {3, 3},  // Complete rectangle 1
            {10, 20}, {10, 50}, {40, 20}     // Incomplete rectangle 2 (missing [40, 50])
        };
        int[] result2 = missingprisoner(points2);
        System.out.println("Missing point (Test 2): " + Arrays.toString(result2));
    
   }
}
