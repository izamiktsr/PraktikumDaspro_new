public class Bioskop18 {
    public static void main(String[] args) {
    
        String[][] penonton = new String[4][2];
       
                penonton[0][0] = "Amin";
                penonton[0][1] = "Bena";
                penonton[1][0] = "Candra";
                penonton[1][1] = "Dela";
                penonton[2][0] = "Eka";
                penonton[2][1] = "Farhan";
                penonton[3][0] = "Gisel";
                penonton[3][1] = "Hana";
            
            // MODIF PERTANYAAN 4
            System.out.println(penonton.length);
            System.out.println(penonton[0].length);
            System.out.println(penonton[1].length);
            System.out.println(penonton[2].length);
            System.out.println(penonton[3].length);
            
            
            System.out.println(penonton.length);
            for (int i = 0; i <  penonton.length; i++) {
                System.out.println("Penonton pada baris ke-"  + (i+1) + ": " + String.join(",", penonton[i]));

            // MODIF PERTANYAAN 6
            System.out.println(penonton.length);
            for (String[] barisPenonton : penonton) {
                System.out.println("Panjang baris: " + barisPenonton.length);
            }
            
            // MODIF PERTANYAAN 7
            System.out.println("Penonton pada baris ke-3: ");
            for (int j = 0; j < penonton[2].length; j++) {
                System.out.println(penonton[2][i]);
            }
            
            // MODIF PERTANYAAN 8
            System.out.println("Penonton pada baris ke-3: ");
            for (String j : penonton[2]) {
                System.out.println(j);
            }
    }
}
}


            