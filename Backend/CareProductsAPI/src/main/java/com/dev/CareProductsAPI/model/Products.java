package com.dev.CareProductsAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "CareProductsCollection")
public class Products {
    @Id
    private ObjectId id;
    private String productId;
    private String productBrand;
    private String productName;
    private String productForm;
    private String skinType;
    private String productScent;
    private String productLink;
    private String productImg;
    private String releaseDate;
    private List<String> features;
    @DocumentReference
    private List<Reviews> reviews;
}
