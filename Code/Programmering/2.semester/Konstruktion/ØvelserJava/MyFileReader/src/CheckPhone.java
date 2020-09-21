public class CheckPhone {

    public static void main(String[] args) {
        CheckPhone check = new CheckPhone();
        try {
            System.out.println(check.checkPhoneNO("1245434387884"));
        } catch (InvalidAdressException e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean checkPhoneNO(String phoneNoToCheck) throws InvalidAdressException {


        if (phoneNoToCheck.length() < 6 || phoneNoToCheck.length() > 12 || phoneNoToCheck.matches(".*\\D*:")) {
            throw new InvalidAdressException();
        } else {
            return true;
        }

    }
}
