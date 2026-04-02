class Elevator{
  static boolean isSwitch;
  static int maxFloor=10;
  static int minFloor=0;
  static int currentFloor=1;
  
  public static boolean onOrOff(){
  System.out.println("on or off method started");
  if(isSwitch==false){
  isSwitch=true;
  System.out.println("Elevator is ON:"+isSwitch);
  }
  else{
  isSwitch=false;
  System.out.println("Elevator is OFF:"+isSwitch);
  }
  System.out.println("on or off method ended");
  return isSwitch;
  }
}