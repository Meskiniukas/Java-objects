package objektai;

/**
 *
 * @author tomas
 */
public class StebuklingasTermosas extends Termosas {
    
    public StebuklingasTermosas() {
        super(5000, 'G');
    }

    @Override
    public void ipilk(int kiek) {
        super.ipilk(kiek * 2);
    }
    
    @Override
    public void isgerk(int kiek) {
        super.isgerk(kiek * 2);
    }
    
}
