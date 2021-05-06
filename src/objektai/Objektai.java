package objektai;

/**
 *
 * @author tomas
 */
public class Objektai {

    public static void main(String[] args) {
        
        Puodukas p = new Puodukas(300, 'r');
        Puodukas paprastas = new Puodukas();
        
        Termosas t = new Termosas(1000, 'M');
        System.out.println(t.getTuris());
        System.out.println(t.getSpalva());
        
        
//        p.turis = 300;
//        p.spalva = 'r';
        System.out.println(p.kiekis);
        p.kiekis = 0;
        System.out.println(p.kiekis);
        p.ipilk(100, "Čiut čiut");
        System.out.println(p.kiekis);
        p.ipilk("Čiut čiut", 50);
        System.out.println(p.kiekis);
        
        System.out.println(p.getSpalva());
        p.setSpalva('z');
        System.out.println(p.getSpalva());
        
//        p.ipilk(100);
//        System.out.println(p.kiekis);
//        p.ipilk(100);
//        System.out.println(p.kiekis);
//        p.ipilk(500);
//        System.out.println(p.kiekis);
        System.out.println("******** ******** Geriam ******** ********");
        p.isgerk(-50);
        System.out.println(p.kiekis);
        p.isgerk(100);
        System.out.println(p.kiekis);
        p.isgerk(100);
        System.out.println(p.kiekis);
        p.isgerk(150);
        System.out.println(p.kiekis);
        System.out.println("******** ******** 0 ******** ********");
        
        Puodukas kp = new Puodukas(150, 'b');
//        kp.turis = 150;
//        kp.spalva = 'b';
//        kp.kiekis = 100;
        
        Puodukas dvp = p;
        dvp.kiekis = 200;
        
        System.out.println(p.getTuris());
        System.out.println(kp.getTuris());
        System.out.println("******** ******** 1 ******** ********");
        System.out.println(p.kiekis);
        System.out.println(kp.kiekis);
        System.out.println(dvp.kiekis);
        
        dvp = kp;
        dvp.kiekis = 20;
        System.out.println("******** ******** 2 ******** ********");
        System.out.println(p.kiekis);
        System.out.println(kp.kiekis);
        System.out.println(dvp.kiekis);
        
        
        
        
    }
    
}
