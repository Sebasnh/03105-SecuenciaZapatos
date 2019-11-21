/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {

        final String ANIMAL1 = "Vaca";
        final int CANTIDAD1 = 3;

        final String ANIMAL2 = "Oveja";
        final int CANTIDAD2 = 14;

        final String ANIMAL3 = "Burro";
        final int CANTIDAD3 = 2;

        final String ANIMAL4 = "Gallina";
        final int CANTIDAD4 = 18;

        final int PATAS_CUADRUPEDOS = 4;
        final int PATAS_BIPEDOS = 2;

        final int PATAS1 = CANTIDAD1 * PATAS_CUADRUPEDOS;
        final int PATAS2 = CANTIDAD2 * PATAS_CUADRUPEDOS;
        final int PATAS3 = CANTIDAD3 * PATAS_CUADRUPEDOS;
        final int PATAS4 = CANTIDAD4 * PATAS_BIPEDOS;

        final int TOTAL_PATAS = PATAS1 + PATAS2 + PATAS3 + PATAS4;
        final int TOTAL_PARES = TOTAL_PATAS / 2;

        System.out.println("Secuencia de Patas");
        System.out.println("==================");

        System.out.printf("Animal .........: %s%n", ANIMAL1);
        System.out.printf("Cantidad .......: %d%n", CANTIDAD1);
        System.out.printf("Patas ..........: %d%n", PATAS1);

        System.out.println("---");

        System.out.printf("Animal .........: %s%n", ANIMAL2);
        System.out.printf("Cantidad .......: %d%n", CANTIDAD2);
        System.out.printf("Patas ..........: %d%n", PATAS2);

        System.out.println("---");

        System.out.printf("Animal .........: %s%n", ANIMAL3);
        System.out.printf("Cantidad .......: %d%n", CANTIDAD3);
        System.out.printf("Patas ..........: %d%n", PATAS3);

        System.out.println("---");

        System.out.printf("Animal .........: %s%n", ANIMAL4);
        System.out.printf("Cantidad .......: %d%n", CANTIDAD4);
        System.out.printf("Patas ..........: %d%n", PATAS4);

        System.out.println("---");

        System.out.printf("Total de Patas .: %d%n", TOTAL_PATAS);
        System.out.printf("Total de Pares .: %d%n", TOTAL_PARES);

    }

}
