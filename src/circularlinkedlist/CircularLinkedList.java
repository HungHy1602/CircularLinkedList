/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularlinkedlist;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: Problem I: Circular Linked list.
*/
public class CircularLinkedList {
    private Node current; // Reference to the current node

    public CircularLinkedList() {
        current = null;
    }

    public boolean isEmpty() {
        return current == null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            newNode.next = newNode; // Circular reference to itself
            current = newNode;
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public boolean search(int data) {
        if (isEmpty()) {
            return false;
        }

        Node start = current;
        Node temp = current;

        do {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        } while (temp != start);

        return false;
    }

    public void delete(int data) {
        if (isEmpty()) {
            return;
        }

        Node start = current;
        Node temp = current;
        Node prev = null;

        do {
            if (temp.data == data) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    current = temp.next;
                }
                if (temp == start) {
                    if (temp.next == temp) {
                        current = null; // List is now empty
                    } else {
                        current = temp.next;
                    }
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != start);
    }

    public void step() {
        if (!isEmpty()) {
            current = current.next;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty List");
            return;
        }

        Node start = current;
        Node temp = current;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != start);

        System.out.println();
    }
    
 }
