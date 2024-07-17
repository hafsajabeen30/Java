package Sorts;

public class Selection <I extends Comparable <I>> {
    static class Element<K>{
        private K content;
        private Element<K> next;
        public Element(K o){
            content =o;
            next=null;
        }
    }

    private Element<I> head; // pointer to beginning of the list
    public Element<I> insert (I o) { // insert at head
        Element<I> newEl = new Element<I>(o);
        if (head == null) { // List is empty
            head = newEl;
        } else {
            newEl.next = head;
            head = newEl;
        }
        return newEl;
    }

    public void selectionSort(){
        if(head == null || head.next == null){
            return;
        }
        else {
            Element<I> th = head;
            while(th!=null){
                Element<I> min = th;
                Element<I> help = min.next;
                while (help != null) {
                    if (help.content.compareTo(min.content) < 0)
                        min = help;
                    help = help.next;
                }
                if (min != th) { // swap content
                    I dummy = th.content;
                    th.content = min.content;
                    min.content = dummy;
                }

                th= th.next;
            }
        }
    }

    public String toString() {
        String s = "(";
        Element<I> help = head;
        while (help != null && help.next != null) {
            s = s + help.content + ", ";
            help = help.next;
        }
        if (help != null)
            s = s + help.content;
        return s + ")";
    }

    public static void main (String[] args) {
        Selection<Integer> l = new Selection<>();
        l.insert(0);
        l.insert(5);
        l.insert(4);
        l.insert(6);
        l.insert(3);
        l.insert(8);
        l.insert(2);
        l.insert(5);
        System.out.println(l);
        l.selectionSort();
        System.out.println(l);
    }
}

