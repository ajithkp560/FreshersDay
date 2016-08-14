/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fresherday;

import static java.lang.Math.random;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
/**
 *
 * @author TERMINAL
 */
public class FXMLDocumentController implements Initializable {
    final static DropShadow ds = new DropShadow( 10, Color.ORANGERED );
    @FXML
    Text Left;
    KeyCodeCombination kb, kbFull;
    String[] boyss = {
        "Kabali Dialog", 
        "Break dance with sad song", 
        "Smoking Ad", 
    };
    String[] girl = {"Poovalan", 
        "Dubsmash - Kilukkam", 
        "Dubbing - Charlie Chaplin", 
        "Dubsmash - Premam", 
        "Telebrand Show: Product-Toothbrush for cow",
        "Telebrand Show: Kuttichool", 
        "Song in different styles", 
        "Audience spool",
        "Story telling in English - Tortoise and Rabbit",
        "Nimisha Kavitha - Muttathod",
        "Multiplication Table", 
        "Balloon Task with sitting", 
        "Reading Book", 
        "Talk about something",
        "Action Song", 
        "Tongue Twister",
        "Drinking without Expression",
        "Eating Without Expression", 
        "Dhurantham - for 5 minutes", 
        "Sales",  
        "Dubsmash - Kadinjool Kalyanam", 
        "Emotions",
        "Counting", };
    
    String[] girls2 = {"Mirror task", "Straw Task", 
        "Findout the coins", "Spot Choreography"};
    String[] boys2 = {"Belly dance", "Makeup", "Saree with dance", "Cat walk"};
    
    String[] girl3 = {"Balloon Task"};
    String[] girls4 = {"Thiruvathira with oppana"};
    String[] boys4 = {"Commentary with slow motion cricket with replay" };
    String[][] girls = {
        {"Anusha", "MCA RE", "profile.png", "Reading"},
        {"Dhanya M V", "MCA LE", "profile.png", "Reading books,Painting,Music"},
        {"Farzeena Parveez", "MCA LE", "profile.png", "Reading books,Painting,Music"},
        {"Bibina V", "MCA LE", "profile.png", "Reading books,Painting,Music"},
        {"Megha Narayanan", "MCA LE", "profile.png", "Reading books,Painting,Music"},
        {"Anagha Raj", "MCA LE", "profile.png", "Craft Making"},
        {"Dilna Prabhakaran C", "MCA LE", "profile.png", "Craft Making,Reading Stories"},
        {"Khajina P K", "MCA RE", "profile.png", "Reading"},
        {"Bijina K P", "MCA LE", "profile.png",  "Beading Books"},
        {"Neethu Madhusoodhanan", "MCA RE", "profile.png", "Gardening, Reading Books"},
        {"Amrutha M S", "MCA LE", "profile.png", "Drawing"}, 
        {"Fabeena TV", "MCA RE", "profile.png", "Reading books"},
        {"Shonima", "MCA RE", "profile.png", "Reading,Music,Watching TV"}, 
        {"Aswathy K", "MCA LE", "profile.png", "Reading Books"},
        {"Madhuja P.M", "MCA LE", "profile.png", "Reading Books"},
        {"Mareena Thomas", "MCA RE", "profile.png", "TV, Music"},
        {"Haritha Suresh", "MCA RE", "profile.png", "Travelling,TV"},
        {"Shradha Sathyan", "MCA RE", "profile.png", "Reading"},
        {"Dilna Sasikumar", "MCA LE", "profile.png", "Reading Books"},
        {"Sherlin Tom C", "MCA RE", "profile.png", "Reading,watching TV"},
        {"Thanseema CMP", "MCA RE", "profile.png", "Reading"}, 
        {"Bavana Balakrishnan", "MCA LE", "profile.png", "Books,Music"},
        {"Megha P", "MCA RE", "profile.png", "Reading books"},
        {"Aparna N.P", "MCA RE", "profile.png", "TV,Travelling,Cooking"},
        {"Ranjitha Rajendran", "MCA RE", "profile.png", "Music,reading"},
        {"Prameela Y", "MCA RE", "profile.png", "Listening Music"},
        {"Arunima Kp", "MCA RE", "profile.png","TV,Travelling"},
        {"Anjana S", "MCA LE", "profile.png", "TV,Reading books"},
        {"Shonima Sanil", "MCA RE", "profile.png", "Reading books"},
        {"Kavyashree PK", "MCA RE", "profile.png", "Listening Music"},
        {"Kavya.K", "MCA LE", "profile.png", "Book,Music,Stamp Collection"},
        {"Fath. Hafra", "MCA LE", "profile.png", "Reading Books", "Watching Movies"},
        {"Shana KV", "MCA RE", "profile.png", "Reading Books", "Watching Movies"},
        {"Sneha C", "MCA RE", "profile.png", "Reading Books", "Watching Movies"}
    };
    String[][] boys = {
        {"Nishanth", "MCA RE", "profile.png", "Reading"},
        {"Shinith PP", "MCA LE", "profile.png", "Reading books,Painting,Music"},
        {"Varun Kumar AV", "MCA LE", "profile.png", "Reading books,Painting,Music"},
        {"Nooshin P T P",  "MCA LE", "profile.png", "Reading books,Painting,Music"},
        {"Sreerag E T K", "MCA LE", "profile.png", "Reading Books,Playing Cricket"},
        {"Siraj M K", "MCA LE", "profile.png", "Playing Football ,Reading Books"},
        {"Nithin K", "MCA RE", "profile.png", "Playing Cricket,Badminton,Swimming"},
        {"Abin K", "MCA RE", "profile.png", "Reading"},
        {"Anand V", "MCA RE", "profile.png", "Reading"},
        {"Jithin Niclhavose", "MCA RE", "profile.png", "Driving,playing,travelling"},
        {"A.Abhilash", "MCA LE", "profile.png", "Riding bikes"},
        {"Jishnu Raj.A", "MCA RE", "profile.png", "Reading"},
        {"Abhinav M.K", "MCA RE", "profile.png", "Reading"},
        {"Roshan.P.Antony", "MCA LE", "profile.png", "Driving"},
        {"Ajay TV", "MCA RE", "profile.png", "Reading books"},
        {"Vipin Pavithran", "MCA RE", "profile.png", "Listening music"},
        {"Rejul.T", "MCA LE", "profile.png","Listening Music"} ,
        {"Rijin Raj", "MCA LE", "profile.png", "Drawing"},
    };
    
