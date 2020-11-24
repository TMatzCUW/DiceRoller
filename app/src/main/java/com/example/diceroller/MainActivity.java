package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonPercentile;
    private Button buttonRoll;
    private Button buttonD4;
    private Button buttonD6;
    private Button buttonD8;
    private Button buttonD10;
    private Button buttonD12;
    private Button buttonD20;
    private TextView diceAddText;
    private TextView diceTotalText;
    private TextView dText;
    private TextView rollText;
    private int sides;
    private int rolls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button1=this.findViewById(R.id.button1);
        this.button2=this.findViewById(R.id.button2);
        this.button3=this.findViewById(R.id.button3);
        this.button4=this.findViewById(R.id.button4);
        this.button5=this.findViewById(R.id.button5);
        this.button6=this.findViewById(R.id.button6);
        this.button7=this.findViewById(R.id.button7);
        this.button8=this.findViewById(R.id.button8);
        this.button9=this.findViewById(R.id.button9);
        this.button0=this.findViewById(R.id.button0);
        this.buttonPercentile=this.findViewById(R.id.buttonPercent);
        this.buttonRoll=this.findViewById(R.id.buttonRoll);
        this.buttonD4=this.findViewById(R.id.buttond4);
        this.buttonD6=this.findViewById(R.id.buttonD6);
        this.buttonD8=this.findViewById(R.id.buttonD8);
        this.buttonD10=this.findViewById(R.id.buttonD10);
        this.buttonD12=this.findViewById(R.id.buttonD12);
        this.buttonD20=this.findViewById(R.id.buttonD20);
        this.diceAddText=this.findViewById(R.id.diceAddText);
        this.diceTotalText=this.findViewById(R.id.diceTotalText);
        this.dText=this.findViewById(R.id.dText);
        this.rollText=this.findViewById(R.id.rollText);
        this.sides=sides;
        this.rolls=rolls;
    }

    public void onButtonClicked(View v){
        int total=0;
        String temp="";
        if(v==this.buttonD4){
            this.dText.setText("D4");
            this.sides=4;
        }
        else if(v==this.buttonD6){
            this.dText.setText("D6");
            this.sides=6;
        }
        else if(v==this.buttonD8){
            this.dText.setText("D8");
            this.sides=8;
        }
        else if(v==this.buttonD10){
            this.dText.setText("D10");
            this.sides=10;
        }
        else if(v==this.buttonD12){
            this.dText.setText("D12");
            this.sides=12;
        }
        else if(v==this.buttonD20){
            this.dText.setText("D20");
            this.sides=20;
        }
        else if(v==this.button1){
            this.rollText.setText("1");
            this.rolls=1;
        }
        else if(v==this.button2){
            this.rollText.setText("2");
            this.rolls=2;
        }
        else if(v==this.button3){
            this.rollText.setText("3");
            this.rolls=3;
        }
        else if(v==this.button4){
            this.rollText.setText("4");
            this.rolls=4;
        }
        else if(v==this.button5){
            this.rollText.setText("5");
            this.rolls=5;
        }
        else if(v==this.button6){
            this.rollText.setText("6");
            this.rolls=6;
        }
        else if(v==this.button7){
            this.rollText.setText("7");
            this.rolls=7;
        }
        else if(v==this.button8){
            this.rollText.setText("8");
            this.rolls=8;
        }
        else if(v==this.button9){
            this.rollText.setText("9");
            this.rolls=9;
        }
        else if(v==this.button0){
            this.rollText.setText("0");
            this.rolls=0;
        }
        else if(v==this.buttonRoll){
            Dice[] theDice=new Dice[rolls];
            for(int i = 0; i < theDice.length-1; i++)
            {
                theDice[i] = new Dice(sides);
            }
            int[] diceResults = new int[rolls];
            for(int x = 0; x < diceResults.length-1; x++)
            {
                int numberRolled = theDice[x].roll();
                diceResults[x] = numberRolled;
            }
            for(int j = 0; j < diceResults.length-1; j++)
            {
                if(j == 0)
                {
                    temp = (temp + Integer.toString(diceResults[j]));
                }
                else
                {
                    temp = (temp +  " + " + Integer.toString(diceResults[j]));
                }
                total = total + diceResults[j];
            }
            this.diceAddText.setText(temp);
            this.diceTotalText.setText(Integer.toString(total));
        }
    }
}