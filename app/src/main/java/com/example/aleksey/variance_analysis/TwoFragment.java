package com.example.aleksey.variance_analysis;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TwoFragment extends Fragment implements View.OnClickListener{

    EditText etNum1;
    EditText etNum2;
    EditText etNum3;
    EditText etNum4;
    EditText etNum5;
    EditText etNum6;
    EditText etNum7;
    EditText etNum8;
    EditText etNum9;
    EditText etNum10;
    EditText etNum11;
    EditText etNum12;
    EditText etNum13;
    EditText etNum14;
    EditText etNum15;
    Button btnRavno;
    TextView tvResult;
    TextView tvResult1;
    TextView tvResult2;
    TextView tvResult3;
    TextView tvResult4;
    TextView tvResult5;
    TextView tvResult6;
    TextView tvResult7;
    TextView tvResult8;
    TextView tvResult9;
    TextView tvResult10;
    TextView tvResult11;
    TextView tvResult12;
    TextView tvResult13;
    TextView tvResult14;
    TextView tvResult15;
    TextView tvResult16;
    TextView tvResult17;
    TextView tvResult18;
    TextView tvResult21;
    TextView tvResult23;
    TextView tvResult29;
    TextView tvResult30;
    TextView tvResult31;
    TextView tvResult32;
    TextView tvResult33;

        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_two, container, false);

            etNum1 = (EditText) view.findViewById(R.id.etNum1);
            etNum2 = (EditText) view.findViewById(R.id.etNum2);
            etNum3 = (EditText) view.findViewById(R.id.etNum3);
            etNum4 = (EditText) view.findViewById(R.id.etNum4);
            etNum5 = (EditText) view.findViewById(R.id.etNum5);
            etNum6 = (EditText) view.findViewById(R.id.etNum6);
            etNum7 = (EditText) view.findViewById(R.id.etNum7);
            etNum8 = (EditText) view.findViewById(R.id.etNum8);
            etNum9 = (EditText) view.findViewById(R.id.etNum9);
            etNum10 = (EditText) view.findViewById(R.id.etNum10);
            etNum11 = (EditText) view.findViewById(R.id.etNum11);
            etNum12 = (EditText) view.findViewById(R.id.etNum12);
            etNum13 = (EditText) view.findViewById(R.id.etNum13);
            etNum14 = (EditText) view.findViewById(R.id.etNum14);
            etNum15 = (EditText) view.findViewById(R.id.etNum15);
            btnRavno = (Button) view.findViewById(R.id.btnRavno);
            tvResult = (TextView) view.findViewById(R.id.tvResult);
            tvResult1 = (TextView) view.findViewById(R.id.tvResult1);
            tvResult2 = (TextView) view.findViewById(R.id.tvResult2);
            tvResult3 = (TextView) view.findViewById(R.id.tvResult3);
            tvResult4 = (TextView) view.findViewById(R.id.tvResult4);
            tvResult5 = (TextView) view.findViewById(R.id.tvResult5);
            tvResult6 = (TextView) view.findViewById(R.id.tvResult6);
            tvResult7 = (TextView) view.findViewById(R.id.tvResult7);
            tvResult8 = (TextView) view.findViewById(R.id.tvResult8);
            tvResult9 = (TextView) view.findViewById(R.id.tvResult9);
            tvResult10 = (TextView) view.findViewById(R.id.tvResult10);
            tvResult11 = (TextView) view.findViewById(R.id.tvResult11);
            tvResult12 = (TextView) view.findViewById(R.id.tvResult12);
            tvResult13 = (TextView) view.findViewById(R.id.tvResult13);
            tvResult14 = (TextView) view.findViewById(R.id.tvResult14);
            tvResult15 = (TextView) view.findViewById(R.id.tvResult15);
            tvResult16 = (TextView) view.findViewById(R.id.tvResult16);
            tvResult17 = (TextView) view.findViewById(R.id.tvResult17);
            tvResult18 = (TextView) view.findViewById(R.id.tvResult18);
            tvResult21 = (TextView) view.findViewById(R.id.tvResult21);
            tvResult23 = (TextView) view.findViewById(R.id.tvResult23);
            tvResult29 = (TextView) view.findViewById(R.id.tvResult29);
            tvResult30 = (TextView) view.findViewById(R.id.tvResult30);
            tvResult31 = (TextView) view.findViewById(R.id.tvResult31);
            tvResult32 = (TextView) view.findViewById(R.id.tvResult32);
            tvResult33 = (TextView) view.findViewById(R.id.tvResult33);

            btnRavno.setOnClickListener(this);

            return view;
        }


    public void onClick(View v) {

        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double num4 = 0;
        double num5 = 0;
        double num6 = 0;
        double num7 = 0;
        double num8 = 0;
        double num9 = 0;
        double num10 = 0;
        double num11 = 0;
        double num12 = 0;
        double num13 = 0;
        double num14 = 0;
        double num15 = 0;
        double result = 0;
        double result1 = 0;
        double result2 = 0;
        double result3 = 0;
        double result4 = 0;
        double result5 = 0;
        double result6 = 0;
        double result7 = 0;
        double result8 = 0;
        double result9 = 0;
        double result10 = 0;
        double result11 = 0;
        double result12 = 0;
        double result13 = 0;
        double result14 = 0;
        double result15 = 0;
        double result16 = 0;
        double result17 = 0;
        double result18 = 0;
        double result21 = 0;
        double result22 = 0;
        double result23 = 0;
        double result24 = 0;
        double result25 = 0;
        double result26 = 0;
        double result28 = 0;
        double result29 = 0;
        double result30 = 0;
        double result31 = 0;
        double result32 = 0;
        double result33 = 0;
        double result_one = 0;
        double result_two = 0;
        double result_three = 0;
        double result_ottf = 0;
        double result_one_1 = 0;
        double result_two_2 = 0;
        double result_three_3 = 0;

        num1 = Double.parseDouble(etNum1.getText().toString());
        num2 = Double.parseDouble(etNum2.getText().toString());
        num3 = Double.parseDouble(etNum3.getText().toString());
        num4 = Double.parseDouble(etNum4.getText().toString());
        num5 = Double.parseDouble(etNum5.getText().toString());
        num6 = Double.parseDouble(etNum6.getText().toString());
        num7 = Double.parseDouble(etNum7.getText().toString());
        num8 = Double.parseDouble(etNum8.getText().toString());
        num9 = Double.parseDouble(etNum9.getText().toString());
        num10 = Double.parseDouble(etNum10.getText().toString());
        num11 = Double.parseDouble(etNum11.getText().toString());
        num12 = Double.parseDouble(etNum12.getText().toString());
        num13 = Double.parseDouble(etNum13.getText().toString());
        num14 = Double.parseDouble(etNum14.getText().toString());
        num15 = Double.parseDouble(etNum15.getText().toString());

        switch (v.getId()) {
            case R.id.btnRavno:
                result_one = num1 + num4 + num7 + num10 + num13;
                result_one_1 = result_one / 5;
                result_two = num2 + num5 + num8 + num11 + num14;
                result_two_2 = result_two / 5;
                result_three = num3 + num6 + num9 + num12 + num15;
                result_three_3 = result_three / 5;
                result_ottf = result_one_1 + result_two_2 + result_three_3;
                result = result_ottf / 3;
                result1 = Math.pow(num1, 2);
                result2 = Math.pow(num2, 2);
                result3 = Math.pow(num3, 2);
                result4 = Math.pow(num4, 2);
                result5 = Math.pow(num5, 2);
                result6 = Math.pow(num6, 2);
                result7 = Math.pow(num7, 2);
                result8 = Math.pow(num8, 2);
                result9 = Math.pow(num9, 2);
                result10 = Math.pow(num10, 2);
                result11 = Math.pow(num11, 2);
                result12 = Math.pow(num12, 2);
                result13 = Math.pow(num13, 2);
                result14 = Math.pow(num14, 2);
                result15 = Math.pow(num15, 2);
                result22 = Math.pow(result, 2);
                result24 = Math.pow(result_one_1, 2);
                result25 = Math.pow(result_two_2, 2);
                result26 = Math.pow(result_three_3, 2);
                result16 = result1 + result4 + result7 + result10 + result13;
                result17 = result2 + result5 + result8 + result11 + result14;
                result18 = result3 + result6 + result9 + result12 + result15;
                result21 = result16 + result17  + result18 - 3 * 5 * result22;
                result28 = result24 + result25 + result26 - 3 * result22;
                result23 = result28 * 5;
                result29 = result21 - result23;
                result30 = result21 / 14;
                result31 = result23 / 2;
                result32 = result29 / 12;
                result33 = result31 / result32;
                break;
            default:
                break;
        }
        tvResult.setText(Double.toString(result));
        tvResult1.setText(Double.toString(result1));
        tvResult2.setText(Double.toString(result2));
        tvResult3.setText(Double.toString(result3));
        tvResult4.setText(Double.toString(result4));
        tvResult5.setText(Double.toString(result5));
        tvResult6.setText(Double.toString(result6));
        tvResult7.setText(Double.toString(result7));
        tvResult8.setText(Double.toString(result8));
        tvResult9.setText(Double.toString(result9));
        tvResult10.setText(Double.toString(result10));
        tvResult11.setText(Double.toString(result11));
        tvResult12.setText(Double.toString(result12));
        tvResult13.setText(Double.toString(result13));
        tvResult14.setText(Double.toString(result14));
        tvResult15.setText(Double.toString(result15));
        tvResult16.setText(Double.toString(result16));
        tvResult17.setText(Double.toString(result17));
        tvResult18.setText(Double.toString(result18));
        tvResult21.setText(Double.toString(result21));
        tvResult23.setText(Double.toString(result23));
        tvResult29.setText(Double.toString(result29));
        tvResult30.setText(Double.toString(result30));
        tvResult31.setText(Double.toString(result31));
        tvResult32.setText(Double.toString(result32));
        tvResult33.setText(Double.toString(result33));
    }

}
