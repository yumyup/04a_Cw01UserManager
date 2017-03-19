package app;

import model.User;

import java.util.Scanner;

public class UserManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String getFirstName = scanner.nextLine();
        System.out.println("podaj nazwisko");
        String getLastName = scanner.nextLine();
        System.out.println("podaj pesel");
        String getPesel = scanner.nextLine();
        System.out.println("podaj wiek");
        int getAge = scanner.nextInt();
        User user1 = new User(getFirstName, getLastName, getPesel, getAge);
        user1.userInfo();
    }
}
