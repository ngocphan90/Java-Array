package com.codewithmosh;

public class Array {
    private int[] items;
    private int count;

    public Array (int length) {
        items = new int [length];
    }

    //add item to the end of array
    public void insert (int item){
        //if array is full -> resize
        if (items.length == count){
            //create a new array (twice the size)
            //copy all the existing items
            int[] newItems = new int [count*2];
            for (int i =0; i< count; i++) {
                newItems[i] = items[i];
            }
            //set "items" to this new array
            items = newItems;

        }
        //add new item at the end of the array
        items[count++] = item;
    }
    public void removeAt(int index){
        if (index<0|| index>=count){
            throw new IllegalArgumentException();
        }

        for (int i =index; i< count; i++) {
            items[i] = items[i + 1];
        }
        //count present number of item in the array not the size of the array
        count--;
    }
    // O(n) in worst case
    public int indexOf( int item){
        for (int i =0 ; i< count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public void print (){
        for (int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }

}
