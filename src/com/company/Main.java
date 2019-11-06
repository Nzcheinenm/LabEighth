package com.company;

/**
 * Класс содержит 3 Лямбды и 2 проверки .
 */

final class Main {
        /**
         * Первая константта проверки.
         */
        private static final int CONST_VALUE_READ1 = 5;
        /**
         * Вторая константта проверки.
         */
        private static final int CONST_VALUE_READ2 = 15;
        /**
         * Делитель-константта.
         */
        private static final int CONST_VALUE1 = 15;

        private Main() {

        }

        public static void main(final String[] args) {
                Functional operation1 = (x) -> x % CONST_VALUE1 == 0;

                Functional operation2 = (x) -> x > 0;

                Functional operation3 = (x) -> {

                        int y = 1,
                            z,
                            b = 1;
                        boolean q = false;
                        for (int i = 1; i < x; i++) {
                                z = y;
                                y = b;
                                b = z + y;
                                if (b == x) {
                                        q = true;
                                }
                        }
                        return !q;
                };


                System.out.println(operation1.mathInter(CONST_VALUE_READ1));
                System.out.println(operation2.mathInter(CONST_VALUE_READ1));
                System.out.println(operation3.mathInter(CONST_VALUE_READ1));
                System.out.println();

                System.out.println(operation1.mathInter(CONST_VALUE_READ2));
                System.out.println(operation2.mathInter(CONST_VALUE_READ2));
                System.out.println(operation3.mathInter(CONST_VALUE_READ2));


        }

}
