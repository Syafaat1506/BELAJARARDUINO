package com.example.belajararduino

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class BahasaActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bahasa)
        val kembali = findViewById<ImageView>(R.id.imgBack10)
        kembali.setOnClickListener {
            Intent(this,MateriActivity::class.java).also {
                startActivity(it)
            }
        }

        val tvscroll = findViewById<TextView>(R.id.tvscroll)
        tvscroll.text="\tBahasa pemrograman Arduino pada dasarnya menggunakan bahasa pemograman C. Bahasa C sendiri merupakan bahasa tingkat tinggi yang sangat populer dan banyak digunakan oleh para programmer. Dengan demikian aturan penulisan dan penggunaan dari bahasa Arduino akan sama dengan bahasa C. \n"

        val tvB = findViewById<TextView>(R.id.tvB)
        tvB.text="\tSrtuktur dasar bahasa pemrograman Arduino sangat sederhana hanya terdiri dari dua bagian. Dua bagian tersebut dapat juga disebut sebagai fungsi utama yaitu setup() dan loop(). \n"

        val tvC = findViewById<TextView>(R.id.tvC)
        tvC.text="\tvoid setup( )\n" +
                "\t{\n" +
                "    //Statement;\n" +
                "\t}\n" +
                "\n" +
                "\tvoid loop( )\n" +
                "\t{\n" +
                "    //Statement;\n" +
                "\t}\n"
        val tvCa = findViewById<TextView>(R.id.tvCa)
        tvCa.text="\tdimana setup() adalah bagian untuk inisialisasi yang hanya dijalankan sekali di awal program, sedangkan loop() untuk mengeksekusi bagian program yang akan dijalankan berulang-ulang untuk selamanya. \n"
        val tvDb = findViewById<TextView>(R.id.tvDb)
        tvDb.text ="\tFungsi setup() hanya di panggil satu kali ketika program pertama kali dijalankan. Ini digunakan untuk pendefinisikan mode pin atau memulai komunikasi serial. Fungsi setup() harus di ikut sertakan dalam program walaupun tidak ada statement yang dijalankan. \n"
        val tvDc = findViewById<TextView>(R.id.tvDc)
        tvDc.text="\tvoid setup()\n" +
                "\t{\n" +
                "    pinMode(13,OUTPUT); //mengset ‘pin’ 13 sebagai output\n" +
                "\t}\n"
        val tvEb = findViewById<TextView>(R.id.tvEb)
        tvEb.text="\tSetelah menjalankan fungsi setup() maka secara langsung akan melakukan fungsi loop() secara berurutan dan melakukan instruksi-instruksi yang ada dalam fungsi loop() terus menerus. \n"
        val tvEc = findViewById<TextView>(R.id.tvEc)
        tvEc.text="\tvoid loop()\n" +
                "\t{\n" +
                "     digitalWrite(13, HIGH);  //nyalakan ‘pin’ 13\n" +
                "     delay(1000);      //pause selama 1 detik\n" +
                "     digitalWrite(13, LOW);  //matikan ‘pin’ 13\n" +
                "     delay(1000);      ///pause selama 1 detik\n" +
                "\t}\n"

        val tvFb = findViewById<TextView>(R.id.tvFb)
        tvFb.text="\tFunction (fungsi) adalah blok pemrograman yang mempunyai nama dan mempunyai statement yang akan di eksekusi ketika function tersebut di panggil. Fungsi void setup() dan void loop() telah di bahas di atas dan pembuatan fungsi yang lain akan di bahas selanjutnya. \n"
        val tvFc = findViewById<TextView>(R.id.tvFc)
        tvFc.text="\ttype functionName(parameters)\n" +
                "\t{\n" +
                "    //Statement;\n" +
                "\t}\n" +
                "Contoh: \n" +
                "\tint delayVal() \n" +
                "\t{ \n" +
                "    int v; //membuat variable ‘v’ bertipe integer \n" +
                "    v = analogRead(pot); //baca harga potentiometer \n" +
                "    v /= 4; //konversi 0-1023 ke 0-255 \n" +
                "    return v; //return nilai v \n" +
                "\t}\n"
        val tvFd = findViewById<TextView>(R.id.tvFd)
        tvFd.text="\tPada contoh di atas fungsi tersebut memiliki nilai balik int (integer), karena kalau tidak menghendaki adanya nilai balik maka type function harus void. \n"

        val tvGb = findViewById<TextView>(R.id.tvGb)
        tvGb.text="\tCurly brace mendefinisikan awal dan akhir dari sebuah blok fungsi. Apabila ketika memprogram dan progremer lupa memberi curly brace tutup maka ketika di compile akan terdapat laporan error. \n"
        val tvGc = findViewById<TextView>(R.id.tvGc)
        tvGc.text="\ttype function()\n" +
                "\t{\n" +
                "    statements;\n" +
                "\t}\n"

        val tvHb = findViewById<TextView>(R.id.tvHb)
        tvHb.text="\tSemua statement yang di tulis dalam block comments tidak akan di eksekusi dan tidak akan di compile sehingga tidak mempengaruhi besar program yang di buat untuk di masukan dalam board arduino. \n"
        val tvHc = findViewById<TextView>(R.id.tvHc)
        tvHc.text="\tint x = 13;   //declares variable 'x' as the integer 13\n"

        val tvIb = findViewById<TextView>(R.id.tvIb)
        tvIb.text="\tSemicolon harus di berikan pada setiap statement program yang kita buat ini merupakan pembatas setiap statement program yang di buat. \n"
        val tvIc = findViewById<TextView>(R.id.tvIc)
        tvIc.text="\t/* this is an enclosed block comment\n" +
                "     don't forget the closing comment\n" +
                "     they have to be balanced!\n" +
                "\t*/\n"

        val tvJb = findViewById<TextView>(R.id.tvJb)
        tvJb.text="\tSama halnya dengan block comments, line coments pun sama hanya saja yang dijadikan komen adalah perbaris. \n"
        val tvJc = findViewById<TextView>(R.id.tvJc)
        tvJc.text="\t //this is a single line comment\n"

        val tvKb=findViewById<TextView>(R.id.tvKb)
        tvKb.text="\tVariable adalah sebuah penyimpan nilai yang dapat digunakan dalam program. Variable dapat di rubah sesuai dengan instruksi yang kita buat. Ketika mendeklarisikan variable harus di ikut sertakan type variable serta nilai awal variable. \n"
        val tvKc=findViewById<TextView>(R.id.tvKc)
        tvKc.text="\ttype variableName = 0;\n" +
                "Contoh: \n" +
                "\t  //mendefinisikan sebuah variable bernama inputVariable dengan nilai awal 0\n" +
                "\t  int inputVariable = 0;\n" +
                "\n" +
                "\t  //menyimpan nilai yang ada di analog pin 2 ke inputVariable\n" +
                "\t  inputVariable = analogRead(2);\n"

        val tvlb=findViewById<TextView>(R.id.tvlb)
        tvlb.text="\tSebuah variable dapat di deklarasikan pada awal program sebelum void setup(), secara local di dalam sebuah function, dan terkadang di dalam sebuah block statement pengulangan. Sebuah variable global hanya satu dan dapat digunakan pada semua block function dan statement di dalam program. Variable global di deklarasikan pada awal program sebelum fungsi setup(). Sebuah variable local di deklarasikan di setiap block function atau di setiap block statement pengulangan dan hanya dapat digunakan pada block yang bersangkutan saja. Contoh penggunaan: \n"
        val tvlc =findViewById<TextView>(R.id.tvlc)
        tvlc.text="\tint value; //‘value’ adalah variable global dan dapat di gunakan pada semua block funtion \n" +
                " \n" +
                "\tvoid setup() \n" +
                "\t{ \n" +
                "    //no setup needed \n" +
                "\t} \n" +
                "\n" +
                "\tvoid loop() \n" +
                "\t{ \n" +
                "    for (int i=0; i<20 code=\"\" dalam=\"\" dapat=\"\" di=\"\" f=\"\" float=\"\" gunakan=\"\" hanya=\"\" i=\"\" local=\"\" pengulangan=\"\" saja=\"\" sebagai=\"\" variable=\"\">\n" +
                "\n"+
                "\n"

        val tvmb=findViewById<TextView>(R.id.tvmb)
        tvmb.text="\ttype byte dapat menyimpan 8-bit nilai angka bilangan asli tanapa koma. Byte memiliki range 0 – 255. \n"
        val tvmc=findViewById<TextView>(R.id.tvmc)
        tvmc.text="\t  byte biteVariable = 160; //mendeklarasikan ‘biteVariable’ sebagai type byte\n"
        val tvnb=findViewById<TextView>(R.id.tvnb)
        tvnb.text="\tInteger merupakan tipe data utama untuk menyimpan nilai bilangan bulat tanpa koma. Penyimpanan integer sebesar 16-bit dengan range 32.767 sampai -32.768. \n"
        val tvnc=findViewById<TextView>(R.id.tvnc)
        tvnc.text="\tint integerVariable = 1500; //mendeklarasikan ‘integerVariable’ sebagai type integer\n"

        val tvob=findViewById<TextView>(R.id.tvob)
        tvob.text="\tPerluasan ukuran untuk long integer, penyimpanan long integer sebesar 32-bit dengan range 2.147.483.647 sampai -2.147.483.648. \n"
        val tvoc=findViewById<TextView>(R.id.tvoc)
        tvoc.text="\tlong longVariable = 900000; //mendeklarasikan ‘longVariable’ sebagai type long\n"

        val tvpb=findViewById<TextView>(R.id.tvpb)
        tvpb.text="\tFloat adalah tipe data yang dapat menampung nilai decimal, float merupakan penyimpan yang lebih besar dari integer dan dapat menyimpan sebesar 32-bit dengan range 3.4028235E+38 sampai -3.4028235E+38. \n"
        val tvpc=findViewById<TextView>(R.id.tvpc)
        tvpc.text="\t  float floatVariable = 3.14; //mendeklarasikan ‘floatVariable’ sebagai type float\n"

        val tvqb=findViewById<TextView>(R.id.tvqb)
        tvqb.text="\tArray adalah kumpulan nilai yang dapat di akses dengan nomor index, nilai yang terdapat dalam array dapat di panggil dengan cara menuliskan nama array dan nomor index. Array dengan index 0 merupakan nilai pertama dari array. Array perlu di deklarasikan dan kalau perlu di beri nilai sebelum digunakan. \n"
        val tvqc=findViewById<TextView>(R.id.tvqc)
        tvqc.text="\t  int myArray[] = {value0, value1, value2 . . . } \n" +
                "Contoh penggunaan aray: \n" +
                "\tint myArray[] = {2,4,6,8,10}\n" +
                "\tx = myArray[5]; //x sekarang sama dengan 10\n"

        val tvrb=findViewById<TextView>(R.id.tvrb)
        tvrb.text="\toperator aritmatik terdiri dari penjumlahan, pengurangan, pengkalian, dan pembagian. \n" +
                "\tDalam menggunakan operan aritmatik harus hati-hati dalam menentukan tipe data yang digunakan jangan sampai terjadi overflow range data. \n"
        val tvrc=findViewById<TextView>(R.id.tvrc)
        tvrc.text="  y = y + 3;\n" +
                "  x = x - 8;\n" +
                "  i = i * 5;\n" +
                "  r = r / 9;\n"

        val tvsb=findViewById<TextView>(R.id.tvrb)
        tvsb.text="\t Compound assignments merupakan kombinasi dari aritmatic dengan sebuah variable. Ini biasanya dipakai pada pengulangan. \n"
        val tvsc=findViewById<TextView>(R.id.tvsc)
        tvsc.text="  x ++; //sama seperti x = x + 1 atau menaikan nilai x sebesar 1  \n" +
                "  x --; //sama seperti x = x - 1 atau mengurangi nilai x sebesar 1  \n" +
                "  x += y; //sama seperti x = x + y  \n" +
                "  x -= y; //sama seperti x = x – y\n" +
                "  x *= y; //sama seperti x = x * y\n" +
                "  x /= y; //sama seperti x = x / y\n"
        val tvtb=findViewById<TextView>(R.id.tvtb)
        tvtb.text="\tStatement ini membadingkan dua variable dan apabila terpenuhi akan bernilai 1 atau true. Statement ini banyak digunakan dalam operator bersyarat. \n"
        val tvtc=findViewById<TextView>(R.id.tvtc)
        tvtc.text="  x == y; //x sama dengan y\n" +
                "  x != y; //x tidak sama dengan y\n" +
                "  x < y;  //x leboh kecil dari y\n" +
                "  x > y;  //x lebih besar dari y\n" +
                "  x <= y; //x lebih kecil dari sama dengan y\n" +
                "  x >= y; //x lebih besar dari sama dengan y\n"

        val tvub=findViewById<TextView>(R.id.tvub)
        tvub.text="\tOperator logical digunakan untuk membandingkan dua expresi dan mengembalikan nilai balik benar atau salah tergantung dari operator yang digunakan. Terdapat 3 operator logical AND,OR, dan NOT, yang biasanya digunakan pada if statement.\n"
        val tvuc=findViewById<TextView>(R.id.tvuc)
        tvuc.text="Contoh penggunaan:\n" +
                "\n" +
                "Logical AND \n" +
                "  if(x>0 && x<5 apabila=\"\" benar=\"\" bernilai=\"\" code=\"\" kedua=\"\" operator=\"\" pembanding=\"\" terpenuhi=\"\">\n" +
                "\n"+
                "Logical OR \n" +
                "  if(x>0 || y>0)  //bernilai benar apabila salah satu dari operator pembanding terpenuhi\n" +
                "\n"+
                "Logical NOT \n" +
                "  if(!x > 0)    //benilai benar apabila ekspresi operator salah\n"
        val tvaab=findViewById<TextView>(R.id.tvaab)
        tvaab.text="\tArduino mempunyai beberapa variable yang sudah di kenal yang kita sebut konstanta. Ini membuat memprogram lebih mudah untuk di baca. Konstanta di kelasifikasi berdasarkan group. \n"

        val tvvb=findViewById<TextView>(R.id.tvvb)
        tvvb.text="Merupakan konstanta Boolean yang mendifinisikan logic level. False dapat didefinisikan sebagai 0 dan True sebagai 1. \n"
        val tvvc=findViewById<TextView>(R.id.tvvc)
        tvvc.text="\tif(b == TRUE);\n" +
                "\t{\n" +
                "    //doSomething\n" +
                "\t}\n"
        val tvwb=findViewById<TextView>(R.id.tvwb)
        tvwb.text="\tKonstanta ini digunakan untuk menentukan kondisi pin pada level HIGH atau LOW ketika membaca dan menulis dari/ke pin digital. HIGH didefinisikan sebagai logic 1, ON, atau 5 volt sedangkan LOW sebagai logic 0, OFF, atau 0 volt. \n"
        val tvwc=findViewById<TextView>(R.id.tvwc)
        tvwc.text="\t digitalWrite(13, HIGH);\n"
        val tvxb=findViewById<TextView>(R.id.tvxb)
        tvxb.text="\tKonstanta ini digunakan dengan fungsi pinMode() untuk mendifinisikam mode pin digital, sebagai INPUT atau OUTPUT. \n"
        val tvxc=findViewById<TextView>(R.id.tvxc)
        tvxc.text="\t pinMode(13, OUTPUT);\n"
        val tvya=findViewById<TextView>(R.id.tvya)
        tvya.text="H. Flow control\n" +
                "1. if\n"
        val tvyb=findViewById<TextView>(R.id.tvyb)
        tvyb.text="\tOperator if mengetes sebuah kondisi apakah sudah tercapai/benar atau belum, dicontohkan seperti pengetesan nilai analog apakah sudah berada di bawah nilai yang kita kehendaki atau belum, apabila terpenuhi maka akan mengeksekusi baris program yang ada dalam brackets kalau tidak terpenuhi maka akan melewati baris program yang ada dalam brackets. \n"
        val tvyc=findViewById<TextView>(R.id.tvyc)
        tvyc.text="\t if(someVariable ?? value)\n" +
                "\t{\n" +
                "    //DoSomething;\n" +
                "\t}\n"
        val tvzb=findViewById<TextView>(R.id.tvzb)
        tvzb.text="\tOperator if…else mengetes sebuah kondisi apabila tidak sesuai dengan kondisi maka akan mengeksekusi baris program yang ada di else. \n"
        val tvzc=findViewById<TextView>(R.id.tvzc)
        tvzc.text="\t if(inputPin == HIGH)\n" +
                "\t{\n" +
                "    //Laksanakan rencana A;\n" +
                "\t}\n" +
                "\telse\n" +
                "\t{\n" +
                "    //Laksanakan rencana B;\n" +
                "\t}\n"
        val tva2=findViewById<TextView>(R.id.tva2)
        tva2.text="\tOperator for digunakan untuk mengulang blok statement di dalam bracket, beberapa kali sesuai dengan jumlah yang ditentukan. Setiap for() loop mempunyai tiga parameter dan dipisahkan menggunakan titik koma (;): \n"
        val tva3=findViewById<TextView>(R.id.tva3)
        tva3.text="\t for(initialization; condition; expression)\n" +
                "\t{\n" +
                "    //doSomethig;\n" +
                "\t}\n" +
                "Contoh penggunaan: \n" +
                "\t for(index=0; index<=3; index++)\n" +
                "\t{\n" +
                "    counter++;\n" +
                "\t}\n"
        val tvb2=findViewById<TextView>(R.id.tvb2)
        tvb2.text="\tBoard Arduino mempunyai jumlah pin yang berlabel digital D0 - D13 sebanyak 14 dengan pengalamatnya 0 - 13. Namun apabila pin digital yang kita butuhkan masih kurang, kita masih bisa menambahnya dengan menggunakan pin yang berlabel analog A0 - A5 difungsikan sebagai pin digital input/output dengan pengalamatnya 14 - 19. Ada saat tertentu pin digital 0 dan 1 tidak bisa digunakan karena di pakai untuk komunikasi serial, sehingga harus hati-hati dalam pengalokasian I/O. \n"
        val tvc3=findViewById<TextView>(R.id.tvc3)
        tvc3.text="1. pinMode(pin, mode)\n" +
                "\n"+
                "\tBiasa digunakan dalam void setup() untuk mengkonfigurasi pin apakah sebagai INPUT atau OUTPUT. Arduino digital pins secara default di konfigurasi sebagai input sehingga untuk merubahnya harus menggunakan operator pinMode(pin, mode). \n"+
                "\t pinMode (pin, OUTPUT);  //mengeset pin sebagai output\n" +
                "\n" +
                "\tdigitalWrite(pin, HIGH);  //mengeset keluaran nilai HIGH (5 volt) pada pin\n" +
                "\n"+
                "2. digitalRead(pin)\n" +
                "\n" +
                "\tMembaca nilai dari pin yang kita kehendaki dengan hasil HIGH atau LOW.\n" +
                " \n" +
                "\t value = digitalRead(pin);  //mengeset ‘value’ sama dengan pin\n" +
                "\n"+
                "3. digitalWrite(pin, value)\n" +
                "\n" +
                "\tDigunakan untuk mengeset pin yang kita kehendaki dalam kondisi level tegangan HIGH atau LOW (nyala atau mati). Pin digital arduino mempunyai 14 ( 0 – 13 ). \n" +
                "\n" +
                "\t digitalWrite ( pin, HIGH );  //set pin ke kondisi HIGH\n"
        val tvd2=findViewById<TextView>(R.id.tvd2)
        tvd2.text="\tSelain pin digital Arduino dilengkapi juga oleh pin analog yang berfungsi untuk membaca input tegangan variabel antara 0 - 5 volt dengan resolusi ADC (Analog to Digital) 10-bit. Pada Arduino ada 6 pin yang berlabel analog input dengan pengalamatan A0 - A5. Tidak seperti pin digital yang dapat di fungsikan selain sebagai digital input dapat juga sebagai digital output, namun pada pin analog hanya dapat berfungsi sebagai analog input saja, apabila kamu ingin membuat Arduino mengeluarkan output tegangan analog kamu masih bisa melakukannya dengan menggunakan pin digital yang berlabel PWM (3,5,6,9,10,11), sejatinya tegangan analog yang dikeluarkan Arduino adalah dengan memanipulasi output digital secara pulsa. \n"
        val tvd3=findViewById<TextView>(R.id.tvd3)
        tvd3.text="1. analogRead(pin)\n" +
                "\n" +
                "\tMembaca nilai pin analog yang memiliki resolusi 10-bit. Fungsi ini hanya dapat bekerja pada analog pin (0 - 5). Hasil dari pembacaan berupa nilai integer dengan range 0 sampai 1023. \n" +
                "\n" +
                "\t value = analogRead(pin);  //mengeset ‘value’ sama dengan nilai analog pin\n" +
                "\n"+
                "2. analogWrite(pin, value)\n" +
                "\n" +
                "\tMengirimkan nilai analog dengan metoda Pulse Width Modulation (PWM) ke pin yang berlabel PWM (3,5,6,9,10,11). Nilai yang dapat digunakan adalah dari 0 - 255. \n" +
                "\n" +
                "\t analogWrite(pin, value);  //mengeluarkan nilai tegangan analog ke pin\n"
        val tve1=findViewById<TextView>(R.id.tve1)
        tve1.text="K. Time\n"
        val tve3=findViewById<TextView>(R.id.tve3)
        tve3.text="1. delay(ms)\n" +
                "\n"+
                "\tMenghentikan program untuk sesaat sesuai dengan yang di kehendaki, satuanya dalam millisecond. \n" +
                "\n"+
                "\t delay(1000);  //menunggu selama satu detik\n" +
                "\n"+
                "2. millis()\n" +
                "\n" +
                "\tMengembalikan nilai dalam millisecond dihitung sejak arduino board menyala. Penapungnya harus long integer. \n" +
                "\n" +
                "\t value = millis();  //set ‘value’ equal to millis()\n"
        val tvf1=findViewById<TextView>(R.id.tvf1)
        tvf1.text="L. Math\n"
        val tvf3=findViewById<TextView>(R.id.tvf3)
        tvf3.text="1. min(x,y)\n" +
                "\n"+
                "\tMembadingkan dua variable dan akan mengembalikan nilai yang paling kecil. \n" +
                "\n"+
                "\t   value = min(value, 100);  //set ‘value’ sebagai nilai yang paling kecil dari kedua nilai\n" +
                "\n"+
                "2. max(x,y)\n" +
                "\n" +
                "\tMembadingkan dua variable dan akan mengembalikan nilai yang paling besar. \n" +
                "\n" +
                "\t   value = max(value, 100);  //set ‘value’ sebagai nilai yang paling besar dari kedua nilai \n"
        val tvh1=findViewById<TextView>(R.id.tvh1)
        tvh1.text="M. Random\n"
        val tvh3=findViewById<TextView>(R.id.tvh3)
        tvh3.text="1. randomSeed(seed)\n" +
                "\n"+
                "\tMengeset sebuah nilai sebagai titik awal fungsi random(). \n" +
                "\n" +
                "\t   randomSeed(value);   //mengeset 'value' sebagai random seed\n" +
                "\n"+
                "2. random(max)\n" +
                "\n" +
                "3. random(min,max)\n" +
                "\n" +
                "\tMenghasilkan sebuah bilangan acak pada range yang di batasi oleh angka min dan max. \n" +
                "\n" +
                "\t   value = random(100, 200);  //mengeset 'value' ke nilai acak antara 100 - 200\n"
        val tvi3=findViewById<TextView>(R.id.tvi3)
        tvi3.text="1. Serial.begin(rate)\n" +
                "\n" +
                "\tStatement ini digunakan untuk mengaktifkan komunikasi serial dan mengatur baudrate. bauderate yang standar biasa digunakan dengan komputer adalah 9600bps. \n" +
                "\n" +
                "\t void setup()\n" +
                "\t{\n" +
                "    Serial.begin(9600);  //open serial port and set baudrate 9600 bps\n" +
                "\t}\n" +
                "\n"+
                "2. Serial.println(data)\n" +
                "\n" +
                "\tMengirimkan data ke serial port, di ikuti oleh karakter carriage return dan line feed (CR dan LF) atau yang kita kenal kode untuk Enter. Perintah ini mempunyai fungsi yang sama dengan Serial.print() namun lebih sering digunakan karena setelah selesai data di kirim di ikuti enter untuk data selanjutnya akan di tampilkan pada baris/alinea baru di bawahnya sehingga bisa memudahkan dalam pembacaan data pada serial monitor.\n" +
                "\n" +
                "\t   Serial.println(100);  //mengirimkan 100 dan diakhiri\n"
    }
}
