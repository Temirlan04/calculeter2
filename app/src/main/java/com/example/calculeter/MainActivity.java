package com.example.calculeter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculeter.R;

public class MainActivity extends AppCompatActivity {
    private TextView tv_result;
    private Integer FirstVar, secondVar;
    private Boolean isFirstVarChose = false;
    private String operation;
    private boolean gh = false;
    private Integer re;
    private Integer result;
    private Boolean isEqualRepair = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result = findViewById(R.id.tv_result);
    }

    public void onNumberClick(View view) {
        if (gh){
            tv_result.setText("0");
            gh = false;
            result =  0;
        }
        switch (view.getId()) {
            case R.id.btn_one:
                setText_main("1");
                break;
            case R.id.btn_two:
                setText_main("2");
                break;
            case R.id.btn_tree:
                setText_main("3");
                break;
            case R.id.four:
                setText_main("4");
                break;
            case R.id.btn_five:
                setText_main("5");
                break;
            case R.id.btn_six:
                setText_main("6");
                break;
            case R.id.btn_seven:
                setText_main("7");
                break;
            case R.id.btn_eight:
                setText_main("8");
                break;
            case R.id.btn_nine:
                setText_main("9");
                break;
            case R.id.btn_zero:
                setText_main("0");
                break;
            case R.id.btn_AC:
                tv_result.setText("0");

                break;

        }
    }

    private void setText_main(String num) {
        if (tv_result.getText().toString().equals("0")) {
            tv_result.setText(num);
        } else {
            tv_result.append(num);
        }
        if (isFirstVarChose) {
            tv_result.setText(num);
        }
        isFirstVarChose = false;
        isEqualRepair = false;
    }
    public void onOpperattion(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                FirstVar = Integer.parseInt(tv_result.getText().toString());
                isFirstVarChose = true;
                isEqualRepair = false;
                operation = "+";
                break;
            case R.id.btn_minus:
                FirstVar = Integer.parseInt(tv_result.getText().toString());
                isFirstVarChose = true;
                isEqualRepair = false;
                operation = "-";
                break;
            case R.id.btn_suppression:
                FirstVar = Integer.parseInt(tv_result.getText().toString());
                isFirstVarChose = true;
                isEqualRepair = false;
                operation = "*";
                break;
            case R.id.btn_division:
                FirstVar = Integer.parseInt(tv_result.getText().toString());
                isFirstVarChose = true;
                isEqualRepair = false;
                operation = "/";
                break;
            case R.id.btn_percent:
                FirstVar = Integer.parseInt(tv_result.getText().toString());
                isFirstVarChose = true;
                isEqualRepair = false;
                operation = "%";
                break;
            case R.id.btn_equals:
                gh = true;
                if (!isEqualRepair)
                {secondVar = Integer.parseInt(tv_result.getText().toString());
                }else
                {FirstVar = Integer.parseInt(tv_result.getText().toString());}
                switch (operation) {
                    case "+":
                        result = FirstVar + secondVar;
                        break;
                    case "-":
                        result = FirstVar - secondVar;
                        break;
                    case "*":
                        result = FirstVar * secondVar;
                        break;
                    case "/":
                        result = FirstVar / secondVar;
                        break;
                    case "%":
                        result = FirstVar * 100 / secondVar;
                        break;
                }
                if (result > 1) {
                    tv_result.setText(result.toString());
                }else{
                    result = 0;
                }
                isFirstVarChose = false;
                isEqualRepair = true;

                break;

        }

    }


}