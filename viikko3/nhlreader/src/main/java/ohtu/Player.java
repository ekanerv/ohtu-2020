
package ohtu;

public class Player implements Comparable<Player>{
    private String name;
    private String team;
    private int goals;
    private int assists;
    private String nationality;

    public void setName(String name) {
        this.name = name;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public void setGoals(int goals) {
        this.goals = goals;
    }
    public void setAssists(int assists) {
        this.assists = assists;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
    public int getGoals() {
        return goals;
    }
    public int getAssists() {
        return assists;
    }
    public String getNationality() {
        return nationality;
    }
    
    public int getSum() {
        return getGoals() + getAssists();
    }
    
    public int compareTo(Player player) {
        return this.getSum() < player.getSum() ? 1 : this.getSum() > player.getSum() ? -1 : 0;
    }

    @Override
    public String toString() {
        return String.format("%-20s%5s%3d%3s%3d%3s%3d", name, team, goals, "+", assists, "=", getSum());
    }
      
}
