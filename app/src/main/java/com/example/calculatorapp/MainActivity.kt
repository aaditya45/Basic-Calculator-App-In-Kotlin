package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var calculator_press : EditText;
    var number1 : Float = 0.0f;
    var isPlus : Boolean = false;
    var isMinus : Boolean =false;
    var isDiv : Boolean =false;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator_press = findViewById(R.id.editText);
    }

    fun Manual (v : View){
        when(v.id){
            R.id.btn0 -> {
                var number = calculator_press.text.toString()+ "0";
                calculator_press.setText(number);
            }
            R.id.btn1 -> {
                var number = calculator_press.text.toString()+ "1";
                calculator_press.setText(number);
            }
            R.id.btn2 -> {
                var number = calculator_press.text.toString()+ "2";
                calculator_press.setText(number);
            }
            R.id.btn3 -> {
                var number = calculator_press.text.toString()+ "3";
                calculator_press.setText(number);
            }
            R.id.btn4 -> {
                var number = calculator_press.text.toString()+ "4";
                calculator_press.setText(number);
            }
            R.id.btn5 -> {
                var number = calculator_press.text.toString()+ "5";
                calculator_press.setText(number);
            }
            R.id.btn6 -> {
                var number = calculator_press.text.toString()+ "6";
                calculator_press.setText(number);
            }
            R.id.btn7 -> {
                var number = calculator_press.text.toString()+ "7";
                calculator_press.setText(number);
            }
            R.id.btn8 -> {
                var number = calculator_press.text.toString()+ "8";
                calculator_press.setText(number);
            }
            R.id.btn9 -> {
                var number = calculator_press.text.toString()+ "9";
                calculator_press.setText(number);
            }
            R.id.btnC -> {
                var number = calculator_press.text.toString();
                if(number.length>0){
                    number = number.substring(0, number.length - 1);
                }
                calculator_press.setText(number);
            }
            R.id.btn_ -> {
                val number = calculator_press.text.toString()+ ".";
                calculator_press.setText(number);
            }
            R.id.btnPls -> {
                number1 = calculator_press.text.toString().toFloat();
                calculator_press.setText("");
                isPlus = true;
            }
            R.id.btnMin -> {
                number1 = calculator_press.text.toString().toFloat();
                calculator_press.setText("");
                isMinus=true;
            }
            R.id.btnDiv -> {
                number1 = calculator_press.text.toString().toFloat();
                calculator_press.setText("");
                isDiv=true;
            }
            R.id.btnEq -> {
                if(isPlus){
                    val number2 = calculator_press.text.toString().toFloat();
                    calculator_press.setText((number1 + number2).toString());
                    isPlus=false;
                }else if(isMinus){
                    val number2 = calculator_press.text.toString().toFloat();
                    calculator_press.setText((number1 - number2).toString());
                    isMinus=false;
                }else{
                    val number2 = calculator_press.text.toString().toFloat();
                    calculator_press.setText((number1 / number2).toString());
                    isDiv=false;
                }
            }

        }


    }



}