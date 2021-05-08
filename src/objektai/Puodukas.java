package objektai;

/**
 *
 * @author tomas
 */
public class Puodukas {

//    public - matoma visiems
//    protected - matoma deklaravusioj klasėj ir paveldėjusioj (vaiko) klasėj
//    (default) arba (package protected)
//    private - matoma tik deklaravusioj klasėj
    private int turis;
    private char spalva;
    protected int kiekis;

    public Puodukas() {
        this.turis = 150;
        this.spalva = 'Ž';
        this.kiekis = 0;
    }

    public Puodukas(int turis, char spalva) {
        this.turis = turis;
        this.spalva = spalva;
        this.kiekis = 0;
    }

    public int getTuris() {
        return this.turis;
    }

    public boolean isTuscias() {
        return this.kiekis == 0;
    }

    public boolean getPilnas() {
        return this.kiekis == this.turis;
    }

    public char getSpalva() {
        return this.spalva;
    }

    public void setSpalva(char spalva) {
        this.spalva = spalva;
    }

    public void ipilk() {
        this.kiekis = this.turis;
    }

    public void ipilk(String s) {
        System.out.println(s);
        this.kiekis = this.turis;
    }

    public void ipilk(int kiek) {
        if (kiek <= 0) {
            return;
        }
        this.kiekis += kiek;
        this.kiekis = this.kiekis > this.turis ? this.turis : this.kiekis;
    }

    public void ipilk(String s, int kiek) {
        if (kiek <= 0) {
            return;
        }
        this.kiekis += kiek;
        this.kiekis = this.kiekis > this.turis ? this.turis : this.kiekis;
        System.out.println("Papildymas atvirkščiai " + s + ": +" + kiek);
    }

    public void isgerk(int kiek) {
        if (kiek > 0) {
            this.kiekis -= kiek;
            this.kiekis = this.kiekis < 0 ? 0 : this.kiekis;
        }
    }

}
