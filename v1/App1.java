import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        House house1=new House(2, 3, 1, 2);
        Stadium stadium1=new Stadium(5, 8, 3);
        Stadium stadium2=new Stadium(8, 12, 4);
        List<Building> listOfBuilding=new ArrayList<>();
        listOfBuilding.add(house1);
        listOfBuilding.add(stadium1);
        listOfBuilding.add(stadium2);
        for (Building building : listOfBuilding) {
            building.getInfo();
        }
        //In the implementations of v2, we may suppose that the
        //this classes Stadium and House already existed 
        //and were in production

        //So by traditionnal way, what we do is updating already existing
        //classes, but here, it is forbidden and it has also risk of dysfunctioning

                
    }
}
