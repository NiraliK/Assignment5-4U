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
        array = new int[10];
        numItems = 0;
    }
    
    public void add(int index, int num){
       if(numItems == 0 && index == 0){
           array[0] = num;
           numItems++;
       }else if(index <= numItems){
           for(int i = numItems; i > index; i --){
               array[i] = array[i-1];
           }
           array[index] = num;
           numItems++;
       }
       if(numItems == array.length){
           int[] array2 = new int[array.length * 2];
           for(int i = 0; i < array.length; i++){
               array2[i] = array[i];
           }
           array = array2;
       }   
    }
    
    
    public void remove(int index){
      if(numItems > 0 && index < numItems){
          for(int i = index; i < numItems; i++){
              array[i] = array[i+1];
          }
      numItems--;    
      }  
    }
    
    public int size(){
        return numItems;
    }
    
    public boolean isEmpty(){
        if( numItems == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public int get(int index){
        return array[index];
    }
    
    public void print(){
        for(int i = 0; i < numItems; i ++){
            System.out.println(array[i]);
        }
    }
    
    }
    

