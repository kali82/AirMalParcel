package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Receiver {
    private int id;
    private String imie;
    private String nazwisko;
    private String miejscowosc;
    private String ulica;
    private String numerDomu;
    private String kodPocztowy;
    private String numerTelefonu;
    private String numerListu;
    private String kwotaPrzesylki;
    private String kosztWysylki;
    private String dataWysylki;
    private String statusPrzesylki;
    private Byte statusRozliczenia;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "imie")
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Basic
    @Column(name = "nazwisko")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Basic
    @Column(name = "miejscowosc")
    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    @Basic
    @Column(name = "ulica")
    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    @Basic
    @Column(name = "numerDomu")
    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        this.numerDomu = numerDomu;
    }

    @Basic
    @Column(name = "kodPocztowy")
    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    @Basic
    @Column(name = "numerTelefonu")
    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    @Basic
    @Column(name = "numerListu")
    public String getNumerListu() {
        return numerListu;
    }

    public void setNumerListu(String numerListu) {
        this.numerListu = numerListu;
    }

    @Basic
    @Column(name = "kwotaPrzesylki")
    public String getKwotaPrzesylki() {
        return kwotaPrzesylki;
    }

    public void setKwotaPrzesylki(String kwotaPrzesylki) {
        this.kwotaPrzesylki = kwotaPrzesylki;
    }

    @Basic
    @Column(name = "kosztWysylki")
    public String getKosztWysylki() {
        return kosztWysylki;
    }

    public void setKosztWysylki(String kosztWysylki) {
        this.kosztWysylki = kosztWysylki;
    }

    @Basic
    @Column(name = "dataWysylki")
    public String getDataWysylki() {
        return dataWysylki;
    }

    public void setDataWysylki(String dataWysylki) {
        this.dataWysylki = dataWysylki;
    }

    @Basic
    @Column(name = "statusPrzesylki")
    public String getStatusPrzesylki() {
        return statusPrzesylki;
    }

    public void setStatusPrzesylki(String statusPrzesylki) {
        this.statusPrzesylki = statusPrzesylki;
    }

    @Basic
    @Column(name = "statusRozliczenia")
    public Byte getStatusRozliczenia() {
        return statusRozliczenia;
    }

    public void setStatusRozliczenia(Byte statusRozliczenia) {
        this.statusRozliczenia = statusRozliczenia;
    }


}
