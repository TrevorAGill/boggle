package com.epicodus.boggle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;

public class GameboardActivity extends Activity {
    private List<String> letterArray = Arrays.asList("A","A","A","A","A","A","A","A","A","A","A","A","B","C","C","C","C","C","D","D","D","D","D","D","E","E","E","E","E","E","E","E","E","E","E","E","E","E","E","E","E","E","E","F","F","F","F","G","G","G","H","H","H","H","H","I","I","I","I","I","I","I","I","I","I","I","J","K","L","L","L","L","L","M","M","M","M","N","N","N","N","N","N","N","N","N","N","N","O","O","O","O","O","O","O","O","O","O","O","P","P","P","P","Q","R","R","R","R","R","R","R","R","R","R","R","R","S","S","S","S","S","S","S","S","S","T","T","T","T","T","T","T","T","T","T","T","T","T","U","U","U","U","V","W","W","X","Y","Y","Y","Z");
    @Bind(R.id.button1) Button mButton1;
    @Bind(R.id.button2) Button mButton2;
    @Bind(R.id.button3) Button mButton3;
    @Bind(R.id.button4) Button mButton4;
    @Bind(R.id.button5) Button mButton5;
    @Bind(R.id.button6) Button mButton6;
    @Bind(R.id.button7) Button mButton7;
    @Bind(R.id.button8) Button mButton8;
    @Bind(R.id.button9) Button mButton9;
    @Bind(R.id.button10) Button mButton10;
    @Bind(R.id.button11) Button mButton11;
    @Bind(R.id.button12) Button mButton12;
    @Bind(R.id.button13) Button mButton13;
    @Bind(R.id.button14) Button mButton14;
    @Bind(R.id.button15) Button mButton15;
    @Bind(R.id.button16) Button mButton16;
    ArrayList<Button> allButtons = new ArrayList<Button>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameboard);
        ButterKnife.bind(this);

        createButtonList();

        for(Button button : allButtons) {
            String letter = randomLetter();
            button.setText(letter);
        }

    }

    public void createButtonList() {
        allButtons.add(mButton1);
        allButtons.add(mButton2);
        allButtons.add(mButton3);
        allButtons.add(mButton4);
        allButtons.add(mButton5);
        allButtons.add(mButton6);
        allButtons.add(mButton7);
        allButtons.add(mButton8);
        allButtons.add(mButton9);
        allButtons.add(mButton10);
        allButtons.add(mButton11);
        allButtons.add(mButton12);
        allButtons.add(mButton13);
        allButtons.add(mButton14);
        allButtons.add(mButton15);
        allButtons.add(mButton16);
    }



    public String randomLetter() {
        Random random = new Random();
        int randomNum = random.nextInt(150);
        String randomLetter = letterArray.get(randomNum);
        return randomLetter;
    }
}
