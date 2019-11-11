
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {

        return euros;
    }

    public int cents() {

        return cents;
    }

    public Money plus(Money added) {
        int e = this.euros + added.euros;
        int c = this.cents + added.cents;
        return new Money(e,c);
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {
        int a = (this.euros*100) + this.cents;
        int b = (decremented.euros*100) + decremented.cents;
        int c = a - b;
        if (c < 1) {
            return new Money(0,0);
        }
        return new Money(0,c);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
