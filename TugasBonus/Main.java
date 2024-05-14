package TugasBonus;
public class Main {
    public static void main(String[] args) {
        // Membuat instansi dari kelas konkret
        Dosen dosen = new Dosen("Pak  Bayu", 40, true, "123456", 10000000);
        Resepsionis resepsionis = new Resepsionis("Mbak Siti", 25, false, 7890, "Senior Resepsionis", 5000000);
        Asprak asprak = new Asprak("Mas Aldo", 22, true);
        
        // Upcasting
        PesertaKelas pesertaDosen = dosen;
        PesertaKelas pesertaResepsionis = resepsionis;
        PesertaKelas pesertaAsprak = asprak;
        
        // Pemanggilan metode menggunakan referensi upcasting
        pesertaDosen.masukKelas();
        pesertaResepsionis.masukKelas();
        pesertaAsprak.masukKelas();
        
        // Pemanggilan metode menggunakan referensi asli
        dosen.mengajar("Matematika");
        dosen.mengasihTugas();
        dosen.menilaiTugas();
        dosen.ikutPenelitian();
        dosen.makanDiKantin("Kantin A");
        dosen.mainGameCorner();
        
        resepsionis.melayani();
        resepsionis.melapor();
        resepsionis.makanDiKantin("Kantin B");
        resepsionis.mainGameCorner();
        
        asprak.ngasihKomenDiGCR();
        asprak.makanDiKantin("Kantin C");
        asprak.mainGameCorner();
    }
}
