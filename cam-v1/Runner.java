import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Runner {
    public Runner(){}
    VirtualPet p = new VirtualPet();
        p.feed();

        String ans = getResponse("How are you doing");
        System.out.println(ans);
    

    public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            "Your Message",
            "Your Title",
            JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public void takeABeat(int milliseconds){
        try{
            Thread.sleep(1000);
        } catch (Exception e){

        }
    }

    public static void main(String[] args) {
        VirtualPet p1 = new VirtualPet();
        p1.feed();
        
    }
}


