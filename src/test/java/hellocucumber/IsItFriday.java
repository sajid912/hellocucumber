package hellocucumber;

public class IsItFriday {

    public IsItFriday() {}

    public static String isItFriday(String today) {
        return "Friday".equalsIgnoreCase(today) ? "Yes" : "Nope";
    }
}
