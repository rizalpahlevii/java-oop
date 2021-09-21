package com.tutorial;

class Mahasiswa {
    String nama = "default";
    String NIM;

    // constructor
    Mahasiswa(String nama, String inputNim) {
        this.nama = nama;
        this.NIM = inputNim;
    }

    // method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    // method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return tapi tidak ada parameter;
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // method dengan return dan parameter;
    String sayHi(String message) {
        return message + " Juga, nama saya adalah " + this.nama;
    }
}

class Dosen {
    String nama;

    Dosen(String nama) {
        this.nama = nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Muhammad Rizal", "A11.2020.12692");
        mahasiswa.show();
        mahasiswa.setNama("Pahlevi");
        mahasiswa.show();
        System.out.println(mahasiswa.getNama());
        System.out.println(mahasiswa.getNIM());

        String data = mahasiswa.sayHi("Halo");
        System.out.println(data);

        Dosen dosen = new Dosen("MRizal");
    }

}