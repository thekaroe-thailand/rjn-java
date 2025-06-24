public class DecodeAndEncode {
    public static void main(String[] args) {
        try {
            String str = "Hello World";
            byte[] encoded = str.getBytes("UTF-8");
            String decoded = new String(encoded, "UTF-8");
            /*
             * for (byte b : encoded) {
             * System.out.print(b);
             * }
             */
            System.out.println("encode: " + encoded);
            System.out.println("decode: " + decoded);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
