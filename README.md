

https://scarleshop-tutorial.koyeb.app/
<img width="615" alt="image" src="https://github.com/Scarletra/tutorial-1/assets/112821721/0b4b1522-4cbe-4714-b430-f9b03565b06e">




Nama : Fernando Valentino Sitinjak </br>
NPM  : 2206081332 </br>

## Tutorial 1
### Refleksi 1
Melalui tutorial 1 ini, saya sadar bahwa ilmu yang sudah saya pelajari sepanjang perkuliahan ini, khususnya bagian <i>programming</i> masih sangat kurang. Ternyata masih banyak aspek yang harus dipelajari, tidak hanya asal menuliskan sebuah kode dan menjadi suatu produk, tetapi juga perlu memperhatikan standar penulisan, kerapihan, dan keamanan kode yang kita tulis.

Saya mempelajari hal baru terkait penulisan kode, seperti:

1. Meaningful Names, penamaan variabel agar sesuai dengan fungsi aslinya
2. Function, penulisan clean code dalam function  agar mudah untuk dibaca
3. Comment, penulisan kode yang jelas membuat komen tidak lagi diperlukan
5. Error Handling, pada bagian ini saya masih kurang karena dari apa yang saya pelajari di kelas, disarankan untuk menggunakan exception <br>

Dari apa yang sudah diajarkan dalam modul tutorial ini, masih ada beberapa bagian kode saya yang belum memenuhi kriteria penulisan kode yang baik. Maka dari itu, saya akan coba merapihkan kembali nantinya.

## Tutorial 2
### Refleksi 2
1. Setelah mempelajari pembuatan <i>unit test</i>, saya jadi belajar hal baru bahwa dalam pembuatan program atau bahkan sampai membentuk suatu aplikasi, <i>testing</i> merupakan hal yang sangat penting. <b>Jumlah unit test</b> yang kita perlukan itu tidak dapat ditentukan sedari awal, hal ini bergantung pada kompleksitas dari program yang kita buat seperti fitur, logic, dan lainnya. Dengan adanya 100% <i>code average</i> belum bisa menjamin bahwa program kita tidak memiliki <i>bug</i> ataupun error karena bisa saja program yang dijalankan bisa ter-<i>execute</i> dengan baik, namun memberikan output yang tidak sesuai dengan seharusnya.

2. Penambahan tes seperti mengecek jumlah produk yang ada dalam program ini dengan prosedur dan instance yang sama menurut saya dapat menurunkan <i>cleanliness</i> dari kode kita. Hal ini disebabkan oleh penggunaan hal yang berulang dengan menggunakan kode yang sudah ada sebelumnya. Menurut saya, salah satu solusi yang dapat dilakukan untuk mencegah hal ini adalah dengan cara membentuk suatu superclass yang <i>reusable</i> agar nantinya untuk pembuatan tes lainnya yang berhubungan hanya perlu memakai superclass ini.

### Refleksi
Selama mengerjakan tutorial 2 ini, beberapa code quality issues saya perbaiki antara lain:
1. Memperbaiki masalah executable permission issue pada file gradlew di Dockerfile dengan memberikan izin yang sesuai menggunakan perintah chmod +x gradlew
2. Menyesuaikan versi Java yang digunakan dalam analisis SonarCloud dengan mengubah konfigurasi untuk menggunakan Java 21, karena versi Java sebelumnya sudah tidak didukung lagi
3. Menambahkan konfigurasi yang diperlukan dalam file GitHub Actions workflow untuk memastikan analisis SonarCloud berjalan dengan benar, termasuk spesifikasi distribusi Java yang digunakan
4. Menghilangkan public modifier pada file yang berhubungan dengan test, karena best implementation pada test yaitu menggunakan default modifier

## Tutorial 3
### Refleksi

