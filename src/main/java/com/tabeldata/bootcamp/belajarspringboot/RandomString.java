/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.bootcamp.belajarspringboot;

import java.util.UUID;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author dimasm93
 */
@Component
@Scope("singleton")
public class RandomString {

    public RandomString() {
        this.value = UUID.randomUUID().toString();
    }

    private String value;

    public String getValue() {
        return value;
    }

}
