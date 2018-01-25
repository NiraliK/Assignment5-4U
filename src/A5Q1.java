/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niralikantaria
 */
public class A5Q1 {
    
    //instancous varibale created to track the first node and all the nums 
    private IntNode head; 
    private int numItems;
    
    public A5Q1(){
        //intialize  head 
        head = null; 
        //intialize num of items in the list 
        numItems = 0; 
    }
    
    public void add(int num){
        //start at the beginning 
        IntNode node = head;
        
        //if there are no numbers then...
        if(numItems == 0){
            //... a node is created for the list 
            IntNode addN = new IntNode(num);
            //the ead is moved 
            addN = head;
        }else{
            //go through the list of numbers 
            for(int i = 0; i < numItems; i++){
                //if the number entered is smaller..
                if(num <= node.getNum()){
                    //new node created 
                   IntNode temp = new IntNode(num);
                   //new node point
                   temp.setNext(node);
                   //head is equal to temp
                   head = temp;
                }
            }
            
        }
    }
    
    public int size(){
        ///the numitems is returned 
        return numItems;
    }
    
    public boolean isEmpty(){
        //if the num of items is equal to 0, it is returned 
        return numItems == 0; 
    }
    
    public int get(int index){
        // set the node to be at the beginnig
        IntNode node = head;
        // move a number of times equal the the index entered
        for (int i = 0; i < index; i++) {
            // move the node over
            node = node.getNext();
        }
        // return the value of the node at the desired position
        return node.getNum();
    }
    
    public void remove(int num) {
        //node is set to head 
        IntNode node = head; 
        //a while loop created to find the number being searched 
        while(node.getNext() != null && node.getNext().getNum() !=num) {
            //number is transfered to the next 
            node = node.getNext();
        }
        //if the number from previous equals to the num..
        if(node.getNext().getNum() == num){
            //the number is removed 
            IntNode removeto = node.getNext();
            //set to the next node
            node.setNext(node.getNext().getNext());
            //remove the link
            removeto.setNext(null);
        }
        //num items decreases by 1
        numItems--;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test created 
        A5Q1 test = new A5Q1();
        
        //sample test values to run test 
        test.add(37);
        test.add(18);
        test.add(13);
        //go through the test numbers and print them out
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
        //remove the test that runs 13
        test.remove(13);
        
    }
    
}
