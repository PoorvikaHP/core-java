class Cricket{
static int noOfPlayers=10;
String teamName;
String coachName;
String jerseyColor;

public Cricket(){
System.out.println("no argument constructor");
}
public Cricket(String teamName,String coachName,String jerseyColor){
this.teamName=teamName;
this.coachName=coachName;
this.jerseyColor=jerseyColor;
}

public void display(){
	
System.out.println("Team name:"+teamName);
System.out.println("coach name:"+coachName);
System.out.println("Jersey color name:"+jerseyColor);
}
}




