public class Reformatory {
    private int i = 0;

    public int weight(Person person) {
        // return the weight of the person
        this.i++;
        return person.getWeight();
    }

    public void feed (Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured () {
        return this.i;

    }

}
