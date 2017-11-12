/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niralikantaria
 */
public class A5Q2Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A5Q2 test = new A5Q2();
        test.add(0, 7);
        test.add(4, 6);
        test.add(5, 9);
        test.add(4, 16);
        test.add(6, 12);
        
        test.remove(7);
        
        test.print();
        
        System.out.println(test.isEmpty());
    }
    
}
