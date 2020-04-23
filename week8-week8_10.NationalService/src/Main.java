public class Main {
    public static void main(String[] args) {
        // Test your code here!
        CivilService yourCivilServiceTime = new CivilService();
        MilitaryService yourMilitaryServiceTime = new MilitaryService(1200);

        yourCivilServiceTime.work();
        yourCivilServiceTime.work();
        yourMilitaryServiceTime.work();
        System.out.println(yourCivilServiceTime.getDaysLeft());
        System.out.println(yourMilitaryServiceTime.getDaysLeft());
    }
}
