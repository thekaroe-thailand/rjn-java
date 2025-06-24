class StringAndMethod {
    public static void main(String[] args) {
        String str = " Hello, World! ";
        String a = "test";

        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace("Hello", "Hi"));
        System.out.println(str.substring(0, 5));
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("World"));
        System.out.println(str.contains("hello"));
        System.out.println(str.isEmpty());
        System.out.println(str.trim());
        // a == "test"
        System.out.println(a.equals("test"));
        // System.out.println(str.replaceAll("l", "OK"));
        str = str.replaceAll("l", "OK");
        System.out.println(str);
    }
}
