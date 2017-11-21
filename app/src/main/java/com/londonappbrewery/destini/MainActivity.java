package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mButtonTop;
    Button mButtonBottom;
    TextView mStoryTextView;
    int mIndex;

    private StoryLine[] mStorylineBank = new StoryLine[]{
            new StoryLine(R.string.T1_Story,R.string.T1_Ans1, R.string.T1_Ans2),
            new StoryLine(R.string.T2_Story,R.string.T2_Ans1, R.string.T2_Ans2),
            new StoryLine(R.string.T3_Story,R.string.T3_Ans1, R.string.T3_Ans2),

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button)findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        mStoryTextView.setText(mStorylineBank[mIndex].getTopText());
        mButtonTop.setText(mStorylineBank[mIndex].getTopButton());
        mButtonBottom.setText(mStorylineBank[mIndex].getBottomButton());


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStoryTop();
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStoryBottom();
            }
        }));

    }

    private void updateStoryTop() {

        if(mIndex==0) {
            Log.d("TOP ", "0");
            mIndex = 2;
            displayStoryAndButtons();
        }else if(mIndex==1) {
            mIndex = 2;
            Log.d("TOP ", "1");
            displayStoryAndButtons();
        }else if(mIndex==2){
            Log.d("TOP ", "2");
            setEnding(R.string.T6_End);
        }

    }

     private void updateStoryBottom() {
         if (mIndex ==0){
             Log.d("BOTTOM ", "0");
             mIndex = 1;
             displayStoryAndButtons();
         }else if(mIndex ==1){
             Log.d("BOTTOM ", "1");
             setEnding(R.string.T4_End);

         }else if(mIndex==2){
             Log.d("BOTTOM ", "2");
             setEnding(R.string.T5_End);
         }
     }


     private void displayStoryAndButtons(){
        mStoryTextView.setText(mStorylineBank[mIndex].getTopText());
         mButtonTop.setText(mStorylineBank[mIndex].getTopButton());
         mButtonBottom.setText(mStorylineBank[mIndex].getBottomButton());
     }

     private void setEnding(int storyEndingIndex){
         mStoryTextView.setText(storyEndingIndex);
         mButtonTop.setVisibility(View.GONE);
         mButtonBottom.setVisibility(View.GONE);
     }


}
