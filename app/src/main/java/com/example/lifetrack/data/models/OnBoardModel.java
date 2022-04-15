package com.example.lifetrack.data.models;

public class OnBoardModel {
    private int animation;
    private String description;
    private String buttonText;

    public int getAnimation() {
        return animation;
    }

    public void setAnimation(int animation) {
        this.animation = animation;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public OnBoardModel(int animation, String description, String buttonText) {
        this.animation = animation;
        this.description = description;
        this.buttonText = buttonText;
    }

    public String getDescription() {
        return description;
    }

    public String getButtonText() {
        return buttonText;
    }
}
