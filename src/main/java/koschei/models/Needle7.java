package koschei.models;


public class Needle7 {

    private Deth8 death;

    public Needle7(Deth8 death) {
        this.death = death;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + death.toString();
    }
}
