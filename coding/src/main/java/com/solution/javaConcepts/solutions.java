/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solution.javaConcepts;

/**
 *
 * @author gangrade.m
 */
public class solutions implements interface3{

    @Override
    public int findGreater(int a, int b) {
        return (a > b ? a : b);
    }

    @Override
    public int doSum(int a, int b) {
        return a + b;
    }

    @Override
    public int doSub(int a, int b) {
        return a - b;
    }

    @Override
    public int doMultiply(int a, int b) {
        return a * b;
    }

    @Override
    public int doDivision(int a, int b) {
        return a / b;
    }
    
}
