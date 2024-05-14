
package TugasBonus;

public class Asprak extends Civitas implements PesertaKelas {
    public Asprak(String nama, int umur, boolean jenisKelamin) {
        super(nama, umur, jenisKelamin);
    }
    
    @Override
    public void masukKelas() {
        System.out.println(nama + " masuk kelas.");
    }
    
    public void ngasihKomenDiGCR() {
        System.out.println(nama + " ngasih komen di GCR.");
    }
    
    @Override
    void mainGameCorner() {
        System.out.println(nama + " main di game corner.");
    }
}
