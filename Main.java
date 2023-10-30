public class Main {
    public double kali(int a, int b){
        return a * b;
    }
    public int tambah(int a, int b){
        return a+b;
    }
    public double  kurang(int a, int b){
        return a-b;
    }
    public double bagi(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        Main  obj = new Main();
        System.out.println("hasil kali dri 5 dan 7: " +obj.kali(5,7));
        System.out.println("hasil tambah: " +obj.tambah(5,7));
        System.out.println("hasil kurang: " +obj.kurang(7,4));
        System.out.println("hasil pembagian: " +obj.bagi(6,3));

    }
}
