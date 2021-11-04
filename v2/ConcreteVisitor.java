
public class ConcreteVisitor implements VisitorI {
    public void visitHouse(House house){
        StringBuilder string=new StringBuilder();
        string.append(house.getClass().getName()+"|objectID:"+house.getClass().hashCode()
            +"{\ncountKitchen:"+house.getCountKitchen()
            +"\ncountBedroom:"+house.getCountBedroom()
            +"\ncountLivingroom:"+house.getCountLivingroom()
            +"\ntoilets:"+house.getToilets()+"\n}");
        System.out.println(string);
    }
    public void visitStadium(Stadium stadium) {
        StringBuilder string=new StringBuilder();
        string.append(stadium.getClass().getName()+"|objectID:"+stadium.getClass().hashCode()+
            "{\ncountKitchen:"+stadium.getCloakrooms()
            +"\ncountBedroom:"+stadium.getCountStands()
            +"\ncountLivingroom:"+stadium.getCountParking()+"\n}");
        System.out.println(string);
    }
}
