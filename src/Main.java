public class Main {
    public static void main(String[] args) {
        int[] list = {5, 23, 35, 44, 13, 48, 5, 18, 26, 55, 48, 10, 44};

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {  // Kendisinden sonra gelen eleman ile karşılaştırmak için +1 yapıldı.
                if (list[i] == (list[j])) {             // Aynı değerde olanların çift olup olmadığı karşılaştırılıp yazdırıldı.
                    if (list[i] % 2 == 0) {
                        System.out.println(list[i]);
                    }
                }
            }
        }
    }
}