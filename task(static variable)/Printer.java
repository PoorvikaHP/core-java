class Printer{
  static boolean isSwitch;
  static int maxInk=100;
  static int minInk=0;
  static int currentInk=60;
  
  public static boolean onOrOff(){
  System.out.println("on or off method started");
  if(isSwitch==false){
  isSwitch=true;
  System.out.println("Printer is ON:"+isSwitch);
  }
  else{
  isSwitch=false;
  System.out.println("Printer is OFF:"+isSwitch);
  }
  System.out.println("on or off method ended");
  return isSwitch;
  }
}