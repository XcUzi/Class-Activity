package edu.temple.classactivity

import android.icu.text.Edits
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
class MainActivity : AppCompatActivity() {

//    lateinit var myButton: Button
//    lateinit var displayMessageTextView: TextView
//    lateinit var nameEditText: TextView
////    lateinit var  seekBar: SeekBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        findViewById<Button>(R.id.button).setOnClickListener {
//            findViewById<TextView>(R.id.textView).text = "You clicked the button!"
//        }
//        myButton = findViewById<button>(R.id.button)
//        displayMessageTextView = findViewById(R.id.textView2)
//        nameEditText = findViewById(R.id.editTextText)
////        seekBar = findViewById(R.id.Seek)

        val textView = findViewById<TextView>(R.id.textView2)
        val editext = findViewById<EditText>(R.id.editTextText)

        findViewById<Button>(R.id.button).setOnClickListener {
            if(EditText.text.isNotEmpty()){
                textView.text = "Hello , " + EditText.text+ "! Welcome."
            }else{
                textView.text = "Please enter your name"

            }
        }





    }






}