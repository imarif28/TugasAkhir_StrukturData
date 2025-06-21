/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_2_akhir;

class Node {
    Definition info;
    int data;
    String nama;
    Node prev;
    Node next;

    public Node(int data,String nama) {
        info = new Definition (data,nama); 
        this.prev = null;
        this.next = null;
    }

}
