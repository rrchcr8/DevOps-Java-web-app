package org.fundacionjala.licorstore.services;

import org.fundacionjala.licorstore.model.LiquorType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrch on 1/5/19.
 * This is a service.
 */
public class LiquorService {

    public List getAvailableBrands(LiquorType type){

        List brands = new ArrayList();

        if(type.equals(LiquorType.WINE)){
            brands.add("Adrianna Vineyard");
            brands.add(("J. P. Chenet"));

        }else if(type.equals(LiquorType.WHISKY)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");

        }else if(type.equals(LiquorType.BEER)){
            brands.add("Corona");

        }else {
            brands.add("No Brand Available, local production");
        }
        return brands;
    }
}