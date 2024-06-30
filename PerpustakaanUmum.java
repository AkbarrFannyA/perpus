/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpusakbar;

/**
 *
 * @author LENOVO
 */
public class PerpustakaanUmum implements Perpustakaan {
    private final String[] daftarBuku = {"Buku A", "Buku B", "Buku C"};

    @Override
    public void pinjamBuku(String judulBuku) {
        System.out.println("Meminjam buku: " + judulBuku);
    }

    @Override
    public void kembalikanBuku(String judulBuku) {
        System.out.println("Mengembalikan buku: " + judulBuku);
    }

    @Override
    public void lihatDaftarBuku() {
        System.out.println("Daftar buku di perpustakaan:");
    for (String buku : daftarBuku) {
        System.out.println("- " + buku);
    }
}
    }