    List<String> BoysS = new LinkedList<String>(Arrays.asList(boyss));
    List<String> GirlsS = new LinkedList<String>(Arrays.asList(girl));
    List<String> BoysSBk = new LinkedList<String>(Arrays.asList(boyss));
    List<String> GirlsSBk = new LinkedList<String>(Arrays.asList(girl));
    
    List<String> Boys2 = new LinkedList<String>(Arrays.asList(boys2));
    List<String> Girls2 = new LinkedList<String>(Arrays.asList(girls2));
    List<String> Boys2Bk = new LinkedList<String>(Arrays.asList(boys2));
    List<String> Girls2Bk = new LinkedList<String>(Arrays.asList(girls2));
    
    //List<String> Group4 = new LinkedList<String>(Arrays.asList(group4));
    List<String> Girls3 = new LinkedList<String>(Arrays.asList(girl3));
    List<String> Girls3Bk = new LinkedList<String>(Arrays.asList(girl3));
    
    List<String> Boys4 = new LinkedList<String>(Arrays.asList(boys4));
    List<String> Girls4 = new LinkedList<String>(Arrays.asList(girls4));
    List<String> Boys4Bk = new LinkedList<String>(Arrays.asList(boys4));
    List<String> Girls4Bk = new LinkedList<String>(Arrays.asList(girls4));
    
    
    List<String[]> Girls = new LinkedList<String[]>(Arrays.asList(girls));
    List<String[]> Boys = new LinkedList<String[]>(Arrays.asList(boys));
    String jobbb;
    @FXML
    private Button twoB, threeB, fourB, singleB;
    @FXML
    private Label kitty;
    @FXML
    private ImageView fre, day, single, group, rot;
    @FXML
    private Button start;
    @FXML
    private AnchorPane finishx, stage1, stage2, anim;
    @FXML
    private AnchorPane dialog, one, two, three, four;
    @FXML
    private BorderPane menu, singlemenu;
    @FXML
    private Rectangle single1, group2one, group2two, group3one, group3two, group3three, group4one, group4two, group4three, group4four;
    @FXML
    private ImageView photo2one, photo2two;
    @FXML
    private Label name2one,name2two, class2one, class2two, hobbie2one, hobbie2two;
    @FXML
    private ImageView photo3one, photo3two, photo3three;
    @FXML
    private ImageView photo4one, photo4two, photo4three, photo4four;
    @FXML
    private ImageView singleimg;
    @FXML
    private Label singlename, singleclass, singlehobbie;
    @FXML
    private Label name3one, name3two, name3three, class3one, class3two, class3three, hobbie3one, hobbie3two, hobbie3three;
    @FXML
    private Rectangle singlerec;
    @FXML
    private Label name4one, name4two, name4three, name4four, class4one, class4two, class4three, class4four, hobbie4one, hobbie4two, hobbie4three, hobbie4four;
    Timeline timelineX, timelineY;
    void resetGame(){
        /*kitty.setVisible(false);
        rot.setOpacity(1.0);
        rot.setVisible(true);*/
        one.setVisible(false);
        two.setVisible(false);
        three.setVisible(false);
        four.setVisible(false);
        
    }
    @FXML
    private void startClicked(ActionEvent evt){
        stage1.setVisible(false);
        stage2.setVisible(true);
        single.setImage(new Image(getClass().getResource("single.png").toExternalForm()));
        single.setX(300);
        single.setY(180);
        single.autosize();
        group.setImage(new Image(getClass().getResource("group.jpg").toExternalForm()));
        group.setX(800);
        group.setY(180);
        group.autosize();
        
        String cssBordering = "-fx-border-color:darkblue ; \n" //#090a0c
            + "-fx-border-insets:3;\n"
            + "-fx-border-radius:7;\n"
            + "-fx-border-width:1.0";
        single.setStyle(cssBordering);
        group.setStyle(cssBordering);
        shakeStage();
        
        single.onMouseEnteredProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try{
                    timelineX.stop();
                    //single.setStyle("-fx-background-radius: 50;");
                }
                catch(Exception e){}
            }
        });
        single.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try{
                    timelineX.play();
                }
                catch(Exception e){}
            }
        });
        
        group.onMouseEnteredProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try{
                    timelineY.stop();
                    /*ScaleTransition st = new ScaleTransition(Duration.millis(2000), group);
                    st.setByX(1.5f);
                    st.setByY(1.5f);
                    st.play();*/
                }
                catch(Exception e){}
            }
        });
        
        group.onMouseExitedProperty().set(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try{
                    timelineY.play();
                }
                catch(Exception e){}
            }
        });
        
        single.onMouseClickedProperty().set(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                resetGame();
                RotateTransition rotator = new RotateTransition(Duration.millis(1000), single);
                rotator.setAxis(Rotate.Y_AXIS);
                rotator.setFromAngle(0);
                rotator.setToAngle(360);
                rotator.setInterpolator(Interpolator.LINEAR);
                rotator.setCycleCount(1);
                rotator.play();
                
                ScaleTransition st = new ScaleTransition(Duration.millis(500), single);
                st.setByX(0.2f);
                st.setByY(0.2f);
                st.onFinishedProperty().set(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        ScaleTransition st = new ScaleTransition(Duration.millis(100), single);
                        st.setByX(-0.2f);
                        st.setByY(-0.2f);
                        st.play();
                        st.onFinishedProperty().set(new EventHandler<ActionEvent>(){
                            @Override
                            public void handle(ActionEvent event) {
                                kitty.setVisible(false);
                                rot.setOpacity(1.0);
                                rot.setVisible(true);
                                startSingleStage();
                            }
                        });
                    }
                });
                rotator.onFinishedProperty().set(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event) {                
                        st.play();
                    }
                });
            }
        });
        group.onMouseClickedProperty().set(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                resetGame();
                RotateTransition rotator = new RotateTransition(Duration.millis(1000), group);
                rotator.setAxis(Rotate.Y_AXIS);
                rotator.setFromAngle(0);
                rotator.setToAngle(360);
                rotator.setInterpolator(Interpolator.LINEAR);
                rotator.setCycleCount(1);
                rotator.play();
                
                ScaleTransition st = new ScaleTransition(Duration.millis(500), group);
                st.setByX(0.2f);
                st.setByY(0.2f);
                st.onFinishedProperty().set(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        ScaleTransition st = new ScaleTransition(Duration.millis(100), group);
                        st.setByX(-0.2f);
                        st.setByY(-0.2f);
                        st.play();
                        st.onFinishedProperty().set(new EventHandler<ActionEvent>(){
                            @Override
                            public void handle(ActionEvent event) {
                                stage2.setVisible(false);
                                dialog.setVisible(true);
                                singlemenu.setVisible(false);
                                menu.setVisible(true);
                                
                                kitty.setVisible(false);
                                rot.setOpacity(1.0);
                                rot.setVisible(true);
                            }
                        });
                    }
                });
                rotator.onFinishedProperty().set(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event) {                
                        st.play();
                    }
                });
            }
        });
    }
    private void startSingleStage(){
        System.out.println("Hello");
        try{
        RotateTransition rotate = rotate(singleimg);
        rotate.play();
        stage2.setVisible(false);
        dialog.setVisible(true);
        one.setVisible(true);
        two.setVisible(false);
        three.setVisible(false);
        four.setVisible(false);
        singlemenu.setVisible(true);
        menu.setVisible(false);
        //singleimg.setImage(new Image(getClass().getResource("profile.png").toExternalForm()));
        singlename.setAlignment(Pos.CENTER);
        singleclass.setAlignment(Pos.CENTER);
        singlehobbie.setAlignment(Pos.CENTER);
        String[] data = new String[4];
        if(Boys.size()>0 && Girls.size()>0){
            int rrr = new Random().nextInt((Boys.size()+Girls.size()));
            System.out.println(rrr);
            if(rrr<Boys.size() && BoysS.size()>0){
                data = getBoy();
                int jjj = new Random().nextInt(BoysS.size()); 
                jobbb = BoysS.get(jjj);
                BoysS.remove(jjj);
            }
            else {
                if(GirlsS.size()>0){
                    data = getGirl();
                    int jjj = new Random().nextInt(GirlsS.size()); 
                    jobbb = GirlsS.get(jjj);
                    GirlsS.remove(jjj);
                }
                else{
                    data = null;
                }
            }
        }
        else if(Girls.size()>0 && GirlsS.size()>0){
            data = getGirl();
            int jjj = new Random().nextInt(GirlsS.size()); 
            jobbb = GirlsS.get(jjj);
            GirlsS.remove(jjj);
        }
        else if(Boys.size()>0 && BoysS.size()>0){
            data = getBoy();
            int jjj = new Random().nextInt(BoysS.size()); 
            jobbb = BoysS.get(jjj);
            BoysS.remove(jjj);
        }
        else{
            data = null;
        }
        System.out.println("HHH"+data[0]);
        if(data!=null){    
            singleimg.setImage(new Image(getClass().getResource(data[2]).toExternalForm()));
            singlename.setText(data[0]);
            singleclass.setText(data[1]);
            singlehobbie.setText(data[3]);
        }
        else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Candidates out of stock");
            alert.showAndWait();
            return;
        }
        singleB.setText("Single ("+(BoysS.size()+GirlsS.size())+")");
        
        
       }
        catch(Exception e){System.out.println(e.getCause());}
    }
    @FXML
    private void reloadSingle(ActionEvent evt){
        
    }
    @FXML
    private void closeGame(ActionEvent evt){
        stage2.setVisible(true);
        dialog.setVisible(false);
        one.setVisible(false);
        two.setVisible(false);
        three.setVisible(false);
        four.setVisible(false);
        
        //kitty.setVisible(false);
        //rot.setOpacity(1.0);
        //rot.setVisible(true);
    }
    @FXML
    private void selectTwo(ActionEvent evt){
        try{
        one.setVisible(false);
        two.setVisible(true);
        three.setVisible(false);
        four.setVisible(false);
        //photo2one.setImage(new Image(getClass().getResource("profile.png").toExternalForm()));
        //photo2one.setEffect(ds);
        //photo2two.setImage(new Image(getClass().getResource("DSC_0281.JPG").toExternalForm()));
        //photo2two.setEffect(ds);
        name2one.setAlignment(Pos.CENTER);
        name2two.setAlignment(Pos.CENTER);
        class2one.setAlignment(Pos.CENTER);
        class2two.setAlignment(Pos.CENTER);
        hobbie2one.setAlignment(Pos.CENTER);
        hobbie2two.setAlignment(Pos.CENTER);
        String[] data1 = new String[4];
        data1 = null;
        String[] data2 = new String[4];
        data2 = null;
        /*if(Boys.size()>1 && Girls.size()>1){
            int rrr = new Random().nextInt((Boys.size()+Girls.size()));
            if(rrr<Girls.size()){
                data1 = getGirl();
                data2 = getGirl();
                int jjj = new Random().nextInt(Girls2.size());
                jobbb = Girls2.get(jjj);
                Girls2.remove(jjj);
            }
            else{
                data1 = getBoy();
                data2 = getBoy();
                int jjj = new Random().nextInt(Boys2.size());
                jobbb = Boys2.get(jjj);
                Boys2.remove(jjj);
            }
        }
        else*/ if(Girls.size()>1 && Girls2.size()>0){
                data1 = getGirl();
                data2 = getGirl();
                int jjj = new Random().nextInt(Girls2.size());
                jobbb = Girls2.get(jjj);
                Girls2.remove(jjj);
        }
        else if(Boys.size()>0 && Boys2.size()>0){
                data1 = getBoy();
                data2 = getBoy();
                int jjj = new Random().nextInt(Boys2.size());
                jobbb = Boys2.get(jjj);
                Boys2.remove(jjj);
        }
        else{
            data1 = null;
            data2 = null;
        }
        
        System.out.println(""+Boys2.size());
        System.out.println(""+Girls2.size());
        //photo2one.setImage(new Image(getClass().getResource("profile.png").toExternalForm()));
        //photo2one.setEffect(ds);
        //photo2two.setImage(new Image(getClass().getResource("DSC_0281.JPG").toExternalForm()));
        //photo2two.setEffect(ds);
        name2one.setAlignment(Pos.CENTER);
        name2two.setAlignment(Pos.CENTER);
        class2one.setAlignment(Pos.CENTER);
        class2two.setAlignment(Pos.CENTER);
        hobbie2one.setAlignment(Pos.CENTER);
        hobbie2two.setAlignment(Pos.CENTER);
        
        twoB.setText("Two ("+(Girls2.size()+Boys2.size()+Girls2.size())+")");
        threeB.setText("Three ("+(Girls3.size())+")");
        fourB.setText("Four ("+(Boys4.size()+Girls2.size())+")");
        
        if(data1!=null && data2!=null){
            photo2one.setImage(new Image(getClass().getResource(data1[2]).toExternalForm()));
            photo2two.setImage(new Image(getClass().getResource(data2[2]).toExternalForm()));
            this.rotate(photo2one).play();
            this.rotate(photo2two).play();
        
            name2one.setText(data1[0]);
            name2two.setText(data2[0]);
        
            class2one.setText(data1[1]);
            class2two.setText(data2[1]);
        
        
            hobbie2one.setText(data1[3]);
            hobbie2two.setText(data2[3]);
        }
        else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Candidates out of stock");
            alert.showAndWait();
            return;
        }
        //group2one.setEffect(new DropShadow( 15, Color.ORANGERED ));
        //group2two.setEffect(new DropShadow( 15, Color.ORANGERED ));
        }
        catch(Exception e){System.out.println(e.getMessage());}
    }
    @FXML
    private void selectThree(ActionEvent evt){
        try{
        one.setVisible(false);
        two.setVisible(false);
        three.setVisible(true);
        four.setVisible(false);
        photo3one.setImage(new Image(getClass().getResource("profile.png").toExternalForm()));
        photo3two.setImage(new Image(getClass().getResource("profile.png").toExternalForm()));
        photo3three.setImage(new Image(getClass().getResource("profile.png").toExternalForm()));
        name3one.setAlignment(Pos.CENTER);
        name3two.setAlignment(Pos.CENTER);
        name3three.setAlignment(Pos.CENTER);
        class3one.setAlignment(Pos.CENTER);
        class3two.setAlignment(Pos.CENTER);
        class3three.setAlignment(Pos.CENTER);
        hobbie3one.setAlignment(Pos.CENTER);
        hobbie3two.setAlignment(Pos.CENTER);
        hobbie3three.setAlignment(Pos.CENTER);
        
        String[] data1 = new String[4];
        String[] data2 = new String[4];
        String[] data3 = new String[4];
        
        if(Girls.size()>2 && Girls3.size()>0){
            data1 = getGirl();
            data2 = getGirl();
            data3 = getGirl();
            int rrr = new Random().nextInt(Girls3.size());
            jobbb = Girls3.get(rrr);
            Girls3.remove(rrr);
        }
        else{
            data1 = null;
            data2 = null;
            data3 = null;
        }
        
        
        twoB.setText("Two ("+(Girls2.size()+Boys2.size()+Girls2.size())+")");
        threeB.setText("Three ("+(Girls3.size())+")");
        fourB.setText("Four ("+(Boys4.size()+Girls4.size())+")");
        
        if(data1!=null && data2!=null && data3!=null){
            photo3one.setImage(new Image(getClass().getResource(data1[2]).toExternalForm()));
            photo3two.setImage(new Image(getClass().getResource(data2[2]).toExternalForm()));
            photo3three.setImage(new Image(getClass().getResource(data3[2]).toExternalForm()));
            
            
            this.rotate(photo3one).play();
            this.rotate(photo3two).play();
            this.rotate(photo3three).play();
            
            name3one.setText(data1[0]);
            name3two.setText(data2[0]);
            name3three.setText(data3[0]);
            class3one.setText(data1[1]);
            class3two.setText(data2[1]);
            class3three.setText(data3[1]);
            hobbie3one.setText(data1[3]);
            hobbie3two.setText(data2[3]);
            hobbie3three.setText(data3[3]);
        }
        else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Candidates out of stock");
            alert.showAndWait();
            return;
        }
        
        
        }
        catch(Exception e){System.out.println(e.getMessage());}
    }
    @FXML
    private void selectFour(ActionEvent evt){
        try{
        one.setVisible(false);
        two.setVisible(false);
        three.setVisible(false);
        four.setVisible(true);
        
        name4one.setAlignment(Pos.CENTER);
        name4two.setAlignment(Pos.CENTER);
        name4three.setAlignment(Pos.CENTER);
        name4four.setAlignment(Pos.CENTER);
        class4one.setAlignment(Pos.CENTER);
        class4two.setAlignment(Pos.CENTER);
        class4three.setAlignment(Pos.CENTER);
        class4four.setAlignment(Pos.CENTER);
        hobbie4one.setAlignment(Pos.CENTER);
        hobbie4two.setAlignment(Pos.CENTER);
        hobbie4three.setAlignment(Pos.CENTER);
        hobbie4four.setAlignment(Pos.CENTER);
        
        String data1[] = new String[4];
        String data2[] = new String[4];
        String data3[] = new String[4];
        String data4[] = new String[4];
        
        /*if(Girls.size()>3 && Boys.size()>0){
            int rrr = new Random().nextInt((Girls.size()+Boys.size()));
            if(rrr<Girls.size()){
                data1 = getGirl();
                data2 = getGirl();
                data3 = getGirl();
                data4 = getGirl();
                jobbb = Girls4.get(0);
                Girls4.remove(0);
            }
            else{
                data1 = getBoy();
                data2 = getBoy();
                data3 = getBoy();
                data4 = getBoy();
                jobbb = Boys4.get(0);
                Boys4.remove(0);
            }
        }
        else*/ if(Girls.size()>3 && Girls4.size()>0){
                data1 = getGirl();
                data2 = getGirl();
                data3 = getGirl();
                data4 = getGirl();
                jobbb = Girls4.get(0);
                Girls4.remove(0);
        }
        else if(Boys.size()>4 && Boys4.size()>0){
                data1 = getBoy();
                data2 = getBoy();
                data3 = getBoy();
                data4 = getBoy();
                jobbb = Boys4.get(0);
                Boys4.remove(0);
        }
        else{
            data1 = null;
            data2 = null;
            data3 = null;
            data4 = null;
        }
        
        twoB.setText("Two ("+(Girls2.size()+Boys2.size()+Girls2.size())+")");
        threeB.setText("Three ("+(Girls3.size())+")");
        fourB.setText("Four ("+(Boys4.size()+Girls4.size())+")");
        if(data1!=null && data2!=null && data3!=null && data4!=null){
            name4one.setText(data1[0]);
            name4two.setText(data2[0]);
            name4three.setText(data3[0]);
            name4four.setText(data4[0]);
            class4one.setText(data1[1]);
            class4two.setText(data2[1]);
            class4three.setText(data3[1]);
            class4four.setText(data4[1]);
            hobbie4one.setText(data1[3]);
            hobbie4two.setText(data2[3]);
            hobbie4three.setText(data3[3]);
            hobbie4four.setText(data4[3]);
        
            photo4one.setImage(new Image(getClass().getResource(data1[2]).toExternalForm()));
            photo4two.setImage(new Image(getClass().getResource(data2[2]).toExternalForm()));
            photo4three.setImage(new Image(getClass().getResource(data3[2]).toExternalForm()));
            photo4four.setImage(new Image(getClass().getResource(data4[2]).toExternalForm()));
            
            
            this.rotate(photo4one).play();
            this.rotate(photo4two).play();
            this.rotate(photo4three).play();
            this.rotate(photo4four).play();
        }
        else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Candidates out of stock");
            alert.showAndWait();
            return;
        }
        /*if(Group4.size()>0){
            int jjj = new Random().nextInt(Group4.size());
            jobbb = Group4.get(jjj);
            Group4.remove(jjj);
        }
        else{
            jobbb = "No Task Left";
        }*/
        }
        catch(Exception e){System.out.println(e.getMessage());}
    }
    
    @FXML
    private void reload2One(ActionEvent evt){
        String data[] = new String[4];// = jobbb;
        if(Boys2Bk.contains(jobbb)){
            if(Boys.size()>0){
                data = getBoy();
            }
        }
        else if(Girls2Bk.contains(jobbb)){
            if(Girls.size()>0){
                data = getGirl();
            }
            else{
                data = null;
            }
        }
        else{
            data = null;
        }
        
        if(data!=null){
            photo2one.setImage(new Image(getClass().getResource(data[2]).toExternalForm()));
            name2one.setText(data[0]);
            class2one.setText(data[1]);
            hobbie2one.setText(data[3]);
            this.rotate(photo2one).play();
        }
        else{
            
        }
        System.out.println(jobbb);
    }
    
    @FXML
    private void reload2Two(ActionEvent evt){
        String data[] = new String[4];// = jobbb;
        if(Boys2Bk.contains(jobbb)){
            if(Boys.size()>0){
                data = getBoy();
            }
        }
        else if(Girls2Bk.contains(jobbb)){
            if(Girls.size()>0){
                data = getGirl();
            }
            else{
                data = null;
            }
        }
        else{
            data = null;
        }
        
        if(data!=null){
            photo2two.setImage(new Image(getClass().getResource(data[2]).toExternalForm()));
            name2two.setText(data[0]);
            class2two.setText(data[1]);
            hobbie2two.setText(data[3]);
            this.rotate(photo2two).play();
        }
        else{
            System.out.println("OutofBoud");
        }
        System.out.println(jobbb);
    }
    
    
    @FXML
    private void reload3One(ActionEvent evt){
        String data[] = new String[4];// = jobbb;
        if(Girls.size()>0){
            data = getGirl();
        }
        else{
            data = null;
        }
        
        System.out.println(data);
        if(data!=null){
            photo3one.setImage(new Image(getClass().getResource(data[2]).toExternalForm()));
            name3one.setText(data[0]);
            class3one.setText(data[1]);
            hobbie3one.setText(data[3]);
            this.rotate(photo3one).play();
        }
        else{
            
        }
        System.out.println(jobbb);
    }
    
    @FXML
    private void reload3Two(ActionEvent evt){
        String data[] = new String[4];// = jobbb;
        if(Girls.size()>0){
            data = getGirl();
        }
        else{
            data = null;
        }
        if(data!=null){
            photo3two.setImage(new Image(getClass().getResource(data[2]).toExternalForm()));
            name3two.setText(data[0]);
            class3two.setText(data[1]);
            hobbie3two.setText(data[3]);
            this.rotate(photo3two).play();
        }
        else{
            System.out.println("OutofBoud");
        }
        System.out.println(jobbb);
    }
    @FXML
    private void reload3Three(ActionEvent evt){
        String data[] = new String[4];// = jobbb;
        if(Girls.size()>0){
            data = getGirl();
        }
        else{
            data = null;
        }
        if(data!=null){
            photo3three.setImage(new Image(getClass().getResource(data[2]).toExternalForm()));
            name3three.setText(data[0]);
            class3three.setText(data[1]);
            hobbie3three.setText(data[3]);
            this.rotate(photo3three).play();
        }
        else{
            System.out.println("OutofBoud");
        }
        System.out.println(jobbb);
    }
    
    @FXML
    private void reload4One(ActionEvent evt){
        String data[] = new String[4];// = jobbb;
        if(Boys4Bk.contains(jobbb)){
            if(Boys.size()>0){
                data = getBoy();
            }
            else{
                data = null;
            }
        }
        else if(Girls4Bk.contains(jobbb)){
            if(Girls.size()>0){
                data = getGirl();
            }
            else{
                data = null;
            }
        }
        else{
            data = null;
        }
        System.out.println(data);
        if(data!=null){
            photo4one.setImage(new Image(getClass().getResource(data[2]).toExternalForm()));
            name4one.setText(data[0]);
            class4one.setText(data[1]);
            hobbie4one.setText(data[3]);
            this.rotate(photo4one).play();
        }
        else{
            
        }
        System.out.println(jobbb);
    }
    
    @FXML
    private void reload4Two(ActionEvent evt){
        String data[] = new String[4];// = jobbb;
        if(Boys4Bk.contains(jobbb)){
            if(Boys.size()>0){
                data = getBoy();
            }
            else{
                data = null;
            }
        }
        else if(Girls4Bk.contains(jobbb)){
            if(Girls.size()>0){
                data = getGirl();
            }
            else{
                data = null;
            }
        }
        else{
            data = null;
        }
        System.out.println("AAA");
        if(data!=null){
            photo4two.setImage(new Image(getClass().getResource(data[2]).toExternalForm()));
            name4two.setText(data[0]);
            class4two.setText(data[1]);
            hobbie4two.setText(data[3]);
            this.rotate(photo4two).play();
        }
        else{
            System.out.println("OutofBoud");
        }
        System.out.println(jobbb);
    }
    @FXML
    private void reload4Three(ActionEvent evt){
        String data[] = new String[4];// = jobbb;
        if(Boys4Bk.contains(jobbb)){
            if(Boys.size()>0){
                data = getBoy();
            }
            else{
                data = null;
            }
        }
        else if(Girls4Bk.contains(jobbb)){
            if(Girls.size()>0){
                data = getGirl();
            }
            else{
                data = null;
            }
        }
        else{
            data = null;
        }
        
        if(data!=null){
            photo4three.setImage(new Image(getClass().getResource(data[2]).toExternalForm()));
            name4three.setText(data[0]);
            class4three.setText(data[1]);
            hobbie4three.setText(data[3]);
            this.rotate(photo4three).play();
        }
        else{
            System.out.println("OutofBoud");
        }
        System.out.println(jobbb);
    }
    @FXML
    private void reload4Four(ActionEvent evt){
        
        String data[] = new String[4];// = jobbb;
        if(Boys4Bk.contains(jobbb)){
            if(Boys.size()>0){
                data = getBoy();
            }
            else{
                data = null;
            }
        }
        else if(Girls4Bk.contains(jobbb)){
            if(Girls.size()>0){
                data = getGirl();
            }
            else{
                data = null;
            }
        }
        else{
            data = null;
        }
        
        if(data!=null){
            photo4four.setImage(new Image(getClass().getResource(data[2]).toExternalForm()));
            name4four.setText(data[0]);
            class4four.setText(data[1]);
            hobbie4four.setText(data[3]);
            this.rotate(photo4four).play();
        }
        else{
            System.out.println("OutofBoud");
        }
        System.out.println(jobbb);
    }
    
    
    boolean rott = false;
    RotateTransition rrr;
    @FXML
    private void rotateImage(MouseEvent evt){
        if(rott==false){
            rrr = new RotateTransition(Duration.millis(1000), rot);
            rrr.setAxis(Rotate.Z_AXIS);
            rrr.setFromAngle(0);
            rrr.setToAngle(360);
            rrr.setInterpolator(Interpolator.LINEAR);
            rrr.setCycleCount(Transition.INDEFINITE);
            rrr.play();
            rott = true;
        }
        else{
            kitty.setStyle("-fx-background-color: #0f0f0f;-fx-text-fill: #3598db;");
            //rot.setVisible(false);
            fadeNode(rot);
            //kitty.setVisible(true);
            showNode(kitty);
            rrr.stop();
            rott = false;
            try{
                kitty.setAlignment(Pos.CENTER);
                kitty.setText(jobbb);
            }
            catch(Exception e){
                kitty.setText("Error: List is empty");
            }
        }
        //System.out.println(""+rott);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        singleimg.setEffect(ds); 
        photo2one.setEffect(ds); 
        photo2two.setEffect(ds);
        photo3one.setEffect(ds); 
        photo3two.setEffect(ds);
        photo3three.setEffect(ds); 
        photo4one.setEffect(ds); 
        photo4two.setEffect(ds);
        photo4three.setEffect(ds); 
        photo4four.setEffect(ds);
        twoB.setText("Two ("+(Boys2.size()+Girls2.size())+")");
        threeB.setText("Three ("+(Girls3.size())+")");
        fourB.setText("Four ("+(Boys4.size()+Girls4.size())+")");
        singleB.setText("Single ("+(BoysS.size()+GirlsS.size())+")");
        stage2.setVisible(false);
        dialog.setVisible(false);
        fre.setImage(new Image(getClass().getResource("Picture1.png").toExternalForm()));
        fre.setX(60);
        fre.setY(-100);
        fre.autosize();
        day.setImage(new Image(getClass().getResource("day.png").toExternalForm()));
        day.setX(850);
        day.setY(320);
        day.autosize();
        start.setLayoutX(600);
        start.setLayoutY(500);
        
        //Rotation
        menu.layoutXProperty().set(420);
        singlemenu.layoutXProperty().set(420);
        rot.setImage(new Image(getClass().getResource("rotate.png").toExternalForm()));
        rot.setX(600);
        rot.setY(500);
        rot.autosize();
        
        /*final Circle clip = new Circle(700, 200, 100);
        img.setClip(clip);
        name.setText("AJITH KP");
        name.setAlignment(Pos.CENTER);
        name.setLayoutX(580);
        name.setLayoutY(300);
        /*RotateTransition rt = new RotateTransition(Duration.millis(3000), img);
        rt.setByAngle(360);
        rt.setAutoReverse(true);
        rt.play();*/
        
        FadeTransition ft = new FadeTransition(Duration.millis(5000), fre);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        //ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();
        
        FadeTransition fth = new FadeTransition(Duration.millis(5000), fre);
        fth.setFromValue(1.0);
        fth.setToValue(0.0);
        fth.setAutoReverse(true);
        
        
        FadeTransition ft2 = new FadeTransition(Duration.millis(5000), day);
        ft2.setFromValue(0.0);
        ft2.setToValue(1.0);
        ft2.setAutoReverse(true);
        
        FadeTransition ft2h = new FadeTransition(Duration.millis(5000), day);
        ft2h.setFromValue(1.0);
        ft2h.setToValue(0.0);
        ft2h.setAutoReverse(true);
                
                
        FadeTransition ft3 = new FadeTransition(Duration.millis(5000), start);
        ft3.setFromValue(0.0);
        ft3.setToValue(0.80);
        ft3.setAutoReverse(true);
        ft3.play();
                        
                
        day.setOpacity(0.0);
        start.setOpacity(0.0);
        
        ft.onFinishedProperty().set(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent actionEvent) {
                ft2.play();
            }
        });
        
        ft2.onFinishedProperty().set(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent actionEvent) {
                ft2h.play();
            }
        });
              
        ft2h.onFinishedProperty().set(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                fth.play();
            }
        });
        fth.onFinishedProperty().set(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                ft.play();
            }
        });
        
        Group circ = new Group();
        
        for(int i=0;i<50;i++)
        {
            Circle c = new Circle(5, Color.web("white", 0.05));
            c.setStrokeType(StrokeType.OUTSIDE);
            c.setStroke(Color.web("white", 0.16));
            c.setStrokeWidth(4);
            c.setEffect(new BoxBlur(10,10,3));
            circ.getChildren().add(c);
        }
        
        Rectangle col = new Rectangle(finishx.getWidth(), finishx.getHeight(), new LinearGradient(0f, 1f, 1f, 0f, true, CycleMethod.NO_CYCLE, new Stop[]{
                                        new Stop(0,    Color.web("#f8bd55")),
                                        new Stop(0.14, Color.web("#c0fe56")),
                                        new Stop(0.28, Color.web("#5dfbc1")),
                                        new Stop(0.43, Color.web("#64c2f8")),
                                        new Stop(0.57, Color.web("#be4af7")),
                                        new Stop(0.71, Color.web("#ed5fc2")),
                                        new Stop(0.85, Color.web("#ef504c")),
                                        new Stop(1,    Color.web("#f2660f")),}));
        col.widthProperty().bind(finishx.widthProperty());
        col.heightProperty().bind(finishx.heightProperty());
        Group grp = new Group(new Group(new Rectangle(finishx.getWidth(), finishx.getHeight(), Color.BLACK), circ), col);
        col.setBlendMode(BlendMode.OVERLAY);
        anim .getChildren().add(grp);
        Timeline tm = new Timeline();
        for(Node cir: circ.getChildren())
        {
            tm.getKeyFrames().addAll(new KeyFrame(Duration.ZERO, new KeyValue(cir.translateXProperty(), random()*1366), new KeyValue(cir.translateYProperty(), random()*786)), new KeyFrame(new Duration(20000), new KeyValue(cir.translateXProperty(), random()*1366), new KeyValue(cir.translateYProperty(), random()*786)));
        }
        tm.setCycleCount(Timeline.INDEFINITE);
        tm.setAutoReverse(true);
        tm.play(); 
        
        kb = new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN);
        kbFull = new KeyCodeCombination(KeyCode.F, KeyCombination.CONTROL_DOWN);
    }
    
    
    @FXML
    private void KeyRel(KeyEvent event)
    {
        if(kb.match(event))
        {
            Left.setText("");
        }
    }
    
    @FXML
    private void KeyPressed(KeyEvent event)
    {
        if(kb.match(event))
        {
            Left.setText(""+(Girls.size()+Boys.size())+" "+Girls.size()+" "+Boys.size());
        }
        if(kbFull.match(event)){
            Stage stage = (Stage) Left.getScene().getWindow();//fullScreenButton.getScene().getWindow();
            stage.setFullScreen(true);
            stage.setFullScreenExitHint("");
        }
    }
    
    
    
    private void SingleEvent(){
    }
    
    int x = 0;
    int y = 0;
    public void shakeStage() {
        timelineX = new Timeline(new KeyFrame(Duration.seconds(0.1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                if (x == 0) {
                    single.setX(single.getX() + 2);
                    x = 1;
                } else {
                    single.setX(single.getX() - 2);
                    x = 0;
                }
            }
        }));

        timelineX.setCycleCount(Timeline.INDEFINITE);
        timelineX.setAutoReverse(false);
        timelineX.play();


        timelineY = new Timeline(new KeyFrame(Duration.seconds(0.1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                if (y == 0) {
                    group.setX(group.getX() + 2);
                    y = 1;
                } else {
                    group.setX(group.getX() - 2);
                    y = 0;
                }
            }
        }));

        timelineY.setCycleCount(Timeline.INDEFINITE);
        timelineY.setAutoReverse(false);
        timelineY.play();
    }
    
    private void fadeNode(Node lbl){
        FadeTransition ft = new FadeTransition(Duration.millis(5000), lbl);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setAutoReverse(true);
        ft.play();
        ft.onFinishedProperty().set(new EventHandler() {
            @Override
            public void handle(Event event) {
                //lbl.setVisible(false);
            }
        });
    }
    private void showNode(Node lbl){
        lbl.setVisible(true);
        FadeTransition ft = new FadeTransition(Duration.millis(5000), lbl);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.setAutoReverse(true);
        ft.play();
        ft.onFinishedProperty().set(new EventHandler() {
            @Override
            public void handle(Event event) {
            }
        });
    }
    private RotateTransition rotate(Node node){
        RotateTransition rotator = new RotateTransition(Duration.millis(2000), node);
        rotator.setAxis(Rotate.Y_AXIS);
        rotator.setFromAngle(0);
        rotator.setToAngle(360);
        rotator.setInterpolator(Interpolator.LINEAR);
        rotator.setCycleCount(1);
        //rotator.play();
        return rotator;
    }
    
    private String[] getBOG(){
        String[] data = new String[4];
        try{
        if(Boys.size()>0 && Girls.size()>0){
            int bof = new Random().nextInt((Boys.size()+Girls.size()));
            if(bof<=Boys.size()){
                int jjj = new Random().nextInt(Boys.size());
                data = Boys.get(jjj);
                Boys.remove(jjj);
            }
            else{
                int jjj = new Random().nextInt(Girls.size());
                data = Girls.get(jjj);
                Girls.remove(jjj);
            }
        }
        else if(Boys.size()>0){
                int jjj = new Random().nextInt(Boys.size());
                data = Boys.get(jjj);
                Boys.remove(jjj);
        }
        else if(Girls2.size()>0){
                int jjj = new Random().nextInt(Girls.size());
                data = Girls.get(jjj);
                Girls.remove(jjj);
        }
        }
        catch(Exception e){}
        return data;
    }
    private String[] getGirl(){
        int jjj = new Random().nextInt(Girls.size());
        String[] data = Girls.get(jjj);
        Girls.remove(jjj);
        return data;
    }
    private String[] getBoy(){
        int jjj = new Random().nextInt(Boys.size());
        String[] data = Boys.get(jjj);
        Boys.remove(jjj);
        return data;
    }
}
