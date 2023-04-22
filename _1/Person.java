package _1;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return "PERSON" +
                "\nname = " + name +
                "\nage = " + age +
                "\naddress = " + address;
    }
}
