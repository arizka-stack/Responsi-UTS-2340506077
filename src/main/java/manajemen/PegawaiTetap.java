/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen;

/**
 *
 * @author Aukhal
 */
public class PegawaiTetap extends Pegawai {
    private int tunjangan;

    // Konstruktor
    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji); // Memanggil konstruktor dari Pegawai
        this.tunjangan = tunjangan;
    }

    // Metode tampilkanInfo (override dari kelas induk)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
