package LinkedLists;

public class SingleLL {

    public static void main (String[] args){
        List<Integer> singlly = new List<>();
        singlly.push(2);
        singlly.push(3);
        singlly.push(4);
        singlly.push(5);
        singlly.delete(5);
        Node<Integer> result = singlly.search(3);
        if(result != null){
            System.out.println("The given node is: " + result);
        } else
        {
            System.out.println("The given node is null");
        }
        singlly.display();

    }
}

class Node<T>{
    T id;
    Node<T> next;
    Node(T id){
        this.id = id;
        this.next =null;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}

class List <T> {
    Node<T> head;
    List() {
        this.head = null;
    }

    public void push( T id){
        Node<T> N = new Node<>(id);

        if(head == null){
            head = N;
        }
        else {
            N.next = head;
            head = N;
        }
    }

    public void pop(){
        if(head.next == null){
            head = null;
        }
        else{
            head = head.next;
        }
    }

    public void delete(T id){
        Node<T> th = head;
        if (id == head.id){
            head = head.next;
        }
        else {
            while(th.next != null){
                if(th.next.id == id){
                    th.next = th.next.next;
                    break;
                }
            }
        }
    }


    public Node<T> search(T id){
        Node<T> th = head;
        if(th.id == id){
            return head;
        }
        else{
            while (th != null){
                if(th.id == id){
                    return th;
                }
                th = th.next;
            }
        }
        return null;
    }


    public void display(){
        Node<T> th = head;
        while (th != null){
            System.out.println(th.id);
            th = th.next;
        }

    }

}
