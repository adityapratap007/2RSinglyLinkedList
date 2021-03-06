package implementation;

import myinterface.SinglyLinkedListADT;

public class MySinglyLinkedList implements SinglyLinkedListADT {
    private Node head;
    private Node tail;
    private int size;
    public MySinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public void addFirst(int element){
        Node node = new Node(element);
        //empty
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
        }
        else{
            node.setNext(head);
            head = node;
            size++;
        }
    }
    @Override
    public void addLast(int element){
        Node node = new Node(element);
        //empty
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
        }
        else{
            tail.setNext(node);
            tail = node;
            size++;
        }
    }
    public void addLastWithoutUsingTail(int element){
        Node node = new Node(element);
        //empty
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
        }
        else{
            //traversing to last node
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
            tail = node;
            size++;
        }
    }
    @Override
    public boolean isEmpty(){
        return head == null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void traverse() {

    }
}
