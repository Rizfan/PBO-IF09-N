package com.nama_kalian.PBO.pertemuan5;

public class Barang {
    String nama;
    int harga;

    public Barang(){}

    public Barang(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void showInfo(){
        System.out.println("Nama : "+nama);
        System.out.println("Harga : "+harga);
    }

}
