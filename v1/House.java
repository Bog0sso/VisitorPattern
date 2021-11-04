public class House implements Building {
    int countKitchen=0;
    int countBedroom=0;
    int countLivingroom=0;
    int toilets=0;
    public House(int countKitchen,int countBedroom,int countLivingroom,int toilets){
        this.countKitchen=countKitchen;
        this.countBedroom=countBedroom;
        this.countLivingroom=countLivingroom;
        this.toilets=toilets;
    }
    
    public int getCountKitchen() {
        return countKitchen;
    }
    public int getCountBedroom() {
        return countBedroom;
    }
    public int getCountLivingroom() {
        return countLivingroom;
    }
    public int getToilets() {
        return toilets;
    }
    public void setCountKitchen(int countKitchen) {
        this.countKitchen = countKitchen;
    }
    public void setCountBedroom(int countBedroom) {
        this.countBedroom = countBedroom;
    }
    public void setCountLivingroom(int countLivingroom) {
        this.countLivingroom = countLivingroom;
    }
    public void setToilets(int toilets) {
        this.toilets = toilets;
    }
    

    //The accept method will be implemented instead of many lines of code


    @Override
    public void getInfo(){
        StringBuilder string=new StringBuilder();
        string.append(this.getClass().getName()+"::"+
            "{\ncountKitchen:"+this.getCountKitchen()
            +"\ncountBedroom:"+this.getCountBedroom()
            +"\ncountLivingroom:"+this.getCountLivingroom()
            +"\ntoilets:"+this.getToilets()+"\n}");
        System.out.println(string);
    }
}
