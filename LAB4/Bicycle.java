package java_study.LAB4;

class Bicycle {
    private String ownerName, tagNo;
    
    public Bicycle(){
        ownerName = "Unknown";
        tagNo="Empty";
    }
    public String getOwnerName(){
        return ownerName;
    }

    public String getTagNo(){
        return tagNo;
    }
    public void setOwnerName(String name){
        ownerName=name;
    }
    public void setTagNo(String tagBicycle){
        tagNo=tagBicycle;
    }
}
