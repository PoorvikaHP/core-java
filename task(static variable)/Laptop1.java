class Laptop1{
  static boolean isSwitch;
  static int maxBattery=100;
  static int minBattery=0;
  static int currentBattery=75;
  
  public static boolean onOrOff(){
  System.out.println("on or off method started");
  if(isSwitch==false){
  isSwitch=true;
  System.out.println("Laptop is ON:"+isSwitch);
  }
  else{
  isSwitch=false;
  System.out.println("Laptop is OFF:"+isSwitch);
  }
  System.out.println("on or off method ended");
  return isSwitch;
  }
}