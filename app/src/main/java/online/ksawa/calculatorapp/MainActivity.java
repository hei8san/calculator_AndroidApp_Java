package online.ksawa.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<String> arrayList;
    public static TextView resultView;

    public static StringBuilder basicNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultView = findViewById(R.id.resultTXTView);
        Button btn;
        arrayList = new ArrayList<>();
        basicNumber = new StringBuilder();
        System.out.println(basicNumber.toString());

    }


    public void input_digits(View view) {
        Button btn = findViewById(view.getId());
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.oneBTN:
                        arrayList.add("1");
                        basicNumber.append(1);
                        break;
                    case R.id.twoBTN:
                        arrayList.add("2");
                        break;
                    case R.id.threeBTN:
                        arrayList.add("3");
                        break;
                    case R.id.fourBTN:
                        arrayList.add("4");
                        break;
                    case R.id.fiveBTN:
                        arrayList.add("5");
                        break;
                    case R.id.sixBTN:
                        arrayList.add("6");
                        break;
                    case R.id.sevenBTN:
                        arrayList.add("7");
                        break;
                    case R.id.eightBTN:
                        arrayList.add("8");
                        break;
                    case R.id.nineBTN:
                        arrayList.add("9");
                        break;
                    case R.id.addBTN:
                        arrayList.add("+");
                        break;
                    case R.id.equalBTN:

                    default:
                        arrayList.add("error");
                        break;
                }
                StringBuilder sb = new StringBuilder();

                for(int i = 0; i < arrayList.size(); i++){
                    sb.append(arrayList.get(i));

                }
                resultView.setText(sb.toString());
            }
        });


    }
    public void adding(int a, int b){

    }
}