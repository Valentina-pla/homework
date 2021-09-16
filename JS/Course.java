package JS;

public class Course {
    String []obstacles = new String[4];

    public void doIt(Team team) {

        for(Participant p: team.participants) {
            for (int i=0;i< obstacles.length; i++){}
            p.finished=true;
        }
    }
}
