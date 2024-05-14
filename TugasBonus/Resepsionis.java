package TugasBonus;

public class Resepsionis extends Civitas implements PesertaKelas {
    int idResepsionis;
    String jabatan;
    double gaji;
    
    public Resepsionis(String nama, int umur, boolean jenisKelamin, int idResepsionis, String jabatan, double gaji) {
        super(nama, umur, jenisKelamin);
        this.idResepsionis = idResepsionis;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
    
    @Override
    public void masukKelas() {
        System.out.println(nama + " masuk kelas.");
    }
    
    public void melayani() {
        System.out.println(nama + " melayani.");
    }
    
    public void melapor() {
        System.out.println(nama + " melapor.");
    }
    
    @Override
    void mainGameCorner() {
        System.out.println(nama + " main di game corner.");
    }
}
