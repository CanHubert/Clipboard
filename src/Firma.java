import java.util.List;

public class Firma {
    private String nazwa;
    private String NIP;
    private String FormaPrawna;
    private String Branza;
    private String telefon;
    private String email;
    private String adres;
    private String kod;
    private String miasto;
    private String wojewodztwo;
    private String WWW;
    private String password;


    public Firma() {
    }
    public Firma(List<String> list){
        this.nazwa = list.get(0);
        this.NIP = list.get(1);
        this.FormaPrawna = list.get(2);
        this.Branza = list.get(3);
        this.telefon = "+"+list.get(4);
        this.email = list.get(5);
        this.adres = list.get(6).replace("ul. ", "");
        this.kod = list.get(7);
        this.miasto = list.get(8);
        this.wojewodztwo = list.get(9);
        this.WWW = list.get(10);


    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getFormaPrawna() {
        return FormaPrawna;
    }

    public void setFormaPrawna(String formaPrawna) {
        FormaPrawna = formaPrawna;
    }

    public String getBranza() {
        return Branza;
    }

    public void setBranza(String branza) {
        Branza = branza;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getWojewodztwo() {
        return wojewodztwo;
    }

    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    public String getWWW() {
        return WWW;
    }

    public void setWWW(String WWW) {
        this.WWW = WWW;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
