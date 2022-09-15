package hu.petrik.pontoop.pont;
public class Pont {
    private int x;
    private int y;
    public Pont(){
        x = 0;
        y = 0;
    }

    public Pont(int x, int y){

        this.x=x;
        this.y=y;
    }

    public Pont(int n) {
        this.x = koordinataGeneralasa(n);
        this.y = koordinataGeneralasa(n);
    }

    private int koordinataGeneralasa(int n) {
        return (int)(Math.random() * ((2*n) + 1)) - n;
    }

    public double getOrigotolMertTavolsag() {
        return Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2));
    }
    @Override
    public String toString() {
       return String.format("(%d, %d)", this.x, this.y);

    }
}

