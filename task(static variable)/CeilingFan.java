class CeilingFan{
  static boolean isSwitch;
  static int maxSpeed=5;
  static int minSpeed=1;
  static int currentSpeed=3;
  
  public static boolean onOrOff(){
  System.out.println("on or off method started");
  if(isSwitch==false){
  isSwitch=true;
  System.out.println("Ceiling Fan is ON:"+isSwitch);
  }
  else{
  isSwitch=false;
  System.out.println("Ceiling Fan is OFF:"+isSwitch);
  }
  System.out.println("on or off method ended");
  return isSwitch;
  }
}