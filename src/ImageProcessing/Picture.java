package ImageProcessing;

import java.awt.image.BufferedImage;

public class Picture {
    private static BufferedImage image;
    private final int widthInCM;
    private final int heightInCM;
    private int width = image.getWidth();
    private int height = image.getHeight();

    public Picture(BufferedImage image, int widthInCM, int heightInCM) {
        this.image = image;
        this.widthInCM = widthInCM;
        this.heightInCM = heightInCM;
    }

    private int pixelRatioW  = image.getWidth() / width;
    private int pixelRatioH = image.getHeight() / height;

    private Point givePixel (Point point) {
        return Point(pixelRatioW * widthInCM / width, pixelRatioH * heightInCM / height);
    }







}