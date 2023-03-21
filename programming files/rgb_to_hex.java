public class rgb_to_hex {
    public static void main(String[] args) {
        
        int r = 255;
        int g = 127;
        int b = 0;
        
        // get the string from hexColor
        String hexColor = rgbToHex(r, g, b);
        
        // print out the converted hex string
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    /* RGB to hex conversion
       Requires: red, green, and blue values
       Returns: color hex string
    */
    public static String rgbToHex(int r, int g, int b) {
        
        // get the rgb values in hex form
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


