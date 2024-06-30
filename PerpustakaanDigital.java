/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpusakbar;

import java.util.HashMap;

/**
 *
 * @author LENOVO
 */
public class PerpustakaanDigital implements Perpustakaan {
    private final HashMap<String, Boolean> daftarBuku;

    public PerpustakaanDigital() {
        this.daftarBuku = new HashMap<>();
        this.daftarBuku.put("Buku A", true);
        this.daftarBuku.put("Buku B", true);
        this.daftarBuku.put("Buku C", true);
    }

    @Override
    public void pinjamBuku(String judulBuku) {
        if (this.daftarBuku.get(judulBuku)) {
        this.daftarBuku.put(judulBuku, false);
        System.out.println("Meminjam buku: " + judulBuku);

        } else {
            System.out.println("Buku " + judulBuku + " sedang dipinjam.");
        }
    }
    @Override
    public void kembalikanBuku(String judulBuku) {
    if (!this.daftarBuku.get(judulBuku)) {
        this.daftarBuku.put(judulBuku, true);
        System.out.println("Mengembalikan buku: " + judulBuku);
    } else {
        System.out.println("Buku " + judulBuku + " sudah dikembalikan.");
    }
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void lihatDaftarBuku() {
        System.out.println("Daftar buku di perpustakaan digital:");
        this.daftarBuku.entrySet().forEach((<any> entry) -> {
            String buku = entry.getKey();
            boolean tersedia = entry.getValue();
            System.out.println("- " + buku + " (Tersedia: " + tersedia + ")");
        });
    }
}
