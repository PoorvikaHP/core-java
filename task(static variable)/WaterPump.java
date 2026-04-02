class WaterPump{
  static boolean isSwitch;
  static int maxCapacity=1000;
  static int minCapacity=100;
  static int currentLevel=500;
  
  public static boolean onOrOff(){
  System.out.println("on or off method started");
  if(isSwitch==false){
  isSwitch=true;
  System.out.println("Water Pump is ON:"+isSwitch);
  }
  else{
  isSwitch=false;
  System.out.println("Water Pump is OFF:"+isSwitch);
  }
  System.out.println("on or off method ended");
  return isSwitch;
  }
}