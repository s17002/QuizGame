package jp.ac.it_college.std.s17002.quizgame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_answer2.*

class Answer2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer2)

        button32.setOnClickListener {
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }

        button33.setOnClickListener {
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }

        button34.setOnClickListener {
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }

        button35.setOnClickListener {
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }

        button36.setOnClickListener {
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }

        button37.setOnClickListener {
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }

        button38.setOnClickListener {
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }

        button39.setOnClickListener {
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }

        button40.setOnClickListener {
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }

        button41.setOnClickListener {
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }

        button42.setOnClickListener {
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }

        button43.setOnClickListener {
            val intent = Intent (this, CategoryHardActivity::class.java)
            startActivity(intent)
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Activity"
    }

    override fun onOptionsItemSelected(item: MenuItem?):Boolean{
        when (item?.itemId){
            android.R.id.home -> finish()
            else -> return super.onOptionsItemSelected(item)

        }
        return true
    }

}
