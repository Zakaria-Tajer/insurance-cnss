package Models;

import jakarta.persistence.*;


@Entity
@Table(name = "doctor")
public class Doctor {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "doctor_type")
    private String doctor_type;

    @Column(name = "remboursement")
    private int remboursement;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctor_type() {
        return doctor_type;
    }

    public void setDoctor_type(String doctor_type) {
        this.doctor_type = doctor_type;
    }

    public int getRemboursement() {
        return remboursement;
    }

    public void setRemboursement(int remboursement) {
        this.remboursement = remboursement;
    }
}
