package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView tv_login,tv_registry;
    EditText et_num,et_ps;
    Button bt_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_login=findViewById(R.id.tv_login);
        tv_registry=findViewById(R.id.tv_registry);
        et_num=findViewById(R.id.et_munber);
        et_ps=findViewById(R.id.et_password);
        bt_login=findViewById(R.id.bt_login);

        tv_registry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Login.this,Registry.class);
                startActivity(intent);
            }
        });
    }
}