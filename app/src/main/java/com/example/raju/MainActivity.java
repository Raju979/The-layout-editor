package com.example.raju;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button countButton,zeroButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        countButton = (Button) findViewById(R.id.button_count);
        zeroButton = findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount !=null){
            mShowCount.setText(Integer.toString(mCount));
        }
        if(mCount%2 !=0){
        countButton.setBackgroundColor(getResources().getColor(R.color.teal_700));
        zeroButton.setBackgroundColor(getResources().getColor(R.color.pink));
        }
        else{
            countButton.setBackgroundColor(getResources().getColor(R.color.blue));
        }
    }

    public void countZero(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        zeroButton.setBackgroundColor(getResources().getColor(R.color.grey));
    }
}