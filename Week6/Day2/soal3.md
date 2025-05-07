# Menurut Saya: Perbedaan Antara `static` dan `final` dengan Contoh Program Sederhana

Berdasarkan apa yang telah saya pelajari dan pahami, berikut adalah pandangan saya mengenai perbedaan antara kata kunci `static` dan `final` dalam pemrograman.

## `static`

Menurut saya, `static` adalah kata kunci yang sangat berguna ketika kita ingin sesuatu menjadi milik kelas itu sendiri, bukan milik masing-masing objek yang dibuat dari kelas tersebut.

- **Definisi**: Saya memahami `static` sebagai penanda untuk anggota (baik itu variabel maupun metode) yang terikat pada kelas, bukan pada instance atau objek spesifik dari kelas itu. Jadi, jika ada variabel `static`, semua objek dari kelas tersebut akan merujuk ke variabel yang sama.
- **Satu Salinan**: Konsep yang menarik menurut saya adalah bahwa hanya ada satu salinan dari anggota `static` di memori. Tidak peduli berapa banyak objek yang kita buat dari kelas tersebut, mereka semua akan berbagi satu salinan ini. Ini sangat efisien untuk data yang memang seharusnya bersifat global untuk kelas tersebut.
- **Akses**: Salah satu kemudahan yang saya lihat dari `static` adalah kita bisa mengakses anggotanya langsung menggunakan nama kelas, tanpa perlu repot-repot membuat objek terlebih dahulu. Ini praktis untuk fungsi-fungsi utilitas atau konstanta.
- **Keterbatasan dalam Konteks `static`**: Saya juga mengerti bahwa ada batasan. Metode `static` tidak bisa begitu saja mengakses variabel atau metode non-`static` (yang merupakan milik instance) secara langsung. Ini karena metode `static` tidak terikat pada objek tertentu, sehingga tidak ada referensi `this` yang bisa digunakan.
- **Penggunaan Umum yang Saya Lihat**:
  - Untuk variabel yang menyimpan data yang perlu dibagi oleh semua objek, seperti penghitung jumlah objek yang telah dibuat, atau nilai konstanta universal seperti `Math.PI`. Bisa juga untuk konfigurasi umum, misalnya suku bunga dalam sebuah sistem perbankan.
  - Untuk metode-metode utilitas yang tidak bergantung pada keadaan spesifik suatu objek, contohnya fungsi konversi satuan atau kalkulasi matematika umum.

## `final`

Kata kunci `final`, menurut pemahaman saya, digunakan untuk menandakan bahwa sesuatu itu sudah tetap dan tidak bisa diubah lagi setelah ditetapkan.

- **Definisi**: Saya melihat `final` sebagai cara untuk membuat sebuah entitas (variabel, metode, atau kelas) menjadi "final" atau "tidak dapat diubah" setelah didefinisikan atau diinisialisasi.
- **Jenis Penggunaan `final` yang Saya Pahami**:
  - **Variabel `final`**: Jika sebuah variabel dideklarasikan `final`, nilainya tidak bisa diubah setelah pertama kali diberi nilai. Ini menjadikannya sebuah konstanta.
    - Untuk tipe data primitif, nilai harfiahnya yang menjadi tetap.
    - Untuk variabel referensi objek, yang `final` adalah referensinya. Artinya, variabel tersebut tidak bisa diarahkan untuk menunjuk ke objek lain. Namun, perlu diingat bahwa isi dari objek yang dirujuk tersebut masih bisa diubah, kecuali objek itu sendiri juga bersifat _immutable_.
  - **Metode `final`**: Menurut saya, metode `final` berarti implementasinya sudah paten dan tidak bisa di-_override_ (diganti perilakunya) oleh kelas turunan (_subclass_). Ini berguna untuk memastikan bahwa perilaku inti dari sebuah metode tetap konsisten.
  - **Kelas `final`**: Jika sebuah kelas dideklarasikan `final`, maka kelas tersebut tidak bisa diwarisi atau tidak bisa memiliki _subclass_. Ini berguna ketika kita ingin mencegah adanya variasi atau modifikasi lebih lanjut dari kelas tersebut.
- **Manfaat yang Saya Rasakan**: Penggunaan `final` menurut saya memberikan beberapa keuntungan, seperti meningkatkan keamanan data karena mencegah perubahan yang tidak diinginkan, menjaga struktur program (terutama untuk metode dan kelas), dan bahkan berpotensi memberikan peluang bagi kompilator untuk melakukan optimasi kinerja.
