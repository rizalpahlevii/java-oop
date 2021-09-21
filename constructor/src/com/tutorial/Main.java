package com.tutorial;

class Polos {
    String dataString;
    int dataInteger;
}

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    // constructor
    // Mahasiswa() {
    // System.out.println("Ini adalh constructor");
    // }

    // constructor with params
    Mahasiswa(String inputNama, String inputNim, String inputJurusan) {
        nama = inputNama;
        jurusan = inputJurusan;
        nim = inputNim;
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Rizal", "12692", "TI");
        Mahasiswa mahasiswa2 = new Mahasiswa("Pahlevi", "126123", "SI");

    }
}
