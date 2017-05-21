package com.example.andregranella.labshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    public EditText address;
    public EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        address = (EditText)findViewById(R.id.address);
        password = (EditText)findViewById(R.id.password);

    }

    public void clickOut(View view) {
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void startEditingAddress(View view) {
        address.setText("");
    }

    public void startEditingPassword(View view) {
        password.setText("");
    }

    public  void login(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        startActivity(intent);
    }


}
