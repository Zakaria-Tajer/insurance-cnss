package Models;


import jakarta.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int patient_id;

    @Column(name = "patient_dossier")
    private int patient_dossier;

    @Column(name = "patient_name")
    private String patient_name;

    @Column(name = "patientUniqueId")
    private String patient_unique_id;


    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getPatient_dossier() {
        return patient_dossier;
    }

    public void setPatient_dossier(int patient_dossier) {
        this.patient_dossier = patient_dossier;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_unique_id() {
        return patient_unique_id;
    }

    public void setPatient_unique_id(String patient_unique_id) {
        this.patient_unique_id = patient_unique_id;
    }
}
