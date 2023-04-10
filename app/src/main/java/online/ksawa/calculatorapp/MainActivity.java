package online.ksawa.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<String> arrayList= new ArrayList<>();;
    public static TextView resultView;

    public static int basicNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultView = findViewById(R.id.resultTXTView);
        Button btn;

        basicNumber = 0;


    }

//    public void calculate(View view) {
//        resultView.setText(basicNumber);
//
//    }

    public void clearEverything(View view) {
        arrayList.clear();
        resultView.setText("");
        basicNumber = 0;
    }

    public void input_digits(View view) {
        Button btn = findViewById(view.getId());
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.oneBTN:
                        arrayList.add("1");
                        if (arrayList.size() == 0) {
                            basicNumber = 1;
                        }
                        break;
                    case R.id.twoBTN:
                        arrayList.add("2");
                        if (arrayList.size() == 0) {
                            basicNumber = 2;
                        }
                        break;
                    case R.id.threeBTN:
                        arrayList.add("3");
                        if (arrayList.size() == 0) {
                            basicNumber = 3;
                        }
                        break;
                    case R.id.fourBTN:
                        arrayList.add("4");
                        if (arrayList.size() == 0) {
                            basicNumber = 4;
                        }
                        break;
                    case R.id.fiveBTN:
                        arrayList.add("5");
                        if (arrayList.size() == 0) {
                            basicNumber = 5;
                        }
                        break;
                    case R.id.sixBTN:
                        arrayList.add("6");
                        if (arrayList.size() == 0) {
                            basicNumber = 6;
                        }
                        break;
                    case R.id.sevenBTN:
                        arrayList.add("7");
                        if (arrayList.size() == 0) {
                            basicNumber = 7;
                        }
                        break;
                    case R.id.eightBTN:
                        arrayList.add("8");
                        if (arrayList.size() == 0) {
                            basicNumber = 8;
                        }
                        break;
                    case R.id.nineBTN:
                        arrayList.add("9");
                        if (arrayList.size() == 0) {
                            basicNumber = 9;
                        }
                        break;
                    case R.id.zeroBTN:
                        arrayList.add("0");
                        if (arrayList.size() == 0) {
                            basicNumber = 0;
                        }
                        break;
                    case R.id.addBTN:
//                        if (arrayList.size() > 1) {
                            arrayList.add("+");
//                        }
                        break;
                    case R.id.equalBTN:
//                        resultView.setText(basicNumber);
                        StringBuilder sb = new StringBuilder();

                        for (int i = 0; i < arrayList.size(); i++) {
                            sb.append(arrayList.get(i));
                            sb.append(" ");
                        }
                        resultView.setText(sb.toString());
                        break;

                    default:
                        arrayList.add("error");
                        break;
                }

            }
        });


    }

    public void adding(int a, int b) {

    }
}