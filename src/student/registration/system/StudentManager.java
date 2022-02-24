package student.registration.system;

import java.util.Scanner;

public class StudentManager {

    private String name;
    private String surname;
    private String department;
    private int defaultNumberLength = 9;
    private int defaultEmailPasswordLength = 10;
    private String number;
    private String email;
    private String emailPassword;
    private String universitySuffix = "stdnt.abc.edu.com";

    /**
     * Create Constructor and get name and surname use parameter.
     *
     * @param name
     * @param surname
     */
    public StudentManager(String name, String surname) {
        this.name = name;
        System.out.println("Your name is: " + this.name);
        this.surname = surname;
        System.out.println("Your surname is: " + this.surname);

        this.department = setDepartment();
        System.out.println("Your department is: " + this.department);

        this.number = randomNumber(defaultNumberLength);
        System.out.println("Your number is: " + number);

        email = number + "@" + universitySuffix;
        System.out.println("Your email is: " + this.email);

        this.emailPassword = emailPassword(defaultEmailPasswordLength);
        System.out.println("Your password is: " + this.emailPassword);

        System.out.println("Registration completed.\nWelcome to ABC University!");
        System.out.println("***************************************************");
        System.out.println();
    }

    /**
     * Ask the department and get it from the user.
     *
     * @return department name to student.
     */
    private String setDepartment() {

        System.out.println("Choose your department:\n1-Computer Engineering\n2-Industrial Engineering\n3-Software Engineering\n4-Mechanical Engineering\n5-Bioengineering");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a == 1) {
            return "Computer Engineering";
        } else if (a == 2) {
            return "Industrial Engineering";
        } else if (a == 3) {
            return "Software Engineering";
        } else if (a == 4) {
            return "Mechanical Engineering";
        } else if (a == 5) {
            return "Bioengineering";
        } else {
            return "";
        }

    }

    /**
     * Generate random password for students.
     *
     * @param defaultNumberLength is length of the student number.
     * @return random password to student.
     */
    private String randomNumber(int defaultNumberLength) {

        String numberSet = "0123456789";

        char[] numberChar = new char[defaultNumberLength];

        for (int i = 0; i < numberChar.length; i++) {

            int randomValue = (int) (Math.random() * numberSet.length());

            numberChar[i] = numberSet.charAt(randomValue);
        }
        return new String(numberChar); // convert to String

    }

    /**
     * Generate random password for the student.
     *
     * @param defaultEmailPasswordLength is length of the email password.
     * @return email password.
     */
    private String emailPassword(int defaultEmailPasswordLength) {

        String passwordSet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] passwordChar = new char[defaultEmailPasswordLength];

        for (int i = 0; i < passwordChar.length; i++) {

            int randomPassword = (int) (Math.random() * passwordSet.length());

            passwordChar[i] = passwordSet.charAt(randomPassword);

        }
        return new String(passwordChar); // convert to String
    }
}
