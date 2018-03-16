package com.woodman.androidstart.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.woodman.androidstart.DAO.CollectionDataBase;
import com.woodman.androidstart.Model.SEX;
import com.woodman.androidstart.Model.User;
import com.woodman.androidstart.R;

public class RegisterActivity extends AppCompatActivity{
    private EditText editTextNick;
    private EditText password;
    private EditText confirm_password;
    private Button btnRegister;
    private TextView showText;

    private String tempString;


    private RadioButton radioSexMale;
    private RadioButton radioSexFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        editTextNick = findViewById(R.id.editTextNick);
        password = findViewById(R.id.editTextPassword);
        confirm_password = findViewById(R.id.editTextConfirmPassword);
        btnRegister = findViewById(R.id.btn_register);
        showText = findViewById(R.id.show_text);

        radioSexMale = findViewById(R.id.radio_sex_male);
        radioSexFemale = findViewById(R.id.radio_sex_female);
        registerForContextMenu(editTextNick);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp_nick = editTextNick.getText().toString();
                String temp_password = password.getText().toString();
                String temp_confirm_password = confirm_password.getText().toString();
                SEX temp_sex = null;
                if (radioSexMale.isChecked()) {
                    temp_sex = SEX.MALE;
                } else if (radioSexFemale.isChecked()) {
                    temp_sex = SEX.FEMALE;
                }
                if (temp_password.equals(temp_confirm_password)) {
                    User user = new User();
                    user.setNick(temp_nick);
                    user.setPassword(temp_password);
                    user.setSex(temp_sex);
                    boolean userIsSaved = CollectionDataBase.getInstance().insertUser(user);
                    if (userIsSaved) {
                        Intent intent = new Intent(RegisterActivity.this, LogInActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(RegisterActivity.this, "User can`t register", Toast.LENGTH_LONG).show();
                    }

                } else {
                    Toast.makeText(RegisterActivity.this, "Passwords are not same!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }


}
