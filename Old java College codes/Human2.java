package staticExample;

public class Human2{
    public static void main(String[] args) {
        // Creating Humans
        Human kunal = new Human(22, "Kunal", 50000, false);
        Human rahul = new Human(25, "Rahul", 60000, true);
        Human sita = new Human(30, "Sita", 70000, true);

        // Print the details
        System.out.println(kunal.name + " is " + kunal.age + " years old.");
        System.out.println(rahul.name + " is " + rahul.age + " years old.");
        System.out.println(sita.name + " is " + sita.age + " years old.");

        // Print the population
        System.out.println("Total Human Population: " + Human.population);
    }
}
