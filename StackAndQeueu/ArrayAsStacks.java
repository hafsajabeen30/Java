package StackAndQeueu;

import java.util.Arrays;

public class ArrayAsStacks {
    public static void main(String[] args){
        MyStack<Integer> stack = new MyStack<>(10);
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);

    }
}

//This is how it is written differently as generic type
class MyStack<T extends Comparable<T>>{
    private T[] element;
    private int lastIndex;

     public MyStack(int len) {

        element = (T[]) new Comparable[len];
        lastIndex = -1;
    }

    public void push (T elem){
         if(lastIndex == element.length-1){
             throw new RuntimeException("Stack is full");
         }
         element[lastIndex+1] = elem;
         lastIndex++;
    }

    public void pop (){
         if (lastIndex <0 ){
             throw new RuntimeException("Stack is empty");
         }
         element[lastIndex] = null;
         lastIndex--;
    }

    public T peek(){
         if (lastIndex < 0){
             throw new RuntimeException("Stack is empty");
         }
         return element[lastIndex];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= lastIndex; i++) {
            sb.append(element[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}

