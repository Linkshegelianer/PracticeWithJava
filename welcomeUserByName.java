public class welcomeUserByName {
    public static void main() {
        welcomeUserByName();
    }
    public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.next();
        printCity();
        String city = scanner.next();
        System.out.println("Nice to meet you, " + name + " from " + city + "!");
    }
}
