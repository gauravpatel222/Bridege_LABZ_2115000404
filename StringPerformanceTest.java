public class StringPerformanceTest {
    public static void main(String[] args) {
        int operations = 1_000_000;
        
        long startTime, endTime;
        
        startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < operations; i++) {
            str += "a";
        }
        endTime = System.nanoTime();
        System.out.println("String: " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < operations; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder: " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < operations; i++) {
            sbf.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
