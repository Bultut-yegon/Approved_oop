public class PoliticalParty {
    public int electedLeader,numOfWins;
    public static void main(String[] args) {
        DemocraticParty party=new DemocraticParty();
        party.SponsorPresident();
        party.numOfWins(2000);
        Republican republic=new Republican();
        republic.lead("Trumph");
    }
    
}
 class DemocraticParty extends PoliticalParty {
    public void SponsorPresident(){
        System.out.println("Support party agenda");
    }
    //override
    public int numOfWins(int counts){
        System.out.println("The total votes won by Democratic party is "+counts);
        return counts;
        
    }

    
}
class Republican extends PoliticalParty{
    public void lead(String leader){
        System.out.println("sponsored leader is :"+leader);
    }
}
