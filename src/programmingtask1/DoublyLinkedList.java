/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingtask1;

/**
 *
 * @author Alexander
 */
public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;
    
    public DoublyLinkedList(){
        head = new Node();
        tail = new Node();
        size = 0;
    }
    
    public DoublyLinkedList(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }
    
    public void MakeEmpty(){
        head = new Node();
        tail = new Node();
        size = 0;
    }
    
    public String PrintList(){
        String string = "";
        for(int i = 0; i < size; i++){
            if(i == 0 && size == 1){
                string += head.getNext().getName();
                continue;
            }
            else if(i == size - 1){
                string += FindByIndex(i).getName();
                continue;
            }
            string += FindByIndex(i).getName() + " -> ";
        }
        return string;
    }
    
    public String PrintList(int start, int end){
        if(start > end){
            return "";
        }
        String string = "";
        for(int i = start - 1; i < end; i++){
            if(i == end - 1){
                string += FindByIndex(i).getName();
                continue;
            }
            string += FindByIndex(i).getName() + " -> ";
        }
        return string;
    }
    
    public void InsertHead(Node node){
        size++;
        if(head.getNext() != null){
            node.setNext(head.getNext());
            node.setPrevious(head);
            head.getNext().setPrevious(node);
            head.setNext(node);
            return;
        }
        node.setNext(tail);
        node.setPrevious(head);
        head.setNext(node);
        tail.setPrevious(node);
    }
    
    public void InsertTail(Node node){
        size++;
        if(tail.getPrevious() != null){
            node.setNext(tail);
            node.setPrevious(tail.getPrevious());
            tail.getPrevious().setNext(node);
            tail.setPrevious(node);
            return;
        }
        node.setNext(tail);
        node.setPrevious(head);
        head.setNext(node);
        tail.setPrevious(node);
    }
    
    public boolean Insert(Node node, int index){
        if(index > size-1){
            System.out.println("ERROR: Index given is greater than size.");
        }
        
        size++;
        
        Node nav = FindByIndex(index);
        
        if(nav == null){
            return false;
        }
        
        node.setPrevious(nav.getPrevious());
        node.setNext(nav);
        
        nav.getPrevious().setNext(node);
        nav.setPrevious(node);
        
        return true;
    }
    
    public void RemoveHead(){
        Remove(0);
    }
    
    public void RemoveTail(){
        Remove(size-1);
    }
    
    public void Remove(Node node){
        
        int index = FindByValue(node);
        
        Remove(index);
        
    }
    
    public void Remove(int index){
        if(index > size-1){
            System.out.println("ERROR: Index given is greater than size.");
            return;
        }
        
        Node nav = FindByIndex(index);
        
        nav.getPrevious().setNext(nav.getNext());
        nav.getNext().setPrevious(nav.getPrevious());
        
        size--;
    }
    
    public int FindByValue(Node node){
        Node nav = head.getNext();
        Node nav1 = tail.getPrevious();
        for(int i = 0; i < size/2; i++){
            if(nav.equals(node)){
               return i;
            }
            else if(nav1.equals(node)){
                return size-i-1;
            }
            nav = nav.getNext();
            nav1 = nav1.getPrevious();
        }
        
        return -1;
    }
    
    public Node FindByIndex(int index){
        if(index > size-1){
            System.out.println("ERROR: Index given is greater than size.");
            return null;
        }
        
        int x = 0, y = size - 1;
        Node nav = head.getNext();
        Node nav1 = tail.getPrevious();
        while(x <= y){
            if(index == x){
                return nav;
            }
            else if(index == y){
                return nav1;
            }
            nav = nav.getNext();
            nav1 = nav1.getPrevious();
            x++;
            y--;
        }
        
        return null;
    }
    
    public Node FindByName(String name, String verse){
        Node nav = head.getNext();
        
        for(int i = 0; i < size; i++){
            if(nav.getName().equalsIgnoreCase(name) &&
                    nav.getVerse().equalsIgnoreCase(verse)){
                return nav;
            }
            nav = nav.getNext();
        }
        return null;
    }
}
