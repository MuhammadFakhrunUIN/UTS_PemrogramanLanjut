import java.util.Scanner;

class ProcessAngka {

    //init array
    private int[] angka;
    private int[] muncul;

    public ProcessAngka(int size) {
        angka = new int[size];
        muncul = new int[101];
    }

    //input
    public void inputAngka() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka:");
        for (int i = 0; i < angka.length; i++) {
            angka[i] = scanner.nextInt();
        }
    }

    //proc
    public void angkaUnik() {
        for (int x = 0; x < angka.length; x++) {
            int number = angka[x];
            muncul[number]++;
        }
    }

    //cek muncul > 2 & output
    public void angkaMuncul() {
        for (int y = 0; y < muncul.length; y++) {
            if (muncul[y] > 1) {
                System.out.println(y + " ada " + muncul[y]);
            }
        }
    }
}
