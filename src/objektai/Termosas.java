package objektai;

/**
 *
 * @author tomas
 */
public class Termosas extends Puodukas {

    private int temp;

    public Termosas() {
        super(); // Įrašo pati Java mintyse.
        this.temp = 20;
    }

    public Termosas(int turis, char spalva) {
        super(turis, spalva); // Jei nebus nurodytas super su parametrais, Java mintyse įsirašys super();
        this.temp = 20;
    }

    public int getTemp() {
        return temp;
    }

    public void pasildyk(int kiek) {
        if (kiek <= 0) {
            return;
        }
        this.temp += kiek;
    }

    public void atvesink(int kiek) {
        if (kiek <= 0) {
            return;
        }
        this.temp -= kiek;
    }

    @Override
    public void ipilk(int kiek) {
//        if (kiek <= 0) {
//            return;
//        }
//        this.kiekis += kiek;
//        this.kiekis = this.kiekis > this.getTuris() ? this.getTuris() : this.kiekis;
        super.ipilk(kiek); //metodo paieška pradedama nuo aukščiau stovinčios klasės
        this.temp -= 5;
    }

    @Override
    public String toString() {
        return "Termosas{" + "temp=" + temp + "} (" + super.toString() + ")";
    }
    
    

}
