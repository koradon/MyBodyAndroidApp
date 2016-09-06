package com.example.michal.mybodyandroidapp.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Michał on 05.09.2016.
 */
public class BodyHistory {
    private List<Body> bodyHistory;

    public BodyHistory(List<Body> bodyHistory) {
        this.bodyHistory = bodyHistory;
    }

    public BodyHistory(){
        this.bodyHistory = new LinkedList<>();
    }

    public void addBodyToBodyHistory(Body body){
        this.bodyHistory.add(body);
    }

    public List<Body> getBodyHistory() {
        return bodyHistory;
    }

    public void setBodyHistory(List<Body> bodyHistory) {
        this.bodyHistory = bodyHistory;
    }

    @Override
    public String toString() {
        String bodyHistoryString = "";

        for(Body body: bodyHistory){
            bodyHistoryString += body.toString() + '\n';
        }

        return bodyHistoryString;
    }
}
