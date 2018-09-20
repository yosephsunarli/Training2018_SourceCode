package com.beonesolution.training2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.beonesolution.training2018.data.remote.ApiUtils;
import com.beonesolution.training2018.data.remote.SAPService;
import com.beonesolution.training2018.model.LoginDataModel;
import com.beonesolution.training2018.model.LoginResponseModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity
{
    private EditText etUsername;
    private EditText etPassword;
    private AppCompatButton btLogin;
    private String user;
    private String pass;
    private SAPService sapService;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bindItem();

        btLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                user = etUsername.getText().toString();
                pass = etPassword.getText().toString();
                postLogin(user, pass);
            }
        });
    }

    private void bindItem(){
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btLogin = findViewById(R.id.btLogin);
        sapService = ApiUtils.getSAPService(LoginActivity.this);
    }

    private void postLogin(String user, String pass){
        LoginDataModel postData = new LoginDataModel("KREASI", pass, user);
        sapService.postLogin(postData).enqueue(new Callback<LoginResponseModel>()
        {
            @Override
            public void onResponse(Call<LoginResponseModel> call, Response<LoginResponseModel> response)
            {
                // HTTP Status 200
                if(response.isSuccessful()){
                    // Jika berhasil login, buka MainActivity
                    Intent intent = new Intent();
                    intent.setClass(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else{
                    Toast.makeText(LoginActivity.this, "Error: " + response.code() + " " + response.errorBody(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponseModel> call, Throwable t)
            {
                Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
