
public class DogConstruc {
    String name;
    String color;
    String ownerName;

    //default const


//paramet const
    public DogConstruc(String dName, String dColor, String dOwnerName){
        this.name= dName;
        this.color = dColor;
        this.ownerName = dOwnerName;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }
    public String getOwnerName(){
        if (ownerName==null){
            return "No Owner for this dog";
        }
        return ownerName;

    }


}