1) SRP : Memisahkan antara ProductController dan CarController, menghapus extend ProductController dari CarController agar CarController hanya menghandle Car saja.

    OCP : Mengubah bagian CarController yang tadinya menggunakan CarServiceImpl sebagai atribut menjadi menggunakan CarService.

    LSP : Karena <b>extend</b> pada CarController sudah hilang, sudah tidak adalagi inheritance yang terjadi antara superclass dan subclass, sehingga yang tersisa hanyalah implementasi dari sebuah interface.

    ISP : Dengan kondisi struktur yang sekarang, tiap interface dan controller hanya berfokus pada satu hal masing-masing (ProductService dan ProductController untuk Product dan CarService && CarController untuk Car)

    DIP : Sekarang kedua controller bergantung dengan abstraksi dari interface ProductService dan CarService, sehingga DIP terimplementasikan.

2) Dengan mengimplementasikan solid principle, kita dapat jadi lebih mudah untuk me-<i>maintain</i> kode kita. Tidak hanya itu, kita juga dapat meningkatkan kualitas dan juga fleksibilitas dari kode yang sudah kita buat. Sebagai contoh, dengan diterapkannya solid principle, pada proyek eshop kita jadi dapat membedakan dengan mudah dalam pengerjaan Car dan Product. SRP membuat setiap class hanya hanya berfokus pada satu fungsi saja. OCP membuat kita tidak perlu memodifikasi kode yang sudah ada saat kita ingin menambahkan suatu fitur baru. ISP membuat kita hanya menggunakan method-method yang diperlukan dari sebuah interface yang ada.

3) <i>Disadvantage</i> dari tidak adanya penerapan solid principle adalah sebaliknya yang ada pada poin (2). <i>Maintability</i> dan <i>readibility</i> dari kode kita menjadi berkurang. Sebagai contoh sederhana, tanpa adanya pemisahan antara CarController dan ProductController, kita akan sedikit bingung disebabkan 2 path yang berbeda berada dalam satu file yang sama.

## Tutorial 4
### Refleksi

1) Setelah menyelesaikan tutorial ini, saya mempelajari banyak hal dari penerapan Test-Driven Development (TDD). Proses ini memberikan manfaat dan pengalaman berkesan bagi saya, karena membutuhkan implementasi berdasarkan tes-tes yang telah saya buat sebelumnya. Dari segi correctness, saya yakin bahwa aplikasi yang saya kembangkan telah memiliki fungsionalitas yang baik dan tentunya sudah teruji dengan kasus-kasus yang jarang terjadi. Dalam hal maintainability, dengan adanya tes-tes yang saya buat, saya jadi bisa melakukan refaktorisasi pada kode saya tanpa perlu takut menghancurkan kodenya. tes-tes tersebut juga membantu saya dalam mengembangkan kode dengan baik. 

Dalam hal workflow saya, saya dapat melakukan rangkaian tes secara efisien ketika diperlukan. Adanya implementasi TDD ini membantu saya mencapai sebagian besar tujuan pengujian saya, saya bisa  melakukan penyesuaian di masa depan berdasarkan evaluasi yang ada terhadap proses pengujian.

2) Dalam pengembangan perangkat lunak, penerapan prinsip F.I.R.S.T dalam pengujian memiliki peran krusial untuk menjamin kualitas dan efektivitas dari kode aplikasi. Saya telah berhasil mengintegrasikan prinsip ini dengan baik dalam seluruh proses pengujian saya. Tes yang saya buat dapat dijalankan dengan cepat tanpa menghambat alur kerja, memungkinkan saya tetap fokus pada pengembangan.

Selain itu, penggunaan Dummy, Mocks, dan setUp saya gunakan untuk menghindari duplikasi dan membuat suatu objek buatan. Dalam situasi di mana fungsi saya memanggil fungsi lain, penggunaan teknik Test Double membantu memastikan pengujian yang terisolasi dan dapat diandalkan. Oleh karena itu, prinsip F.I.R.S.T telah membantu saya dalam membangun dan menguji perangkat lunak, sehingga produk yang dihasilkan memiliki kualitas tinggi.
