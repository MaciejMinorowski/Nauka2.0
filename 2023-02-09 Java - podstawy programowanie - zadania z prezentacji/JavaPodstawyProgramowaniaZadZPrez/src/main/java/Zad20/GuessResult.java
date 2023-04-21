package Zad20;

public enum GuessResult {

    FREEZING,
    COLD,
    WARM,
    HOT,
    WIN;



    public static void printEnum(Enum<GuessResult> aGuessResult) {
        if (aGuessResult.equals(FREEZING)) {
            System.out.println("FREEZING");
        } else if (aGuessResult.equals(COLD)) {
            System.out.println("COLD");
        } else if (aGuessResult.equals(WARM)) {
            System.out.println("WARM");
        } else if (aGuessResult.equals(HOT)) {
            System.out.println("HOT");
        } else if (aGuessResult.equals(WIN)) {
            System.out.println("WIN");
        }
    }


}
