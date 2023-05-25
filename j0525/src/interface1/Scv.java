package interface1;

public class Scv extends GroundUnit implements Repairable {

    Scv() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable g) {
        // Repairable g = new Tank(); // 다형성
        Unit t = (Unit) g;

        while (t.hitPoint != t.MAX_HP) {
            t.hitPoint++;
        }
    }

}
