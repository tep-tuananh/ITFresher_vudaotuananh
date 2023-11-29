import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int sizeArr = 0;
        int[] arr = new int[0];
        int sum = 0;
        do {
            System.out.printf("\n***************MENU****************\n");
            System.out.printf("1. Nhập giá trị n phần tử của mảng (n nhập từ bàn phím)\n");
            System.out.printf("2. In giá trị các phần tử trong mảng\n");
            System.out.printf("3. Tính trung bình các phần tử dương (>0) trong mảng\n");
            System.out.printf("4. In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong\n" +
                    "mảng (k nhập từ bàn phím)\n");
            System.out.printf("5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần\n");
            System.out.printf("6. Tính số lượng các phần tử là số nguyên tố trong mảng\n");
            System.out.printf("7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng" +
                    "dần, các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần,\n" +
                    "các phần tử còn lại ở giữa mảng theo thứ tự tăng dần");
            System.out.printf("8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm\n" +
                    "dần) đúng vị trí \n");
            System.out.printf("9. Thoát\n");
            System.out.println("Lựa chọn của bạn: ");
            number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:
                    System.out.printf("Nhâp số phần tử : ");
                    sizeArr = Integer.parseInt(sc.nextLine());
                    arr = new int[sizeArr];
                    for (int i = 0; i < sizeArr; i++) {
                        System.out.printf("arr[%d]: ", i);
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2:
                    for (int i = 0; i < arr.length; i++) {
                        System.out.printf("%d\t", arr[i]);
                    }
                    break;
                case 3:
                    int count = 0;
                    float avgMark;
                    for (int i = 0; i < sizeArr; i++) {
                        if (arr[i] > 0) {
                            sum += arr[i];
                            count += 1;
                        }
                    }
                    avgMark = (float) sum / count;
                    System.out.println("Trung bình cộng các số > 0 là " + avgMark);
                    break;
                case 4:
                    int numberk;
                    System.out.println("Nhập số k: ");
                    numberk = Integer.parseInt(sc.nextLine());
                    System.out.println("số K tại vị trí");

                    for (int i = 0; i < arr.length; i++) {
                        if (numberk == arr[i]) {
                            System.out.printf("%d\t", i);
                        }

                    }
                    break;
                case 5:
                    for (int i = sizeArr; i >0; i--) {
                        for (int j = 0; j < sizeArr - 1; j++) {
                            if (arr[j] < arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    //System.out.println("Mảng đã được sắp xếp: ");
                    for (int i = 0; i < sizeArr; i++) {
                        System.out.printf("%d\t", arr[i]);
                    }
                    break;
                case 6:
                    boolean isPrime = true;
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 2; j < Math.sqrt(arr[i]); j++) {
                            if (arr[i] % j == 0) {
                                isPrime = false;
                                break;
                            } else {
                                isPrime = true;
                            }
                        }
                        System.out.println("Các số nguyên tố trong mảng:");
                        if (isPrime) {
                            System.out.printf("%d\t", arr[i]);
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1 -> 9");
            }
        } while (true);
    }
}
