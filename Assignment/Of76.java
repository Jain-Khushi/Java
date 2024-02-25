package Assignment;
interface Nose {
    int iMethod();
}
abstract class Picasso implements Nose {
    public int iMethod() {
        return 7;
    }
}

class Clown extends Picasso {
}

class Acts extends Picasso {
    public int iMethod() {
        return 5;
    }
}

public class Of76 extends Clown {
    public static void main(String[] args) {
        Picasso[] i = new Picasso[3];
     
        i[0] = new Acts();
        i[1] = new Clown();
        i[2] = new Of76();

        for (int x = 0; x < 3; x++) {
            System.out.println(i[x].iMethod() + " " + i[x].getClass());
        }

    }

}
