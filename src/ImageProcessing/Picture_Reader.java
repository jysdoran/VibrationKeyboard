//will read the area of the image that is fed into it - this will be in the form of a point and a distance
// and we will look at that distance around it (The shape or area we look at is open to change).
// Class will also contain a set of  methods to create and display picture objects.


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Picture_Reader {

    private Picture_Reader() {
    }


//      Create a new instance of a Picture object of the specified width and
//      height.
//      param width = width of new Picture
//      param height = height of new Picture
//      return a new instance of a Picture object of the specified size.

    public static Picture createPicture(int width, int height) {
        BufferedImage img = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        return new Picture(img);
    }


//     Create object from the the image at the specified location (URL
//     or local file).
//
//     loction is a String representing the location of the image to be loaded. This
//     can either be a URL, or a filesystem location.
//     returns a Picture representing the image at the specified URL, or null if
//     loading failed for any reason.

      public static Picture loadPicture(String locationString) {

        final BufferedImage img;
        final BufferedImage origImage;

        URL locationURL = null;
        File locationFile = null;
        try {
            locationURL = new URL(locationString);
        } catch (MalformedURLException e) {
            File tmpFile = new File(locationString);
            if (tmpFile.exists() && tmpFile.canRead()) {
                locationFile = tmpFile;
            }
        }

        try {
            if (locationURL != null) {
                origImage = ImageIO.read(locationURL);
            } else if (locationFile != null) {
                origImage = ImageIO.read(locationFile);
            } else {
                return null;
            }

            if (origImage == null) {
                return null;
            }

        } catch (IOException e) {
            return null;
        }

        // If image loaded, then create a BufferedImage which will then be worked with when coding.

        int imageWidth = origImage.getWidth(null);
        int imageHeight = origImage.getHeight(null);
        img = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);
        Graphics g = img.createGraphics();
        g.drawImage(origImage, 0, 0, null);
        return new Picture(img);
    }
