package projectTasks;

import java.util.HashMap;

public class SumOFTwoNumbersInString {

    public static void main(String[] args) {

        //create a method should return an integer
        // Task is, find the sum of integers in a string
        String str="AB123C15EF";
//        System.out.println(str.charAt(str.length()-1));
//        String result="";
//        for (char i:str.toCharArray()){
//            if(Character.isDigit(i)){
//                result+=i;
//            }
//            else{
//                result+=" ";
//            }
//        }
//        result=result.trim();
//
//        String firstNumber=result.substring(0,result.indexOf(" "));
//
//        String secondNumber="";
//
//        for (int i=result.length()-1;i>=0;i--){
//            if(result.charAt(i)==' '){
//                secondNumber=result.substring(i+1);
//                break;
//            }
//        }
//
//        int sum=Integer.parseInt(firstNumber)+Integer.parseInt(secondNumber);
//        System.out.println(sum);


       int num2 = num(str);
        System.out.println(num2);
    }

    public static int num(String str){
        String result="";
        for (char i:str.toCharArray()){
            if(Character.isDigit(i)){
                result+=i;
            }
            else{
                result+=" ";
            }
        }
        result=result.trim();

        String firstNumber=result.substring(0,result.indexOf(" "));

        String secondNumber="";

        for (int i=result.length()-1;i>=0;i--){
            if(result.charAt(i)==' '){
                secondNumber=result.substring(i+1);
                break;
            }
        }

        int sum=Integer.parseInt(firstNumber)+Integer.parseInt(secondNumber);
        System.out.println(sum);
        return sum;
    }
}
