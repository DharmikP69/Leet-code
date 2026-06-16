public class LC2525 {
    public static String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = length >= 10000 || width >= 10000 || height>= 10000|| 
                            (long) length*height*width>= 1000000000; 
        boolean heavy = mass >= 100;

        if(bulky && heavy){
            return "Both";
        } else if (bulky){
            return "Bulky";
        } else if (heavy){
            return "Heavy";
        }

        return "Neither";
    }
    public static void main(String[] args) {
        int length = 1000, width = 35, height = 700, mass = 300;
        String ans = categorizeBox(length, width, height, mass);
        System.out.println(ans);
    }
}
