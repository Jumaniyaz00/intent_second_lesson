package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    TextView textView;
    String operation;
    int value1;
    int value2;
    String res;
    int result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.show_text);

    }

    public void onClickNumber(View view) {
        switch (view.getId()) {
            case R.id.zero:
                if (textView.getText() != "") {

                    textView.append("0");
                } else {
                    textView.setText("");
                }
                break;
            case R.id.first:
                textView.append("1");
                break;
            case R.id.two:
                textView.append("2");
                break;
            case R.id.tree:
                textView.append("3");
                break;
            case R.id.four:
                textView.append("4");
                break;
            case R.id.five:
                textView.append("5");
                break;
            case R.id.six:
                textView.append("6");
                break;
            case R.id.seven:
                textView.append("7");
                break;
            case R.id.eight:
                textView.append("8");
                break;
            case R.id.nine:
                textView.append("9");
                break;

        }
    }

    public void onClickOperation(View view) {
        switch (view.getId()) {


            case R.id.minus:
                operation = "-";
                value1 = Integer.valueOf(textView.getText().toString());
                textView.setText(value1 + "-");
                break;

            case R.id.plus:
                operation = "+";
                value1 = Integer.valueOf(textView.getText().toString());
                textView.setText(value1 + "+");
                break;

            case R.id.umnajenie:
                value1 = Integer.valueOf(textView.getText().toString());
                textView.setText(value1 + "*");
                operation = "*";
                break;

            case R.id.division:
                value1 = Integer.valueOf(textView.getText().toString());
                textView.setText(value1 + "/");
                operation = "/";
                break;
            case R.id.clin:
                textView.setText("");
                break;


            case R.id.ravno:
                String first= textView.getText().toString().replace(value1+ operation+ "","");
                value2 = Integer.valueOf(first);
                      switch (operation){
                          case "*":
                              textView.setText(value1 + "*"+ value2 + "="+(result= value1*value2));
                              res = String.valueOf(result);

                              break;
                          case "/":
                              textView.setText(value1 + "/"+ value2 + "="+(result=value1/value2));
                              res = String.valueOf(result);
                              break;
                          case "+":
                              textView.setText(value1 + "+"+ value2 + "="+(result=value1+value2));
                             res = String.valueOf(result);
                              break;
                          case "-":
                              textView.setText(value1 + "-"+ value2 + "="+(result=value1-value2));
                              res = String.valueOf(result);
                              break;
                      }

                      Intent intent = new Intent(this,MainActivity.class);
                      intent.putExtra("res", res);
                      setResult(RESULT_OK,intent);
                      finish();
                break;

        }

    }

}