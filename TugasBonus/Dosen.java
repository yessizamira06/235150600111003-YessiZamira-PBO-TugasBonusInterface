package TugasBonus;

public class Dosen extends Civitas implements PesertaKelas, Pengajar {
    String nip;
    double gaji;
    
    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }
    
    @Override
    public void masukKelas() {
        System.out.println(nama + " masuk kelas.");
    }
    
    public void ikutPenelitian() {
        System.out.println(nama + " ikut penelitian.");
    }
    
    @Override
    public void mengajar(String matkul) {
        System.out.println(nama + " mengajar mata kuliah " + matkul);
    }

    @Override
    public void mengasihTugas() {
        System.out.println(nama + " mengasih tugas.");
    }

    @Override
    public void menilaiTugas() {
        System.out.println(nama + " menilai tugas.");
    }
    
    @Override
    void mainGameCorner() {
        System.out.println(nama + " main di game corner.");
    }
}
