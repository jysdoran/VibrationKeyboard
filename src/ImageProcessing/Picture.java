package ImageProcessing;

import MathsUtils.Point;

import java.awt.image.BufferedImage;

public class Picture {
    private static BufferedImage image;
    private final int widthInCM;
    private final int heightInCM;
    private int width = image.getWidth();
    private int height = image.getHeight();

    public Picture(BufferedImage image) {
        this.image = image;
        this.widthInCM = widthInCM;
        this.heightInCM = heightInCM;
    }

    private double pixelRatioW  = image.getWidth() / width;
    private double pixelRatioH = image.getHeight() / height;

    private Point givePixel (Point point) {
        return new Point(pixelRatioW * widthInCM / width, pixelRatioH * heightInCM / height);
    }







}