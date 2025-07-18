public class Container {

    private int value;

    public Container() {
        this.value = 0;
    }

    public int contains() {
        return this.value;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.value += amount;
            if (this.value > 100) {
                this.value = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (this.value > amount) {
                this.value -= amount;
            } else {
                this.value = 0;
            }
        }
    }

    public String toString() {
        return this.value + "/100";
    }
}
