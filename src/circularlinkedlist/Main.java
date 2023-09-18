/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularlinkedlist;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: Problem I: Circular Linked list.
*/
public class Main {
     public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);

        System.out.print("Initial Circular Linked List: ");
        cll.display();

        cll.step(); // Move current to the next node
        System.out.print("After stepping: ");
        cll.display();

        cll.delete(2);
        System.out.print("After deleting 2: ");
        cll.display();

        System.out.println("Is 3 in the list? " + cll.search(3)); // Should print true
        System.out.println("Is 5 in the list? " + cll.search(5)); // Should print false
    }
}
