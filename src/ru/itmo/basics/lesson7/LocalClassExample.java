package ru.itmo.basics.lesson7;

public class LocalClassExample {
    static String regex = "\\D";

    public static void validatePhoneNumber(String num1, String num2) {

        final int numberLength = 10;

        class PhoneNumber {
            String formattedNumber = null;

            public PhoneNumber(String formattedNumber) {
                String currentNumber = formattedNumber.replaceAll(regex, "");
                if (currentNumber.length() == numberLength) {
                    this.formattedNumber = currentNumber;
                }
            }

            public String getFormattedNumber() {
                return this.formattedNumber;
            }
        }

        PhoneNumber phoneNumber1 = new PhoneNumber(num1);
        PhoneNumber phoneNumber2 = new PhoneNumber(num2);

        String formattedNumber1 = phoneNumber1.getFormattedNumber();
        String formattedNumber2 = phoneNumber2.getFormattedNumber();

        if (formattedNumber1 == null) {
            System.out.println("First phone number is invalid");
        } else {
            System.out.println("First phone number is " + formattedNumber1);
        }


        if (formattedNumber2 == null) {
            System.out.println("Second phone number is invalid");
        } else {
            System.out.println("Second phone number is " + formattedNumber2);
        }
    }

    public static void main(String[] args) {
        validatePhoneNumber("921-555-66-77", "123123-2");
    }

}
