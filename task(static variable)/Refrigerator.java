class Refrigerator{
  static boolean isSwitch;
  static int maxTemperature=10;
  static int minTemperature=0;
  static int currentTemperature=5;
  
  public static boolean onOrOff(){
  System.out.println("on or off method started");
  if(isSwitch==false){
  isSwitch=true;
  System.out.println("Refrigerator is ON:"+isSwitch);
  }
  else{
  isSwitch=false;
  System.out.println("Refrigerator is OFF:"+isSwitch);
  }
  System.out.println("on or off method ended");
  return isSwitch;
  }
}