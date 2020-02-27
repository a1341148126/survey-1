package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Report extends AppCompatActivity {
private TextView report_finish;
    private TextView report2;
    private TextView report3;
    private TextView report4;
    private TextView report5;
    private TextView report6;
    private TextView report7;
    private TextView report8;
    private TextView report9;
    private TextView report10;
    private TextView report11;
    private TextView report12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report);
        Intent intent=getIntent();
        Bundle bundle=getIntent().getExtras();
        String A1=bundle.getString("Q1");
        String A2=bundle.getString("Q2");
        String A3=bundle.getString("Q3");
        String A4=bundle.getString("Q4");
        String A5=bundle.getString("Q5");
        String A6=bundle.getString("Q6");
        String A7=bundle.getString("Q7");
        String A8=bundle.getString("Q8");
        String A9=bundle.getString("Q9");
        String A10=bundle.getString("Q10");
        String A11=bundle.getString("Q11");
        String A12=bundle.getString("Q12");
        report_finish=findViewById(R.id.report_final);
        report_finish.setText(A1);
        report2=findViewById(R.id.report2);
        report2.setText(A2);
        report3=findViewById(R.id.report3);
        report3.setText(A3);
        report4=findViewById(R.id.report4);
        report4.setText(A4);
        report5=findViewById(R.id.report5);
        report5.setText(A5);
        report6=findViewById(R.id.report6);
        report6.setText(A6);
        report7=findViewById(R.id.report7);
        report7.setText(A7);
        report8=findViewById(R.id.report8);
        report8.setText(A8);
        report9=findViewById(R.id.report9);
        report9.setText(A9);
        report10=findViewById(R.id.report10);
        report10.setText(A10);
        report11=findViewById(R.id.report11);
        report11.setText(A11);
        report12=findViewById(R.id.report12);
        report12.setText(A12);

    }
}
