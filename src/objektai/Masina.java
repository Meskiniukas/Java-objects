package objektai;

/**
 *
 * @author tomas
 */
public class Masina {

    protected String name;
    protected int maxspeed;
    protected int distance;
    protected int speed;

    public Masina(String name, int maxspeed) {
        this.name = name;
        this.maxspeed = maxspeed;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public int getSpeed() {
        return speed;
    }
    
    public void gazuok(int kiek) {
        this.speed = kiek + this.speed < this.maxspeed ? this.speed += kiek : this.maxspeed;
    }

    public void stabdyk(int kiek) {
        this.speed = this.speed - kiek > 0 ? this.speed -= kiek : 0;
    }
    
    public void vaziuok() {
        this.distance += this.speed;
    }
    
}
