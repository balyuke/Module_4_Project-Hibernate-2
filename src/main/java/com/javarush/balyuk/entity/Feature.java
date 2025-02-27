package com.javarush.balyuk.entity;

import static java.util.Objects.isNull;

public enum Feature {
    TRAILERS("Trailers"),
    COMMENTARIES("Commentaries"),
    DELETED_SCENES("Deleted scenes"),
    BEHIND_THE_SCENES("Behind the scenes");

    private String name;

    Feature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Feature getFeatureByValue(String name) {
        if (!(isNull(name) || name.isEmpty())) {
            Feature[] features = Feature.values();
            for (Feature feature : features) {
                if (feature.name.equals(name)) {
                    return feature;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }

}
