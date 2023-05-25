package interface1;

public class Unit {
    int hitPoint; // 현재 체력 70
    final int MAX_HP;

    Unit() {
        MAX_HP = 10;
    }

    Unit(int hp) {
        MAX_HP = hp;
    }
}
