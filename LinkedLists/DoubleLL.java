package LinkedLists;

public class DoubleLL {
    public static void main (String[] args){
        List<Integer> doubelly = new List<>();
        doubelly.push(2);
        doubelly.push(3);
        doubelly.push(4);
        doubelly.push(5);
        doubelly.delete(5);
        Node<Integer> result = doubelly.search(3);
        if(result != null){
            System.out.println("The given node is: " + result);
        } else
        {
            System.out.println("The given node is null");
        }
        doubelly.display();

    }
}

class Node1<T>{
    T id;
    Node1<T> next;
    Node1<T> prev;
    Node1(T id){
        this.id = id;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString (){
        return String.valueOf(id);
    }
}

class List1 <T> {
    Node1<T> head;
    Node1<T> tail;
    List1(){
        this.head = null;
        this.tail = null;
    }

    public void push(T id){
       Node1<T> N = new Node1<>(id);

       if (head == null){
           head = N;
           tail = head;
       }
       else {
           head.prev = N;
           N.next = head;
           head = N;
       }
    }

    public void pop(){
        if(head ==tail){
            head = null;
            tail = null;
        }
        else{
            tail.prev.next = null;
            tail = tail.prev;
        }
    }

    public void delete(T id){
        Node1<T> th = head;

        if(head ==tail){
            head = null;
            tail = null;
        }
        else
        {
            while (th != null){
                if(th.id == id){
                    if(th != tail){
                        th.prev.next = th.next;
                        th.next.prev = th.prev;
                    }
                    else
                    {
                        th.prev.next = th.next;
                        tail = th.prev;
                    }
                }
                th = th.next;
            }
        }
    }

    public Node1 <T> search (T id){
        Node1<T> th = head;
        if(th.id == id){
            return head;
        }
        else {
            while (th.next != null){
                if(th.id == id){
                    return th;
                }
                th = th.next;
            }
        }
        return null;
    }

    public void display(){
        Node1<T> th = head;
        while (th != null){
            System.out.println(th.id);
            th = th.next;
        }

    }

}