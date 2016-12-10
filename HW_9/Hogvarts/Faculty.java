import java.util.Arrays;
import java.util.Random;

public enum Faculty {

    GRYFFINDOR("Griffindor", "Гриффиндор"),
    SLYTHERIN("Slytherin", "Слизерин"),
    HUFFLEPUFF("Hufflepuff", "Гуфлепуф"),
    RAVENCLAW("Ravenclaw", "Ривинклоу");

    String nameEN;
    String nameRU;

    Faculty(String nameEN, String nameRU) {
        this.nameEN = nameEN;
        this.nameRU = nameRU;
}

    public String getNameEN() {
        return nameEN;
    }

    public String getNameRU() {
        return nameRU;
    }


}
