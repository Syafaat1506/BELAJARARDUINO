package com.example.belajararduino

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ArduinoActivity : AppCompatActivity() {
    val versionList = ArrayList<Versions>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arduino)
        val kembali = findViewById<ImageView>(R.id.imgBack14)
        kembali.setOnClickListener {
            Intent(this,MateriActivity::class.java).also {
                startActivity(it)
            }
        }


        iniData()
        setRecyclerview()


    }

    private fun setRecyclerview() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView1)
        val versionAdapter = VersionAdapter(versionList)
        recyclerView.adapter = versionAdapter
        recyclerView.setHasFixedSize(true)

    }

    private fun iniData() {
        versionList.add(
            Versions(
            "Sejarah",
                "  Semuanya berawal dari sebuah thesis yang dibuat oleh Hernando Barragan, di Institute Ivrea Italia pada tahun 2005, dikembangkan oleh Massimo Banzi dan David Cuartielle dan diberi nama Arduin of Ivrea. Lalu diganti nama menjadi Arduino yang dalam bahasa Italia berarti teman yang berani.\n" +
                        "\n" +
                        "\tTujuan awal dibuat Arduino adalah untuk membuat perangkat mudah dan murah, dari perangkat yang ada saat itu. Dan perangkat tersebut ditujukan untuk para siswa yang akan membuat perangkat desain dan interaksi. Saat ini tim pengembangnya adalah Massimo banzi, David cuartielles, Tom igoe, Gianluca martino, David mellis, dan Nicholas zambetti. Mereka mengupayakan 4 hal dalam arduino ini, yaitu:\n" +
                        "a. Harga terjangkau\n" +
                        "b. Dapat dijalankan diberbagai sistem operasi, Windows, Linux, Mac, dan sebagainya.\n" +
                        "c. Sederhana, dengan bahasa pemograman yang mudah bisa dipelajari orang awam, bukan untuk orang teknik saja.\n" +
                        "d. Open Source, hardware maupun software.\n" +
                        "\n" +
                        "\tSifat Arduino yang open source, membuat Arduino berkembang sangat cepat. Sehingga banyak lahir perangkat-perangkat sejenis Arduino. Seperti dfrduino atau freeduino, sedangkan untuk lokal ada cipaduino yang dibuat oleh skir70, lalu ada murmerduino yang dibuat oleh robot unyil, ada lagi Avishaduino yang salah satu pembuatnya adalah admin kelas robot. Sampai saat ini pihak resmi, sudah membuat berbagai jenis-jenis Arduino. Mulai dari yang paling mudah dicari dan paling banyak digunakan, yaitu Arduino uno. Hingga Arduino yang sudah menggunakan arm cortex, berbentuk mini pc. Hingga saat ini sudah ada ratusan ribu Arduino yang digunakan.\n" +
                        "\n" +
                        "\tBanyak yang bertanya Arduino ini sebenarnya menggunakan bahasa pemprograman apa? Arduino sebenarnya menggunakan bahasa C, yang sudah disederhanakan. Sehingga orang awam pun bisa menjadi seniman digital, bisa mempelajari Arduino dengan mudahnya.\n" +
                        "\n" +
                        "\tSampai saat ini pihak resmi, sudah membuat berbagai jenis- jenis Arduino. Mulai dari yang paling mudah dicari dan paling banyak digunakan, yaitu Arduino Uno. Hingga Arduino yang sudah menggunakan ARM Cortex, berbentuk\n" +
                        "\n" +
                        "\tMini PC. Hingga saat ini sudah ada ratusan ribu Arduino yang digunakan di dunia sejak tahun 2011. Arduino juga sudah dipakai oleh perusahaan-perusahaan besar, contohnya Google menggunakan Arduino untuk Accessory Development Kit, NASA memakai Arduino untuk prototypin, ada lagi Large Hadron Colider memakai Arduino dalam beberapa hal untuk pengumpulan data.\n" +
                        "\n",
                R.drawable.putih1,
                "\n",
                R.drawable.putih1,
                "\n",
                R.drawable.putih1,
                "\n",
                R.drawable.putih1,
                "\n",

             )
        )
        versionList.add(
          Versions(
              "Pengertian",
              "\tArduino merupakan rangkaian elektronik yang bersifat open source, serta memiliki perangkat keras dan lunak yang mudah untuk digunakan. Arduino dapat mengenali lingkungan sekitarnya melalui berbagai jenis aktuator lainnya. Arduino mempunyai banyak jenis diantaranya Arduino Atmega 328, Arduino fio, dan lainnya. Arduino yang dikontrol penuh oleh mikrokontroler ATmega328, banyak hal yang bisa dilakukan itu semua tergantung kreatifitas anda. Arduino dapat disambungkan dan mengontrol led, beberapa led, bahkan banyak led, motor DC, relay, servo, modul dan sensor-sensor, serta banyak lagi komponen lainnya. Platform Arduino sudah sangat popular sekarang ini, sehingga tidak akan kesulitan untuk memperoleh informasi, tutorial dan berbagai eksperimen yang menarik yang tersedia banyak di internet. Dengan Arduino, dunia hardware bisa bekerja sama dengan dunia software. Anda bisa mengontrol hardware dari software, dan hardware bisa memberikan data kepada software. Semuanya bisa dilakukan dengan relatif mudah, murah, dan menyenangkan.\n" +
                      "\n" +
                      "\tArduino juga merupakan platform hardware terbuka yang ditujukan kepada siapa saja yang ingin membuat purwarupa peralatan elektronik interaktif berdasarkan hardware dan software yang fleksibel dan mudah digunakan. Mikrokontroler diprogram menggunakan bahasa pemrograman arduino yang memiliki kemiripan syntax dengan bahasa pemrograman C. Karena sifatnya yang terbuka maka siapa saja dapat mengunduh skema hardware arduino dan membangunnya.\n" +
                      "\n" +
                      "\tArduino menggunakan keluarga mikrokontroler ATMega yang dirilis oleh Atmel sebagai basis, namun ada individu/perusahaan yang membuat clone arduino dengan menggunakan mikrokontroler lain dan tetap kompatibel dengan arduino pada level hardware. Untuk fleksibilitas, program dimasukkan melalui bootloader meskipun ada opsi untuk mem-bypass bootloader dan menggunakan downloader untuk memprogram mikrokontroler secara langsung melalui port ISP.\n",
              R.drawable.putih1,
              "\n",
              R.drawable.putih1,
              "\n",
              R.drawable.putih1,
              "\n",
              R.drawable.putih1,
              "\n"
          )
        )
        versionList.add(
            Versions(
                "Jenis-Jenis Arduino",
                "\tBerikut jenis-jenis Arduino:",
                R.drawable.uno1,
                "1. Arduino Uno\n" +
                        "Jenis Arduino yang paling sering digunakan. Terutama untuk pemula atau media pembelajaran sangat disarankan menggunakan Arduino Uno. Selain banyaknya referensi yang membahasa jenis arduino yang satu ini, juga karena chip mikrokontroller yang digunakan memakai jenis DIL / DIP (Dual In-Line Package). Sangat memudahkan pengguna mengganti chip mikrokontroller, jika terjadi kerusakan, dan juga kompatible dengan banyak Shield tambahan seperti, Ethernet, SD-CARD, GSM,dll. Versi yang terakhir adalah Arduino uno R3 (Revisi 3), menggunakan chip mikrokontroller Atmel AVR ATMEGA328, memiliki 14 pin I/O digital (6 diantaranya pin PWM), 6 pin input analog, . Komunikasi USB A to USB B (USB Printer) memudahkan komunikasi hardware dengan perangkat komputer / laptop.\n",
                R.drawable.leonardo,
                "2. Arduino Leonardo\n" +
                        "\tArduino Leonardo adalah salah satu jenis yang lumayan unik, yah benar namanya seperti nama orang Leonardo, tapi Arduino tipe ini sangat berbeda dengan Arduino uno yang diatas, meskipun secara fisik hampir mirip, Arduino Leonardo adalah papan mikrokontroler yang memakai IC ATmega32u4 sebagai kontrollernya berbeda dengan Arduino Uno yang memakai IC Atmega328p.\n" +
                        "\n" +
                        "\tSelain itu Arduino Leonardo ini memiliki 20 pin input/output digital (dimana 7 dapat digunakan sebagai output PWM dan 12 sebagai input analog), osilator kristal 16 MHz, input koneksi micro USB tipe b, colokan DC 9V, header ICSP, dan tombol reset. Berbeda dengan tipe Arduino yang lainnya dengan tipe Arduino Leonardo yang memakai IC ATmega32u4 ini anda dapat menggunakannya sebagai koneksi Mouse ataupun Keyboard di komputer anda, tentu saja anda harus membuat kodenya dan hardware tombol tambahannya terlebih dahulu sebelum anda gunakan sebagai mouse ataupun keyboard external.\n",
                R.drawable.due,
                "3. Arduino Due\n" +
                        "\tArduino Due adalah varian papan pengembang mikrokontroler Arduino yang menggunakan CPU Atmel SAM3X8E ARM Cortex-M3. Dengan demikian, Arduino Due adalah Arduino Development Board pertama yang didasarkan pada mikrokontroler ARM 32-bit. Arduino Due yang dirilis tahun 2012 dengan CPU 32-bit ARM Cortex- M3 sama sekali berbeda dari Arduino Duemilanove dengan MCU 8-bit ATmega168 yang dirilis tahun 2009. Miskonsepsi yang sering terjadi karena \"Due\" disalah-artikan sebagai.\n" +
                        "\n" +
                        "\tSingkatan dari Duemilanove.\tDue adalah advanced board baru dengan kemampuan jauh di atas varian   Arduino   lainnya,   Duemilanove    adalah entry- level board lama yang merupakan \"pendahulu\" Arduino Uno\n" +
                        "\n" +
                        "\tPapan pengembang ini memiliki pin masukan/keluaran digital sebanyak 54 pin (12 di antaranya berkemampuan PWM), 12 pin masukan analog, 4 UART / hardware serial port, pencacah-waktu / clock berfrekuensi 84 MHz, koneksi dengan kemampuan USB OTG, 2 DAC (digital-to-analog converter), 2 TWI (Two Wire Interface, kompatibel dengan protokol I2C dari Phillips), soket jack catu daya standar (5,5/2,1mm), konektor SPI header, konektor JTAG header, tombol reset, dan sebuah tombol hapus (erase button).\n",
                R.drawable.mega,
                "4. Arduino Mega 2560\n" +
                        "\tArduino Mega 2560 Rev3, sesuai dengan namanya Mega yang berarti besar, Arduino Mega 2560 ini memiliki ukuran yang paling besar dari jenis yang lainnya, Arduino Mega 2560 mengadopsi chip miktrokontroller ATmega2560 yang mempunyai 54 pin input/output (dimana 15 pin diantaranya dapat digunakan sebagai output PWM), 16 analog input, 4 UARTs (serial port), 16MHz crystal , Koneksi USB, Colokan Power 9v, dan ICSP pin. Arduino Mega 2560 ini bisa sering digunakan pada project skala besar, seperti Print 3d dan project robot lainnya yang membutuhkan banyak serial pin input/output.\n"
            )
        )
        versionList.add(
            Versions(
                "Bagian-Bagian Arduino",
                "\tBerikut bagian-bagian arduino:",
                R.drawable.bagiannn,
                "1. Power USB, fungsi dari power usb pada modul Arduino adalah sebagai berikut:\n" +
                        "- Media pemberi tegangan listrik ke Arduino\n" +
                        "- Media tempat memasukkan program dari komputer ke Arduino\n" +
                        "- Sebagai media untuk komunikasi serial antara komputer dan Arduino R3 maupun sebaliknya.\n" +
                        "\n" +
                        "2. Crystal Oscillator, fungsi crystal oscillator adalah sebagai jantung Arduino yang membuat dan mengirimkan detak ke mikrokontroler agar beroperasi setiap detaknya.\n" +
                        "\n" +
                        "3. Voltage Regulator, berfungsi menstabilkan tegangan listrik yang masuk ke Arduino.\n" +
                        "\n" +
                        "4. Power Jack, fungsi dari power jack pada modul Arduino adalah sebagai media pemberi tegangan listrik ke Arduino apabila tak ingin menggunakan Power USB.\n" +
                        "\n" +
                        "5. Pin Reset, berfungsi untuk mereset Arduino agar program dimulai dari awal. Cara penggunannya yaitu dengan menghubungkan pin reset ini langsung ke ground.\n" +
                        "\n" +
                        "6. Pin Tegangan 3,3 Volt, berfungsi sebagai pin positif untuk komponen yang menggunakan tegangan 3,3 volt.\n" +
                        "\n" +
                        "7. Pin Tegangan 5 Volt, berfungsi sebagai pin positif untuk komponen yang menggunakan tegangan 5 volt. Pin 5 volt sering juga disebut pin VCC.\n" +
                        "\n" +
                        "8. Pin Ground (GND), fungsi pin GND adalah sebagai pin negatif pada tiap komponen yang dihubungkan ke Arduino.\n" +
                        "\n" +
                        "9. Pin Penambah Tegangan (VIN), berfungsi sebagai media pemasok listrik tambahan dari luar sebesar 5 volt bila tak ingin menggunakan Power USB atau Power Jack.\n" +
                        "\n" +
                        "10. Pin Analog, berfungsi membaca tegangan dan sinyal analog dari berbagai jenis sensor untuk diubah ke nilai digital.\n" +
                        "\n" +
                        "11. Main Microcontroller, berfungsi sebagai otak yang mengatur pin-pin pada Arduino.\n" +
                        "\n" +
                        "12. Tombol Reset, komponen pendukung Arduino yang berfungsi untuk mengulang program dari awal dengan cara menekan tombol.\n" +
                        "\n" +
                        "13. Pin ICSP (In-Circuit Serial Programming), berfungsi untuk memprogram mikrokontroler seperti Atmega328 melalui jalur USB Atmega16U2.\n" +
                        "\n" +
                        "14. Lampu Indikator Power, berfungsi sebagai indikator bahwa Arduino sudah mendapatkan suplai tegangan listrik yang baik.\n" +
                        "\n" +
                        "15. Lampu TX (transmit), berfungsi sebagai penanda bahwa sedang terjadi pengiriman data dalam komunikasi serial.\n" +
                        "\n" +
                        "16. Lampu RX (receive), berfungsi sebagai penanda bahwa sedang terjadi penerimaan data dalam komunikasi serial.\n" +
                        "\n" +
                        "17. Pin Input/Output Digital, berfungsi untuk membaca nilai logika 1 dan 0 atau mengendalikan komponen output lain seperti LED, relay, atau sejenisnya. Pin ini termasuk paling banyak digunakan saat membuat rangkaian.\n" +
                        "Untuk pin yang berlambang “~” artinya dapat digunakan untuk membangkitkan PWM (Pulse With Modulation) yang fungsinya bisa mengatur tegangan output. Biasanya digunakan untuk mengatur kecepatan kipas atau mengatur terangnya cahaya lampu.\n" +
                        "\n" +
                        "18. Pin AREF (Analog Reference), fungsi pin Arduino Uno yang satu ini untuk mengatur tegangan referensi eksternal yang biasanya berada di kisaran 0 sampai 5 volt.\n" +
                        "\n" +
                        "19. Pin SDA (Serial Data), berfungsi untuk menghantarkan data dari modul I2C atau yang sejenisnya.\n" +
                        "\n" +
                        "20. Pin SCL (Serial Clock), berfungsi untuk menghantarkan sinyal waktu (clock) dari modul I2C ke Arduino\n",
                R.drawable.putih1,
                "\n",
                R.drawable.putih1,
                "\n",
                R.drawable.putih1,
                "\n"
            )
        )
    }


}
