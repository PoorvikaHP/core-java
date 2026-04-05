class Hospital{
  String patientName;
 int patientId;
 String disease;
  double billAmount;
 String doctorName;
public Hospital() {
this("Arjun", 101);
System.out.println("Default Constructor");
}
public Hospital(String patientName, int patientId) {
  this("Arjun", 101,"Fever");
  System.out.println("Two Parameter Constructor");
}
public Hospital(String patientName, int patientId, String disease) {
 this("Arjun", 101,"Fever", 1500.0);
 System.out.println("Three Parameter Constructor");
}
public Hospital(String patientName, int patientId, String disease, double billAmount) {
 this("Arjun", 101,"Fever", 1500.0,"Dr. Sharma");
System.out.println("Four Parameter Constructor");
}
public Hospital(String patientName, int patientId, String disease, double billAmount, String doctorName) {
        System.out.println("Patient : " + patientName);
        System.out.println("ID : " + patientId);
        System.out.println("Disease : " + disease);
        System.out.println("Bill : " + billAmount);
        System.out.println("Doctor : " + doctorName);
    }
}