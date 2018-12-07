package jp.ac.it_college.std.s17002.quizgame

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        button3.setOnClickListener{
            val intent = Intent (this, Answer2Activity::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener{
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "SecondActivity"
    }
    override fun onOptionsItemSelected(item: MenuItem?):Boolean{
        when (item?.itemId){
            android.R.id.home -> finish()
            else -> return super.onOptionsItemSelected(item)

        }
        return true
    }
}
