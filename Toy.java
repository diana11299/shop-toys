public class Toy {
    int id;
    String name;
    int lossRate;

    public Toy(int id, String name, int lossRate){
        this.id = id;
        this.name = name;
        this.lossRate = lossRate;
    }


    @Override
    public String toString() {
        return "Create_toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lossRate=" + lossRate +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLossRate() {
        return lossRate;
    }

    public void setLossRate(int lossRate) {
        this.lossRate = lossRate;
    }
}
