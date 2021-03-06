package models;

import java.util.ArrayList;


public class Team {
    private String teamName;
    private String description;
    private ArrayList<Member> members = new ArrayList<>();
    private static ArrayList<Team> teamList = new ArrayList<>();
    private int id;


    public Team(String teamName, String description) {
        this.teamName = teamName;
        this.description = description;
        teamList.add(this);
        this.id = teamList.size();
    }

    public String getTeamName() {
        return teamName;
    }

    public String getDescription() {
        return description;
    }

    public void addMembers(Member member) {

            members.add(member);
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public int getId() {
        return id;
    }

    public static ArrayList<Team> getTeams() {
        return teamList;
    }

    public static Team findById(int id) {
        return teamList.get(id-1);
    }

    public void updateTeam(String teamName) {
        this.teamName = teamName;
    }

    public static void clearAllTeams(){
        teamList.clear();
    }
}

