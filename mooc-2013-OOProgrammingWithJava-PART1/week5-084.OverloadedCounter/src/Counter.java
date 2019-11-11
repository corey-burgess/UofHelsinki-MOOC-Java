public class Counter {
    private int number;
    private boolean check;

    public Counter (int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;
    }

    public Counter (int startingValue) {
        this(startingValue,false);
    }

    public Counter (boolean check) {
        this(0,check);
    }

    public Counter () {
        this (0,false);
    }

    public int value() {
        return this.number;
    }

    public void increase () {
        this.increase(1);
    }

    public void decrease () {
        this.decrease(1);
    }

    public void increase (int increaseAmount) {
        if (increaseAmount > -1) {
            this.number += increaseAmount;
        }
    }

    public void decrease (int decreaseAmount) {
        if (decreaseAmount > -1) {
            if (this.check) {
                if (this.number < decreaseAmount) {
                    this.number = 0;
                    return;
                }
            }
            this.number -= decreaseAmount;
        }
    }


}
