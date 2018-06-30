import java.awt.*;

public class ChatClient2 extends Frame {

    TextField tfTxt = new TextField();//new
    TextArea taContent = new TextArea();//new

    public static void main(String[] args){
        ChatClient2 cc = new ChatClient2();
        cc.launchFrame();
    }

    public void launchFrame(){
        setLocation(400,300);
        setSize(300,300);
        add(tfTxt, BorderLayout.SOUTH);//
        add(taContent, BorderLayout.NORTH);//
        pack();//new
        setVisible(true);
    }


}
