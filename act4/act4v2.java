public class act4v2 {
    public static void main(String[] args) {
        int[][] suhu = {{24,31,20}, {33,32,30}, {28,29,17}};
        double total = 0;
        int count = 0;
        
        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                total += suhu[i][j];
                count++;
                }
            }
        }
        double rata = total/count;
        System.out.println("Suhu rata rata adalah " + rata + " derajat Celcius");
    }
}