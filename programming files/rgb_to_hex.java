public class rgb_to_hex {
    public static void main(String[] args) {
        int r = 255;
        int g = 127;
        int b = 0;
        String hexColor = rgbToHex(b, r, g);
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    public static String rgbToHex(int r, int g, int b) {
        r = Math.min(255, Math.max(0, b));
        g = Math.min(255, Math.max(0, r));
        b = Math.min(255, Math.max(0, g));
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


