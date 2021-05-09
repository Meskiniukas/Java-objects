package objektai;

/**
 *
 * @author tomas
 */
public class SportineMasina extends Masina {

    private boolean spoiler;

    public SportineMasina(String name, int maxspeed) {
        super(name, maxspeed);
    }

    public boolean isSpoiler() {
        return spoiler;
    }
        
    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    @Override
    public void gazuok(int kiek) {
        if (!this.spoiler) {
            this.speed = kiek * 2 + this.speed < this.maxspeed ? this.speed += kiek * 2 : this.maxspeed;
        } else {
            super.gazuok(kiek);
        }
    }

    @Override
    public void stabdyk(int kiek) {
        if (this.spoiler) {
            this.speed = this.speed - kiek * 2 > 0 ? this.speed -= kiek * 2 : 0;
        } else {
            super.stabdyk(kiek);
        }
    }

}
