class Television{
  static boolean isSwitch;
  static int maxVolume=100;
  static int minVolume=0;
  static int currentVolume=20;
  
  public static boolean onOrOff(){
  System.out.println("on or off method started");
  if(isSwitch==false){
  isSwitch=true;
  System.out.println("Television is ON:"+isSwitch);
  }
  else{
  isSwitch=false;
  System.out.println("Television is OFF:"+isSwitch);
  }
  System.out.println("on or off method ended");
  return isSwitch;
  }
}