package StackAndQeueu;

public class ArrayAsQueue {
    public static void main(String[] args){

        MyQueue<Integer> queue = new MyQueue<>(10);
        queue.push(5);
        queue.push(3);
        queue.push(8);
        queue.push(7);
        queue.push(9);
        queue.push(19);
        queue.push(29);
        queue.push(23);
        queue.pop();
        System.out.println(queue);
        System.out.println(queue.peek1());
        queue.remove(2);
        System.out.println(queue);
        System.out.println(queue.search(29));
        queue.insert(30, 4);
        System.out.println(queue);
    }
}

class MyQueue<T extends Comparable<T>> {
    private T[] elem;
    private int lastInd;

    public MyQueue(int len1){
//        myString = new String[length/10]
        elem = (T[]) new Comparable[len1];
        lastInd = -1;
    }

    public void push (T element){
        if (lastInd == elem.length-1){
            throw new RuntimeException("Queue is full.");
        }
        elem[lastInd+1] = element;
        lastInd++;
    }

    public void pop (){
        if(lastInd<0){
            throw new RuntimeException("Queue is empty");
        }

        elem[0] = null;
        for (int i=0; i < lastInd ; i++){
            elem[i] = elem[i+1];
        }
        elem[lastInd] = null;
        lastInd--;
    }
    public void remove (int index){
        if (index > lastInd || index<0){
            throw new RuntimeException("no element at that index");
        }
        elem[index] = null;
        for (int i=index; i < lastInd ; i++){
            elem[i] = elem[i+1];
        }
        elem[lastInd] = null;
        lastInd--;
    }

    public void insert (T o, int index){
        if(index == elem.length-1){
            throw new RuntimeException("The list is full.");
        }
        if (index >= lastInd || index<0){
            throw new RuntimeException("Position is not allowed.");
        }

        for (int i=lastInd+1; i >=index ; i--){
            elem[i] = elem[i-1];
        }
        elem[index] = o;
        lastInd++;
    }

    public T peek1(){
        if (lastInd < 0){
            throw new RuntimeException("Stack is empty");
        }
        return elem[lastInd];
    }

    public String search(T value){

        for(int i=0; i<= lastInd; i++){
            if( elem[i] == value){
                return "Value is found at " + i;
            }
        }
        return "Value was not found.";
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= lastInd; i++) {
            sb.append(elem[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

}