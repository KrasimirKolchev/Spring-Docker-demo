package com.westcoastdealershop.services;

import com.westcoastdealershop.models.entities.Brand;
import com.westcoastdealershop.models.serviceModels.BrandServiceModel;

import java.util.ArrayList;
import java.util.List;

public interface BrandService {
    ArrayList<BrandServiceModel> getAllBrands();

    Brand getBrandById(String id);

    Brand getBrandByName(String name);

    BrandServiceModel createBrand(BrandServiceModel brand);

    Brand updateBrand(Brand brand);

    Brand deleteBrand(String id);

    long brandsCount();

    boolean brandExistByName(String name);

    void createBrandsBatch(List<Brand> brands);
}
