package NivelBasico;

public class Array {
    public static void main(String[] args) {

        String[] ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzamaki";

        //For para exebir todo o array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

    }
}
