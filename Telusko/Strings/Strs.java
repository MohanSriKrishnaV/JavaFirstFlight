public class Strs {
    public static void main(String[] args) {
        String s1 = "Naveen";
        System.out.println(s1);
        // String name2 = new String("Naveen");
        // System.out.println(name2);

        System.out.println(s1.charAt(0));
        System.out.println(s1.concat(" Kumar"));
        System.out.println(s1.contains("veen"));
        System.out.println(s1.endsWith(s1));
        System.out.println(s1.equals("Naveen"));
        System.out.println(s1.equalsIgnoreCase("naveen"));
        System.out.println(s1.length());
        System.out.println(s1.replace('N', 'K'));
        System.out.println(s1.substring(0, 3));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
    }
}