public class stringMethods {
    public static void main(String[] args){
        String str = "Java Programming";
        System.out.println("Orginal:"+str);
        System.out.println("Length:"+str.length());
        System.out.println("Character at index 2:"+str.charAt(2));
        System.out.println("Uppercase:"+str.toUpperCase());
        System.out.println("Lowercase:"+str.toLowerCase());
        System.out.println("Equals:"+str.equals("Java Programming"));
        System.out.println("EqualsIgnorCase:"+str.equalsIgnoreCase("java"));
        System.out.println("Contains:"+str.contains("Prog"));
        System.out.println("StartsWith:"+str.startsWith("Ja"));
        System.out.println("Endswith:"+str.endsWith("ng"));
        System.out.println("SubString:"+str.substring(4, 8));
        System.out.println("IndexOf:"+str.indexOf("P"));
        System.out.println("LastIndexOf:"+str.lastIndexOf("a"));
        System.out.println("Replace:"+str.replace("Java","Python"));
        System.out.println("Trim:",+str.trim());
        System.out.println("Split:"+str.split(""));
    }
}
