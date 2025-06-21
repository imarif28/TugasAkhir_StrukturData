package tubes_2_akhir;

class Queue {
    Node front, rear;
    
    public Queue() {
        this.front = this.rear = null;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void enqueue(int data, String nama) {
        Node newNode = new Node(data, nama);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong. Tidak dapat melakukan dequeue.");
            return;
        }

        String nama = front.nama;
        front = front.next;

        if (front != null) {
            front.prev = null;
        } else {
            rear = null;
        }

        System.out.println(nama + " telah dihapus dari Queue.");

        if (isEmpty()) {
            System.out.println("Queue kosong setelah penghapusan elemen terakhir.");
        }
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue kosong.");
        } else {
            Node temp = front;
            System.out.print("Queue: ");

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public void print() {
        Node elemenSementara = front;
        if (elemenSementara == null) {
            System.out.println("KOSONG");
        } else {
            while (elemenSementara != null) {
                System.out.println("Nama  : " + elemenSementara.nama);
                System.out.println("Nomor Antrian  : " + elemenSementara.data);
                elemenSementara = elemenSementara.next;
            }
        }
    }
}
