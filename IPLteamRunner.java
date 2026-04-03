class IPLteamRunner{
	    public static void main(String[] args) {

	IPLteam rcb=new IPLteam();
	rcb.teamName="RCB";
	rcb.captainName="Faf du Plessis";
	rcb.coachName="Andy Flower";
	rcb.ownerName="United Spirits Limited";
	rcb.jerseyColor="black and red";
	
	rcb.displayTeamDeatils();
	
	IPLteam csk=new IPLteam("CSK", "MS Dhoni", "Stephen Fleming", "India Cements", "Yellow");
     csk.displayTeamDeatils();

}
}