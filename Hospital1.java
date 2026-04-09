 class Hospital1 {

    // Properties (States)
    String hospitalName;
    String location;
    int numberOfDoctors;
    int numberOfPatients;
    int numberOfBeds;
    String chiefDoctor;
    double consultationFee;
    boolean hasEmergencyWard;
    boolean hasPharmacy;
    int establishedYear;

    // Static Variables
    static String country = "India";
    static String hospitalType = "Private";

    // Behaviours (Methods)

    public String admitPatient(String patientName) {
        System.out.println("Admitted Patient: " + patientName);
        return patientName;
    }

    public String dischargePatient(String patientName) {
        System.out.println("Discharged Patient: " + patientName);
        return patientName;
    }

    public String assignDoctor(String doctorName) {
        System.out.println("Assigned Doctor: " + doctorName);
        return doctorName;
    }

    public double collectFee(double amount) {
        System.out.println("Collected Fee: " + amount);
        return amount;
    }

    public boolean startEmergency(boolean status) {
        System.out.println("Emergency Ward Active: " + status);
        return status;
    }

    public String provideTreatment(String treatment) {
        System.out.println("Treatment Provided: " + treatment);
        return treatment;
    }

    public boolean conductSurgery(boolean surgeryStatus) {
        System.out.println("Surgery Conducted: " + surgeryStatus);
        return surgeryStatus;
    }

    public int checkAvailableBeds(int beds) {
        System.out.println("Available Beds: " + beds);
        return beds;
    }

    public String issueReport(String reportName) {
        System.out.println("Report Issued: " + reportName);
        return reportName;
    }

    public boolean maintainHygiene(boolean status) {
        System.out.println("Hygiene Maintained: " + status);
        return status;
    }
}