package ohtu.verkkokauppa;

public class Viitegeneraattori implements ViitegeneraattoriRajapinta {

    /*public static Viitegeneraattori instanssi;

    public static Viitegeneraattori getInstance() {
        if (instanssi == null) {
            instanssi = new Viitegeneraattori();
        }

        return instanssi;
    }*/
    
    public int seuraava;
    
    public Viitegeneraattori(){
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
