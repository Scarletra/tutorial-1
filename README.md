# tutorial-1

Nama : Fernando Valentino Sitinjak </br>
NPM  : 2206081332 </br>

### Refleksi 1
Melalui tutorial 1 ini, saya sadar bahwa ilmu yang sudah saya pelajari sepanjang perkuliahan ini, khususnya bagian <i>programming</i> masih sangat kurang. Ternyata masih banyak aspek yang harus dipelajari, tidak hanya asal menuliskan sebuah kode dan menjadi suatu produk, tetapi juga perlu memperhatikan standar penulisan, kerapihan, dan keamanan kode yang kita tulis.

Saya mempelajari hal baru terkait penulisan kode, seperti:

1. Meaningful Names, penamaan variabel agar sesuai dengan fungsi aslinya
2. Function, penulisan clean code dalam function  agar mudah untuk dibaca
3. Comment, penulisan kode yang jelas membuat komen tidak lagi diperlukan
5. Error Handling, pada bagian ini saya masih kurang karena dari apa yang saya pelajari di kelas, disarankan untuk menggunakan exception <br>

Dari apa yang sudah diajarkan dalam modul tutorial ini, masih ada beberapa bagian kode saya yang belum memenuhi kriteria penulisan kode yang baik. Maka dari itu, saya akan coba merapihkan kembali nantinya

### Refleksi 2
1. Setelah mempelajari pembuatan <i>unit test</i>, saya jadi belajar hal baru bahwa dalam pembuatan program atau bahkan sampai membentuk suatu aplikasi, <i>testing</i> merupakan hal yang sangat penting. <b>Jumlah unit test</b> yang kita perlukan itu tidak dapat ditentukan sedari awal, hal ini bergantung pada kompleksitas dari program yang kita buat seperti fitur, logic, dan lainnya. Dengan adanya 100% <i>code average</i> belum bisa menjamin bahwa program kita tidak memiliki <i>bug</i> ataupun error karena bisa saja program yang dijalankan bisa ter-<i>execute</i> dengan baik, namun memberikan output yang tidak sesuai dengan seharusnya.

2. Penambahan tes seperti mengecek jumlah produk yang ada dalam program ini dengan prosedur dan instance yang sama menurut saya dapat menurunkan <i>cleanliness</i> dari kode kita. Hal ini disebabkan oleh penggunaan hal yang berulang dengan menggunakan kode yang sudah ada sebelumnya. Menurut saya, salah satu solusi yang dapat dilakukan untuk mencegah hal ini adalah dengan cara membentuk suatu superclass yang <i>reusable</i> agar nantinya untuk pembuatan tes lainnya yang berhubungan hanya perlu memakai superclass ini.

## Tutorial 2
### Refleksi
Selama mengerjakan tutorial 2 ini, beberapa code quality issues saya perbaiki antara lain:
1. Memperbaiki masalah executable permission issue pada file gradlew di Dockerfile dengan memberikan izin yang sesuai menggunakan perintah chmod +x gradlew
2. Menyesuaikan versi Java yang digunakan dalam analisis SonarCloud dengan mengubah konfigurasi untuk menggunakan Java 21, karena versi Java sebelumnya sudah tidak didukung lagi
3. Menambahkan konfigurasi yang diperlukan dalam file GitHub Actions workflow untuk memastikan analisis SonarCloud berjalan dengan benar, termasuk spesifikasi distribusi Java yang digunakan
4. Menghilangkan public modifier pada file yang berhubungan dengan test, karena best implementation pada test yaitu menggunakan default modifier
