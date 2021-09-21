package com.tutorial;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) {
        // instansiasi
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Rizal";
        mahasiswa1.nim = "A11.2020.12692";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 19;
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
    }
}
