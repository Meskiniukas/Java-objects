package objektai;

/**
 *
 * @author tomas
 */
public class Objektai {

    public static void main(String[] args) {

        int[] m = new int[3];

        Puodukas[] pm = new Puodukas[4];
        pm[0] = new Puodukas(300, 'g');
        pm[1] = new StebuklingasTermosas();
        pm[3] = new Sikpuodis();

        Puodukas[] kpm = {
            new Puodukas(300, 'g'),
            new StebuklingasTermosas(),
            new Puodukas(),
            new Sikpuodis()
        };
        
        
        //        Puodukas p = new Puodukas(300, 'r');
        //        Puodukas paprastas = new Puodukas();
        //
        //        Termosas t = new Termosas(1000, 'M');
        //        System.out.println(t.getTuris());
        //        System.out.println(t.getSpalva());
        //        t.ipilk(250);
        //        System.out.println(t.kiekis);
        //        System.out.println(t.getTemp());
        //        System.out.println(t);
        //
        //        Puodukas pp = new StebuklingasTermosas();
        //        pp.ipilk(250);
        //        System.out.println(pp);
        //
        ////        pp = new Sikpuodis();
        //        if (pp instanceof Termosas) {
        //
        //            Termosas tt = (Termosas) pp;
        //            tt.pasildyk(20);
        //            System.out.println(tt);
        //
        //            ((Termosas) pp).atvesink(10);
        //            System.out.println(pp);
        //        }
        //
        ////        p.turis = 300;
        ////        p.spalva = 'r';
        //        System.out.println(p.kiekis);
        //        p.kiekis = 0;
        //        System.out.println(p.kiekis);
        //
        //        System.out.println(p.kiekis);
        //        p.ipilk("Čiut čiut", 50);
        //        System.out.println(p.kiekis);
        //
        //        System.out.println(p.getSpalva());
        //        p.setSpalva('z');
        //        System.out.println(p.getSpalva());
        //
        ////        p.ipilk(100);
        ////        System.out.println(p.kiekis);
        ////        p.ipilk(100);
        ////        System.out.println(p.kiekis);
        ////        p.ipilk(500);
        ////        System.out.println(p.kiekis);
        //        System.out.println("******** ******** Geriam ******** ********");
        //        p.isgerk(-50);
        //        System.out.println(p.kiekis);
        //        p.isgerk(100);
        //        System.out.println(p.kiekis);
        //        p.isgerk(100);
        //        System.out.println(p.kiekis);
        //        p.isgerk(150);
        //        System.out.println(p.kiekis);
        //        System.out.println("******** ******** 0 ******** ********");
        //
        //        Puodukas kp = new Puodukas(150, 'b');
        ////        kp.turis = 150;
        ////        kp.spalva = 'b';
        ////        kp.kiekis = 100;
        //
        //        Puodukas dvp = p;
        //        dvp.kiekis = 200;
        //
        //        System.out.println(p.getTuris());
        //        System.out.println(kp.getTuris());
        //        System.out.println("******** ******** 1 ******** ********");
        //        System.out.println(p.kiekis);
        //        System.out.println(kp.kiekis);
        //        System.out.println(dvp.kiekis);
        //
        //        dvp = kp;
        //        dvp.kiekis = 20;
        //        System.out.println("******** ******** 2 ******** ********");
        //        System.out.println(p.kiekis);
        //        System.out.println(kp.kiekis);
        //        System.out.println(dvp.kiekis);

    }

}
