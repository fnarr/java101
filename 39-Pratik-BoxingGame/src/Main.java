public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mike Tyson", 20, 100, 100, 25);
        Fighter f2 = new Fighter("Muhammed Ali", 10, 85, 107, 50);

        Match match = new Match(f1, f2, 100, 120);
        match.run();
    }
}