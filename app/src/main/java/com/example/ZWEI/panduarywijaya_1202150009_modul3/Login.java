package com.example.ZWEI.panduarywijaya_1202150009_modul3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText user, pass;
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText)findViewById(R.id.ed_username);
        pass = (EditText)findViewById(R.id.ed_password);
        btnlogin = (Button)findViewById(R.id.btn_login);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernamekey = user.getText().toString();
                String passwordkey = pass.getText().toString();

                if (usernamekey.equals("EAD")&& passwordkey.equals("MOBILE")){
                    Intent login = new Intent(Login.this, Daftarmenu.class);
                    startActivity(login);
                    Toast.makeText(Login.this, "Login Sukses" , Toast.LENGTH_SHORT).show();


                }else {
                    Toast.makeText(Login.this,"Login gagal",Toast.LENGTH_SHORT).show();

                }


            }
        });


    }
}
