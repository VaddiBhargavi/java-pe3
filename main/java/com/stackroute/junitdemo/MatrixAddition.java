package com.stackroute.junitdemo;

public class MatrixAddition {
public static int[][] addition(int a[][], int b[][])
{
    int sum[][] = new int[3][2]; //Matrix for rows and columns
    int i, j;
    if(a.length <= 0  || b.length <= 0)
    {
        return sum;
    }
    else
    {
        //Rows and Columns length is not equal to zero
    for( i=0; i<3; i++)
    {
        for( j=0; j<2; j++)
        {
            //Sum of two matrices
            sum[i][j] = a[i][j] + b[i][j];
        }
    } return sum;
}}
}
