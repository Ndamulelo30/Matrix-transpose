/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrixtranspose;

/**
 *
 * @author Sanele
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Input matrix dimensions
        System.out.println("Enter the number of rows in the matrix:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns in the matrix:");
        int cols = scanner.nextInt();
        
        // Input matrix elements
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Transpose the matrix
        int[][] transposeMatrix = transpose(matrix);
        
        // Print the transpose matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposeMatrix = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        
        return transposeMatrix;
    }
}
    
