package Models;

import jakarta.persistence.*;

@Entity
@Table(name = "analysis")
public class Analysis {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "analysis_name")
    private String analysis_name;

    @Column(name = "analysis_uniqueId")
    private String analysis_uniqueId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnalysis_name() {
        return analysis_name;
    }

    public void setAnalysis_name(String analysis_name) {
        this.analysis_name = analysis_name;
    }

    public String getAnalysis_uniqueId() {
        return analysis_uniqueId;
    }

    public void setAnalysis_uniqueId(String analysis_uniqueId) {
        this.analysis_uniqueId = analysis_uniqueId;
    }
}
