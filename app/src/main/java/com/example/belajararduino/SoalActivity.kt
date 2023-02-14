package com.example.belajararduino

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.ktx.Firebase
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.collections.ArrayList

class SoalActivity : AppCompatActivity() {


    private lateinit var questionsList: ArrayList<SoalMode>
//    private var questionList: mutablelistof<>
    private var index: Int = 0
    private lateinit var questionModel: SoalMode

    private var correctAnswerCount: Int = 0
    private var wrongAnswerCount: Int = 0

    lateinit var imgNext: ImageView
    lateinit var countDown: TextView
    lateinit var questions: TextView
    lateinit var option1: Button
    lateinit var option2: Button
    lateinit var option3: Button
    lateinit var option4: Button
    lateinit var option5: Button
    private lateinit var databaseReference: DatabaseReference



    private var backPressedTime: Long = 0
    private var backToast: Toast? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soal)

        databaseReference= Firebase.database.reference
        databaseReference=FirebaseDatabase.getInstance().getReference("soal")

        countDown = findViewById(R.id.countdown)
        imgNext = findViewById(R.id.imgNext)
        questions = findViewById(R.id.questions)
        option1 = findViewById(R.id.option1)
        option2 = findViewById(R.id.option2)
        option3 = findViewById(R.id.option3)
        option4 = findViewById(R.id.option4)
        option5 = findViewById(R.id.option5)



        Log.d("adakah?","inimije ehh")
        databaseReference.addValueEventListener(object :ValueEventListener{
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                questionsList = arrayListOf<SoalMode>()
                Log.d("anjay", "Hasillnya:${dataSnapshot.exists()}")
//                if (dataSnapshot.exists()) {
                    questionsList.clear()
                    for (item in dataSnapshot.child("soal").children) {
                        val soal = item.getValue(SoalMode::class.java)
                        Log.d("data", "Hasilnya: ${soal?.answer}")
                        questionsList.add(soal!!)
                    }
                    questionModel = questionsList[index]
                    setAllQuestions()

//                }
            }
            override fun onCancelled(error: DatabaseError) {
                Log.w(ContentValues.TAG, "loadPost:onCancelled", error.toException())
            }
        })



        countdown()
        nextSoal()
//        randomQuestion()


    }

    fun countdown(){
        var duration:Long=TimeUnit.SECONDS.toMillis(30)

        object :CountDownTimer( duration,1000) {
            override fun onTick(millisUntilFinished: Long) {
                var sDuration:String= String.format(Locale.ENGLISH,
                "%02d:%02d",
                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished)-TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)))

                    countDown.text = sDuration
            }
            override fun onFinish() {
                if (index<questionsList.size){
                    gameResult()
                }else{
                    cancel()
                }

            }
            }.start()
    }

//    private fun randomQuestion(){
//        questionsList.shuffle()
//        index = 0
//        setAllQuestions()
//    }
    private fun nextSoal(){
        imgNext.setOnClickListener {
            index++
                if (index<questionsList.size){
                    questionModel=questionsList[index]
                    setAllQuestions()
                    resetBackground()
                    enableButton()
                }
                else{
                    gameResult()

                }

        }
    }
    private fun correctAns(option: Button){
        option.background=resources.getDrawable(R.drawable.right_bg)
            correctAnswerCount++
    }
    private fun wrongAns(option:Button){

        option.background=resources.getDrawable(R.drawable.wrong_bg)

            wrongAnswerCount++
    }

    private fun gameResult(){
        var intent=Intent(this,HasilActivity::class.java)

        intent.putExtra("correct",correctAnswerCount.toString())
        intent.putExtra("total",questionsList.size.toString())

        startActivity(intent)
    }

    private fun setAllQuestions() {
        questions.text=questionModel.question
        option1.text=questionModel.option1
        option2.text=questionModel.option2
        option3.text=questionModel.option3
        option4.text=questionModel.option4
        option5.text=questionModel.option5
    }
    private fun enableButton(){
        option1.isClickable=true
        option2.isClickable=true
        option3.isClickable=true
        option4.isClickable=true
        option5.isClickable=true
    }
    private fun disableButton(){
        option1.isClickable=false
        option2.isClickable=false
        option3.isClickable=false
        option4.isClickable=false
        option5.isClickable=false
    }
    private fun resetBackground(){
        option1.background=resources.getDrawable(R.drawable.option_bg)
        option2.background=resources.getDrawable(R.drawable.option_bg)
        option3.background=resources.getDrawable(R.drawable.option_bg)
        option4.background=resources.getDrawable(R.drawable.option_bg)
        option5.background=resources.getDrawable(R.drawable.option_bg)
    }
    fun option1Clicked(view:View) {
        disableButton()
            if (questionModel.option1 == questionModel.answer) {
                option1.background = resources.getDrawable(R.drawable.right_bg)

                correctAns(option1)

            } else {
                wrongAns(option1)
            }
    }

    fun option2Clicked(view:View) {
        disableButton()
            if (questionModel.option2 == questionModel.answer) {
                option2.background = resources.getDrawable(R.drawable.right_bg)

                correctAns(option2)

            } else {
                wrongAns(option2)
            }
    }
    fun option3Clicked(view:View) {
        disableButton()
            if (questionModel.option3 == questionModel.answer) {

                option3.background = resources.getDrawable(R.drawable.right_bg)


                correctAns(option3)


            } else {
                wrongAns(option3)
            }
    }
    fun option4Clicked(view:View) {
        disableButton()
            if (questionModel.option4 == questionModel.answer) {
                option4.background = resources.getDrawable(R.drawable.right_bg)


                correctAns(option4)

            } else {
                wrongAns(option4)
            }
    }
    fun option5Clicked(view:View) {
        disableButton()
            if (questionModel.option5 == questionModel.answer) {
                option5.background = resources.getDrawable(R.drawable.right_bg)


                correctAns(option5)

            } else {
                wrongAns(option5)
            }
    }

    override fun onBackPressed() {
        if(backPressedTime + 2000 >System.currentTimeMillis()){
            backToast?.cancel()
            finish()
        }
        else{
            backToast = Toast.makeText(baseContext,"TEKAN 2 KALI UNTUK KELUAR", Toast.LENGTH_SHORT)
            backToast?.show()
            countdown()
        }
        backPressedTime = System.currentTimeMillis()

    }

}