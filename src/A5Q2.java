/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niralikantaria
 */
public class A5Q2 {
    private int[] array;
    private int numItems;
    
    public A5Q2(){
        //array created 
        array = new int[10];
        numItems = 0;
    }
    
    //add method created 
    public void add(int index, int num){
        //if the numItems is 0 and so is the index 
       if(numItems == 0 && index == 0){
           //the array at position 0 is the number
           array[0] = num;
           numItems++;
           //if the index is less then or equall to the numItem 
       }else if(index <= numItems){
           //go through the array 
           for(int i = numItems; i > index; i --){
               //numbers placed in appropriate index
               array[i] = array[i-1];
           }
           //copied back into original 
           array[index] = num;
           numItems++;
       }
       //if the number of items in the array is the length of the array...
       if(numItems == array.length){
           //the array sports double 
           int[] array2 = new int[array.length * 2];
           //go through the array 
           for(int i = 0; i < array.length; i++){
               //numbers placed in second array 
               array2[i] = array[i];
           }
           //frist array and doubled array are equal 
           array = array2;
       }   
    }
    
    
    public void remove(int index){
      //if the num of items in the array is greater then 0 and index is less then number of items
      if(numItems > 0 && index < numItems){
          //go through the array
          for(int i = index; i < numItems; i++){
              //add one more to the array 
              array[i] = array[i+1];
          }
      numItems--;    
      }  
    }
    
    public int size(){
        //number of items is returned 
        return numItems;
    }
    
    public boolean isEmpty(){
        //if the number of items is equal to 0
        if( numItems == 0){
            //true is returned 
            return true;
        //if not it is false
        }else{
            return false;
        }
    }
    
    public int get(int index){
        //the array at index is returned 
        return array[index];
    }
    
    public void print(){
        //go through the array and print the num of items 
        for(int i = 0; i < numItems; i ++){
            System.out.println(array[i]);
        }
    }
    
    }