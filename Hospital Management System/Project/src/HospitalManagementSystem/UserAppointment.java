
package HospitalManagementSystem;

public class UserAppointment {
    int id;
    String Name,gender,email,birth,slot,aptdate ,doctorName,disease;


    public UserAppointment(int id, String Name, String gender, String email, String birth, String slot, 
                           String aptdate , String doctorName, String disease) 
    {
        this.id = id;
        this.Name = Name;
        this.gender = gender;
        this.email = email;
        this.birth = birth;
        this.slot = slot;
        this.aptdate = aptdate;
        
        this.doctorName = doctorName;
        this.disease = disease;
  
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String Name() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

 

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
    

    public String getAptdate() {
        return aptdate;
    }

    public void setAptdate(String aptdate) {
        this.aptdate = aptdate;
    }

     
    
}
