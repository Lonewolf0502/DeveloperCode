// Leetcode - 412. Fizz Buzz
// https://leetcode.com/problems/fizz-buzz/

class Solution {
    public List<String> fizzBuzz(int n) {
        
        // The commented method can also be used but is a bit untidy & can be lenghty in some cases.
        
        // ArrayList<String> answer = new ArrayList<>();
        // for(int i = 1; i <= n; i++){
        //     if((i % 3 == 0) && (i % 5 == 0)){
        //        answer.add("FizzBuzz"); 
        //     }else if(i % 3 == 0){
        //         answer.add("Fizz");
        //     }else if(i % 5 == 0){
        //         answer.add("Buzz");
        //     }else{
        //         answer.add(String.valueOf(i));
        //     }
        // }
        // return answer;
        
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            boolean divisibleBy3 = (i % 3 == 0);
            boolean divisibleBy5 = (i % 5 == 0);
            
            String numAnsStr = "";
            
            if(divisibleBy3){
                numAnsStr += "Fizz";
            }
            
            if(divisibleBy5){
                numAnsStr += "Buzz";
            }
            
            if(numAnsStr.equals("")){
                numAnsStr += Integer.toString(i);
            }
            
            answer.add(numAnsStr);
        }
        
        return answer;
    }
}
