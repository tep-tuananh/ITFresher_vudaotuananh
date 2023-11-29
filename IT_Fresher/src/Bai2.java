import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 0, colum = 0;
        int[][] arr = new int[row][colum];
        do {
            System.out.println("\n1. Nhập giá trị các phần tử: ");
            System.out.println("2. In giá trị các phần tử theo ma trận");
            System.out.println("3. Tính số lợng các phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("4. In các phần tử và tổng các phần tử nằm trên biên," +
                    "đường chéo chính và đường chéo phụ");
            System.out.println("5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của\n" +
                    "mảng");
            System.out.println("6. In ra các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sử dụng thuật toán chèn (Insertion sort) sắp xếp các phần tử trên đường chéo chính\n" +
                    "của mảng giảm dần");
            System.out.println("8. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng muốn chèn vào mảng,\n" +
                    "thực hiện chèn vào mảng 2 chiều");
            System.out.println("(. thoát");
            System.out.printf("Nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.printf("Nhập số hàng: \n");
                    row = Integer.parseInt(sc.nextLine());
                    System.out.printf("Nhập số cột: \n");
                    colum = Integer.parseInt(sc.nextLine());
                    arr = new int[row][colum];
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            System.out.printf("arr[%d][%d]: ", i, j);
                            arr[i][j] = Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    // System.out.println("Các phần tử trong mảng");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            System.out.printf("%d\t", arr[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    System.out.println("Các số chia hết cho 2 và 3 : ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            if (arr[i][j] % 2 == 0 && arr[i][j] % 3 == 0) {
                                System.out.printf("%d\t", arr[i][j]);
                            }
                        }
                    }
                    break;
                case 4:
                    int sum = 0;
                    System.out.println("Các phần tử nằm trên đường biên");
                    int sum1 = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            if (i == 0 || i == row - 1 || j == 0 || j == colum - 1) {
                                System.out.printf("%d\t", arr[i][j]);
                                sum1 += arr[i][j];
                            } else {
                                System.out.println("   ");
                            }
                        }
                    }
                    System.out.println("Tổng các phần tử trên đường biên: " + sum1);
                    System.out.printf("\n");
                    System.out.println("Các phần tử nằm trên đường chéo chính: ");
                    int sum2 = 0;
                    for (int i = 0; i < row; i++) {
                        System.out.printf("%d \t", arr[i][i]);
                        sum2 += arr[i][i];
                    }
                    System.out.println("Tổng các phần tử trên đường chéo chính: " + sum2);
                    System.out.printf("\n");
                    int sum3 = 0;
                    System.out.println("các phần tử nằm trên đường chéo phụ:");
                    for (int i = 0; i < row; i++) {
                        System.out.printf("%d\t", arr[i][colum - 1 - i]);
                        sum3 += arr[i][colum - 1 - i];
                    }
                    System.out.println("Tổng các phần tử trên đường chép phụ: " + sum3);
                    break;
                case 5:

                    break;
                case 6:
                    boolean isPrime = true;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            for (int k = 2; k < Math.sqrt(arr[i][j]); k++) {
                                if (arr[i][j] % k == 0) {
                                    isPrime = false;
                                    break;
                                } else {
                                    isPrime = true;
                                }
                            }
                            if (isPrime) {
                                System.out.printf("%d\t", arr[i][j]);
                            }
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
                    System.out.println("Vui lòng chọn từ 1 đến 9");
            }
        } while (true);
    }
}
