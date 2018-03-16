package com.woodman.androidstart.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.woodman.androidstart.R;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {
    Intent intent;
    private EditText editTextNick;
    private EditText editTextPassword;
    private Button btnSingUp;
    private Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        editTextNick = findViewById(R.id.edit_text_nick);
        editTextPassword = findViewById(R.id.edit_text_password);
        btnLogIn = findViewById(R.id.btn_login);
        btnSingUp = findViewById(R.id.btn_sing_up);

        btnLogIn.setOnClickListener(this);
        btnSingUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                intent = new Intent(LogInActivity.this, DrawerActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_sing_up:
                intent = new Intent(LogInActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;
        }
    }
}
