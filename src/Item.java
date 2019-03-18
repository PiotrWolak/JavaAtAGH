public class Item implements Comparable, IPrint {
    private String name;
    private double mass;
    private int quantity;

    @Override
    public void print() {
        System.out.println("nazwa " + name + " masa " + mass + " ilosc " + quantity);
    }

    @Override
    public boolean compare(Item item) {
        if(this.name==item.name) return true;
        else return false;
    }



    protected enum condition {
        NEW, USED, REFURBISHED;
    }
    public Item(String name, double mass, int quantity) {
        this.name = name;
        this.mass = mass;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
