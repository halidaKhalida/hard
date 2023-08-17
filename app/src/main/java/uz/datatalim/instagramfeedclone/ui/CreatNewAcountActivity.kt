package uz.datatalim.instagramfeedclone.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import uz.datatalim.instagramfeedclone.R

class CreatNewAcountActivity : AppCompatActivity() {
    lateinit var bNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creatnewacount)
        initView()
    }

    private fun initView() {
        bNext2.findViewById<Button>(R.id.b_next2)

        bNext2.setOnClickListener {
            intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        }
    }




