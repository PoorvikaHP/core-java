class ElectricHeater{
  static boolean isSwitch;
  static int maxTemperature=100;
  static int minTemperature=20;
  static int currentTemperature=40;
  
  public static boolean onOrOff(){
  System.out.println("on or off method started");
  if(isSwitch==false){
  isSwitch=true;
  System.out.println("Heater is ON:"+isSwitch);
  }
  else{
  isSwitch=false;
  System.out.println("Heater is OFF:"+isSwitch);
  }
  System.out.println("on or off method ended");
  return isSwitch;
  }
}