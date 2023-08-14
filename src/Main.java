import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //CGPA
        Scanner input=new Scanner(System.in);
        int math,physic,english,chemistry,music,history;
        System.out.println("Math Grade: " );
        math=input.nextInt();
        System.out.println("Physic  Grade: ");
        physic=input.nextInt();
        System.out.println("English Grade : ");
        english=input.nextInt();
        System.out.println("Chemistry Grade: ");
        chemistry=input.nextInt();
        System.out.println("Music Grade : ");
        music=input.nextInt();
        System.out.println("History Grade");
        history=input.nextInt();
        double result=(math + physic + english + chemistry + music + history) / 5;
        System.out.println("Your Result : " + result);
    }
}