class WashingMachine{
  static boolean isSwitch;
  static int maxLoad=10;
  static int minLoad=1;
  static int currentLoad=5;
  
  public static boolean onOrOff(){
  System.out.println("on or off method started");
  if(isSwitch==false){
  isSwitch=true;
  System.out.println("Washing Machine is ON:"+isSwitch);
  }
  else{
  isSwitch=false;
  System.out.println("Washing Machine is OFF:"+isSwitch);
  }
  System.out.println("on or off method ended");
  return isSwitch;
  }
}