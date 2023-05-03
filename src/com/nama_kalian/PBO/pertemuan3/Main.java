package com.nama_kalian.PBO.pertemuan3;

public class Main {
    public static void main(String[] args) {
        //Pembuatan class
        SepedaMotor honda = new SepedaMotor("Honda", "vario 160", 35000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "N Max", 4000000);
        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa Matic", 60000000);

        /*
        // Mengisi nilai atribut object Honda
        honda.merk = "Honda";
        honda.tipe = "Vario 160";
        honda.harga = 35000000;

        // Mengisi nilai atribut object Yamaha
        yamaha.merk = "Yamaha";
        yamaha.tipe = "N Max";
        yamaha.harga = 40000000;

        // Mengisi nilai atribut object Vespa
        vespa.merk = "Vespa";
        vespa.tipe = "Vespa Matic";
        vespa.harga = 60000000;

         */
        // Untuk menjalankan method
        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();

        // Uji coba getter dan setter
        System.out.println("Motor merk " + honda.getMerk() + " dengan tipe (sebelum) : " + honda.getTipe());
        honda.setTipe("Beat 110");
        System.out.println("Motor merk  " + honda.getMerk() + " dengan tipe (sesudah) : " + honda.getTipe());
    }
}
