public class immutable_stringMemoryMap {
    public static void main(String[] args) {
        // s1 , s2 is referenced object so its created in heap area
        // but when we create String without using new keyword so its located inside the
        // heap region called String constant pool

        String s1 = "java tutorial";
        String s2 = "java tutorial";

        // in SCP repeation is not allowed therefore (s1,s2) pointing same memory
        // location
        System.out.println(s1 == s2);

        // but when we create String without using new keyword so its located in the
        // heap region
        String s3 = new String("pwskill");
        String s4 = new String("pwskill");

        // in heap memory repeation is allowed therefore (s3,s4) pointing different
        // memory location
        System.out.println(s3 == s4);
    }
}