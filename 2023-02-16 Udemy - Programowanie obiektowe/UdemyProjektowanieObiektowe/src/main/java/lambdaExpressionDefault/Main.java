package lambdaExpressionDefault;

public class Main {
    public static void main(String[] args) {   // Lambde mozna uzyc gdy wystepuje jedna metoda abstakcyjna w interfejsie

    Formula f = (int a) -> {
      return 5;
    };
    }
}

interface Formula {
    double calculate(int a);                            // metoda abstrakcyjna
    default double sqrt(int a){                         // metoda zwykła
        return Math.sqrt(a);
    }

}

class A implements Formula{

    public double calculate(int a) {
        return this.sqrt(a * 5);
    }

}