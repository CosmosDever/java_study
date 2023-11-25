public class car {
    private int fuel;
    public car(){fuel=0;}
    public car(int g){fuel=g;}
    public void addFuel(){fuel++;}
    public void display(){System.out.print(fuel+" ");}
    public static void main(String[] args) {
        car c1 = new car(5);
        car c2 = new Racecar(5);
        c1.display();
        c1.addFuel();
        c1.display();
        c2.display();
        c2.addFuel();
        c2.display();
    }


}
class Racecar extends car{
    public Racecar(int g){super(2*g);}
}