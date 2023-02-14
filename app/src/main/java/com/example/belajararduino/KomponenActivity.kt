package com.example.belajararduino

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KomponenActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_komponen)
        supportActionBar?.hide()

        val kembali = findViewById<ImageView>(R.id.imgBack12)
        val imageList = listOf<Image>(
            Image(
                R.drawable.boardbo,
                "Breadboard",
                "\tBreadboard adalah board yang digunakan untuk membuat rangkaian elektronik sementara dengan tujuan uji coba atau prototipe tanpa harus menyolder.Dengan memanfaatkan breadboard, komponen- komponen elektronik yang dipakai tidak akan rusak dan dapat digunakan kembali untuk membuat rangkaian yang lain.Breadboard umumnya terbuat dari plastik dengan banyak lubang-lubang diatasnya. Lubang-lubang pada breadboard diatur sedemikian rupa membentuk pola sesuai dengan pola jaringan koneksi di dalamnya. Breadboard yang tersedia di pasaran umumnya terbagi atas 3 ukuran: mini breadboard, medium breadboard atau large breadboard. Mini breadboard memiliki 170 titik koneksi (bisa juga lebih). Kemudian medium breaboard memiliki 400 titik koneksi. Dan large breadboard memiliki 830 titik koneksi.\n"+
                        "\n" +
                        "\tPada breadboard dapat dilihat penulisan huruf A, B, C, D, E, F, G, H, I dan J. Kemudian ada angka 1, 5, 10, 15 dan 20. Huruf dan angka ini membentuk semacam koordinat. A1, B1, C1, D1 dan E1 saling berhubungan sesuai pola koneksinya (lihat kembali garis berwarna biru).\n"+
                        "\n" +
                        "\tSeperti yang dibahas di awal bahwa kegunaan breadboard yaitu sebagai media penghantar (konduktor listrik) sekaligus tempat kabel jumper dilekatkan. Sehingga arus dari satu komponen bisa terdistribusi dengan baik sesuai keinginan ke komponen lain tanpa harus merepotkan pengguna untuk melakukan penyolderan atau melakukan bongkar pasang.  Salah satu kelebihan tersendiri dari penggunaan breadboard adalah komponen-komponen yang telah dirakit tak akan rusak dan mudah untuk dibongkar pasang. Ini karena papan breadboard merupakan papan tanpa solder (solderless).\n",
                R.drawable.putih1,
                "\n",
                "\n",
                R.drawable.putih1,
                "\n"
            ),
            Image(
                R.drawable.kkabel,
                "Kabel Jumper",
                "\tGambar di atas menunjukkan seperti apa bentuk dari yang namanya male connector dan female connector. Kabel jumper adalah suatu istilah kabel yang ber-diameter kecil yang di dalam dunia elektronika digunakan untuk menghubungkan dua titik atau lebih dan dapat juga untuk menghubungkan 2 komponen elektronika.\n" +
                        "\n" +
                        "               Macam-Macam Kabel Jumper Arduino\n" +
                        "\n" +
                        "\tAda bebera jenis kabel jumper yang dibedakan berdasarkan konektor kabelnya, yaitu :\n"+
                        "\n" +
                        "1. kabel jumper male to male\n"+
                        "\n" +
                        "\tJenis yang pertama adalah kabel jumper male male. Kabel jumper male to male adalah adalah jenis yang sangat yang sangat cocok untuk kamu yang mau membuat rangkaian elektronik di breadboard.\n"+
                        "\n" +
                        "2. kabel jumper male to female\n"+
                        "\n" +
                        "\tKabel jumper male female memiliki ujung konektor yang berbeda pada tiap ujungnya, yaitu male dan female. Biasanya kabel ini digunakan untuk menghubungkan komponen elektronika selain Arduino ke breadboard\n"+
                        "\n" +
                        "3. kabel jumper famale to famale\n"+
                        "\n" +
                        "\tJenis kabel jumper yang terakhir adalah kabel female to female. Kabel ini sangat cocok untuk menghubungkan antar komponen yang memiliki  header male. contohnya seperti sensor ultrasonik HC-SR04, sensor suhu DHT, dan masih banyak lagi. Spesifikasi kabel jumper Arduino yang baik adalah kabel yang agak lentur dengan konektor yang agak keras dan sulit untuk dilepaskan dari ujung kabel.\n" +
                        "\n" +
                        "\tKabel jumper yang keras dan kaku serta memiliki konektor lunak akan lebih mudah rusak saat digunakan. Jadi perhatikan dua hal ini saat ingin membeli kabel.jumper yah! Pastikan juga panjang kabel jumper yang kamu butuhkan sesuai dengan yang kamu beli. Karena kabel jumper yang terlalu panjang maupun terlalu pendek akan menyulitkanmu dalam membuat rangkaian.\n" +
                        "\n" +
                        "               Apa Fungsi Warna Pada Kabel Jumper?\n" +
                        "\tSaat membeli kabel jumper, kamu mungkin akan melihat warna kabel yang berwarna-warni. Ada hitam, putih, hijau, merah, kuning, dan sebagainya. Pada dasarnya semua fungsi kabel jumper itu sama. Tidak ada fungsi khusus untuk tipa warna. Perbedaan warna tersebut hanya untuk memudahkan kamu saat membuat rangkaian. Coba deh kamu bayangkan kalau semua kabel itu warnanya sama dalam suatu rangkaian. Tentunya sobat akan dibuat pusing untuk mengenali dan memerhatikan ujungnya mengarah ke mana. Tetapi dengan adanya warna, kamu bisa lebih mudah dalam mengenali suatu kabel itu ujungnya mengarah ke mana.\n" +
                        "\n" +
                        "               Cara Kerja Kabel Jumper\n" +
                        "\tSingkatnya, prinsip kerja kabel jumper yaitu menghantarkan arus listrik dari satu komponen ke komponen lainnya yang dihubungkan. Ini terjadi karena di ujung dan di dalam kabel terdapat konduktor listrik kecil yang memang fungsinya untuk menghantarkan listrik.\n" +
                        "\n" +
                        "\tKelebihan dari kabel jumper antara lain: Memiliki konektor di ujungnya yang sangat memudahkan kita dalam memasang maupun melepas kabel ke komponen, Harganya terjangkau, dan Memiliki warna bervariasi yang memudahkan kita dalam membuat rangkaian\n" +
                        "\n" +
                        "\tBerbicara tentang kekurangannya, menurut saya kabel jumper Arduino tidak memiliki kekurangan yang berarti karena dengan adanya kabel jumper ini sudah sangat memudahkan kita dalam membuat rangkaian proyek.\n",
                R.drawable.putih1,
                "\n",
                "\n",
                R.drawable.putih1,
                "\n"
            ),
            Image(
                R.drawable.usb,
                "USB",
                "\tUSB adalah singkatan dari Universal Serial Bus yang merupakan jenis konektor yang dikembangkan pada tahun 1990-an dengan tujuan untuk menyederhanakan koneksi antara komputer dan perangkat periferal serta hardware lainnya dan USB sangat mendukung transfer data sebesar 12 Mbps ( juta bit per detik) dan menghubungkan alat eksternal (peripheral) seperti scanner, printer, mouse, papan ketik (keyboard), alat penyimpan data (zip drive), flash disk, kamera digital atau perangkat lainnya ke komputer kita.\n" +
                        "\n" +
                        "\tSetiap komputer yang kita beli saat ini selalu di lengkapi USB port standard yaitu satu atau lebih konektor USB. Konektor-konektor USB tersebut dapat ditancapi berbagai perangkat mulai dari mouse sampai printer secara mudah dan cepat. Sistem operasi saat ini juga sangat mendukung keberadaan USB, mulai versi windows xp ke atas bahkan sudah terdapat installer berbagai perangkat USB yang include dalam satu paket program windows tersebut.\n" +
                        "\n" +
                        "\tDesain USB sendiri memang dibuat untuk memudahkan user pengguna komputer dalam memasang atau melepas peralatan tambahan pada komputer tanpa perlu mematikan dan membuka CPU komputer kemudian baru menambahkan peralatan tersebut pada slot ISA komputer maupun PCI Slot. Dengan USB kita cukup lepas pasang dengan sangat mudah pada USB Komputer. Jenis Dan Versi Kabel USB\n"+
                        "\n" +
                        "\tBerdasarkan versinya kabel USB memiliki 4 versi, yaitu:\n" +
                        "1.\tUSB 1.1\n" +
                        "\tVersi kabel USB 1.1 adalah versi yang pertama yang dirilis sekitar Agustus 1998 dan mulai banyak digunakan di berbagai perangkat elektronik. Versi original-nya, USB 1.0 tidak pernah digunakan pada perangkat elektronik. Versi kabel USB 1.1 ini Memiliki kecepatan up to 12 Mbps. Adapun logo yang dimiliki oleh USB 1.1 ini berwarna biru dengan simbol berbentuk trisula. Namun kini Versi kabel USB ini sudah tidak digunakan lagi.\n" +
                        "\n" +
                        "2.\tUSB 2.0\n" +
                        "\tVersi kabel USB 2.0 adalah versi yang kedua yang rilis pada tahun 2000, yang memiliki kecepatan maximum up to 480Mbps dengan Hi-Speed mode atau pada Full-Speed mode memiliki kecepatan 12Mbps. Supply tegangan maximum (max power out put) 2.5V, 1.8A dan tetap berfungsi baik jika dihubungkan dengan versi sebelumnya (backward-compatible with USB 1.1).\n" +
                        "\n" +
                        "\tMemiliki logo berwarna biru dengan tambahan tulisan HI-SPEED di atasnya dengan dasar merah. Simbol seperti trisula dengan tambahan tanda “+” di atasnya. Terkadang hanya berupa trisula saja untuk menunjukkan USB yang digunakan adalah USB 2.0, karena USB 1.1 sudah tidak digunakan lagi. Namun fungsinya kabel usb ini masih sama dengan versi sebelumnya.\n" +
                        "\n" +
                        "3.\tUSB 3.0\n" +
                        "\tVersi kabel USB 3.0 adalah versi yang ketiga yang rilis pada tahun 2008, memiliki kecepatan up to 5Gbps pada mode SuperSpeed. Umumnya pada versi kabel USB 3.0 memiliki konektor dan soket USB berwarna biru, yang merupakan tanda perbedaan USB 3.0 dengan versi sebelumnya. Lihat pada gambar dibawah ini.\n" +
                        "\n" +
                        "\tPada versi kabel USB 3.0 dikenal sebagai USB SuperSpeed USB dengan logo bertuliskan SUPERSPEED dan memiliki simbol yang berbeda dengan versi sebelumnya, yakni ada tambahan huruf SS di pangkal trisula. USB 3.0 memiliki tampilan yang sama seperti USB 2.0 sehingga cukup kompatibel dengan USB 2.0.\n" +
                        "\n" +
                        "4.\tUSB 3.1\n" +
                        "\tVersi kabel USB 3.1 adalah versi yang keempat yang rilis pada tahun 2013 yang memiliki kecepatan 2 kali leboh tinggi dari versi USB 3.0 yaitu 10 Gbps. Versi ini juga dikenal dengan istilah USB SuperSpeed+ atau SuperSpeed USB 10 Gbps atau standar dengan Thunderbolt (milik Apple). Versi 3.1 ini sangat kompatibel dengan USB 3.0 dan USB 2.0.USB 3.1 mempunyai tiga power supply tegangan yakni 2A pada tegangan 5V (tegangan max 10W), 5A pada tegangan 12V ( tegangan max 60W), 5A pada tegangan 20V (tegangan max 100W).\n",
                R.drawable.putih1,
                "\n",
                "\n",
                R.drawable.putih1,
                "\n"
            ),
            Image(
                R.drawable.resistor,
                "Resistor",
                "\tResistor merupakan komponen elektronika yang bersifat resistif berfungsi untuk menghambat atau membatasi aliran listrik yang mengalir dalam suatu rangkain elektronika (gambar 2.8). Satuan atau nilai resistansi suatu resistor disebut Ohm yang dilambangkan dengan simbol Omega (Ω). Hukum Ohm menyatakan bahwa “resistansi berbanding terbalik dengan jumlah arus yang mengalir melaluinya”. Selain nilai resistansinya (Ohm), resistor juga memiliki nilai toleransi dan kapasitas daya yang mampu dilewatkannya. Berdasarkan nilai resistansinya, resistor dibedakan menjadi 2 jenis yaitu resistor tetap (fixed resistor) dan resistor tidak tetap (variable resistor).\n" +
                        "\n" +
                        "a. Resistor Tetap (Fixed Resistor): \n" +
                        "\tResistor yang nilai resistansinya tidak dapat diubah atau tetap. Resistor jenis ini biasa digunakan dalam rangkaian elektronika sebagai pembatas arus dalam suatu rangkaian elektronika. Resistor tetap dapat ditemui dalam beberpa jenis, seperti : Metal Film Resistor, Metal Oxide Resistor, Carbon Film Resistor, Ceramic Encased Wirewound, Economy Wirewound, Zero Ohm Jumper Wire, S I P Resistor Network.\n" +
                        "\n" +
                        "b. Resistor Tidak Tetap (Variable Resistor) : \n" +
                        "\tResistor yang nilai resistansinya dapat diubah contohnya yaitu a) Pontensiometer, b) Trimer Potensiometer, c) 15 Thermistor, d) LDR (Light Depending Resistor)\n"+
                        "\n" +
                        "\tBiasanya nilai resistor dinyatakan dengan gelang warna atau kode angka yang terdapat pada bagian badannya. Resistance atau resistansi merupakan sebutan lain dari hambatan resistans. Komponen ini memiliki dua macam bentuk yaitu komponen Chip yang memiliki kode angka dan komponen Axial/Radial yang memiliki gelang warna.\n",
                R.drawable.putih1,
                "\n",
                "\n",
                R.drawable.putih1,
                "\n"
            ),
            Image(
                R.drawable.led,
                "LED",
                "\tLED (Light Emitting Dioda) adalah dioda yang dapat memancarkan cahaya pada saat mendapat arus bias maju (forward bias). LED (Light Emitting Dioda) dapat memancarkan cahaya karena menggunakan dopping galium, arsenic dan phosporus. Jenis doping yang berbeda diata dapat menhasilkan cahaya dengan warna yang berbeda. LED (Light Emitting Dioda) merupakann salah satu jenis dioda, sehingga hanya akan mengalirkan arus listrik satu arah saja. LED akan memancarkan cahaya apabil diberikan tegangan listrik dengan konfigurasi forward bias. Berbeda dengan dioda pada umumnya, kemampuan mengalirkan arus pada LED (Light Emitting Dioda) cukup rendah yaitu maksimal 20 mA. Apabila LED (Light Emitting Dioda) dialiri arus lebih besar dari 20 mA maka LED akan rusak, sehingga pada rangkaian LED dipasang sebuah resistor sebgai pembatas arus. Simbol dan bentuk fisik dari LED (Light Emitting Dioda) dapat dilihat pada gambar berikut.\n"+
                        "\n" +
                        "\tmemperlihatkan bahwa LED memiliki kaki 2 buah seperti dengan dioda yaitu kaki anoda dan kaki katoda. Kaki anoda memiliki ciri fisik lebih panjang dari kaki katoda pada saat masih baru, kemudian kaki katoda pada LED (Light Emitting Dioda) ditandai dengan bagian body LED yang di papas rata. Kaki anoda dan kaki katoda pada LED (Light Emitting Dioda) disimbolkan seperti pada gambar diatas. Pemasangan LED (Light Emitting Dioda) agar dapat menyala adalah dengan memberikan tegangan bias maju yaitu dengan memberikan tegangan positif ke kaki anoda dan tegangan negatif ke kaki katoda.\n",
                R.drawable.rled,
                "void setup() {  \n" +
                        "   pinMode(13, OUTPUT);\n" +
                        "   digitalWrite(13,LOW);\n" +
                        "}\n" +
                        "void loop() {\n" +
                        "   digitalWrite(13, HIGH); \n" +
                        "   delay(1000); \n" +
                        "   digitalWrite(13, LOW); \n" +
                        "   delay(1000); \n" +
                        "}\n",
                "Hasil Project",
                R.drawable.hled,
                "Lampu akan menyala dan padam setiap 1 detik \n" +
                        "\n"+
                        "\n"+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.soal1,
                "Sensor Ultrasonik",
                "\tSensor ultrasonik adalah sebuah sensor yang berfungsi untuk mengubah besaran fisis (bunyi) menjadi besaran listrik dan sebaliknya. Cara kerja sensor ini didasarkan pada prinsip dari pantulan suatu gelombang suara sehingga dapat dipakai untuk menafsirkan eksistensi (jarak) suatu benda dengan frekuensi tertentu. Disebut sebagai sensor ultrasonik karena sensor ini menggunakan gelombang ultrasonik (bunyi ultrasonik). Gelombang ultrasonik adalah gelombang bunyi yang mempunyai frekuensi sangat tinggi yaitu 20.000 Hz. Bunyi ultrasonik tidak dapat di dengar oleh telinga manusia. Bunyi ultrasonik dapat didengar oleh anjing, kucing, kelelawar, dan lumba-lumba. Bunyi ultrasonik nisa merambat melalui zat padat, cair dan gas. Reflektivitas bunyi ultrasonik di permukaan zat padat hampir sama dengan reflektivitas bunyi ultrasonik di permukaan zat cair. Akan tetapi, gelombang bunyi ultrasonik akan diserap oleh tekstil dan busa. Pada sensor ultrasonik, gelombang ultrasonik dibangkitkan melalui sebuah alat yang disebut dengan piezoelektrik dengan frekuensi tertentu. Piezoelektrik ini akan menghasilkan gelombang ultrasonik (umumnya berfrekuensi 40kHz) ketika sebuah osilator diterapkan pada benda tersebut. Secara umum, alat ini akan menembakkan gelombang ultrasonik menuju suatu area atau suatu target. Setelah gelombang menyentuh permukaan target, maka target akan memantulkan kembali gelombang tersebut. Gelombang pantulan dari target akan ditangkap oleh sensor, kemudian sensor menghitung selisih antara waktu pengiriman gelombang dan waktu gelombang pantul diterima.\n"+
                        "\n" +
                        "\tSecara detail, cara kerja sensor ultrasonik adalah sebagai berikut: • Sinyal dipancarkan oleh pemancar ultrasonik dengan frekuensi tertentu dan dengan durasi waktu tertentu. Sinyal tersebut berfrekuensi diatas 20kHz. Untuk mengukur jarak benda (sensor jarak), frekuensi yang umum digunakan adalah 40kHz. • Sinyal yang dipancarkan akan merambat sebagai gelombang bunyi dengan kecepatan sekitar 340 m/s. Ketika menumbuk suatu benda, maka sinyal tersebut akan dipantulkan oleh benda tersebut. • Setelah gelombang pantulan sampai di alat penerima, maka sinyal tersebut akan diproses untuk menghitung jarak benda tersebut. Jarak benda dihitung berdasarkan rumus: S = 0,034.t/2 dimana S merupakan jarak antara sensor ultrasonik dengan benda (bidang pantul), dan t adalah selisih antara waktu (durasi) pemancaran gelombang oleh transmitter dan waktu ketika gelombang pantul diterima receiver.",
                R.drawable.rultr,
                "#define echoPin 12 //Echo Pin\n" +
                        "#define trigPin 11 //Trigger Pin\n" +
                        "#define LEDPin 13 //Led Arduino uno\n" +
                        " \n" +
                        "int maximumRange = 200; \n" +
                        "int minimumRange = 00; \n" +
                        "long duration, distance;\n" +
                        " \n" +
                        "void setup() {\n" +
                        "Serial.begin (9600); //\n" +
                        "//deklarasi pin\n" +
                        "pinMode(trigPin, OUTPUT);\n" +
                        "pinMode(echoPin, INPUT);\n" +
                        "pinMode(LEDPin, OUTPUT);\n" +
                        "}\n" +
                        " \n" +
                        "void loop() {\n" +
                        "\n" +
                        "digitalWrite(trigPin, LOW);\n" +
                        "delayMicroseconds(2);\n" +
                        "digitalWrite(trigPin, HIGH);\n" +
                        "delayMicroseconds(10);\n" +
                        "digitalWrite(trigPin, LOW);\n" +
                        "duration = pulseIn(echoPin, HIGH);\n" +
                        " \n" +
                        "//perhitungan untuk dijadikan jarak\n" +
                        "distance = duration/58.2;\n" +
                        "if (distance >= maximumRange || distance <= minimumRange)\n" +
                        "\n"+
                        "{\n" +
                        "Serial.println(\"-1\");\n" +
                        "digitalWrite(LEDPin, HIGH);\n" +
                        "}\n" +
                        "else {\n" +
                        " Serial.println(distance);\n" +
                        "digitalWrite(LEDPin, LOW);\n" +
                        " \n" +
                        "//waktu tunda 50mS\n" +
                        "delay(50);\n" +
                        "}}\n",
                "Hasil Project ",
                R.drawable.hultr,
                "serial monitor akan print angka jarak antara benda dengan sensor \n"+
                        " \n"+
                        "\n"+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.lcd,
                "LCD",
                "\tArduino LCD (Liquid Crystal Display) adalah salah satu jenis display elektronik yang dibuat dengan teknologi CMOS logic yang bekerja dengan tidak menghasilkan cahaya tetapi memantulkan cahaya yang ada di sekelilingnya terhadap front-lit atau mentransmisikan cahaya dari back-lit. LCD (Liquid Cristal Display) berfungsi sebagai penampil data baik dalam bentuk karakter, huruf, angka ataupun grafik.\n" +
                        "\n" +
                        "\tSeven segment display (7 segment display) dalam bahasa indonesia disebut dengan layar tujuh segmen adalah komponen elektronika yang dapat menampilkan angka\tdesimal\tmelalui\tkombinasi-kombinasi\tsegmennya.\tSeven\tsegment display pada umumnya dipakai pada jam digital, kalkulator, penghitung atau counter digital, multimeter digital dan juga panel display digital seperti pada microwave oven ataupun pengatur suhu digital . Seven segment display pertama diperkenalkan dan dipatenkan pada tahun 1908 oleh frank. W. Wood dan mulai dikenal luas pada tahun 1970-an setelah aplikasinya pada led (light emitting diode). Salah satu jenis seven segment display yang sering digunakan oleh para penghobi elektronika adalah 7 segmen yang menggunakan led (light emitting diode) sebagai penerangnya. LED 7 segmen ini umumnya memiliki 7 segmen atau elemen garis dan 1 segmen titik yang menandakan “koma” desimal. Jadi jumlah keseluruhan segmen atau elemen led sebenarnya adalah 8. Cara kerjanya pun boleh dikatakan mudah, ketika segmen atau elemen tertentu diberikan arus listrik, maka display akan menampilkan angka atau digit yang diinginkan sesuai dengan\n" +
                        "\n" +
                        "               Kombinasi yang diberikan.\n" +
                        "\tLCD (Liquid Crystal Display) adalah suatu jenis media tampil yang menggunakan kristal cair sebagai penampil utama. LCD sudah digunakan diberbagai bidang misalnya alal–alat elektronik seperti televisi, kalkulator, atau pun layar komputer. Pada postingan aplikasi LCD yang dugunakan ialah LCD dot matrik dengan jumlah karakter 2 x 16. LCD sangat berfungsi sebagai penampil yang nantinya akan digunakan untuk menampilkan status kerja alat.\n"+
                        "\n" +
                        "               Cara kerja LCD\n"+
                        "\tPada aplikasi umumnya RW diberi logika rendah “0”. Bus data terdiri dari 4-bit atau 8-bit. Jika jalur data 4-bit maka yang digunakan ialah DB4 sampai dengan DB7. Sebagaimana terlihat pada table diskripsi, interface LCD merupakan sebuah parallel bus, dimana hal ini sangat memudahkan dan sangat cepat dalam pembacaan dan penulisan data dari atau ke LCD. Kode ASCII yang ditampilkan sepanjang 8-bit dikirim ke LCD secara 4-bit atau 8 bit pada satu waktu. Jika mode 4-bit yang digunakan, maka 2 nibble data dikirim untuk membuat sepenuhnya 8- bit (pertama dikirim 4-bit MSB lalu 4-bit LSB dengan pulsa clock EN setiap nibblenya). Jalur kontrol EN digunakan untuk memberitahu LCD bahwa mikrokontroller mengirimkan data ke LCD. Untuk mengirim data ke LCD program harus menset EN ke kondisi high “1” dan kemudian menset dua jalur kontrol lainnya (RS dan R/W) atau juga mengirimkan data ke jalur data bus.\n" +
                        "\n" +
                        "\tSaat jalur lainnya sudah siap, EN harus diset ke “0” dan tunggu beberapa saat (tergantung pada datasheet LCD), dan set EN kembali ke high “1”. Ketika jalur\n" +
                        "RS berada dalam kondisi low “0”, data yang dikirimkan ke LCD dianggap sebagai sebuah perintah atau instruksi khusus (seperti bersihkan layar, posisi kursor dll). Ketika RS dalam kondisi high atau “1”, data yang dikirimkan adalah data ASCII yang akan ditampilkan dilayar. Misal, untuk menampilkan huruf “A” pada layar maka RS harus diset ke “1”. Jalur kontrol R/W harus berada dalam kondisi low (0) saat informasi pada data bus akan dituliskan ke LCD. Apabila R/W berada dalam kondisi high “1”, maka program akan melakukan query (pembacaan) data dari LCD. Instruksi pembacaan hanya satu, yaitu Get LCD status (membaca status LCD), lainnya merupakan instruksi penulisan. Jadi hampir setiap aplikasi yang menggunakan LCD, R/W selalu diset ke “0”. Jalur data dapat terdiri 4 atau 8 jalur (tergantung mode yang dipilih pengguna), DB0, DB1, DB2, DB3, DB4, DB5, DB6 dan DB7. Mengirim data secara parallel baik 4-bit atau 8-bit merupakan 2 mode operasi primer. Untuk membuat sebuah aplikasi interface LCD, menentukan mode operasi merupakan hal yang paling penting.\n" +
                        "\n" +
                        "\tMode 8-bit sangat baik digunakan ketika kecepatan menjadi keutamaan dalam sebuah aplikasi dan setidaknya minimal tersedia 11 pin I/O (3 pin untuk kontrol, 8 pin untuk data). Sedangkan mode 4 bit minimal hanya membutuhkan 7- bit (3 pin untuk kontrol, 4 pin untuk data). Bit RS digunakan untuk memilih apakah data atau instruksi yang akan ditransfer antara mikrokontroller dan LCD. Jika bit ini di set (RS = 1), maka byte pada posisi kursor LCD saat itu dapat dibaca atau ditulis. Jika bit ini di reset (RS = 0), merupakan instruksi yang dikirim ke LCD atau status eksekusi dari instruksi terakhir yang dibaca. ",
                R.drawable.rlcd,
                "#include <LiquidCrystal_I2C.h>\n" +
                        "LiquidCrystal_I2C lcd(0x27, 16, 2);\n" +
                        "\n" +
                        "void setup() {\n" +
                        "  lcd.begin();\n" +
                        "}\n" +
                        "\n" +
                        "void loop(){\n" +
                        "  lcd.setCursor(0,0);\n" +
                        "  lcd.print(\"TEST LCD i2C\");\n" +
                        "  lcd.setCursor(0,1);\n" +
                        "  lcd.print(\"KelasRobot.com\");\n" +
                        "}\n" ,
                "Hasil Project",
                R.drawable.hlcd,
                "\n"
            ),
            Image(
                R.drawable.servo,
                "Motor Servo",
                "\tMotor servo adalah sebuah perangkat atau aktuator putar (motor) yang dirancang dengan sistem kontrol umpan balik loop tertutup (servo), sehingga dapat di set-up atau di atur untuk menentukan dan memastikan posisi sudut dari poros output motor. motor servo merupakan perangkat yang terdiri dari motor DC, serangkaian gear, rangkaian kontrol dan potensiometer.\n" +
                        "\n" +
                        "\tSerangkaian gear yang melekat pada poros motor DC akan memperlambat putaran poros dan meningkatkan torsi motor servo, sedangkan potensiometer dengan perubahan resistansinya saat motor berputar berfungsi sebagai penentu batas posisi putaran poros motor servo. Servo biasanya digunakan untuk aplikasi robotic, radio control,bahkan untuk pengaturan mekanikal pada pesawat terbang. Hal ini dikarenakan Sistem kontrol servo yang paling cocok untuk kecepatan tinggi, aplikasi torsi tinggi yang melibatkan perubahan beban dinamis. Untuk alternatifnya, Sistem kontrol motor Stepper yang lebih murah dan optimal untuk aplikasi yang membutuhkan akselerasi rendah-menengah, torsi memegang tinggi, dan fleksibilitas operasi loop terbuka atau tertutup.\n" +
                        "\n" +
                        "\tMacam-macam motor servo. Motor servo AC lebih dapat menangani arus yang tinggi atau beban berat, sehingga sering diaplikasikan pada mesin-mesin industri, Servo DC biasanya lebih cocok untuk digunakan pada aplikasi-aplikasi yang lebih kecil.\n" +
                        "\n"+
                        "\tMotor servo pada dasarnya dibuat menggunakan motor DC yang dilengkapi dengan controler dan sensor posisi sehingga dapat memiliki gerakan 0o, 90o, 180o atau 360o. Berikut adalah komponen internal sebuah motor servo 180o.\n" +
                        "\n" +
                        "\tTiap komponen pada motor servo diatas masing-masing memiliki fungsi sebagai controler, driver, sensor, girbox dan aktuator.    Pada    gambar    diatas    terlihat    beberapa bagian komponen motor servo. Motor pada sebuah motor\n" +
                        " \n" +
                        "\tservo adalah motor DC yang dikendalikan oleh bagian controler, kemudian komponen yang berfungsi sebagai sensor adalah potensiometer yang terhubung pada sistem girbox pada motor servo.\n" +
                        "\n" +
                        "Pin Pada Motor Servo\n" +
                        "\tKabel warna merah merupakan kabel power yang berfungsi untuk mengkoneksikan dengan tegangan 5V pada board arduino.\n" +
                        "\n" +
                        "-Kabel yang berwarna coklat/hitam merupakan kabel ground yang nantinya akan dihubungkan dengan ground yang ada pada board arduino.\n" +
                        "\n" +
                        "-Kabel kuning yang merupakan kabel pin signal servo yang akan dihubungkan dengan pin input pada board arduino.\n" +
                        "\n" +
                        "Kelebihan dan Kekurangan Motor Servo\n" +
                        "a.\tKelebihan\n" +
                        "-\tTidak bergetar dan tidak ber-resonansi saat beroperasi.\n" +
                        "-\tDaya yang dihasilkan sebanding dengan ukuran dan berat motor.\n" +
                        "-\tPenggunaan arus listik sebanding dengan beban yang diberikan.\n" +
                        "-\tResolusi dan akurasi dapat diubah dengan hanya mengganti encoder yang dipakai.\n" +
                        "-\tTidak\tberisik\tsaat\tberoperasi\tdengan kecepatan tinggi.\n" +
                      	"\n"+
                        "b.\tKekurangan\n" +
                        "-\tMemerlukan pengaturan yang tepat untuk menstabilkan umpan balik.\n" +
                        "-\tMotor menjadi tidak terkendali jika encoder tidak memberikan umpan balik.\n" +
                        "Beban berlebih dalam waktu yang lama dapat merusak motor\n",
                R.drawable.rservoo,
                "#include <Servo.h>\n" +
                        "\n" +
                        "Servo myservo;  \n" +
                        "int pos = 0;   \n" +
                        "\n" +
                        "void setup() {\n" +
                        "  myservo.attach(9); \n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        "  for (pos = 0; pos <= 180; pos += 1) { \n" +
                        "    myservo.write(pos);              \n" +
                        "    delay(15);                     \n" +
                        "  }\n" +
                        "  for (pos = 180; pos >= 0; pos -= 1) { \n" +
                        "    myservo.write(pos);             \n" +
                        "    delay(15);                      \n" +
                        "  }\n" +
                        "} ",
                "Hasil Project ",
                R.drawable.hsrvoo,
                "hasilnya adalah servo akan berputar 360 derajat" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n"
            ),
            Image(
                R.drawable.bluetotot,
                " Bluetooth",
                "\tBluetooth sesungguhnya merupakan spesifikasi industri untuk jaringan wilayah pribadi nirkabel(wpan). Bluetooth menfasilitasi koneksi dan pertukaran informasi diantara alat-alat seperti pda, ponsel, computer laptop, printer, dan kamera digital melalui frekuensi radio .\n" +
                        "\n" +
                        "               Spesifikasi bluetooth\n" +
                        "Bluetooth adalah teknologi yang memungkinkan dua perangkat yang kompatibel, seperti telepon dan pc untuk berkomunikasi tanpa kabel dan tidak memerlukan koneksi saluran yang terlihat. Teknologi ini memberikan perubahan yang signifikan terhadap peralatan elektronik yang kita gunakan.\n" +
                        "\n" +
                        "               Prinsip kerja bluetooth\n" +
                        "\tBluetooth sebenarnya hadir ditujukan untuk mengatasi beberapa kendala komunikasi data antarperanti elektronik yang lebih dahulu hadir. Yang paling utama memang untuk komunikasi antarperalatan elektronik tanpa kabel. Namun, bluetooth juga digunakan untuk menjembatani komunikasi one by one menjadi one to many. Selain itu, bluetooth juga mengeliminasi campur tangan pengguna dalam mengonfigurasi koneksi. Jadi, koneksi antarperalatan elektronik via bluetooth terjadi secara otomatis.\n" +
                        "\n" +
                        "               cara kerja Bluetooth\n"+
                        "Agar sebuah bluetooth dapat bekerja dengan baik, maka dibutuhkan komponen-komponen pendukung di dalamnya .\n" +
                        "1.\tRadio Transceiver, berfungsi utama sebagai pengirim dan penerima sinyal dalam wujud gelombang radio.\n" +
                        "2.\tBaseband Link Controller, berfungsi sebagai penghubung antara radio hardware dengan baseband processing dan layer protokol fisik.\n" +
                        "3.\tLink Manager, berfungsi sebagai autentifikator dan konfigurator pada perangkat bluetooth yang terhubung.\n" +
                        "4.\tFlash\n" +
                        "5.\tVoice Codec\n" +
                        "\n" +
                        "\tSecara garis besar, bluetooth bekerja dengan mengirim atau menerima gelombang radio pada suatu band dengan 79 saluran (frekuensi) yang berbeda antara 2.402 GHz hingga 2.480 GHz.\n" +
                        "\n" +
                        "\tOleh karena daya pemancar sinyal bluetooth cukup kecil, maka perangkat lain tidak akan terganggu kinerjanya. Secara teoritis, bluetooth lebih aman dibanding jaringan nirkabel lain seperti wifi. Perangkat bluetooth akan otomatis mendeteksi dan saling terhubung satu dengan lainnya hingga mencapai delapan perangkat dalam waktu bersamaan.\n" +
                        "\n" +
                        "\tKedelapan perangkat ini saling berinteraksi menggunakan saluran yang berbeda-beda, sehingga tidak akan terjadi gangguan satu dengan yang lainnya. Ketika dua perangkat ingin terhubung, mereka akan memilih saluran secara acak dan menggantinya dengan saluran yang lain secara terus menerus.\n" +
                        "\n" +
                        "\tTeknik ini disebut dengan spread-spectrum frequency hopping. Untuk menghindari gangguan dari peralatan listrik lain, dua perangkat yang saling terhubung akan mengubah frekuensi mereka hingga ribuan kali setiap detiknya.\n\n"+
                        "\n" +
                        "Kelebihan:\n" +
                        "•\tBisa menembus rintangan, misalnya seperti dinding, kotak, dan sebagainya. Walaupun jarak transmisinya hanya 10 m.\n" +
                        "•\tTidak memerlukan media kabel ataupun kawat.\n" +
                        "•\tDapat mensingkronisasi data dari handphone ke komputer atau laptop.\n" +
                        "•\tDapat dipakai sebagai perantara modem.\n" +
                        "•\tPraktis dan tidk ribet dalam penggunaanya.\n" +
                        "\n" +
                        "Kekurangan:\n" +
                        "•\tMemakai frekuensi yang sama dengan gelombang wifi.\n" +
                        "•\tKalu terlalu banyak koneksi bluetooth didalam satu ruangan, akan sulit untuk menemukan penerima yang dituju.\n" +
                        "•\tSering beredar virus-virus yang disebarkan melalui bluetooth, khususnya dari handphone.\n" +
                        "•\tCukup banyak mekanisme keamanan yang harus diperhatikan untuk mencegah kegagalan pengiriman data atau penerimaan data maupun informasi.\n" +
                        "•\tKecepatan dalam transfer data tidak tetap, tergantung dari perangkat yang dipakai untuk mengirim dan yang menerima data maupun informas\n",
                R.drawable.rblutot,
                "SoftwareSerial bt(2,3); \n" +
                        "\n" +
                        "void setup() {\n" +
                        "  bt.begin(9600);\t\n" +
                        "  Serial.begin(9600);\t\n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        "  \n" +
                        "    if (bt.available())\n" +
                        "    {\n" +
                        "     Serial.write(bt.read());\t\n" +
                        "    }\n" +
                        "}",
                "Hasil Project ",
                R.drawable.hbluetoot,
                "kamu akan mengirimkan data dari Smartphone melalui Bluetooth ke Arduino Uno dan menampilkannya di Serial Monitor PC.\n" +
                        "\n" +
                        "Unduh dan instal aplikasi terminal Bluetooth di ponsel Anda dan gunakan untuk terhubung ke modul Bluetooth HC-05.\n" +
                        "\n" +
                        "Data dikirim dari Smartphone menggunakan aplikasi terminal Bluetooth.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n"
            ),
            Image(
                R.drawable.soal,
                "Modul Relay",
                "modul relay Arduino.\n" +
                        "               Pengertian Relay Arduino\n" +
                        "\tModul relay adalah salah satu piranti yang beroperasi berdasarkan prinsip elektromagnetik untuk menggerakkan kontaktor guna memindahkan posisi ON ke OFF atau sebaliknya dengan memanfaatkan tenaga listrik.\n" +
                        "\n" +
                        "\tPeristiwa tertutup dan terbukanya kontaktor ini terjadi akibat adanya efek induksi magnet yang timbul dari kumparan induksi listrik. Perbedaan yang paling mendasar antara relay dan sakelar adalah pada saat pemindahan dari posisi ON ke OFF.\n" +
                        "\n" +
                        "\tRelay melakukan pemindahan-nya secara otomatis dengan arus listrik, sedangkan sakelar dilakukan dengan cara manual.\n"+
                        "\n" +
                        "               Apa Fungsi Relay Arduino\n" +
                        "\tPada dasarnya, fungsi modul relay adalah sebagai saklar elektrik. Dimana ia akan bekerja secara otomatis berdasarkan perintah logika yang diberikan.\n" +
                        "\n" +
                        "\tKebanyakan, relay 5 volt DC digunakan untuk membuat project yang salah satu komponennya butuh tegangan tinggi atau yang sifatnya AC (Alternating Current).\n" +
                        "\n" +
                        "Sedangkan kegunaan relay secara lebih spesifik adalah sebagai berikut:\n" +
                        "\n" +
                        "•\tMenjalankan fungsi logika dari mikrokontroler Arduino\n" +
                        "•\tSarana untuk mengendalikan tegangan tinggi hanya dengan menggunakan tegangan rendah\n" +
                        "•\tMeminimalkan terjadinya penurunan tegangan\n" +
                        "•\tMemungkinkan penggunaan fungsi penundaan waktu atau fungsi time delay function\n" +
                        "•\tMelindungi komponen lainnya dari kelebihan tegangan penyebab korsleting.\n" +
                        "•\tMenyederhanakan rangkaian agar lebih ringkas.\n" +
                        "\n" +
                        "               Cara Kerja Relay Arduino\n" +
                        "\tUntuk dapat memahami prinsip kerja relay, terlebih dahulu kamu wajib tahu kelima fungsi komponen relay berikut ini. Penyangga (Armature), Kumparan (Coil), Pegas (Spring), Saklar (Switch Contact), Inti Besi (Iron Core)\n" +
                        "\n" +
                        "\tCara kerja relay adalah memutus dan menyambung aliran listrik dalam rangkaian. Bisa dibilang, fungsi relay yaitu sebagai sakelar otomatis. Selain digunakan pada rangkaian project Arduino, modul relay 5V juga bisa ditemukan pada jenis kendaraan seperti motor maupun mobil.\n" +
                        "\n" +
                        "\tBahwa relay dapat bekerja karena adanya gaya elektromagnetik. Ini tercipta dari inti besi yang dililitkan kawat kumparan dan dialiri aliran listrik. Saat kumparan dialiri listrik, maka otomatis inti besi akan jadi magnet dan menarik penyangga sehingga kondisi yang awalnya tertutup jadi terbuka (Open).\n" +
                        "\n" +
                        "\tSementara pada saat kumparan tak lagi dialiri listrik, maka pegas akan menarik ujung penyangga dan menyebabkan kondisi yang awalnya terbuka jadi tertutup (Close).\n" +
                        "\n" +
                        "\tSecara umum kondisi atau posisi pada relay terbagi menjadi dua, yaitu:\n" +
                        "\n" +
                        "•\tNC (Normally Close), adalah kondisi awal atau kondisi dimana relay dalam posisi tertutup karena tak menerima arus listrik.\n" +
                        "\n" +
                        "•\tNO (Normally Open), adalah kondisi dimana relay dalam posisi terbuka karena menerima arus listrik\n"+
                        "\n" +
                        "               Jenis-Jenis Relay\n" +
                        "\nMacam macam relay dan fungsinya digolongkan menjadi dua macam, yaitu:\n" +
                        "\n" +
                        "1. Jenis relay berdasarkan trigger atau pemicunya\n" +
                        "\n" +
                        "\tSebelum membuat rangkaian, terlebih dahulu kamu harus tahu bahwa ada dua jenis relay yang beredar di pasaran berdasarkan trigger atau pemicunya, yaitu:\n" +
                        "\n" +
                        "o LOW LEVEL TRIGGER, adalah relay yang akan berfungsi (menyala) jika diberikan kondisi LOW.\n" +
                        "\n" +
                        "o HIGH LEVEL TRIGGER, adalah relay yang akan berfungsi (menyala) jika diberikan kondisi HIGH.\n" +
                        "\n" +
                        "2. Jenis relay berdasarkan jumlah channel-nya\n" +
                        "o Modul relay 1 channel\n" +
                        "o Modul relay 2 channel\n" +
                        "o Jenis modul relay 4 channel\n" +
                        "o Modul relay 8 channel\n" +
                        "o Modul relay 16 channel\n" +
                        "o Jenis modul relay 32 channel\n",
                R.drawable.rrelayy,
                "\n" +
                        "    DC+ : tegangan DC positif (5 volt)\n" +
                        "    DC-  : ground\n" +
                        "    IN     : pin 13\n" +
                        "\n" +
                        "----------------------------" +
                        "\n"+
                        "void setup() {\n" +
                        "  pinMode(LED_BUILTIN, OUTPUT);\n" +
                        "}\n" +
                        "// the loop function runs over and over again forever\n" +
                        "void loop() {\n" +
                        "  digitalWrite(LED_BUILTIN, HIGH);   \n" +
                        "  delay(1000);                       \n" +
                        "  digitalWrite(LED_BUILTIN, LOW);    \n" +
                        "  delay(1000);                       \n" +
                        "}",
                "Hasil project",
                R.drawable.hrelay,
                "Lampu pada arduino akan menyala secara bersamaan dengan relay" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n"
            ),
            Image(
                R.drawable.button,
                "Push Button",
                "                  Pengertian Push Button\n" +
                        "\tDan push button adalah perangkat / saklar sederhana yang berfungsi untuk menghubungkan atau memutuskan aliran arus listrik dengan sistem kerja tekan unlock (tidak mengunci). Sistem kerja unlock disini berarti saklar akan bekerja sebagai device penghubung atau pemutus aliran arus listrik saat tombol ditekan, dan saat tombol tidak ditekan (dilepas), maka saklar akan kembali pada kondisi normal. Sebagai device penghubung atau pemutus, push button switch hanya memiliki 2 kondisi, yaitu On dan Off (1 dan 0). Istilah On dan Off ini menjadi sangat penting karena semua perangkat listrik yang memerlukan sumber energi listrik pasti membutuhkan kondisi On dan Off.\n" +
                        "\n" +
                        "\tKarena sistem kerjanya yang unlock dan langsung berhubungan dengan operator, push button switch menjadi device paling utama yang biasa digunakan untuk memulai dan mengakhiri kerja mesin di industri. Secanggih apapun sebuah mesin bisa dipastikan sistem kerjanya tidak terlepas dari keberadaan sebuah saklar seperti push button switch atau perangkat lain yang sejenis yang bekerja mengatur pengkondisian On dan Off.\n" +
                        "\n" +
                        "               Fungsi Push Button\n" +
                        "\tSeperti yang dijelaskan pada poin sebelumnya, bahwa fungsi push button adalah untuk memutus dan menyambungkan arus listrik. Biasanya push button ini digunakan untuk memicu jalannya suatu perangkat output seperti relay, buzzer, LED, maupun yang lainnya.\n" +
                        "\tBahkan kerennya lagi, push button juga dapat dipadukan dengan software Matlab maupun database website.\n" +
                        "\n" +
                        "               Cara Kerja Push Button\n" +
                        "\tPada dasarnya, prinsip kerja push button adalah pemutus dan penyambung aliran listrik. Namun dalam hal ini, ia tak bersifat mengunci. Jadi ia akan kembali ke posisi semua saat selesai ditekan. Saat push button ditekan, ia menjadi bernilai HIGH dan akan menghantarkan arus listrik. Sedangkan apabila dilepas, maka ia bernilai LOW dan memutus arus listrik. Namun cara kerja saklar push button kadang berbeda tergantung dari jenisnya. Apakah ia termasuk NO atau NC.\n" +
                        "\n" +
                        "               Macam-Macam Push Button Arduino\n" +
                        "\tMacam macam saklar push button yang umum adalah sebagai berikut:\n" +
                        "1.\tPush Button NO (Normally Open)\n" +
                        "\tJenis push button ini akan menyambungkan arus listrik saat ditekan, dan akan kembali seperti semula saat dilepas. Fungsi push button NO biasanya untuk membuat tombol mulai atau start.\n" +
                        "\n" +
                        "2.\tPush Button NC (Normally Close)\n" +
                        "\tFungsi push button NC adalah kebalikan dari NO dan sering disebut sebagai tombol emergency atau stop. Dalam kondisi awal, ia bersifat mengalirkan arus listrik. Sehingga pada saat ditekan, ia akan memutus arus listrik. Serta kembali ke posisi semua apabila dilepas.\n" +
                        "\n" +
                        "3.\tPush Button Perpaduan NO dan NC\n" +
                        "\tUntuk jenis yang satu ini memiliki empat kaki terminal kontak. Dimana pada saat tombol ditekan, maka sepasang terminal kontaknya akan berada dalam NC, sedangkan dua lainnya NO. Sehingga apabila push button ditekan lagi untuk yang kedua kalinya, maka akan terjadi sebaliknya. Sampai sini kamu sudah paham kan fungsi push button NO dan NC.\n",
                R.drawable.rbutton,
                "void setup() {\n" +
                        "  Serial.begin(9600);\n" +
                        "  pinMode(2, INPUT_PULLUP);\n" +
                        "  pinMode(13, OUTPUT);\n" +
                        "}\n" +
                        "void loop() {\n" +
                        "  int sensorVal = digitalRead(2);\n" +
                        "  Serial.println(sensorVal);\n" +
                        "  if (sensorVal == HIGH) {\n" +
                        "    digitalWrite(13, LOW);\n" +
                        "  } else {\n" +
                        "    digitalWrite(13, HIGH);\n" +
                        "  }\n" +
                        "}\n",
                "Hasil Project",
                R.drawable.hbutton,
                "Lampu pada arduino akan menyala ketika di tekan dan akan mati ketika di lepas\n"+
                        " \n"+
                        "\n"+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.dht11,
                "DHT 11",
                "\tSuatu alat   ukur   yang   digunakan   untuk   membantu dalam proses pengukuran atau pendifinisian yang suatu kelembaban uap air yang terkandung dalam udara.\n" +
                        "\n" +
                        "               Jenis kelembaban\n" +
                        "1.\tKelembaban absolut adalah bilangan yang menunjukkan berapa gram uap air yang tertampung dalam satu meter kubik udara\n" +
                        "\n" +
                        "2.\tKelembaban    relative     adalah     bilangan     yang\n" +
                        "\tmenunjukkan berapa persen perbandingan antara uap air yang ada dalam udara saat pengukuran dan jumlah uap air maksimum yang dapat ditampung oleh udara tersebut.\n" +
                        "\n" +
                        "               SENSOR KELEMBABAN DHT 11\n" +
                        "\n" +
                        "\tDHT11 adalah sensor digital yang dapat mengukur suhu dan kelembaban udara di sekitarnya. Sensor ini sangat mudah digunakan bersama dengan Arduino. Memiliki tingkat stabilitas yang sangat baik serta fitur kalibrasi yang akurat. Koefisien kalibrasi disimpan dalam OTP program memory, sehingga ketika internal sensor mendeteksi sesuatu, maka module ini menyertakan koefisien tersebut dalam kalkulasinya.\n" +
                        "\n" +
                        "\tDHT11 termasuk sensor yang memiliki kualitas baik, dinilai dari respon, pembacaan data yang cepat, dan kemampuan anti-interference. Ukurannya yang kecil, dan dengan transmisi sinyal hingga 20 meter, membuat produk ini cocok digunakan untuk banyak aplikasi-aplikasi pengukuran suhu dan kelembaban.\n"+
                        "\n" +
                        "\tSensor ini menggunakan komunikasi serial format data single-bus di gunakan untuk berkomunikasi dan singkronisasi antara sensor DHT11 Dan MCU, proses komunikasi membutuhkan waktu 40ms.\n"+
                        "\n" +
                        "\tUntuk menggunakan sensor DHT 11 ini ada berbagai cara. Tapi pada kasus ini untuk penggunaan sensor DHT 11 akan menggunakan bantuan library tertentu. Sehingga pada program yang digunakan sudah lebih disederhanakan.\n",
                R.drawable.rdht,
                "#include <DHT.h> \n" +
                        "#define DHTPIN 2 \n" +
                        "#define DHTTYPE DHT11 \n" +
                        "DHT dht(DHTPIN, DHTTYPE); \n" +
                        "\n" +
                        "float humi, temp; \n" +
                        "\n" +
                        "void setup()\n" +
                        "{\n" +
                        "  Serial.begin(9600); \n" +
                        "  delay(10);  \n" +
                        "}\n" +
                        "\n" +
                        "void loop()\n" +
                        "{\n" +
                        "  humi = dht.readHumidity();\n" +
                        "  temp = dht.readTemperature();\n" +
                        "  if (isnan(humi) || isnan(temp)) \n" +
                        "{ \n" +
                        "    Serial.println(\"DHT11 tidak terbaca... !\");\n" +
                        "    return;\n" +
                        "  }\n" +
                        "  else{//jika ada hasilnya \n" +
                        "  Serial.print(\"Suhu=\");  \n" +
                        "  Serial.print(temp);     \n" +
                        "  Serial.println(\"C\");    \n" +
                        "  Serial.print(\"Humi=\"); \n" +
                        "  Serial.print(humi);     \n" +
                        "  Serial.println(\"%RH\");  \n" +
                        "  }\n" +
                        "  delay(1000);           \n" +
                        "}\n",
                "Hasil Project",
                R.drawable.hdht,
                "serial monitor akan menampilkan gambar seperti di atas\n"+
                        " \n"+
                        "\n"+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.buzzer,
                "Buzzer",
                "                  Pengertian Buzzer Arduino\n" +
                        "\n" +
                        "\tBuzzerYaitu suatu komponen elektronika yang dapat mengubah energi listrik menjadi suara. Sejenis speaker, namun bentuknya lebih kecil. Buzzer adalah komponen elektronika yang dapat menghasilkan getaran suara dalam bentuk gelombang bunyi. Buzzer lebih sering digunakan karena ukuran penggunaan dayanya yang minim.\n" +
                        "\n" +
                        "               Cara kerja Buzzer\n" +
                        "\tPrinsip kerja buzzer adalah sangat sederhana.Ketika suatu aliran listrik mengalir ke rangkaian buzzer, maka terjadi pergerakan mekanis pada buzzer tersebut. Akibatnya terjadi perubahan energi dari energi listrik menjadi energi suara yang dapat didengar oleh manusia. Umumnya jenis buzzer yang beredar di pasaran adalah buzzer piezoelectric yang bekerja pada tegangan 3 sampai 12 volt DC.\n" +
                        "\n" +
                        "               Jenis-Jenis Buzzer\n" +
                        "\n" +
                        "\tJenis2 buzzer pada rangkaian Arduino berdasarkan bunyinya terbagi atas dua, yaitu:\n" +
                        "\n"+
                        "1. Active Buzzer, yaitu buzzer yang sudah memiliki suaranya sendiri saat diberikan tegangan listrik. Buzzer aktif Arduino jenis ini seringkali juga disebut buzzer stand alone atau berdiri sendiri.\n" +
                        "\n" +
                        "2. Passive Buzzer, yaitu buzzer yang tak memiliki suara sendiri. Buzzer jenis ini sangat cocok dipadukan dengan Arduino karena kita bisa memprogram tinggi rendah nadanya. Salah satu contohnya adalah speaker.\n" +
                        "\n" +
                        "               Fungsi Buzzer Arduino\n" +
                        "\n" +
                        "\tAdapun fungsi buzzer adalah sebagai komponen yang menghasilkan output berupa bunyi beep. Kegunaan buzzer yang paling umum yaitu sebagai alarm, indikator suara, dan timer.\n" +
                        "\n" +
                        "     Spesifikasi Buzzer Arduino\n" +
                        "\n" +
                        "\tBerdasarkan gambar komponen buzzer pada poin sebelumnya, kita dapat mengetahui bahwa spesifikasi komponen buzzer adalah sebagai berikut:\n" +
                        "\n"+
                        "1.\tPiezoelectric, yaitu berbentuk tabung berwarna hitam yang menjadi sumber keluarnya bunyi.\n" +
                        "\n" +
                        "2.\tKaki pin negatif, yaitu kaki buzzer yang pendek untuk dihubungkan ke arus negatif atau GND.\n" +
                        "\n" +
                        "3.\tKaki pin positif, yaitu pin kaki buzzer yang panjang dan gunanya untuk dihubungkan ke arus positif atau VCC/5V.\n",
                R.drawable.rbuzzer,
                "const int pinBuzzer = 12;\n" +
                        "void setup() {\n" +
                        "  pinMode(pinBuzzer, OUTPUT);\n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        "  digitalWrite(pinBuzzer, HIGH);    \n" +
                        "  delay(200);                       \n" +
                        "  digitalWrite(pinBuzzer, LOW);     \n" +
                        "  delay(200);                       \n" +
                        "  digitalWrite(pinBuzzer, HIGH);    \n" +
                        "  delay(200);                     \n" +
                        "  digitalWrite(pinBuzzer, LOW); \n" +
                        "  delay(1000);                      \n" +
                        "}\n",
                "Hasil Project",
                R.drawable.hbuz,
                "Buzzer akan menyala dengan delay dan akan mati dengan delay\n"+
                        " \n"+
                        "\n"+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.ldr,
                "LDR",
                "\tLight Dependent Resistor atau disingkat dengan LDR adalah jenis Resistor yang nilai hambatan atau nilai resistansinya tergantung pada intensitas cahaya yang diterimanya. Nilai Hambatan LDR akan menurun pada saat cahaya terang dan nilai Hambatannya akan menjadi tinggi jika dalam kondisi gelap. Dengan kata lain, fungsi LDR (Light Dependent Resistor) adalah untuk menghantarkan arus listrik jika menerima sejumlah intensitas cahaya (Kondisi Terang) dan menghambat arus listrik dalam kondisi gelap.\n" +
                        "\n" +
                        "\tNaik turunnya nilai Hambatan akan sebanding dengan jumlah cahaya yang diterimanya. Pada umumnya, Nilai Hambatan LDR akan mencapai 200 Kilo Ohm (kΩ) pada kondisi gelap dan menurun menjadi 500 Ohm (Ω) pada Kondisi Cahaya Terang.\n" +
                        "\n" +
                        "\tLDR (Light Dependent Resistor) yang merupakan Komponen Elektronika peka cahaya ini sering digunakan atau diaplikasikan dalam Rangkaian Elektronika sebagai sensor pada Lampu Penerang Jalan, Lampu Kamar Tidur, Rangkaian Anti Maling, Shutter Kamera, Alarm dan lain sebagainya.LDR memiliki dua karakteristik yaitu Laju recovery dan respon spektral.\n" +
                        "\n" +
                        "\tBila sebuah LDR dibawa dari suatu ruangan dengan level kekuatan tertentu ke dalam suatu ruangan yang gelap. Maka bisa kita amati bahwa nilai resistansi dari LDR tidak akan segera berubah resistansinya pada keadaan ruangan gelap tersebut. Namun LDR tersebut hanya akan bisa mencapai harga di kegelapan setelah mengalami selang waktu tertentu. Laju recovery merupakan suatu ukuran praktis dan suatu kenaikan nilai resistansi dalam waktu tertentu. Harga ini ditulis dalam K/detik, untuk LDR tipe arus harganya lebih besar dari 200K/detik(selama 20 menit pertama mulai dari level cahaya 100 lux), kecepatan tersebut akan lebih tinggi pada arah sebaliknya, yaitu pindah dari tempat gelap ke tempat terang yang memerlukan waktu kurang dari 10 ms untuk mencapai resistansi yang sesuai den-gan level cahaya 400 lux.\n" +
                        "\n" +
                        "               Respon Spektral\n" +
                        "\tLDR tidak mempunyai sensitivitas yang sama untuk setiap panjang gelombang cahaya yang jatuh padanya (yaitu warna). Bahan yang biasa digunakan sebagai penghantar arus listrik yaitu tembaga, aluminium, baja, emas dan perak. Dari kelima bahan tersebut tembaga merupakan penghantar yang paling banyak digunakan karena mempunyai daya hantar yang baik. Resistansi LDR akan berubah seiring dengan perubahan intensitas cahaya yang mengenainya atau yang\n" +
                        "\n" +
                        "\tada disekitarnya. Dalam keadaan gelap resistansi LDR sekitar 10MΩ dan dalam keadaan terang sebesar 1KΩ atau kurang. LDR terbuat dari bahan semikonduktor sepertikadmium sulfida. Dengan bahan ini energi dari cahaya yang jatuh menyebabkan lebih banyak muatan yang dilepas atau arus listrik meningkat. Artinya resistansi bahan telah mengalami penurunan.\n" +
                        "               Prinsip Kerja LDR\n" +
                        "\tPada dasarnya LDR terbuat dari sebuah cakram semikonduktor yang mempunyai dua buah elektroda pada permukaannya. Pada saat gelap atau intensitas cahaya rendah, bahan tersebut menghasilkan elektron bebas dengan jumlah yang relatif kecil. Sehingga hanya sedikit elektron yang dihasilkan untuk mengangkut muatan elektrik. Hal ini berarti, pada saat keadaan gelap atau intensitas cahaya rendah, maka LDR akan menjadi konduktor yang buruk, sehingga LDR memiliki resistansi yang besar pada saat gelap atau intensitas cahaya rendah. Pada saat terang atau intensitas cahaya tinggi, bahan tersebut lebih banyak menghasilkan elektron yang lepas dari atom. Sehingga akan lebih banyak elektron yang dihasilkan untuk mengangkut muatan elektrik. Hal ini berarti, pada saat terang atau intensitas cahaya tinggi, maka LDR menjadi konduktor yang baik, sehingga LDR memiliki resistansi yang kecil pada saat terang atau intensistas cahaya tinggi\n"+
                        "\n" +
                        "               cara kerja LDR\n"+
                        "\tLDR tidak mempunyai sensitivitas yang sama untuk setiap panjang gelombang cahaya yang jatuh padanya (yaitu warna). Bahan yang biasa digunakan sebagai penghantar arus listrik yaitu tembaga, aluminium, baja, emas dan perak. Dari kelima bahan tersebut tembaga merupakan penghantar yang paling banyak digunakan karena mempunyai daya hantar yang baik. Resistansi LDR akan berubah seiring dengan perubahan intensitas cahaya yang mengenainya atau yang\n" +
                        " \n" +
                        "\tada disekitarnya. Dalam keadaan gelap resistansi LDR sekitar 10MΩ dan dalam keadaan terang sebesar 1KΩ atau kurang. LDR terbuat dari bahan semikonduktor sepertikadmium sulfida. Dengan bahan ini energi dari cahaya yang jatuh menyebabkan lebih banyak muatan yang dilepas atau arus listrik meningkat. Artinya resistansi bahan telah mengalami penurunan.\n"+
                        "\n",
                R.drawable.rldr,
                "int pinLdr = A1;\n" +
                        "\tint intensitas;\n" +
                        "\n" +
                        "void setup() {\n" +
                        "\n" +
                        "Serial.begin(9600);\n" +
                        "\n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        "\n" +
                        "intensitas = analogRead(pinLdr);\n" +
                        "Serial.print(\"Intensitas : \");\n" +
                        "Serial.println(intensitas);\n" +
                        "\n" +
                        "delay(500);\n" +
                        "  \n" +
                        "}\n",
                "Hasil Project ",
                R.drawable.hldr,
                "gambar rangkaian di atas dapat di aplikasikan di breadboard. Serial monitor akan menampilkan  intensitas cahaya dengan angka yang tinggi bila terkena cahaya dan begtu pun sebaliknya\n"+
                        " \n"+
                        "\n"+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.adc,
                "ADC",
                "\tBagaimana cara menghitung nilai pembacaan ADC yang berasal dari suatu sensor analog. Microcontroller memiliki kemampuan untuk menerima, mengolah, dan memberikan output signal digital. Sebagai contoh bila microcontroller dengan catu daya 5 volt, microcontroller tersebut dapat mengenali tegangan sebesar 0 volt sebagai signal digital low, atau tegangan 5 volt sebagai signal digital high. Sedangkan untuk mengenali nilai tegangan antara 0 volt hingga 5 volt, diperlukan feature khusus, yakni Analog-to-Digital Converter. Analog-to-Digital Converter atau biasa disebut ADC, memungkinkan microcontroller untuk mengenali suatu nilai analog melalui suatu pendekatan digital. Saat ini banyak microcontroller, termasuk Arduino telah dilengkapi dengan feature ADC yang terintegrasi di dalamnya.\n" +
                        "\n" +
                        "\tTapi tidak semua pin Arduino dapat digunakan untuk mengolah signal analog. Pada board Arduino Uno, terdapat enam pin analog, yakni mulai dari A0 hingga A5. Huruf A pada awal nama pin Arduino menandakan pin tersebut dapat digunakan untuk mengolah signal analog. Seberapa tepat nilai signal analog yang dipetakan secara digital, ditentukan\n" +
                        " \n" +
                        "\toleh seberapa besar resolusi ADC. Semakin besar resolusi ADC, maka semakin mendekati nilai analog dari signal tersebut. Untuk resolusi ADC pada board Arduino Uno ialah 10 bit, yang berarti mampu memetakan hingga 1024 discrete analog level. Beberapa jenis microcontroller lain memiliki resolusi 8 bit, 256 discrete analog level, bahkan ada yang memiliki resolusi 16 bit, 65536 discrete analog level.\n"+
                        "\n" +
                        "                  kaitan nilai ADC dengan tegangan\n"+
                        "\tNilai ADC menunjukkan ratio perbandingan dengan tegangan yang terbaca. Berikut persamaannya ialah nilai ADC terukur ialahnilai ADC maximum dikalikan tegangan terbaca, kemudian dibagi dengan nilai tegangan sumber.\n" +
                        "\n" +
                        "\tNilai ADC tergantung dengan tegangan yang menjadi catu daya sistem microcontroller. Untuk board Arduino biasa menggunakan sumber tegangan 5 volt. Berikut adalah cara mencari nilai ADC, dengan menerapkan persamaan yang ada dan tegangan terbaca sebesar 2,12 volt pada board Arduino Uno.\n" +
                        "\n" +
                        "\tBoard Arduino Uno memiliki resolusi 10 bit, dengan nilai terbesar 1023.Tegangan sumber 5 volt dan tegangan terbaca ialah 2,12 volt.Nilai ADC terukur ialah nilai ADC maximum dikalikan tegangan terbaca, kemudian dibagi dengan nilai tegangan sumber. Sehingga diperoleh nilai ADC sebesar 434. Dengan demikian diperoleh nilai ADC sebesar 434 dari tegangan terukur 2,12 volt. Untuk setiap unit ADC tersebut memiliki perbandingan tegangan sebesar 4,9 mV. Proses konversi dari nilai analog menjadi digital ini disebut proses ADC (Analog to Digital Conversion). Bagaimana jika tegangan 5 volt dikonversi menjadi data digital 10 bit? Mari kita hitung\n" +
                        " \n" +
                        "\tSelain dipengaruhi oleh besarnya nilai resolusi ADC, tepat tidaknya pengukuran nilai ADC juga dipengaruhi oleh clock speed ADC tersebut. Untuk board Arduino Uno sendiri clock speed ADC maximum yang disarankan ialah 200 kHz. Nilai clock speed 200 kHz tersebut berdasarkan spesifikasi internal DAC (Digital to Analog Converter) pada rangkaian pengubahnya. Meski demikian, penggunaan clock speed pada 1 MHz mesalnya, tidak mengurangi kualitas resolusi ADC tersebut.\n",
                R.drawable.radci,
                "int sensorPin = A0;  \n" +
                        "int digitalValue = 0;\n" +
                        "\n" +
                        "void setup() {\n" +
                        "  Serial.begin(9600);\n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        "  digitalValue = analogRead(sensorPin);\n" +
                        "  Serial.print(\"digital value = \");\n" +
                        "  Serial.println(digitalValue);       \n" +
                        "  delay(1000);\n" +
                        "}",
                "Hasil Project",
                R.drawable.hadc,
                "buka serial monitor dan akan tampil seperti pada gambar di atas"
            ),
            Image(
                R.drawable.lm,
                "LM35",
                "\tSensor suhu LM35 adalah komponen elektronika yang memiliki fungsi untuk mengubah besaran suhu menjadi besaran listrik dalam bentuk tegangan. LM35 mempunyai keluaran impedansi yang rendah dan linieritas yang tinggi sehingga dapat dengan mudah dihubungkan dengan rangkaian kendali khusus serta tidak memerlukan penyetelan lanjutan.\n" +
                        "\n" +
                        "\tMeskipun tegangan sensor ini dapat mencapai 30 volt akan tetapi yang diberikan kesensor adalah sebesar 5 volt, sehingga dapat digunakan dengan catu daya tunggal dengan ketentuan bahwa LM35 hanya membutuhkan arus sebesar 60 µA hal ini berarti LM35 mempunyai kemampuan menghasilkan panas (self-heating) dari sensor yang dapat menyebabkan kesalahan pembacaan yang rendah yaitu kurang dari 0,5 ºC pada suhu 25 ºC\n" +
                        "\n" +
                        "\tSensor LM35 bekerja dengan mengubah besaran suhu menjadi besaran tegangan. Tegangan ideal yang keluar dari LM35 mempunyai perbandingan 100°C setara dengan 1 volt. Sensor ini mempunyai pemanasan diri (self heating) kurang dari 0,1°C, dapat dioperasikan dengan menggunakan power supply tunggal dan dapat dihubungkan antar muka (interface) rangkaian control yang sangat mudah.\n" +
                        "\tIC LM 35 sebagai sensor suhu yang teliti dan terkemas dalam bentuk Integrated Circuit (IC), dimana output tegangan keluaran sangat linear terhadap perubahan suhu. Sensor ini berfungsi sebagai pegubah dari besaran fisis suhu ke besaran tegangan yang memiliki koefisien sebesar 10 mV/°C yang berarti bahwa kenaikan suhu 1° C maka akan terjadi kenaikan tegangan sebesar 10 mV.\n"+
                        "\n" +
                        "              Adapun spesifikasi yang dimiliki sensor temperature LM35 ini adalah:\n" +
                        "\n" +
                        "1.\tTerkalibrasi secara langsung dalam derajat celcius.\n" +
                        "2.\tKeluaran linier 10.0mV/derajat celcius.\n" +
                        "3.\tKetelitian dijamin 0.5 derajat celcius pada temperatur      25 derajat celcius.\n" +
                        "4.\tBekerja pada temperatur antara -50 sampai 150 derajat celcius.\n" +
                        "5.\tDisiapkan sebagai aplikasi remote.\n" +
                        "6.\tTegangan operasi antara 4 sampai 20V\n" +
                        "7.\tArus drain lebih kecil dari 60 mikro Ampere.\n" +
                        "8.\tPemanasan sendiri sangat rendah yaitu 0.08 derajat celcius dalam udara.\n" +
                        "9.\tSecara tipikal ketidak linieran sebesar 0.25 derajat celcius.\n" +
                        "10.\tImpedansi output 0.1 Ohm untuk beban 1 mA.\n" +
                        "\n" +
                        "\t IC LM 35 ini tidak memerlukan pengkalibrasian atau penyetelan dari luar karena ketelitiannya sampai lebih kurang seperempat derajat celcius pada temperature ruang. Jangka sensor mulai dari – 55°C sampai dengan 150°C, IC LM35 penggunaannya sangat mudah, difungsikan sebagai kontrol dari indicator tampilan catu daya terbelah. IC LM 35 dapat dialiri arus 60 μ A dari supplay sehingga panas yang ditimbulkan sendiri sangat rendah kurang dari 0 ° C di dalam suhu ruangan. Untuk mendeteksi suhu digunakan sebuah sensor suhu LM35 yang dapat dikalibrasikan langsung dalam C (celcius).\n"+
                        "\n" +
                        "                    cara kerja LM35\n"+
                        "\tSensor LM35 bekerja dengan mengubah besaran suhu menjadi besaran tegangan. Tegangan ideal yang keluar dari LM35 mempunyai perbandingan 100°C setara dengan 1 volt. Sensor ini mempunyai pemanasan diri (self heating) kurang dari 0,1°C, dapat dioperasikan dengan menggunakan power supply tunggal dan dapat dihubungkan antar muka (interface) rangkaian control yang sangat mudah. IC LM 35 sebagai sensor suhu yang teliti dan terkemas dalam bentuk Integrated Circuit (IC), dimana output tegangan keluaran sangat linear terhadap perubahan suhu. Sensor ini berfungsi sebagai pegubah dari besaran fisis suhu ke besaran tegangan yang memiliki koefisien sebesar 10 mV /°C yang berarti bahwa kenaikan suhu 1° C maka akan terjadi kenaikan tegangan sebesar 10 mV.\n" +
                        "\n" +
                        "\tIC LM 35 ini tidak memerlukan pengkalibrasian atau penyetelan dari luar karena ketelitiannya sampai lebih kurang seperempat derajat celcius pada temperature ruang. Jangka sensor mulai dari – 55°C sampai dengan 150°C, IC LM35 penggunaannya sangat mudah, difungsikan sebagai kontrol dari indicator tampilan catu daya terbelah. IC LM 35 dapat dialiri arus 60 μ A dari supplay sehingga panas yang ditimbulkan sendiri sangat rendah kurang dari 0 ° C di dalam suhu ruangan. Untuk mendeteksi suhu digunakan sebuah sensor suhu LM35 yang dapat dikalibrasikan langsung dalam C (celcius), LM35 ini difungsikan sebagai basictemperature sensor.\n",
                R.drawable.rlm,
                "#define sensorPin A0\n" +
                        "\n" +
                        "void setup() {\n" +
                        "  Serial.begin(9600);\n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        "  int reading = analogRead(sensorPin);\n" +
                        "  float voltage = reading * (5.0 / 1024.0);\n" +
                        "  float temperatureC = voltage * 100;\n" +
                        "  Serial.print(\"Temperature: \");\n" +
                        "  Serial.print(temperatureC);\n" +
                        "  Serial.print(\"\\xC2\\xB0\"); \n" +
                        "  Serial.print(\"C  |  \");\n" +
                        "  \n" +
                        "  float temperatureF = (temperatureC * 9.0 / 5.0) + 32.0;\n" +
                        "\n" +
                        "  Serial.print(temperatureF);\n" +
                        "  Serial.print(\"\\xC2\\xB0\"); \n" +
                        "  Serial.println(\"F\");\n" +
                        "\n" +
                        "  delay(1000); \n" +
                        "}",
                "Hasil Project",
                R.drawable.hlm,
                "Tampilkan serial monitor dan lihat seperti pada gambar di atas\n"+
                        " \n"+
                        "\n"+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.soii,
                "Soil Moisture",
                "\tSensor kelembaban tanah mengukur volumetrik kadar air di tanah. Sejak langsung pengukuran gravimetri kelembaban tanah bebas membutuhkan menghapus, pengeringan, dan bobot sampel, sensor kelembaban tanah mengukur kadar air volumetrik secara tidak langsung dengan menggunakan beberapa properti lain dari tanah, seperti hambatan listrik, konstanta dielektrik, atau interaksi dengan neutron , sebagai proxy untuk kadar air. Hubungan antara diukur properti dan tanah air harus dikalibrasi dan dapat bervariasi tergantung pada factor lingkungan seperti jenis tanah, suhu , atau konduktivitas listrik . Tercermin microwave radiasi dipengaruhi oleh kelembaban tanah dan digunakan untuk penginderaan jauh di hidrologi dan pertanian. Instrumen probe portabel bisa digunakan oleh petani atau tukang kebun.\n" +
                        "\n" +
                        "\tSensor kelembaban tanah biasanya mengacu pada sensor yang memperkirakan kadar air volumetrik. Kelas lain dari sensor mengukur properti lain dari kelembaban di tanah yang disebut potensial air ; sensor ini biasanya disebut sebagai potensi sensor air tanah dan termasuk tensiometer dan blok gipsum.\n" +
                        "\n" +
                        "\tSensor kelembaban ini bisa membaca jumlah kelembaban yang ada di tanah yang mengelilinginya. Ini adalah sensor berteknologi rendah, tapi ideal untuk memantau taman kota, atau tingkat air tanaman hewan peliharaan Anda. Ini adalah harus memiliki alat untuk kebun terhubung.\n" +
                        "\n" +
                        "\tSensor ini menggunakan dua probe untuk melewati arus melalui tanah, dan kemudian dibaca bahwa ketahanan untuk mendapatkan tingkat kelembaban. Lebih banyak air membuat tanah melakukan listrik lebih mudah (kurang tahan), sedangkan tanah kering melakukan listrik dengan buruk (lebih tahan).\n" +
                        "\n" +
                        "\tAkan sangat membantu jika Anda mengingatkan Anda untuk menyirami tanaman indoor Anda atau untuk memantau kelembaban tanah di kebun Anda. Teknologi yang biasa digunakan untuk secara tidak langsung mengukur kadar air volumetrik (kelembaban tanah) termasuk)\n" +
                        "•\tFrekuensi Domain Reflectometry (FDR) : The konstanta dielektrik dari elemen volume tertentu di sekitar sensor diperoleh dengan mengukur frekuensi operasi dari sebuah rangkaian berosilasi.\n" +
                        "\n"+
                        "•\tWaktu Domain Transmisi (TDT) dan Time Domain Reflectometry (TDR) : The konstanta dielektrik dari elemen volume tertentu di sekitar sensor diperoleh dengan mengukur kecepatan propagasi di sepanjang saluran transmisi dimakamkan.\n" +
                        "\n"+
                        "•\tPengukur Neutron kelembaban : The moderator sifat air untuk neutron yang digunakan untuk memperkirakan kadar air tanah antara sumber dan detektor penyelidikan.\n" +
                        "\n"+
                        "•\tTanah resistivitas : Mengukur seberapa kuat tanah menolak aliran listrik antara dua elektroda dapat digunakan untuk menentukan kadar air tanah.\n" +
                        "\n" +
                        "•\tGalvanic cell : Jumlah air yang dapat ditentukan berdasarkan tegangan tanah menghasilkan karena air bertindak sebagai elektrolit dan menghasilkan listrik. Teknologi di balik konsep ini adalah sel galvanik.\n",
                R.drawable.rsoi,
                "#define soilWet 500  \n" +
                        "#define soilDry 750   \n" +
                        "\n" +
                        "#define sensorPower 7\n" +
                        "#define sensorPin A0\n" +
                        "\n" +
                        "void setup() {\n" +
                        " pinMode(sensorPower, OUTPUT);\n" +
                        " digitalWrite(sensorPower, LOW);\n" +
                        " Serial.begin(9600);\n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        "\n" +
                        " int moisture = readSensor();\n" +
                        " Serial.print(\"Analog Output: \");\n" +
                        " Serial.println(moisture);\n" +
                        " if (moisture < soilWet) {\n" +
                        " Serial.println(\"Status: Soil is too wet\");\n" +
                        " } \n" +
                        " else if (moisture >= soilWet && moisture < soilDry) {\n" +
                        " Serial.println(\"Status: Soil moisture is perfect\");\n" +
                        " } \n" +
                        " else {\n" +
                        " Serial.println(\"Status: Soil is too dry - time to water!\");\n" +
                        " }\n" +
                        " delay(1000);\t\n" +
                        " Serial.println();\n" +
                        "}\n" +
                        "\n" +
                        "\n" +
                        "int readSensor() {\n" +
                        " digitalWrite(sensorPower, HIGH);\t\n" +
                        " delay(10);\t\t\t\t\t\t\t\n" +
                        " int val = analogRead(sensorPin);\t\n" +
                        " digitalWrite(sensorPower, LOW);\t\t\n" +
                        " return val;\t\t\t\t\t\t\t\n" +
                        "}",
                "Hasil Project ",
                R.drawable.hsoi,
                " Tampilkan serial monitor\n"+
                        " \n"+
                        "\n"+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.mq3,
                "MQ-3",
                "\tMQ-3adalah sensor alkohol berbasis pemanas yang mengeluarkan sinyal analog (biasanya diinterpretasikan di suatu tempat antara 150 dan 1023 tergantung pada berapa lama Anda membiarkan sensornya memanas), yang melalui penggunaan kode dan kalibrasi Arduino Anda, dapat ditafsirkan. Untuk apa pun yang Anda butuhkan. (http://bildr.org/2013/10/mq3-arduino) Sensor gas MQ-3 ini digunakan untuk mengukur konsentrasi gas atau uap Alkohol di udara menggunakan rangkaian mikrokontroler seperti Arduino.Sensor MQ-3 ini sangat sensitif terhadap gas Alkohol. Material gas yang dideteksi oleh sensor gas MQ3 adalah gas atau uap Alkohol.\n"+
                        "\n" +
                        "\tSensor bekerja melalui terminal AOUT memberikan output tegangan analog sebanding dengan jumlah alkohol yang dideteksi sensor. Semakin banyak alkohol yang dideteksi, semakin besar   tegangan   analog   yang   akan dihasilkannya. Sebaliknya, semakin sedikit alkohol yang\n" +
                        " \n" +
                        "\tdideteksi, semakin sedikit tegangan analog yang dihasilkannya. Jika tegangan analog mencapai ambang tertentu, maka akan mengirimkan pin digital DOUT yang tinggi. Setelah pin DOUT ini naik tinggi, arduino akan mendeteksi hal ini dan akan memicu LED menyala, menandakan bahwa ambang alkohol telah tercapai dan sekarang melampaui batas.\n" +
                        "Kelebihan \n" +
                        "1.\tKepekaan terhadap alkohol yang tinggi dan rendah terhadap bensin\n" +
                        "2.\tWaktu respon cepat\n" +
                        "3.\tStabil dan tahan lama\n" +
                        "4.\tSumber tegangan AC / Dc 5 Volt\n" +
                        "5.\tSuhu Operasional – 10 s/d 70 derajat celcius\n" +
                        "\n"+
                        "Kekurangan\n" +
                        "Mengonsumsi daya yang cukup besar\n",
                R.drawable.rrm,
                "#define Sober 120  \n" +
                        "#define Drunk 400 \n" +
                        "\n" +
                        "#define MQ3pin 0\n" +
                        "\n" +
                        "float sensorValue;  \n" +
                        "\n" +
                        "void setup() {\n" +
                        "\tSerial.begin(9600);\n" +
                        "\tSerial.println(\"MQ3 warming up!\");\n" +
                        "\tdelay(20000); \n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        " sensorValue = analogRead(MQ3pin); \n" +
                        " Serial.print(\"Sensor Value: \");\n" +
                        " Serial.print(sensorValue);\n" +
                        " if (sensorValue < Sober) {\n" +
                        "   Serial.println(\"  |  Status: Stone Cold Sober\");\n" +
                        " } else if (sensorValue >= Sober && sensorValue < Drunk) {\n" +
                        "   Serial.println(\"  |  Status: Drinking but within legal limits\");\n" +
                        " } else {\n" +
                        "   Serial.println(\"  |  Status: DRUNK\");\n" +
                        " }\n" +
                        " delay(2000); // wait 2s for next reading\n" +
                        "}",
                " Hasil Project",
                R.drawable.hrm,
                "lihat pada tampilan serial monitor\n"+
                        " \n"+
                        "\n"+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.mq7,
                "MQ-7",
                "\tMQ 7 merupakan sensor gas yang digunakan dalam peralatan untuk mendeteksi gas karbon monoksida (CO) dalam kehidupan sehari-hari, industri, atau mobil. Fitur dari sensor gas MQ7 ini adalah mempunyai sensitivitas yang tinggi terhadap karbon monoksida (CO), stabil, dan berumur panjang. Sensor ini menggunakan catu daya heater : 5V AC/DC dan menggunakan catu daya rangkaian : 5VDC, jarak pengukuran : 20 - 2000ppm untuk ampu mengukur gas karbon monoksida.\n"+
                        "\n" +
                        "\tStruktur dan konfigurasi MQ-7 sensor gas, sensor disusun oleh mikro AL2O3 tabung keramik, Tin Dioksida (SnO2) lapisan sensitif, elektroda pengukuran dan pemanas adalah tetap menjadi kerak yang dibuat oleh plastik dan stainless steel bersih. Pemanas menyediakan kondisi kerja yang diperlukan untuk pekerjaan komponen sensitif. MQ-7 dibuat dengan 6 pin, 4 dari mereka yang digunakan untuk mengambil sinyal, dan 2 lainnya digunakan untuk menyediakan arus pemanasan.",
                R.drawable.rmqqq,
                "#define pinSensor A0 \n" +
                        "\n" +
                        "void setup()\n" +
                        "{\n" +
                        " Serial.begin(9600);\n" +
                        "}\n" +
                        "\n" +
                        "long RL = 1000; \n" +
                        "long Ro = 830; \n" +
                        "void loop()\n" +
                        "{\n" +
                        " int sensorvalue = analogRead(pinSensor); \n" +
                        " float VRL= sensorvalue*5.00/1024;  \n" +
                        " Serial.print(\"VRL : \");\n" +
                        " Serial.print(VRL);\n" +
                        " Serial.println(\" volt\");\n" +
                        "\n" +
                        " float Rs = ( 5.00 * RL / VRL ) - RL;\n" +
                        " Serial.print(\"Rs : \");\n" +
                        " Serial.print(Rs);\n" +
                        " Serial.println(\" Ohm\");\n" +
                        "\n" +
                        " float ppm = 100 * pow(Rs / Ro,-1.53); \n" +
                        " Serial.print(\"CO : \");\n" +
                        " Serial.print(ppm);\n" +
                        " Serial.println(\" ppm\");\n" +
                        " \n" +
                        " Serial.println();\n" +
                        " delay(500);\n" +
                        "}",
                " Hasil Project",
                R.drawable.hmqq,
                "Berikut adalah hasil dari serial monitor\n "+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.suara,
                "Sensor Suara",
                "\tSensor suara adalah alat sensor yang mampu mengubah gelombang Sinusioda suara menjadi gelombang sinus energi listrik (Alternating Sinusioda Electric Curret). Sensor suara bekerja berdasarkan besar kecilnya kekuatan gelombang suara yang diterima membran sensor dan menyebabkan bergeraknya membran sensor dimana juga terdapat sebuah kumparan dibalik membran tadi yang naik turun mengikuti besar kecilnya penerimaan gelombang suara.\n" +
                        "\n" +
                        "               Prinsip Kerja Sensor Suara\n" +
                        "\tCara kerja sensor suara adalah dengan merubah besaran suara menjadi besaran listrik. Sinyal suara yang masuk akan diolah sehingga akan menghasilkan suatu kondisi boolean yaitu kondisi 1 (aktif) atau kondisi 0 (mati), yang mana sinyal kondisi tersebut dibaca oleh mikrokontroler. Sensor suara adalah sensor yang cara kerjanya merubah besaran gelombang suara menjadi besaran listrik. Komponen yang termasuk dalam sensor suara yaitu :\n" +
                        " \n" +
                        "1. ECM\n" +
                        "\tECM atau Electric Condenser Microphone biasa juga disebut mic kondenser adalah microphone yang terbuat dari lempeng konduktor tipis berbentuk sebuah kapasitor yang dapat berubah-ubah nilai kapasitasnya sesuai dengan getaran suara yang diterima\n" +
                        "\n" +
                        "2. Sensor Suara V2\n" +
                        "\tModul sensor suara memiliki output pin analog dan digital. Modul sensor suara menggunakan input mic condensor. Sensor ini dapat mendeteksi suara dan sebagai deteksi sensor saklar ke arduino atau mikrokontroler.\n" +
                        "\n" +
                        "                Spesifikasi Modul :\n" +
                        "1.\tVoltage : 5V\n" +
                        "2.\tIndikator LED\n" +
                        "3.\tTingkat output TTL\n" +
                        "4.\tOutput Analog dan Digital\n" +
                        "5.\tDilengkapi Dioda Pelindung\n"+
                        "\n" +
                        "\tPada era serba teknologi dan canggih saat ini untuk melakukan banyak hal tidaklah sulit malah mudah dan praktis. Namun masih sedikit aplikasi yang canggih digunakan untuk tempat tinggal atau rumah, jadi untuk mempermudah kegiatan dalam ruangan saya ingin melakukan simulasi menyalakan dan mematikan lampu menggunakan sensor suara yang dimana tidak perlu repot berjalan ke ujung ruangan untuk mematikan atau menyalakan lampu melalui saklar, tinggal tepuk tangan saja diarea yang dijangkau sensor maka lampu akan menyala secara otomatis, dan untuk mematikan lampu tinggal tepuk tangan 1 kali lagi.",
                R.drawable.rsuara,
                "#define sensorPin 8\n" +
                        "\n" +
                        "unsigned long lastEvent = 0;\n" +
                        "\n" +
                        "void setup() {\n" +
                        "\tpinMode(sensorPin, INPUT);\t\n" +
                        "\tSerial.begin(9600);\n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        "\tint sensorData = digitalRead(sensorPin);\n" +
                        "\tif (sensorData == LOW) {\n" +
                        "\tif (millis() - lastEvent > 25) {\n" +
                        "\tSerial.println(\"Clap detected!\");\n" +
                        "\t}\n" +
                        "\t\t\n" +
                        "\tlastEvent = millis();\n" +
                        "}\n",
                "Hasil Project",
                R.drawable.hsuara,
                " Lakukan Tepuk tangan di sekitar sensor dan lihat tampilan pada serial monitor\n"+
                        " \n"+
                        "\n"+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.sentuh,
                "Sensor Sentuh",
                "              Pengertian Sensor Sentuh\n" +
                        "\tSeperti namanya, sensor sentuh atau touch sensor adalah sensor elektronik yang bisa mendekeksi sentuhan. Sensor sentuh ini beroperasi sebagai sakelar apabila disentuh, seperti sakelar pada lampu, layar sentuh ponsel dan lain sebagainya. Sensor sentuh ini dikenal juga sebagai Sensor Taktil (Tactile Sensor).\n" +
                        "\n"+
                        "\tSeiring dengan berkembangnya zaman dan juga teknologi, sensor sentuh ini semakin banyak digunakan dan sudah menggeser peranan sakelar mekanik pada perangkat-perangkat elektronik.\n" +
                        "\n"+
                        "               Jenis-Jenis Sensor Sentuh\n" +
                        "\tBerdasarkan fungsinya sensor sentuh dapat dibagi menjadi 4 yaitu sensor kapasitif, sensor resistif, multi touch dan surface acoustic wave.\n" +
                        "\n"+
                        "\tNah untuk itu simak pembahasannya mengenai keempat jenis sensor sentuh tersebut dibawah ini.\n" +
                        "\n"+
                        "1. Sensor Kapasitif\n" +
                        "\n" +
                        "\tSensor kapasitif adalah sensor sentuh yang sangat populer saat ini, hal ini dikarenakan sensor kapasitif lebih kuat, tahan lama serta mudah digunakan dan harganya pun yang relatif lebih murah dari sensor resistif. Smartphone saat ini sudah banyak yang menggunakan teknologi ini karena juga menghasilkan respon yang lebih akurat.\n" +
                        "\n"+
                        "\tBerbeda dengan sensor resistif yang menggunakan tekanan tertentu untuk merasakan perubahan pada permukaan layar. Sensor kapasitif ini memanfaatkan sifat konduktif alami pada tubuh manusia untuk mendeteksi perubahan layar sentuhnya.\n" +
                        "\n"+
                        "\tLayar sentuh sensor kapasitif ini terbuat dari bahan konduktif biasanya Indium Tin Oxide (ITO) yang dilapisi oleh kaca tipis dan hanya bisa disentuh oleh jari manusia atau stylus khusus atau sarung khusus yang mempunyai sifat konduktif.\n" +
                        "\n"+
                        "\tPada saat jari menyentuh layar, akan terjadi perubahan medan listrik pada layar sentuh tersebut dan lalu direspon oleh processor untuk membaca pergerakan jari tangan tersebut.\n" +
                        "\n"+
                        "\tJadi perlu diperhatikan bahwa sentuhan kita tidak akan direspon oleh layar sensor kapasitif apabila menggunakan bahan non-konduktif sebagai pelantara jari tangan dan layar sentuh tersebut.\n" +
                        "\n"+
                        "2. Sensor Resistif\n" +
                        "\n" +
                        "\tSensor sentuh resistif ini tidak tergantung pada sifat listrik yang terjadi pada konduktivitas pelat logam. Sensor resistif bekerja dengan mengukur tekanan yang diberikan pada permukaannya. Karena tidak perlu mengukur perbedaan kapasitansi, sensor sentuh resistif ini bisa beroperasi pada bahan non-konduktif seperti pena, stylus atau jari di dalam sarung tangan.\n" +
                        "\n"+
                        "\tSensor sentuh ini terdiri dari dua lapisan konduktif yang dipisahkan oleh jarak atau cela yang sangat kecil. Dua lapisan konduktif (lapisan atas dan lapisan bawah) ini umumnya terbuat dari sebuah film. Film-film pada umumnya dilapisi oleh Indium Tin Oxide yang merupakan konduktor listrik yang baik dan transparan.\n" +
                        "\n"+
                        "\tCara kerjanya hampir sama dengan sebuah sakelar, pada saat film lapisan atas mendapatkan tekanan tertentu baik dengan jari ataupun stylus, maka film lapisan atas akan bersentuhan dengan film lapisan bawah. Sehingga menimbulkan aliran listrik pada titik koordinat tertentu layar tersebut serta memberikan signal ke prosesor untuk melakukan proses selanjutnya.\n" +
                        "\n"+
                        "3. Multi Touch\n" +
                        "\n" +
                        "\tMulti touch layar sentuh merupakan teknologi layar sentuh yang sudah mengalami perkembangan. Kelebihan yang dimiliki oleh layar sentuh ini yaitu dapat disentuh oleh lebih dari satu jari. Multi touch ini dapat disentuh hingga puluhan jari dari beberapa orang berbeda sekaligus secara bersamaan.\n" +
                        "\n" +
                        "\tMulti touch ini dapat digunakan untuk mengecilkan, membesarkan, mengubah posisi dan bahkan memindahkan posisi suatu objek pada layar monitor seperti foto atau games. Multi touch ini umumnya banyak digunakan pada komputer, handphone, MP3 player dan lain sebagainya.\n" +
                        "\n"+
                        "4. Surface Acoustic Wave\n" +
                        "\n" +
                        "\tUntuk dapat mendeteksi kejadian pada permukaan layarnya, sistem teknologi ini biasanya menggunakan gelombang ultrasonik. Dalam monitornya terdapat dua transducer, yakni pengirim dan penerima sinyal ultrasonik. Bahkan dilengkapi juga dengan sebuah reflektor yang mempunyai fungsi untuk mencegah gelombang ultrasonik agar tetap berada pada area layar monitor.\n" +
                        "\n"+
                        "\tKedua transducer tersebut dipasang pada empat sisi, dua vertikal dan dua horizontal. Jika panel touchnya tersentuh langsung, maka bagian dari gelombang tersebut nantinya ada yang diserap oleh sentuhan tersebut. Misalnya seperti terhalang oleh tangan, stylus dan masih banyak lagi.\n" +
                        "\n"+
                        "\tSentuhan ini membuat adanya perubahan berupa gelombang yang dipancarkan. Perubahan gelombang ultrasonik yang sudah terjadi kemudian akan diterima oleh receiver dan diterjemahkan langsung dalam bentuk pulsa listrik.\n" +
                        "\n"+
                        "\tLalu informasi sentuhan ini akan mengalami perubahan menjadi suatu data yang akan diteruskan ke controller untuk diproses secara lebih lanjut. Data yang dihasilkan oleh sentuhan tersebut yaitu data mengenai posisi tangan yang menyentuh sinyal ultrasonik secara langsung. Apabila hal ini dilakukan secara kontinyu, maka akan ada banyak sensor gelombang ultrasonik pada media yang sudah disentuhnya.\n" +
                        "\n"+
                        "               Cara Kerja dan Komponen Layar Sentuh\n" +
                        "\tLayar sentuh umumnya mempunyai sensor sentuh, pengontrol dan driver perangkat lunak sebagai tiga komponen utama. Layar sentuh diperlukan untuk dikombinasikan dengan tampilan dan PC untuk membuat sistem layar sentuh.\n" +
                        "1. Sensor Sentuh\n" +
                        "\tSensor sentuh umumnya mempunyai arus lsitrik atau sinyal melewatinya serta menyentuh layar menyebabkan perubahan sinyal. Perubahan ini digunakan untuk menentukan lokasi sentuhan layar\n" +
                        "\n"+
                        "2. Driver Perangkat Lunak\n" +
                        "Driver perangkat lunak ini memungkinkan komputer dan layar sentuh untuk bekerja bersama. Ia memberi tahu kepada OS cara berinteraksi informasi acara sentuh yang dikirm dari pengontrol.\n" +
                        "\n"+
                        "3. Pengendali (Controller)\n" +
                        "\tPengendali (Controller) akan dihubungkan antara sensor sentuh dan PC. Dibutuhkan informasi dari sensor dan menerjemahkannya untuk memahami PC.  Pengendali atau Controller ini menentukan jenis koneksi apa yang dibutuhkan.\n" +
                        "\n"+
                        "T\touch Sensor atau Sensor Sentuh adalah sensor elektronik yang dapat mendeteksi ada atau tidaknya sentuhan. Sensor Sentuh ini pada dasarnya beroperasi sebagai sakelar apabila disentuh, seperti sakelar pada lampu, layar sentuh ponsel dan lain sebagainya. Salah satu sensor sentuh adalah tipe TTP223. Modul sensor ini berwarna merah dengan dimensi yang cukup mungil, jadi cocok untuk project-project Anda yang membutuhkan interface imput data yang kecil. BEntuk sensor sentuh TTP-223 seperti gambar di bawah ini.\n" +
                        "\n"+
                        "\tPrinsip kerja sensor sentuh adalah dengan memanfaatkan listrik dalam tubuh manusia. Ketika jari menyentuh sensor maka output sensor akan bernilai HIGH atau berlogika 1 (5V), namun saat tidak ada sentuhan maka nilai output sensor bernilai LOW atau berlogika 0 (0V). Sensor sentuh TTP223 mempunyai 3 pin yaitu VCC, I/O, dan GND. ",
                R.drawable.rsentuh,
                "const int SENSOR_PIN = 7; \n" +
                        "\n" +
                        "void setup() {\n" +
                        "  Serial.begin(9600);\n" +
                        "  pinMode(SENSOR_PIN, INPUT);\n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        "  int state = digitalRead(SENSOR_PIN);\n" +
                        "  Serial.println(state);\n" +
                        "}\n",
                "Hasil Project ",
                R.drawable.hsentuh,
                " Letakkan jarimu pada sensor, dan liat pada serial monitor\n"+
                        " \n"+
                        "\n"+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.hujan,
                "Sensor Hujan",
                "\tSensor hujan adalah jenis sensor yang berfungsi untuk mendeteksi terjadinya hujan atau tidak, yang dapat difungsikan dalam segala macam aplikasi dalam kehidupan sehari – hari. Sensor dipasaran ini dijual dalam bentuk modul sehingga hanya perlu menyediakan kabel jumper untuk mendukung mikrokontroler atau Arduino.\n" +
                        "\n"+
                        "\tPrinsip kerja dari modul sensor ini yaitu pada saat ada air hujan turun dan mengenai panel sensor maka akan terjadi proses elektrolisis oleh air hujan. Dan karena air hujan termasuk dalam golongan cairan elektrolit yang dimana cairan tersebut akan menghantarkan arus listrik.\n" +
                        "\n"+
                        "\tPada sensor hujan ini terdapat ic komparator yang dimana output dari sensor ini dapat berupa logika tinggi dan rendah (on atau off). Serta pada modul sensor ini terdapat keluaran yang berupa tegangan pula. Sehingga dapat dikoneksikan ke pin khusus Arduino yaitu Analog Digital Converter .\n" +
                        "\n"+
                        "\tDengan kata singkat, sensor ini dapat digunakan untuk menyatukan kondisi tidaknya hujan di lingkungan luar yang dimana output dari sensor ini dapat berupa sinyal analog maupun sinyal digital.\n" +
                        "\n"+
                        "               Spesifikasi sensor hujan :\n" +
                        "1.\tSensor ini bermaterial dari FR-04 dengan dimensi 5cm x 4cm berlapis nikel dan dengan kualitas tinggi pada kedua sisinya\n" +
                        "2.\tPada lapisan modul memiliki sifat anti oksidasi sehingga tahan terhadap korosi\n" +
                        "3.\tkoneksi kerja masukan sensor 3.3V – 5V\n" +
                        "4.\tMenggunakan IC komparator LM393 yang stabil\n" +
                        "5.\tOutput dari modul comparator dengan kualitas sinyal bagus lebih dari 15mA\n" +
                        "6.\tDilengkapi lubang baut untuk instalasi dengan modul lainnya\n" +
                        "7.\tTerdapat potensiometer yang berfungsi untuk mengatur sensitifitas sensor\n" +
                        "8.\tTerdapat 2 Output yaitu digital (0 dan 1) dan analog (tegangan)\n" +
                        "9.\tDimensi PCB yaitu 3.2 cm x 1.4 cm\n",
                R.drawable.rhujan,
                "int sensor_hujan = A0;\n" +
                        "int Lamp = 13;  \n" +
                        "\n" +
                        "void setup() {\n" +
                        "  pinMode(Lamp, OUTPUT);\n" +
                        "  pinMode(sensor_hujan, INPUT);\n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        "  int kondisi_sensor = digitalRead(sensor_hujan); \n" +
                        "  if (kondisi_sensor == LOW) {\n" +
                        "    digitalWrite(Lamp, HIGH);  \n" +
                        "    Serial.println(\"Hujan: Menyala\");\n" +
                        "  } else {\n" +
                        "    digitalWrite(Lamp, LOW);  \n" +
                        "    Serial.println(\"Hujan: Mati\");\n" +
                        "  }\n" +
                        "}\n",
                "Hasil Project ",
                R.drawable.hhujan,
                "Lampu akan menyala ketika hujan dan lampu akan mati ketika tidak hujan \n"+
                        " \n"+
                        "\n"+
                        "\n"+
                        "\n"
            ),
            Image(
                R.drawable.air,
                "Sensor Ketinggian Air",
                "Water Level Sensor adalah alat yang digunakan untuk memberikan signal kepada alarm/automation panel bahwa permukaan air telah mencapai level tertentu. Sensor akan memberikan signal dry contact (NO/NC) ke panel.. Pendeteksi level ketinggian air dengan membaca nilai tegangan yang dihasilkan oleh masingmasing rangkaian pembagian tegangan yang tersusun oleh empat keluaran\n" +
                        "\n" +
                        "Fungsi khusus dari sensor ini adalah mengukur ketinggian dari objek yang berupa zat cair seperti air, bensin, solar, minyak, dan sejenisnya.\n" +
                        "\n" +
                        "Kekurangan dari sensor ini adalah ketinggian yang dapat diukur hanyalah ketinggian yang mengenai lempengannya saja. Jadi tak bisa digunakan untuk mengukur ketinggian air yang lebih tinggi dari tinggi lempengan sensor. Biasanya sensor ini digunakan untuk mengukur ketinggian tempat air minum ternak atau sejenisnya.\n" +
                        "\n"+
                        "Kerja dari sensor tersebut adalah membaca resistasi yang dihasilkan oleh air yang mengenai lempengan yang bergiris garis pada sensor tersebut, semakin banyak air yang mengenai permukaan bergaris garis tersebut maka hambatannya semakin kecil dan ketika tidak ada air yang mengenai lempengan sensor tersebut maka hambatanya sangat besar atau bisa dikatakan tidak terhingga.\n",
                R.drawable.rair,
                "#define sensorPower 7\n" +
                        "#define sensorPin A0\n" +
                        "\n" +
                        "int val = 0;\n" +
                        "\n" +
                        "void setup() {\n" +
                        "\tpinMode(sensorPower, OUTPUT);\n" +
                        "\tdigitalWrite(sensorPower, LOW);\n" +
                        "\tSerial.begin(9600);\n" +
                        "}\n" +
                        "\n" +
                        "void loop() {\n" +
                        "\tint level = readSensor();\n" +
                        "\tSerial.print(\"Water level: \");\n" +
                        "\tSerial.println(level);\n" +
                        "\tdelay(1000);\n" +
                        "}\n" +
                        "int readSensor() {\n" +
                        "\tdigitalWrite(sensorPower, HIGH);\t\n" +
                        "\tdelay(10);\t\t\t\t\t\t\t\n" +
                        "\tval = analogRead(sensorPin);\t\t\n" +
                        "\tdigitalWrite(sensorPower, LOW);\t\t\n" +
                        "\treturn val;\t\t\t\t\t\t\t\n" +
                        "}\n",
                "Hasil Project",
                R.drawable.hair,
                "Serial monitor akan menampilkan angka, jika sensor kering menunjukkan angka 0, jika sensor terendam sebagian menunjukkan kisaran angka 400 dan jika sensor terendam air menunjukkan kisaran angka  500 \n"+
                        " \n"+
                        "\n"+
                        "\n"+
                        "\n"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList){
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
        kembali.setOnClickListener {
            Intent(this,MateriActivity::class.java).also {
                startActivity(it)
            }

        }
    }

    override fun onBackPressed() {
        var intent = Intent(this,MateriActivity::class.java)
            startActivity(intent)
    }
}