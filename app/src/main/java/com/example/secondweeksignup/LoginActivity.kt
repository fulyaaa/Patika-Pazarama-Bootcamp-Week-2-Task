package com.example.secondweeksignup

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.secondweeksignup.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var ivChangePasswordVisibility : ImageView
    private var isVisibilityOn = false
    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //burada binding metodu ile Sign Up butonuna basildiginda Sign Up sayfasina yonlendiriyoruz
        binding.btnSignUp.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        ivChangePasswordVisibility = binding.ivshowPassword
        //ivChangePasswordVisibility = findViewById(R.id.ivshowPassword)

        ivChangePasswordVisibility.setOnClickListener {
            if (isVisibilityOn){
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_24)
                isVisibilityOn = false
            }else{
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                isVisibilityOn = true
            }
        }
    }
}


