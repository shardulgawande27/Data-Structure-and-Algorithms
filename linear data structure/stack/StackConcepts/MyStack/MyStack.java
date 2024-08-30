package StackConcepts.MyStack;

import java.util.EmptyStackException;

public class MyStack {

    private int[] items;
    private int top;
    private int size;

    MyStack(int size){
        this.size = size;
        this.items = new int[size];
        this.top = 0;
    }

    public void push (int value){
        if (top == size){
            throw new StackOverflowError();
//            System.out.println("Stack is full");
//            return;
        }
        this.items[this.top] = value;
        this.top++;
    }

    public int pop (){
        if (top == 0){
            throw new EmptyStackException();
//            System.out.println("The Stack is empty");
//            return -1;
        }
        int popedValue = items[top-1];
        items[top-1] =0;
        this.top--;
        return popedValue;
    }

    public int peek(){
        if (top == 0){
            throw new EmptyStackException();
//            System.out.println("The Stack is empty");
//            return -1;
        }
        int peekValue = items[top-1];
        return peekValue;
    }

    public boolean isEmpty(){
        if (top == 0 && items[top]  == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return top;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = size - 1 ; i >= 0; i--){
            stringBuilder.append(items[i]).append("\n");
        }
        return stringBuilder.toString();
    }
}
