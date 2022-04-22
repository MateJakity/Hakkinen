import java.time.LocalDate;

public class Race {
    private String nagydij;
    private LocalDate localdate;
    private String konstruktor;
    private int eredmeny;
    private int pont;

    public Race(String nagydij, LocalDate localdate, String konstruktor, int eredmeny, int pont) {
        this.nagydij = nagydij;
        this.localdate = localdate;
        this.konstruktor = konstruktor;
        this.eredmeny = eredmeny;
        this.pont = pont;
    }

    public String getNagydij() {
        return nagydij;
    }

    public void setNagydij(String nagydij) {
        this.nagydij = nagydij;
    }

    public LocalDate getLocaldate() {
        return localdate;
    }

    public void setLocaldate(LocalDate localdate) {
        this.localdate = localdate;
    }

    public String getKonstruktor() {
        return konstruktor;
    }

    public void setKonstruktor(String konstruktor) {
        this.konstruktor = konstruktor;
    }

    public Integer getEredmeny() {
        return eredmeny;
    }

    public void setEredmeny(int eredmeny) {
        this.eredmeny = eredmeny;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }


}
