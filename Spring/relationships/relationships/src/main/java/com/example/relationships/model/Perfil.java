package com.example.relationships.model;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_perfil")

public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_perfil")
    private Long codigo;

    private String youtube;
    private String facebook;
    private String linkedin;

    public Perfil() {

    }

    public Perfil(String y, String f, String l) {
        this.youtube = y;
        this.facebook = f;
        this.linkedin = l;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String y) {
        this.youtube = y;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String f) {
        this.facebook = f;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String l) {
        this.linkedin = l;
    }

}
