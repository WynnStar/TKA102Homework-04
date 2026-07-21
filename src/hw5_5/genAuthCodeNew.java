package hw5_5;

public class genAuthCodeNew {
    public static void main(String[] args) {

        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 8; i++) {
            int index = (int)(Math.random() * chars.length());
            System.out.print(chars.charAt(index));
        }
    }
}