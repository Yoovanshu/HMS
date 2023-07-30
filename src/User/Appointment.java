package User;

public class Appointment {
    // Declaring the objects
    Doctor Doctor;
    Patient Patient;
    int priority; // For emergency cases
    String Recommendation, Date;

    public Appointment(User.Doctor doctor, User.Patient patient, int priority, String recommendation, String date) {
        Doctor = doctor;
        Patient = patient;
        this.priority = priority;
        Recommendation = recommendation;
        Date = date;
    }

    public User.Doctor getDoctor() {
        return Doctor;
    }

    public void setDoctor(User.Doctor doctor) {
        Doctor = doctor;
    }

    public User.Patient getPatient() {
        return Patient;
    }

    public void setPatient(User.Patient patient) {
        Patient = patient;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getRecommendation() {
        return Recommendation;
    }

    public void setRecommendation(String recommendation) {
        Recommendation = recommendation;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "Doctor=" + Doctor.toString() + // WE ADDED .toString(), to return all its data
                ", Patient=" + Patient.toString() +
                ", priority=" + priority +
                ", Recommendation='" + Recommendation + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
