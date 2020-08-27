package com.example.urineanalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class register_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);

        //Edit Text
        EditText id_edt_acc = findViewById(R.id.email_edit_acc); //아이디 입력란
        EditText pass_edt_acc = findViewById(R.id.pass_edit_acc); //비밀번호 입력란
        EditText pass_edt_acc_check = findViewById(R.id.pass_edit_acc_check);//비밀번화 확인란
        EditText name_edt_acc = findViewById(R.id.name_edit_acc); //이름 란


        //Button
        LinearLayout account_complete_btn = findViewById(R.id.complete_btn_acc); //최종 회원가입 버튼
        LinearLayout cancel_btn = findViewById(R.id.cancel_Linear_acc); //취소 버튼

        account_complete_btn.setOnClickListener(new View.OnClickListener() { //회원가입 버튼
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register_Activity.this,Login_Activity.class);
                setResult(RESULT_OK, intent);
            }
        });
        cancel_btn.setOnClickListener(new View.OnClickListener() { //회원가입 취소
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register_Activity.this, Login_Activity.class);
                setResult(RESULT_CANCELED, intent);
            }
        });
    }
}