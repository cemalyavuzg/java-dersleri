public class Main {

    public static void main(String[] args) {
        int sayı1 = 25;
        int sayı2 = 20;
        int sayı3 = 15;
        int enbuyuk = sayı3;

        if(enbuyuk<sayı2){
            enbuyuk = sayı2;
        }

        if(enbuyuk<sayı1){
            enbuyuk = sayı1;
        }
        System.out.println("en büyük sayı: "+ enbuyuk);
    }
}
