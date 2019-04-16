package HW3_OOP_Homework;

public class ConcreteTelecom extends AbstractTelecom implements InterfaceTelecom1, InterfaceTelecom2, InterfaceTelecom3 {



    @Override
    public void callingsystem () {
        System.out.println("We will chose the "+ callingSystem [0]+ "calling system for this telecommunication");
    }


    @Override
    public void phonering () {
        String [] ringTone = {"Hero", "Best day in my life", "007"};
        System.out.println("We will chose the ringtone of "+ callingSystem [0]+ "calling system for this telecommunication");

    }

    @Override
    public void answerphone(){

    }

    @Override
    public void endphone(){

    }


    @Override
    public void voicecall(){
        System.out.println("I will pick up the voicecall.");
    }


    public void videocall(){
        System.out.println("I will pick up the videocall, do you have a cam?");
    }

    public void holdcall (){
        System.out.println("Please leave your voicemail!");
}


}
