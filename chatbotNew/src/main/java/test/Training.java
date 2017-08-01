package test;

import java.util.ArrayList;

/**
 * Created by Stan on 31.07.2017.
 */
public class Training {
    private ArrayList<String> yesList;
    private ArrayList<String> noList;
    private ArrayList<String> hzList;
    private ArrayList<String> noVoteList;

    public Training(ArrayList<String> yesList, ArrayList<String> noList, ArrayList<String> hzList, ArrayList<String> noVoteList) {
        this.yesList = yesList;
        this.noList = noList;
        this.hzList = hzList;
        this.noVoteList = noVoteList;
    }

    public ArrayList<String> getYesList() {
        return yesList;
    }

    public ArrayList<String> getNoList() {
        return noList;
    }

    public ArrayList<String> getHzList() {
        return hzList;
    }

    public ArrayList<String> getNoVoteList() {
        return noVoteList;
    }

    public void setYesList(ArrayList<String> yesList) {
        this.yesList = yesList;
    }

    public void setNoList(ArrayList<String> noList) {
        this.noList = noList;
    }

    public void setHzList(ArrayList<String> hzList) {
        this.hzList = hzList;
    }

    public void setNoVoteList(ArrayList<String> noVoteList) {
        this.noVoteList = noVoteList;
    }
}
