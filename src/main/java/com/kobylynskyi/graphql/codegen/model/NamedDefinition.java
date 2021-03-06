package com.kobylynskyi.graphql.codegen.model;

public class NamedDefinition {

    private String javaName;
    private String graphqlTypeName;
    private boolean isInterface;
    private boolean mandatory;
    private boolean primitiveCanBeUsed;

    public NamedDefinition(String javaName, String graphqlTypeName,
                           boolean isInterface, boolean mandatory, boolean primitiveCanBeUsed) {
        this.javaName = javaName;
        this.graphqlTypeName = graphqlTypeName;
        this.isInterface = isInterface;
        this.mandatory = mandatory;
        this.primitiveCanBeUsed = primitiveCanBeUsed;
    }

    public String getJavaName() {
        return javaName;
    }

    public void setJavaName(String javaName) {
        this.javaName = javaName;
    }

    public String getGraphqlTypeName() {
        return graphqlTypeName;
    }

    public void setGraphqlTypeName(String graphqlTypeName) {
        this.graphqlTypeName = graphqlTypeName;
    }

    public boolean isInterface() {
        return isInterface;
    }

    public void setInterface(boolean anInterface) {
        isInterface = anInterface;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public boolean isPrimitiveCanBeUsed() {
        return primitiveCanBeUsed;
    }

    public void setPrimitiveCanBeUsed(boolean primitiveCanBeUsed) {
        this.primitiveCanBeUsed = primitiveCanBeUsed;
    }

}
