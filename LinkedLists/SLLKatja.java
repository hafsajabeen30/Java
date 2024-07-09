package LinkedLists;

public class SLLKatja <T extends Comparable<T>> {

    public static void main(String[] args){
        SLLKatja<Integer> List = new SLLKatja<>();
        System.out.println(List);
        List.insertAnywhere(2);
        List.insertAnywhere(3);
        List.insertAnywhere(1);
        List.insertAnywhere(6);
        List.insertAnywhere(5);
        System.out.println(List);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ElementL<T> current = head;
        while (current != null) {
            sb.append(current.element).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    static class ElementL<E>{
        private E element;
        private ElementL<E> next;

        public ElementL(E o) {
            element = o;
//            can also just use element = this.element
            next = null;
        }

    }


    private ElementL<T> head;

//    we usually dont wrirte these in exam paper these are constructors

    public SLLKatja(){
        head = null;
    }
    public SLLKatja(T o){
        head =  new ElementL<T>(o);
    }

//    We start writing from here:

    public void insertAtStart(T elem){
        ElementL<T> newEl = new ElementL<T>(elem);
//        learn to write the above line, it is important for insertion of input

        if(head == null){
            head = newEl;
        }
        else {
            newEl.next = head;
            head = newEl;
        }
    }

//this is the best example to remember it has two kinds of variables

    public void insertAfterPred ( T elem, ElementL<T> pred){
        ElementL<T> newEl = new ElementL<T>(elem);
        ElementL<T> th = head;

        if (pred == null) {
            pred = newEl;
        }
        else while(th != null){
            if(th == pred){
                newEl.next = pred.next;
                pred.next = newEl;
            }
            th = th.next;
        }
    }

    public void insertAnywhere (T elem){
        ElementL<T> newEl = new ElementL<T>(elem);
        ElementL<T> th = head;
        if(head == null){
            head = newEl;
        }
        else if (head.next == null) {
            if((elem.compareTo(head.element)<=0) ){
                newEl.next = head;
                head = newEl;
            }
            else {
                head.next = newEl;

            }
        }
        else {

            if((elem.compareTo(head.element))<=0){
                newEl.next = head;
                head = newEl;
            }
            else {
                while (th.next != null && elem.compareTo(th.next.element) > 0){
                    th = th.next;
                }
                newEl.next = th.next;
                th.next = newEl;
            }
            }

        }
    }



