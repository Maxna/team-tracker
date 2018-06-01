package models;


import java.util.ArrayList;

public class Team {
    private String teamName;
    private String description;
    private String member;
    private int id;
    private static ArrayList<Team> teamList = new ArrayList<>();

    public Team(String teamName, String description, String member) {
        this.teamName = teamName;
        this.description = description;
        this.member = member;
        teamList.add(this);
        this.id = teamList.size();

    }

    public String getTeamName() {
        return teamName;
    }

    public String getDescription() {
        return description;
    }

    public String getMember() {
        return member;
    }

    public int getId() {
        return id;
    }

    public static ArrayList<Team> getAll() {
        return teamList;
    }

    public static Team findById(int id) {
        return teamList.get(id-1);
    }
}
