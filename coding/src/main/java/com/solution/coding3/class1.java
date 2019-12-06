/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solution.coding3;

/**
 *
 * @author gangrade.m
 */
public class class1 implements basicOperation{

    
    public int sum(int a, int b) {
        return a+b;
    }
    
    public int sum(int a){
        return a;
    }

    @Override
    public int sum() {
        return 1;
    }
    
}
