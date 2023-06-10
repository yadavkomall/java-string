class StringMethod {

    public static void main(String args[]) {
        String name = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Given String            :"+name);
        System.out.println("charAt(3) method        : " + name.charAt(3));
        System.out.println("length() method         : " + name.length());
        System.out.println("substring(2,5) method   : " + name.substring(2, 5));
        System.out.println("contains(mno) method    : " + name.contains("mno"));
        System.out.println("concat(12345) method    : " + name.concat("12345"));
        System.out.println("replace(d,c) method     : " + name.replace('d', 'c'));
        System.out.println("index(f) method         : " + name.indexOf('f'));
        System.out.println("toLowerCase() method    : " + name.toLowerCase());
        System.out.println("toUpperCase() method    : " + name.toUpperCase());
        System.out.println("trim() method           : " + name.trim());
        String ar = "abc@efg@hikk@opq";
        System.out.println("Given String            : "+ar);
        System.out.print("givenString.split(@)      : ");
        String array[] = ar.split("@");
        for (String i : array) {
            System.out.print(i + " ");
        }System.out.println();
    }
}