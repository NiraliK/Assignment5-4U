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
        IntNode node = head;
        
        if(numItems == 0){
            IntNode addN = new IntNode(num);
            addN = head;
        }else{ 
            for(int i = 0; i < numItems; i++){
                if(num <= node.getNum()){
                   IntNode temp = new IntNode(num);
                   temp.setNext(node);
                   head = temp;
                }
            }
            
        }
    }
    
    public int size(){
        return numItems;
    }
    
    public boolean isEmpty(){
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
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
