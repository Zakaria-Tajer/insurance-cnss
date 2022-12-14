package Models;


import jakarta.persistence.*;

@Entity
@Table(name = "Dossier")
public class Dossier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dossierId;

    @Column(name = "patientIds")
    @JoinColumn(name = "patientId", referencedColumnName = "patient_id" ,insertable = false,updatable = false)
    private int patient;

    @Column(name = "radioIds")
    @JoinColumn(name = "radioId", referencedColumnName = "id",insertable = false,updatable = false)
    private int radio;

    @Column(name = "analysis_id")
    @JoinColumn(name = "analysis_id", referencedColumnName = "id",insertable = false,updatable = false)
    private int analysis;

    @Column(name = "doctor_id")
    @JoinColumn(name = "doctor_id", referencedColumnName = "id",insertable = false,updatable = false)
    private int doctorId;

    public int getDossierId() {
        return dossierId;
    }

    public void setDossierId(int dossierId) {
        this.dossierId = dossierId;
    }

    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getAnalysis() {
        return analysis;
    }

    public void setAnalysis(int analysis) {
        this.analysis = analysis;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
}
