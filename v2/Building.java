interface Building{
    public void accept(VisitorI visitorI);
    //To illustrate this pattern, we suppose that
    // we cannot create this method because it's forbidden 
    //to modify the existing code

    public void getInfo();
}