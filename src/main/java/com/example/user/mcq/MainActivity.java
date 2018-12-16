package com.example.user.mcq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button a1,a2,a3,a4;
    TextView score,question;
    int S;
    Question q1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1=findViewById(R.id.answer1);
        a2=findViewById(R.id.answer2);
        a3=findViewById(R.id.answer3);
        a4=findViewById(R.id.answer4);

        score=findViewById(R.id.score);
        question=findViewById(R.id.question);
        q1=new Question("What is Sun?","solar power","jupiter","mars","moon","solar power");
        Question q2=new Question("What is the Earth?","solar power","jupiter","mars","living place","living place");
        question.setText(q1.question);
        a1.setText(q1.op1);
        a2.setText(q1.op2);
        a3.setText(q1.op3);
        a4.setText(q1.op4);
        a1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==a1){
           if(a1.getText().equals(q1.ans)){
               S++;
               score.setText(S+"");

           }
        }else if(view==a2){

        }else if(view==a3){

        }else if(view==a4){

        }

    }
}
