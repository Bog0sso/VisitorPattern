public class Stadium implements Building {
    int cloakrooms = 0; // vestiaire
    int countStands = 0;
    int countParking = 0;

    public Stadium(int cloakrooms, int countStands, int countParking) {
        this.cloakrooms = cloakrooms;
        this.countStands = countStands;
        this.countParking = countParking;
    }
    
    

    public int getCloakrooms() {
        return cloakrooms;
    }

    public int getCountParking() {
        return countParking;
    }

    public int getCountStands() {
        return countStands;
    }

    public void setCloakrooms(int cloakrooms) {
        this.cloakrooms = cloakrooms;
    }

    public void setCountStands(int countStands) {
        this.countStands = countStands;
    }

    public void setCountParking(int countParking) {
        this.countParking = countParking;
    }
   

    @Override
    public void getInfo() {
        StringBuilder string=new StringBuilder();
        string.append(this.getClass().getName()+"::"+
            "{\ncountKitchen:"+this.getCloakrooms()
            +"\ncountBedroom:"+this.getCountStands()
            +"\ncountLivingroom:"+this.getCountParking()+"\n}");
        System.out.println(string);
    }
   /*
   .
   .
   .
   This may be a big suit of code
   */
    
}
