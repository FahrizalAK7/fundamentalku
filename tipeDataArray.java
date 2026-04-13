public class tipeDataArray {
    public static void main(String[] args) {
        

        String[] stringArray;
        stringArray = new String[3];


        stringArray[0] = "Fahrizal";
        stringArray[1] = "Abdul";
        stringArray[2] = "Khalim";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        //atau
        String[] stringArray2 = new String[3];


        // array kode initilizer
        String[] namaNama = {
            "Fahrizal", "Abdul", "Khalim"
        };

        int[] arrayInt = new int[] {
            1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
            10L, 20L, 30L
        };

        // operasi array
        arrayLong[0] = 0;
        System.out.println(arrayLong.length);


        String[][] members = {
            {"Eko", "Kurniawan", "Fahrizal","Abdul","Khalim", "asdasd"},
            {"Fahrizal", "Abdul", "Khalim"},
            {"joko"}
        };

        System.out.println(members[0][1]); // ini untuk mengambil array ke 1 (0) dan mengambil data 2 (1) yaitu kurniawan
        System.out.println(members[1][0]); // ini untuk mengambil array ke 2 (1) dan mengambil data 1 (0) yaitu fahrizal
        System.out.println(members[2][0]); // ini untuk mengambil array ke 3 (2) dan mengambil data 1 (0) yaitu joko
    }
}
