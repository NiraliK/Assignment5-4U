
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author niralikantaria
 */
public class A5Q3 {

    //char stack created 
    Stack<Character> stack = new Stack<Character>();

    //boolean created 
    public boolean inLang(String word) {

        //check, if there is a dollar symbol in the middle of the word
        if (word.charAt(word.length() / 2) != '$') {
            //if there isnt return false
            return false;
        } else {
            //char created to store letters 
            char[] list = new char[word.length() / 2];

            //for loop to go through and input characters 
            for (int i = 0; i < word.length() / 2; i++) {
                //copied into the char array..
                list[i] = word.charAt(i);
                //..and pushed 
                stack.push(list[i]);
            }
            //if the word length/2 +1 if less then word length..
            while ((word.length() / 2 + 1) < word.length()) {
                //letter is stored at the top
                char letter = stack.peek();
                //if letter is not equal
                if (word.charAt(word.length() / 2 + 1) != letter) {
                    //false is returned
                    return false;
                } else {
                    //else the top letter is removed and num is increased
                    stack.pop();
                    int num = word.length() / 2 + 1;
                    num++;
                }
            }
            //if every case was true then true is returned
            return true;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test cretaed
        A5Q3 test = new A5Q3();

        //testing a false 
        System.out.println(test.inLang("car$rac"));
        System.out.println(test.inLang("t$t"));

        //testing a true
        System.out.println(test.inLang("s$"));
        System.out.println("n$");
    }

}
