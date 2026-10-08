<div align="center">
  
# MINPRO 2 PBO

</div>

Nama : Otniel Putra Wardana

Nim : 2509116081

----

##  Deskripsi Singkat Program

Program ini merupakan Sistem Monitoring Kelayakan dan Perizinan Kendaraan Operasional yang dibuat untuk membantu perusahaan atau instansi dalam mengelola dan memantau kondisi serta perizinan kendaraan operasional. Program ini diperuntukkan bagi pihak yang bertanggung jawab terhadap kendaraan agar dapat mengetahui data kendaraan, kondisi kelayakannya, serta informasi perizinan yang dimiliki. Dengan adanya program ini, proses pengelolaan data kendaraan menjadi lebih terstruktur dan mudah dipantau, sehingga dapat membantu memastikan kendaraan yang digunakan berada dalam kondisi layak dan memiliki perizinan yang sesuai.

----

## Fitur Program

* Tambah Data Kendaraan Operasional
* Menampilkan Data Kendaraan
* Mengubah Kondisi Kelayakan Kendaraan
* Menghapus Data Kendaraan
* Menampilkan Status Kelayakan Kendaraan
* Tambah Data Perizinan Kendaraan
* Menampilkan Data Perizinan Kendaraan

----

## Struktur Package (MVC)

Program ini dibagi menjadi 4 package. Tiga di antaranya adalah komponen MVC yaitu Controller, View, dan Model. serta satu lagi adalah titik awal program.

<img width="525" height="316" alt="image" src="https://github.com/user-attachments/assets/a0170c51-7093-4fc9-8c84-7254e71224ff" />


### 1. Main

<img width="162" height="42" alt="image" src="https://github.com/user-attachments/assets/98168f82-c992-425d-9632-077f0ffbfed7" />


Package `main` adalah folder tempat program mulai dijalankan, isinya `Main.java`. Ini berbeda dari method `main()`, yaitu syarat Java agar program bisa berjalan. Package ini bukan bagian dari MVC, tugasnya hanya menghubungkan View dan Controller: meminta input ke View, meminta Controller memproses data, lalu meminta View menampilkan hasilnya. Di NetBeans, Main Class diatur ke `main.Main`.

### 2. Model

<img width="248" height="123" alt="image" src="https://github.com/user-attachments/assets/d5bd73dc-ef80-4778-a6a5-5c9be6045cde" />

**Model** adalah bagian yang mengatur, menyimpan, dan mengambil data, berisi aturan bisnis, dan tidak peduli bagaimana data ditampilkan (tidak ada `Scanner` atau `System.out`). Data disimpan di atribut `private`, diambil lewat getter, dan data yang melanggar aturan ditolak dengan `IllegalArgumentException`.

**Class di package `model`:**

- **`Kendaraan`**: abstract class induk yang menyimpan dan memvalidasi data kendaraan, serta punya abstract method `getKeterangan()`.
- **`KendaraanLayak`**: turunan `Kendaraan` untuk kondisi layak.
- **`KendaraanTidakLayak`**: turunan `Kendaraan` untuk kondisi tidak layak.
- **`Perizinan`**: menyimpan data izin kendaraan (nomor izin, plat, jenis izin, tanggal berlaku).

### 3. Controller

<img width="176" height="42" alt="image" src="https://github.com/user-attachments/assets/fa6ff36b-0236-4071-b921-d2cb92fbc678" />

Controller adalah otak yang menghubungkan View dan Model. Controller menerima input dari pengguna, memprosesnya, meminta data yang diperlukan ke Model, lalu mengirimkan hasilnya kembali ke View untuk ditampilkan. Class di package controller:

- **`Monitoring`**: mengelola data kendaraan dan perizinan (tambah, hapus, update kondisi, cek plat) dan menolak plat kembar.

### 4. View

Bagian yang bertugas menampilkan informasi kepada pengguna, contohnya UI. View hanya menerima data yang sudah siap disajikan dan tidak memproses data. Pada proyek ini View berupa tampilan console: menampilkan menu, data, dan animasi, serta menerima input pengguna lalu meneruskannya ke Controller. Class di dalam package view:

- **`Animasi`**: berisi animasi loading, efek mesin tik, dan transisi antar menu supaya program terlihat lebih hidup.
- **`KendaraanView`**: menampilkan menu, data kendaraan, dan data perizinan, serta menerima input pengguna dan memeriksa formatnya (misalnya jenis kendaraan hanya boleh huruf).

<img width="207" height="67" alt="image" src="https://github.com/user-attachments/assets/d80ba6e7-b719-4fa2-8b0c-a29ad3ef1555" />

----

## Alur Program

### 1. Menu Utama Program

