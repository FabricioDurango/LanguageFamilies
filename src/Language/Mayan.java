package Language;

public class Mayan extends Language {

    public Mayan(String name, int numSpeakers){
        super(name, numSpeakers,"Central america", "verb-object-subject");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Fund fact: "+ this.name + "is an ergative languaje.");
    }

}
