package com.example.urineanalyzer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;


public class Login_Activity extends AppCompatActivity {

    private int REQUEST_TEST  = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        //editText
       final EditText email_edt = findViewById(R.id.email_edit);
       final EditText pass_edt = findViewById(R.id.password_edit);

        //button
        LinearLayout login_btn = findViewById(R.id.login_Linear_btn);
        LinearLayout account_btn = findViewById(R.id.account_Linear_btn);

        login_btn.setOnClickListener(new View.OnClickListener() { //로그인 버튼
            @Override
            public void onClick(View view) {
               /* Intent intent = new Intent(Login_Activity.this,register_Activity.class);
                startActivityForResult(intent,REQUEST_TEST);*/

                final String ID = email_edt.getText().toString();
                final String PASS = pass_edt.getText().toString();

                Log.e("ID",""+ID);
                Log.e("PASS",""+PASS);


            }
        });
        account_btn.setOnClickListener(new View.OnClickListener() {//회원가입 화면 전환 버튼
            @Override
            public void onClick(View view) {

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_TEST){
            if(RESULT_OK == resultCode){ //회원가입이 성공했을때

            }else if(RESULT_CANCELED == resultCode){ //취소버튼 눌렀을때

            }else{ //회원가입 실패

            }
        }
    }
}