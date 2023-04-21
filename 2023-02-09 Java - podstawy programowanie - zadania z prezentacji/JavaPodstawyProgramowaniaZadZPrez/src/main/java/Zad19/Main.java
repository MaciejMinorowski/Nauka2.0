package Zad19;

public class Main{
    public static void main(String[] args) {

        Author WilliamShakespeare = new Author("Shakespear", "english");
        Author EdgarAllanPoe = new Author("Poe", "american");
        Author WaltWhitman = new Author("Whitman", "american");

        Poem raven = new Poem(EdgarAllanPoe, 18);
        Poem thePhoenixAndTheTurtle = new Poem(WilliamShakespeare, 19);
        Poem iSingTheBodyElectric = new Poem();
        Poem temporary;

        iSingTheBodyElectric.setCreator(WaltWhitman);
        iSingTheBodyElectric.setStropheNumbers(31);

        Poem[] arrayOfPoems = new Poem[]{raven, thePhoenixAndTheTurtle, iSingTheBodyElectric};


        for (int i = 0; i < arrayOfPoems.length; i++){
            for (int j = i + 1; j < arrayOfPoems.length; j++){
                if (arrayOfPoems[i].getStropheNumbers() < arrayOfPoems[j].getStropheNumbers()) {

                    temporary = arrayOfPoems[i];
                    arrayOfPoems[i] = arrayOfPoems[j];
                    arrayOfPoems[j] = temporary;
                }
            }
        }

        for (int i = 0; i < arrayOfPoems.length; i++){
            System.out.println(arrayOfPoems[i].getStropheNumbers());
        }

        System.out.println("Author of poem with greatest number of strophes is: " + arrayOfPoems[1].getCreator().getSurname());

    }
}

class Author {
    String surname;
    String nationality;

    public Author(){
    }

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSurname() {
        return surname;
    }

    public String getNationality() {
        return nationality;
    }
}



class Poem {
    Author creator;
    int stropheNumbers;

    public Poem() {
    }

    public Poem(Author creator, int stropheNumbers){
        this.creator = creator;
        this.stropheNumbers= stropheNumbers;

    }

    public void setCreator(Author creator){
        this.creator = creator;
    }

    public void setStropheNumbers(int stropheNumbers){
        this.stropheNumbers = stropheNumbers;
    }

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumbers(){
        return stropheNumbers;
    }


}