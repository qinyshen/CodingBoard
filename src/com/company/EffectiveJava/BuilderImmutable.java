package com.company.EffectiveJava;

import java.util.HashMap;

public class BuilderImmutable {

    //required fields
    private int id;
    private String name;

    //optional fields
    private HashMap properties;
    private String company;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap getProperties() {
        //return cloned object to avoid changing it by the client application
        return (HashMap) properties.clone();
    }

    public String getCompany() {
        return company;
    }

    private BuilderImmutable(ImmutableClassBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.properties = builder.properties;
        this.company = builder.company;
    }

    //Builder class
    public static class ImmutableClassBuilder{
        //required fields
        private int id;
        private String name;

        //optional fields
        private HashMap properties;
        private String company;

        public ImmutableClassBuilder(int i, String nm){
            this.id=i;
            this.name=nm;
        }

        public ImmutableClassBuilder setProperties(HashMap hm){
            this.properties = (HashMap) hm.clone();
            return this;
        }

        public ImmutableClassBuilder setCompany(String comp){
            this.company = comp;
            return this;
        }

        public BuilderImmutable build(){
            return new BuilderImmutable(this);
        }

    }

    // Getting immutable class only with required parameters
//        BuilderImmutable immutableClass = new BuilderImmutable.ImmutableClassBuilder(1, "Pankaj").build();
//
//        HashMap hm = new HashMap();
//        hm.put("Name", "Pankaj");
//        hm.put("City", "San Jose");
//        // Getting immutable class with optional parameters
//        BuilderImmutable immutableClass1 = new BuilderImmutable.ImmutableClassBuilder(1, "Pankaj")
//                .setCompany("Apple").setProperties(hm).build();
//
//        //Testing immutability
//        HashMap hm1 = immutableClass1.getProperties();
//
//        //lets modify the Object passed as argument or get from the Object
//        hm1.put("test", "test");
//
//        //check that immutable class properties are not changed
//        System.out.println(immutableClass1.getProperties());


}
