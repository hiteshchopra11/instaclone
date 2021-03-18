package com.hiteshchopra.instagramclone.ui.login

import android.content.Intent
import android.os.Bundle
import com.hiteshchopra.instagramclone.R
import com.hiteshchopra.instagramclone.databinding.ActivityLoginBinding
import com.hiteshchopra.instagramclone.ui.base.BaseActivity
import com.hiteshchopra.instagramclone.ui.signup.SignUpActivity


class LoginActivity : BaseActivity<ActivityLoginBinding, LoginVM>() {
    override fun layoutId(): Int = R.layout.activity_login
    override fun getViewModelClass(): Class<LoginVM> = LoginVM::class.java
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addListeners()
    }

    private fun addListeners() {
        with(binding) {
            tvSignUp.setOnClickListener {
                val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
                overridePendingTransition(0, 0)
                intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
                startActivity(intent)
            }
            layoutUsernamePassword.btnFirebaseLoginSignup.setText(R.string.log_in)
        }
    }
}