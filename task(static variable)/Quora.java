class Quora{
public static String validateAndRegister(long mobileNumber,String psw,String birthday,String fullName,String userName){
System.out.println("validateAndRegister method started");
String registerStatus=null;
if(mobileNumber!=0 && psw !=null && birthday !=null && fullName !=null && userName!=null){
               if(psw.length()>6 && fullName.length()>4 && userName.length()>4){
      registerStatus="thank you"+  fullName  +"registered successfully";
         }else{
           registerStatus="please check the length of name or password";
}
               }else{
         registerStatus="please enter the valid data";
}
           System.out.println("validateAndRegister method ended");
            return registerStatus;
}
}