package JS;

public class Program {
    public static void main(String[] args) {
        Course c = new Course();
        Team team = new Team("Team", "Vasa", "Peta","Igor","Vadim");
        c.doIt(team);
        team.showResults();

    }
}
