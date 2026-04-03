class IPLteam{
String teamName;
static int noOfPlayers=11;
String captainName;
String coachName;
String ownerName;
String jerseyColor;


public IPLteam() {

}

public IPLteam(String teamName, String captainName, String coachName, String ownerName, String jerseyColor) {
	this.teamName = teamName;
        this.captainName = captainName;
        this.coachName = coachName;
        this.ownerName = ownerName;
        this.jerseyColor = jerseyColor;
   
}

public void displayTeamDeatils() {

    System.out.println("Team Name :" + teamName);
    System.out.println("Caption Name :" + captainName);
    System.out.println("number of players:" + noOfPlayers);
    System.out.println("coach name:" + coachName);
    System.out.println("Owner Name :" + ownerName);
    System.out.println("Jersey colour:" + jerseyColor);
}


}