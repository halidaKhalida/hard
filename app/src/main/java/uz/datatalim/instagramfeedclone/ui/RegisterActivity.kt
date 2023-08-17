package uz.datatalim.instagramfeedclone.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import uz.datatalim.instagramfeedclone.R

class RegisterActivity: AppCompatActivity() {
    lateinit var bCreatAccount:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initView1()



    }


    private fun initView1() {

        val tvLanguage=findViewById<TextView>(R.id.tv_lahguage)
        val etUsername=findViewById<EditText>(R.id.et_username)
        val etPassword=findViewById<EditText>(R.id.et_password)
        val bCreatAccount=findViewById<Button>(R.id.b_creat_account)
        val bNext=findViewById<Button>(R.id.b_next)
        val tvForgotPassword=findViewById<TextView>(R.id.tv_forgot_password)
        tvLanguage.setOnClickListener {
            tvLanguage.text="English"
            etUsername.hint="Username, email or mobile phone"
            etPassword.hint="Password"
            bNext.text="Sign in"
            tvForgotPassword.text="Forgot password?"
            bCreatAccount.text="Create new account"
            tvLanguage.setOnClickListener {
                tvLanguage.text = "Русский"
                etUsername.hint = "Имя пользователя, эл.адрес или мобильн..."
                etPassword.hint = "Пароль"
                bNext.text = "Войти"
                tvForgotPassword.text = "Забыли пароль?"
                bCreatAccount.text = "Создать новый аккаунт"
            }


        }

        bNext.setOnClickListener {
            intent =Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }


    }

