class InstagramRunner{
public static void main(String[] args) {
System.out.println("--first time method call--");
String poorvika=Instagram.validateAndRegister(9465676543l,"poorvika@123","09-9-2006","poorvika HP","poorvika_hp");
System.out.println(poorvika);

System.out.println("--second time method call--");
String anu=Instagram.validateAndRegister(946654543l,"anu@123","23-10-2006","anushree","anushree_anu");
System.out.println(anu);
}
}