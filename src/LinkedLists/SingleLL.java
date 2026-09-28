package LinkedLists;
import java.util.*;

public class SingleLL {

    static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
    public static Node ArrToLL(int arr[]){
        int size = arr.length;
        if(size == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i=1; i<size; i++){
             curr.next = new Node(arr[i]);
             curr = curr.next;
        }
        return head;
    }

    public static void printLL(Node head){
        Node curr = head;
        while(curr.next != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public static int lengthLL(Node head){
        int length = 0;
        Node curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        return length;
    }


    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        Node head = ArrToLL(arr);
        printLL(head);
        System.out.println();

        int length = lengthLL(head);
        System.out.print(length);
    }

}