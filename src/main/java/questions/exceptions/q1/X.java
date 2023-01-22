package questions.exceptions.q1;

import java.io.IOException;

public class X {
    public void printFileContent() throws IOException {
        //code line
        throw new IOException();

    }


    public static class Test {
        public static void main(String[] args) throws Exception {
            X xobj = new X();
            xobj.printFileContent();
        }
    }
}

