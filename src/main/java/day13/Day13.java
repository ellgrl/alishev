package day13;

public class Day13 {
    public static void main(String[] args) {
        User userA = new User("Alex");
        User userB = new User("Bob");
        User userC = new User("Catherine");

        userA.sendMessage(userB,"Привет! ");
        userA.sendMessage(userB,"Как ты, Боб?");

        userB.sendMessage(userA,"Алекс! Сколько лет, сколько зим!");
        userB.sendMessage(userA,"Не знал, что ты тоже сидишь на этой платформе.");
        userB.sendMessage(userA, "У меня всё супер. Ты как поживаешь?");

        userA.sendMessage(userB, "Лучше всех!");
        userA.sendMessage(userB, "Ты знал, что Кейт тоже есть в этой соцсети?");

        userC.sendMessage(userB, "Сюрприз, Боб! Рада видеть тебя здесь!");

        userB.sendMessage(userC, "Ребята, нам пора встретиться в баре :) ");

        MessageDatabase.showDialog(userA, userB);
    }
}
