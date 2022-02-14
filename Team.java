package Jsles1;

public class Team {


   private Participant[] participant;
   private String color;
   private String name;


   public Team(String name, String color, Participant[]participant) {
      this.participant=participant;


      this.name = name;
      this.color = color;
   }

   public void showResult(){
      System.out.println("team:"+" "+this.name);
      for(int i=0; i<participant.length;i++){


         participant[i].print();

      }
      System.out.println("");

   }



}
