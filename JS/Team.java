package JS;

public class Team {
    public Team(String name, String participant1,String participant2,String participant3,String participant4) {
        this.name=name;
        this.participants=new Participant[4];
        this.participants[0] = new Participant(participant1);
        this.participants[1] = new Participant(participant2);
        this.participants[2] = new Participant(participant3);
        this.participants[3] =new Participant(participant4);
    }
    String name;
Participant[] participants;

    public void showResults() {
        for(Participant p: participants) {
            System.out.println(p.name+": finished");
        }

    }
}
