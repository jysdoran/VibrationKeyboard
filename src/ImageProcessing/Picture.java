package ImageProcessing;

import java.awt.image.BufferedImage;

public class Picture {
    private final BufferedImage image;
    public Picture(BufferedImage image) {
        this.image = image;

    }

    private int[][] ImageToPixelRectangles() {
        final int width = image.getWidth();
        final int height = image.getHeight();
        final int xWidth = (int) Math.floor(width / 15);
        final int yHeight = (int) Math.floor(height / 6);

        int[][] pixelArray = new int[xWidth][yHeight];
        for (int i = 0; i < xWidth; i++) {
            for (int j = 0; j < yHeight; j++) {
            }
        }

    return null;
    }
}