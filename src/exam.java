import java.util.Random;

public class exam {
    public static void main(String[] args) throws Exception{
        PGMImage imRand = new PGMImage(80,60);
        PGMImage imGrad = new PGMImage(80,60);

        for (int i = 0; i < imRand.width; i++) {
            for (int j = 0; j < imRand.height; j++) {
                imRand.setPixel(i, j, (int) (Math.random()*256));
            }
        }

        for (int i = 0; i < imGrad.width; i++) {
            for (int j = 0; j < imGrad.height; j++) {
                imGrad.setPixel(i, j, (i+j) % 256);
            }
        }

        imRand.saveTo("imRand.pgm");
        imGrad.saveTo("imGrad.pgm");

    }
}


