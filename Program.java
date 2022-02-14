package Jsles1;

public class Program {


    public static void main(String[] args){

        Participant[] participant1=new Participant[2];
        Participant[] participant2=new Participant[2];

        participant1[0]=new Participant("Vasa", 25,168);
        participant1[1]=new Participant("Peta", 28,175);
        participant2[0]=new Participant("Vera", 18,180);
        participant2[1]=new Participant("Nada", 38,165);

        Team team1 = new Team("Right","red",participant1);
        Team team2 = new Team("Left","yellow",participant2);
        Course c = new Course();

        team1.showResult();
        team2.showResult();

        c.doIt(team1);
        c.doIt(team2);

    }
}
