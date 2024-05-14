package TugasBonus;

public abstract class Civitas {
    String nama;
    int umur;
    boolean jenisKelamin; // true untuk laki-laki, false untuk perempuan
    
    Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }
    
    void makanDiKantin(String kantin) {
        System.out.println(nama + " sedang makan di " + kantin);
    }

    abstract void mainGameCorner();
}
