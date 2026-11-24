import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> al = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                al.add("FizzBuzz");
            }
            else if(i % 3 == 0) {
                al.add("Fizz");
            }
            else if(i % 5 == 0) {
                al.add("Buzz");
            }
            else {
                al.add(String.valueOf(i));
            }
        }
        return al;
    }

    public static void main(String[] args) {
        FizzBuzz obj = new FizzBuzz();
        int n = 15;
        
        // Call the method on the object and store the result
        List<String> result = obj.fizzBuzz(n);
        
        // Print the result instead of just 'n'
        System.out.println(result);
    }
}