package com.londonappbrewery.destini;

/**
 * Created by jasmine on 21/11/17.
 */

public class StoryLine {

    private int mTopText;
    private int mTopButton;
    private int mBottomButton;

    public StoryLine (int storyTextDisplayed, int topButtonText, int bottomButtonText){
        mTopText = storyTextDisplayed;
        mTopButton = topButtonText;
        mBottomButton = bottomButtonText;
    }

    public int getTopText() {
        return mTopText;
    }

    public void setTopText(int topText) {
        mTopText = topText;
    }

    public int getTopButton() {
        return mTopButton;
    }

    public void setTopButton(int topButton) {
        mTopButton = topButton;
    }

    public int getBottomButton() {
        return mBottomButton;
    }

    public void setBottomButton(int bottomButton) {
        mBottomButton = bottomButton;
    }
}
