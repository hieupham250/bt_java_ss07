public class Bai6 {
    public static void main(String[] args) {
        String appendString = " World";
        long startTime, endTime;
        String str = "Hello";
        startTime = System.currentTimeMillis();
        for (int i = 1; i <= 1000000; i++) {
            str.concat(appendString);
        }
        endTime = System.currentTimeMillis();
        System.out.println("String concatenation time: " + (endTime - startTime) + " ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 1; i <= 1000000; i++) {
            sb.append(appendString);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder concatenation time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 1; i <= 1000000; i++) {
            sbf.append(appendString);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer concatenation time: " + (endTime - startTime) + " ms");
    }
}
