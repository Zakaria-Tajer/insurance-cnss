package Models;

import jakarta.persistence.*;


@Entity
@Table(name = "radio_as")
public class Radio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "radioName")
    private String radio_name;

    @Column(name = "radioUniqueId")
    private String radio_unique_id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRadio_name() {
        return radio_name;
    }

    public void setRadio_name(String radio_name) {
        this.radio_name = radio_name;
    }
}
