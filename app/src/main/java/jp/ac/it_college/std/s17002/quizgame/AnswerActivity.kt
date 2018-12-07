package jp.ac.it_college.std.s17002.quizgame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_answer.*
import kotlinx.android.synthetic.main.activity_answer2.*
import kotlinx.android.synthetic.main.activity_first.*
import java.util.*

class AnswerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)
        button16.setOnClickListener {
            val intent = Intent (this, CategoryActivity::class.java)
            startActivity(intent)
        }
        button17.setOnClickListener {
            val intent = Intent (this, CategoryActivity::class.java)
            startActivity(intent)
        }
        button18.setOnClickListener {
            val intent = Intent (this, CategoryActivity::class.java)
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent (this, CategoryActivity::class.java)
            startActivity(intent)
        }
        button20.setOnClickListener {
            val intent = Intent (this, CategoryActivity::class.java)
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent (this, CategoryActivity::class.java)
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent (this, CategoryActivity::class.java)
            startActivity(intent)
        }
        button24.setOnClickListener {
            val intent = Intent (this, CategoryActivity::class.java)
            startActivity(intent)
        }

        button25.setOnClickListener {
            val intent = Intent (this, CategoryActivity::class.java)
            startActivity(intent)
        }
        button26.setOnClickListener {
            val intent = Intent (this, CategoryActivity::class.java)
            startActivity(intent)
        }
        button27.setOnClickListener {
            val intent = Intent (this, CategoryActivity::class.java)
            startActivity(intent)
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "AnswerActivity"
    }

    override fun onOptionsItemSelected(item: MenuItem?):Boolean{
        when (item?.itemId){
            android.R.id.home -> finish()
            else -> return super.onOptionsItemSelected(item)

        }
        return true
    }


}