Jika pengguna menjalankan program ini, maka pengguna akan langsung masuk kedalam menu. Menu ini menjadi pusat navigasi bagi pengguna untuk mengakses berbagai fitur yang tersedia dalam sistem. Pada menu utama, pengguna akan diberikan beberapa pilihan berupa nomor yang dapat dipilih sesuai kebutuhan. Pengguna cukup memasukkan nomor pilihan, kemudian program akan menjalankan fitur yang dipilih. Setelah fitur selesai digunakan, pengguna dapat kembali ke menu utama untuk memilih fitur lainnya atau memilih opsi keluar untuk mengakhiri program.

<img width="632" height="545" alt="image" src="https://github.com/user-attachments/assets/598edfbd-b3e6-4984-8296-80b854b7c811" />

### 2. Menambahkan Kendaraan

Fitur Tambah Kendaraan digunakan untuk memasukkan data kendaraan operasional baru ke dalam sistem. Pengguna akan diminta mengisi beberapa informasi seperti plat nomor, jenis kendaraan, merk, tahun kendaraan, dan kondisi kendaraan. Setiap input akan divalidasi terlebih dahulu agar data yang dimasukkan sesuai dengan ketentuan. Setelah semua data valid, kendaraan akan disimpan ke dalam sistem dan dapat dilihat melalui fitur Tampilkan Kendaraan.

<img width="617" height="427" alt="image" src="https://github.com/user-attachments/assets/16838bdb-8c33-47ca-bd43-c41bf85bcffc" />

### 3. Menampilkan Kendaraan 

Fitur Tampilkan Kendaraan digunakan untuk melihat seluruh data kendaraan yang telah tersimpan di dalam sistem. Pada fitur ini, pengguna dapat melihat informasi seperti plat nomor, jenis kendaraan, merk, tahun, dan kondisi kendaraan. Sistem juga menampilkan keterangan mengenai status kendaraan, apakah kendaraan tersebut layak digunakan atau tidak layak dan perlu diperiksa.

<img width="392" height="541" alt="image" src="https://github.com/user-attachments/assets/409f3c2f-4679-4724-9ae2-1bba32ae6f24" />

### 4. Memperbarui Kondisi Kendaraan

Fitur Update Kondisi digunakan untuk mengubah kondisi atau status kelayakan kendaraan yang sudah tersimpan di dalam sistem. Pengguna memasukkan plat nomor kendaraan yang ingin diperbarui, kemudian memilih kondisi baru, yaitu “Layak” atau “Tidak Layak”. Setelah proses berhasil, data kendaraan akan diperbarui sesuai dengan kondisi yang dipilih.

<img width="276" height="705" alt="image" src="https://github.com/user-attachments/assets/6d6776ce-2c36-43b7-88c6-e6bf7c1bb0f7" />

### 5. Menghapus Kendaraan 

Fitur Hapus Kendaraan digunakan untuk menghapus data kendaraan yang sudah tersimpan di dalam sistem. Pengguna cukup memasukkan nomor plat kendaraan yang ingin dihapus, kemudian sistem akan mencari data tersebut. Jika kendaraan ditemukan, data akan dihapus dari sistem dan pengguna akan mendapatkan pemberitahuan bahwa data berhasil dihapus.

<img width="270" height="532" alt="image" src="https://github.com/user-attachments/assets/9b356021-b932-4770-8881-cb15c04539bb" />

### 6. Tambah Perizinan

Fitur Tambah Perizinan digunakan untuk memasukkan data izin kendaraan ke dalam sistem. Pengguna akan mengisi informasi seperti nomor izin, nomor plat kendaraan, jenis izin, dan tanggal berlaku. Setelah data yang dimasukkan valid, sistem akan menyimpan data perizinan sehingga dapat digunakan dan ditampilkan kembali melalui fitur Tampilkan Perizinan.

<img width="342" height="332" alt="image" src="https://github.com/user-attachments/assets/7e7fd00b-edab-44ea-a57f-97b125c693a3" />

### 7. Tampilkan Perizinan

Fitur Tampilkan Perizinan digunakan untuk melihat seluruh data perizinan kendaraan yang telah tersimpan di dalam sistem. Pengguna dapat melihat informasi seperti nomor izin, nomor plat kendaraan, jenis izin, dan tanggal berlaku. Fitur ini membantu pengguna mengetahui informasi perizinan kendaraan secara lebih mudah dan terorganisir.

<img width="255" height="273" alt="image" src="https://github.com/user-attachments/assets/70b3041a-0c7c-4ffc-847b-007f46b412c6" />


### 8. Menyelesaikan Program

Fitur Keluar digunakan untuk mengakhiri program. Ketika pengguna memilih menu ini, sistem akan menghentikan proses program dan pengguna akan keluar dari sistem.

<img width="475" height="267" alt="image" src="https://github.com/user-attachments/assets/e10e7fe3-de28-472d-9d63-a3304defc8f3" />


