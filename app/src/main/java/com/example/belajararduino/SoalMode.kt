package com.example.belajararduino

data class SoalMode (
 val question : String?="",
 val option1 : String?="",
 val option2 : String? ="",
 val option3 : String? ="",
 val option4 : String? ="",
 val option5 : String? ="",
 val answer : String? =""){
 constructor(): this("","","","","","",""){}

}



