/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen;

/**
 *
 * @author Aukhal
 */
public class Produk {
    // Atribut
    private String namaProduk;
    private int harga;

    // Konstruktor
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Metode tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}
