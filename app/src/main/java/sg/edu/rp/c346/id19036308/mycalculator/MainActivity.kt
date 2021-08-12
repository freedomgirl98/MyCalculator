package sg.edu.rp.c346.id19036308.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var textViewText = ""
    var number = 0.0
    var plus = false
    var minus = false
    var times = false
    var divide = false

    //    var result = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = "0"
        btnAC.setOnClickListener {
            tv.text = ""
            textViewText = ""
        }


        btnPlus.setOnClickListener {
            plus = true
            number = textViewText.toDouble()
            tv.text = ""
            textViewText = ""
            times = false
            minus = false
            divide = false
        }
        btnEqual.setOnClickListener {
            if (plus == true){
                tv.text = (number + textViewText.toDouble()).toString()
            } else if (minus == true) {
                tv.text = (number - textViewText.toDouble()).toString()
            } else if (divide == true) {
                tv.text = (number / textViewText.toDouble()).toString()
            } else if (times == true) {
                tv.text = (number * textViewText.toDouble()).toString()
            }


        }
        btnSub.setOnClickListener {
            minus = true
            number = textViewText.toDouble()
            tv.text = ""
            textViewText = ""
            times = false
            plus = false
            divide = false
        }

        btnMultiply.setOnClickListener {
            times = true
            number = textViewText.toDouble()
            tv.text = ""
            textViewText = ""
            plus = false
            minus = false
            divide = false
        }
        btnDivide.setOnClickListener {
            divide = true
            number = textViewText.toDouble()
            tv.text = ""
            textViewText = ""
            times = false
            minus = false
            plus = false
        }
    }

    fun btnOnClick(view: View) {// numbers

////        var textViewText :String=tv.text.toString()
//        var textViewText = ""
//        var buClickValue:String=etShowNumber.text.toString()
        val btnNumSelected = view as Button
        when (btnNumSelected.id) {
            btn0.id -> textViewText += "0"
            btn1.id -> textViewText += "1"
            btn2.id -> textViewText += "2"
            btn3.id -> textViewText += "3"
            btn4.id -> textViewText += "4"
            btn5.id -> textViewText += "5"
            btn6.id -> textViewText += "6"
            btn7.id -> textViewText += "7"
            btn8.id -> textViewText += "8"
            btn9.id -> textViewText += "9"
            btnDot.id -> textViewText += "."
        }
        tv.text = textViewText


    }

//    fun btnOperatorOnClick(view: View) {
//        var operatorText: String = tv.text.toString()
//        val btnOperatorSelected = view as Button
//        when (btnOperatorSelected.id) {
//            btnDivide.id -> operatorText = "/"
//            btnMultiply.id -> operatorText = "x"
//            btnPlus.id -> operatorText = "+"
//            btnSub.id -> operatorText = "-"
//        }
//        tv.text = operatorText
//    }
}