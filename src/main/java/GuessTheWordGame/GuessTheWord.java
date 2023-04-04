package GuessTheWordGame;

public class GuessTheWord {

    private boolean play = true;

    public void start() {
        do {
            showWord();
            getInput();
            checkInput();
        } while (play);

    }


    void showWord() {
        System.out.println("Show Word Game Enter ");

    }

    void getInput() {
        System.out.println("Get Input");

    }

    void checkInput() {
        System.out.println("Check Input");

    }


}
