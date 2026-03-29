public class Patterns {
    public void Pattern1() {
        // part 3
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    public void Pattern2() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || j == 0 || i == 3 || j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public void Pattern3() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    public void Pattern4() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println(" ");
        }
    }

    public void Pattern5() {
        int n = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(n);
                n = n + 1;
            }
            System.out.println(" ");
        }
    }

    public void Pattern6() {
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }

    public void Pattern7(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(' ');
        }

    }

    public void Pattern8(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; i < n - i - 1; i++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public void Pattern9(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");

        }
    }

    public void Pattern10() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print("*");
            }
            System.err.println(' ');
        }
    }

    public void Pattern11() {
        for (int i = 0; i < 3; i++) {
            // space
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

    public void Pattern12() {
        for (int i = 0; i < 8; i++) {
            // space
            for (int j = 0; j < 8 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

    public void Pattern13() {
        for (int i = 0 + 1; i <= 5; i++) {
            for (int j = 0 + 1; j <= 5 - i; j++) {

                System.out.print(j);
            }
            System.out.println(" ");
        }

    }

    public void Pattern14(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

    }

    public void Pattern15(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }

    // NOW THE COMPLEX PATTERNS STARTS
    public void ComplexPattern1() {
        int n = 4;
        // part1
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(' ');
        }
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    public void ComplexPattern2() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // space 1

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void ComplexPattern3() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(i);
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(' ');
        }
    }

    public void ComplexPattern4() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println("");
        }
    }

    public void ComplexPattern5() {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.println(" ");

        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * (n - i)-1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println(" ");

        }
    }

    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.ComplexPattern5();
    }
}
