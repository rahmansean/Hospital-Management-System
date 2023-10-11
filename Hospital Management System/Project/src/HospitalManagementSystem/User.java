package HospitalManagementSystem;

public class User {
    private int Id;
    private String Name;
    private String Qualification;
    private int ConsultationFees;


    
      public User(int Id, String Name, String Qualification,int ConsultationFees) {
        this.Id = Id;
        this.Name = Name;
        this.Qualification = Qualification;
        this.ConsultationFees=ConsultationFees;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public int getConsultationFees() {
        return ConsultationFees;
    }

    public void setConsultationFees(int ConsultationFees) {
        this.ConsultationFees = ConsultationFees;
    }
    

}
