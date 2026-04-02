class PanasonicAc{
  static boolean isSwitch;
  static int maxTemperature=50;
  static int minTemperature=10;
  static int currentTemperature=30;
  
  public static boolean onOrOff(){
  System.out.println("on or off method started");
  if(isSwitch==false){
  isSwitch=true;
  System.out.println("AC is ON:"+isSwitch);
  }
  else{
  isSwitch=false;
  System.out.println("AC is OFF:"+isSwitch);
  }
  System.out.println("on or off method ended");
  return isSwitch;
  }
}