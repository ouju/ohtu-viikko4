package ohtu.verkkokauppa;

public class Kauppa implements KauppaRajapinta {

    public VarastoRajapinta varasto;
    public PankkiRajapinta pankki;
    public Ostoskori ostoskori;
    public ViitegeneraattoriRajapinta viitegeneraattori;
    public String kaupanTili;

    public Kauppa(VarastoRajapinta varasto, PankkiRajapinta pankki, ViitegeneraattoriRajapinta viitegeneraattori) {
        this.varasto = varasto;
        this.pankki = pankki;
        this.viitegeneraattori = viitegeneraattori;
        
        /*  varasto = Varasto.getInstance();
        pankki = Pankki.getInstance();
        viitegeneraattori = Viitegeneraattori.getInstance();
              */
        kaupanTili = "33333-44455";
    }

    @Override
    public void aloitaAsiointi() {
        ostoskori = new Ostoskori();
    }

    @Override
    public void poistaKorista(int id) {
        Tuote t = varasto.haeTuote(id); 
        varasto.palautaVarastoon(t);
    }

    @Override
    public void lisaaKoriin(int id) {
        if (varasto.saldo(id)>0) {
            Tuote t = varasto.haeTuote(id);             
            ostoskori.lisaa(t);
            varasto.otaVarastosta(t);
        }
    }

    @Override
    public boolean tilimaksu(String nimi, String tiliNumero) {
        int viite = viitegeneraattori.uusi();
        int summa = ostoskori.hinta();
        
        return pankki.tilisiirto(nimi, viite, tiliNumero, kaupanTili, summa);
    }

}
