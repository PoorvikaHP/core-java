class Microwave{
  static boolean isSwitch;
  static int maxTime=60;
  static int minTime=1;
  static int currentTime=10;
  
  public static boolean onOrOff(){
  System.out.println("on or off method started");
  if(isSwitch==false){
  isSwitch=true;
  System.out.println("Microwave is ON:"+isSwitch);
  }
  else{
  isSwitch=false;
  System.out.println("Microwave is OFF:"+isSwitch);
  }
  System.out.println("on or off method ended");
  return isSwitch;
  }
}