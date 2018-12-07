package jp.ac.it_college.std.s17002.quizgame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button7.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java )
            startActivity(intent)
        }

        button9.setOnClickListener{
            val intent = Intent (this, thirdActivity::class.java)
            startActivity(intent)
        }

    }



}
