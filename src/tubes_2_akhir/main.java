package tubes_2_akhir;

import java.util.Scanner;


public class main {
        public static void addNode(Graph G, String name) {
            if (G.cariSimpul(name) == null) {
                G.tambahSimpul(name);
                System.out.println("Berhasil menambah kota " + name + " pada graph");
            } else {
                System.out.println("Kota " + name + " sudah ada");
            }
        }

	
	public static void addEdge(Graph G, String ori, String dest, int weight){
		Simpul end = G.cariSimpul(dest);
		Simpul begin = G.cariSimpul(ori);
		if ((begin != null) && (end != null)){
			if (!G.cekJalur(begin, end)){
				G.tambahJalur(end, weight, begin);
				System.out.println("Tambah jalur dari " + begin.infoSimpul + " ke " + end.infoSimpul + " dengan bobot " + weight);
			}else{
				System.out.println("Sudah ada jalur dari " + begin.infoSimpul + " ke " + end.infoSimpul);
			}
		}
	}
        
    public static void deleteEdge(Graph graph, String asal, String tujuan) {
        Simpul simpulAsal = graph.cariSimpul(asal);
        Simpul simpulTujuan = graph.cariSimpul(tujuan);

        if (simpulAsal != null && simpulTujuan != null) {
            if (graph.cekJalur(simpulAsal, simpulTujuan)) {
                Jalur jalur = simpulAsal.jalur;
                Jalur prevJalur = null;

                while (jalur != null) {
                    if (jalur.simpul == simpulTujuan) {
                        if (prevJalur == null) {
                            simpulAsal.jalur = jalur.nextJalur;
                        } else {
                            prevJalur.nextJalur = jalur.nextJalur;
                        }
                        System.out.println("Jalur antara " + asal + " dan " + tujuan + " berhasil dihapus.");
                        return;
                    }

                    prevJalur = jalur;
                    jalur = jalur.nextJalur;
                }

                System.out.println("Tidak ditemukan jalur antara " + asal + " dan " + tujuan + ".");
            } else {
                System.out.println("Tidak ditemukan jalur antara " + asal + " dan " + tujuan + ".");
            }
        } else {
            System.out.println("Simpul " + asal + " atau " + tujuan + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        Queue BusQueue = new Queue();
        Queue KeretaQueue = new Queue();
        Queue PesawatQueue = new Queue();

        messy m = new messy();

        int nomorAntrian = 1;
        String nama, kota;

        addNode(g, "Yokosuka");
        addNode(g, "Fujiyoshida");
        addNode(g, "Chichibu");
        addNode(g, "Utsunomiya");
        addNode(g, "Tokyo");

        Scanner s = new Scanner(System.in);
        Scanner k = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= MENU PILIHAN ==========");
            System.out.println("|\t1. Tambah Antrian\t|");
            System.out.println("|\t2. Lihat Antrian\t|");
            System.out.println("|\t3. Kelola Kota\t\t|");
            System.out.println("|\t4. Cari Kota\t\t|");
            System.out.println("|\t5. Kelola Jalur\t\t|");
            System.out.println("|\t6. Cari Jalur\t\t|");
            System.out.println("|\t7. Beli Tiket\t\t|");
            System.out.println("|\t8. Lihat Tiket Terjual\t|");
            System.out.println("=================================");
            System.out.print("Pilihan = ");
            int pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    switch (m.pilihan1()) {
                        case 1:
                            System.out.print("Masukkan Nama Anda : ");
                            nama = k.nextLine();
                            BusQueue.enqueue(nomorAntrian, nama);
                            nomorAntrian++;
                            break;
                        case 2:
                            int nomorAntrian2 = 1;
                            System.out.print("Masukkan Nama Anda : ");
                            nama = k.nextLine();
                            KeretaQueue.enqueue(nomorAntrian2, nama);
                            break;
                        case 3:
                            int nomorAntrian3 = 1;
                            System.out.print("Masukkan Nama Anda : ");
                            nama = k.nextLine();
                            PesawatQueue.enqueue(nomorAntrian3, nama);
                            break;
                    }
                    break;
                case 2:
                    switch (messy.pilihan1()) {
                        case 1:
                            BusQueue.print();
                            break;
                        case 2:
                            KeretaQueue.print();
                            break;
                        case 3:
                            PesawatQueue.print();
                            break;
                    }
                    break;
                case 3:
                    switch (messy.pilihan2()) {
                        case 1:
                            System.out.print("Masukkan Nama Kota : ");
                            kota = k.nextLine();
                            addNode(g, kota);
                            break;
                        case 2:
                            System.out.print("Masukkan Nama Kota yang Akan Dihapus : ");
                            String nama_kota = k.nextLine();
                            g.hapusSimpul(nama_kota);
                            break;
                        case 3:
                            g.cetakGraph();
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Kota Yang Akan Dicari : ");
                    String nama_kota = k.nextLine();
                    g.cariSimpul2(nama_kota);
                    break;
                case 5:
                    switch (messy.pilihan3()) {
                        case 1:
                            System.out.print("Masukkan Kota Asal: ");
                            String asal = k.nextLine();
                            System.out.print("Masukkan Kota Tujuan: ");
                            String tujuan = k.nextLine();
                            System.out.print("Masukkan Jarak: ");
                            int jarak = s.nextInt();
                            addEdge(g, asal, tujuan, jarak);
                            break;
                        case 2:
                            System.out.print("Masukkan Kota Asal: ");
                            String origin = k.nextLine();
                            System.out.print("Masukkan Kota Tujuan: ");
                            String destination = k.nextLine();
                            deleteEdge(g, origin, destination);
                            break;
                        case 3:
                            g.cetakGraph();
                            break;
                    }
                    break;
                case 6:
                    // cariJalur(g, s);
                    break;
                case 7:
                    // beliTiket(busQueue, keretaQueue, pesawatQueue, tiketTerjual, s);
                    break;
                case 8:
                    // lihatTiketTerjual(tiketTerjual);
                    break;
            }
        }
    }
}