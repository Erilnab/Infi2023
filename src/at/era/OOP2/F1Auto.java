package at.era.OOP2;

public class F1Auto {
    private String Motor;
    private int bhp;
    private int topspeed;
    private String Teamname;

    public F1Auto(String Motor, int bhp, int topspeed, String Teamname) {
        this.Motor=Motor;
        this.bhp=bhp;
        this.topspeed=topspeed;
        this.Teamname=Teamname;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }

    public int getBhp() {
        return bhp;
    }

    public void setBhp(int bhp) {
        this.bhp = bhp;
    }

    public int getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(int topspeed) {
        this.topspeed = topspeed;
    }

    public String getTeamname() {
        return Teamname;
    }

    public void setTeamname(String teamname) {
        Teamname = teamname;
    }
}
