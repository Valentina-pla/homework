package lesson1.homework.git;

public class Woker {

    public static class Employee {
        private String name;
        private String position;
        private String email;
        private String number;
        private String money;
        private int age;

        public Employee(String _name, String _position, String _email, String _number, String _money, int _age  ) {
            name= _name;
            position=_position;
            email=_email;
            number=_number;
            money=_money;
            age=_age;

        }

        public void print() {
            System.out.println(name+" "+position+" "+email+" "+number+" "+money+" "+age);
        }
    }


    public static void main (String[] args) {


        Employee[] empArray = new Employee[5];
        empArray[0]=new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", "123", 56);
        empArray[1]=new Employee("Petrov Petr", "Builder", "1235n@mailbox.com", "892312312", "123", 26);
        empArray[2]=new Employee("Sokolov Vasilii", "Builder", "7855@mailbox.com", "892312312", "123", 25);
        empArray[3]=new Employee("Worontsov Vitlii", "Engineer", "885@mailbox.com", "892312312", "123", 47);
        empArray[4]=new Employee("Kornev Ivan", "Builder", "888633@mailbox.com", "892312312", "123", 38);


        for (int i=0; i< empArray.length; i++ ){
            if (empArray[i].age >=40){
                empArray[i].print();
            }
        }
    }

}
