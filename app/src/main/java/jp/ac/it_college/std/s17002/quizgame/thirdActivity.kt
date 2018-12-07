package jp.ac.it_college.std.s17002.quizgame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_third.*

class thirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)



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
