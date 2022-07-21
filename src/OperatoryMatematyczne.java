// Umożliwają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber; //10
        int substraction = firstNumber - secondNumber; //-2
        int multiplication = firstNumber * secondNumber; //24
        float division = firstNumber/secondNumber; //0,66
        int mod = secondNumber%firstNumber; //Reszta z dzielenia, 6 mieści się w 4 (0), 4

        System.out.println("Wynik dodawania " + addition);
        System.out.println("Odejmowanie " + substraction);
        System.out.println("Mnożenie " + multiplication);
        System.out.println("Dzielenie " + division);
        System.out.println("Modulo " + mod);

    }
}
