package lesson1dz;


public class Main {
        public static void main(String[] args) {

            Course course = new Course(new Cross(300), new Wall(2),
                    new Cross(800), new Water(5));

            Team team = new Team("Team", new Human("Bob"), new Cat("Барсик"), new Cat("Мурзик"),
                    new Dog("Шарик"), new Dog("Тузик"));

            course.doIt(team);

            System.out.println("\n===== RESULTS =====\n");
            team.showResults();

        }
}