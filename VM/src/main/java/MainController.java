
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.util.Pair;


import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
public class MainController implements Initializable {

    //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
    private int Taskindex=0;
    //joint index type pos vel Accel torque
    private int jtype=0;
    //1->5
    private boolean Particapants[]={false,false,false,false,false,false};
    //spine Sh-r E-r Sh-l E-l H-r kn-r H-l kn-l
    private boolean Joints[]={false,false,false,false,false,false,false,false,false};

    //DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus 10 42"window 11 50"wall 12 casDrag 13 casDrag vertical 14-legtuck
    private boolean Task[]={false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
    private Button SelectedTask;

    private Button SelectedJtype;



    @FXML
    private CheckBox DragSelect;
    @FXML
    private CheckBox HandReleaseSelect;
    @FXML
    private CheckBox KettleBellSelect;
    @FXML
    private CheckBox SprintSelect;
    @FXML
    private CheckBox DLSelect;
    @FXML
    private CheckBox JumpSelect;
    @FXML
    private CheckBox HighCrawlSelect;
    @FXML
    private CheckBox MarchSUS;
    @FXML
    private CheckBox ProneFightingSelect;
    @FXML
    private CheckBox ProneSusSelect;
    @FXML
    private CheckBox Window42Select;
    @FXML
    private CheckBox Wall50Select;
    @FXML
    private CheckBox CasDragHandleSelect;
    @FXML
    private CheckBox CasultyExtractVerticalSelect;
    @FXML
    private CheckBox LegTuckSelect;

    @FXML
    private CheckBox P1;
    @FXML
    private CheckBox P2;
    @FXML
    private CheckBox P3;
    @FXML
    private CheckBox P4;
    @FXML
    private CheckBox P5;
    @FXML
    private CheckBox P6;


    @FXML
    private CheckBox Spine;
    @FXML
    private CheckBox ShoulderRight;
    @FXML
    private CheckBox ElbowRight;
    @FXML
    private CheckBox ShoulderLeft;
    @FXML
    private CheckBox ElbowLeft;
    @FXML
    private CheckBox HipRight;
    @FXML
    private CheckBox KneeRight;
    @FXML
    private CheckBox HipLeft;
    @FXML
    private CheckBox KneeLeft;


    @FXML
    private Button PositionSelect;
    @FXML
    private Button VelSelect;
    @FXML
    private Button AccelSelect;
    @FXML
    private Button TorqueSelect;

    @FXML
    private LineChart JointChart;

    @FXML
    private CheckBox score70;
    @FXML
    private CheckBox score50;


    private DataHandler allData;
    @Override
    public void initialize(URL url, ResourceBundle rb){
        allData=new DataHandler();
    }
/*
    @FXML
    private void DLSelectAct(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();
        Taskindex=0;

        if(SelectedTask!=null){
            SelectedTask.setStyle(null);
        }
        SelectedTask=DLSelect;
        SelectedTask.setStyle("-fx-background-color: #D3D3D3");

        System.out.println("DL");
        UpdateChartData();
    }
    @FXML
    private void DragSelectAct(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();
        Taskindex=1;

        if(SelectedTask!=null){
            SelectedTask.setStyle(null);
        }
        SelectedTask=DragSelect;
        SelectedTask.setStyle("-fx-background-color: #D3D3D3");
        System.out.println("DragSelect");
        UpdateChartData();
    }
    @FXML
    private void HandReleaseSelectAct(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();
        Taskindex=2;

        if(SelectedTask!=null){
            SelectedTask.setStyle(null);;
        }
        SelectedTask=HandReleaseSelect;
        SelectedTask.setStyle("-fx-background-color: #D3D3D3");
        System.out.println("HandReleaseSelectAct");
        UpdateChartData();
    }
    @FXML
    private void KettleBellSelectAct(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();
        Taskindex=3;

        if(SelectedTask!=null){
            SelectedTask.setStyle(null);
        }
        SelectedTask=KettleBellSelect;
        SelectedTask.setStyle("-fx-background-color: #D3D3D3");
        System.out.println("KettleBellSelectAct");
        UpdateChartData();
    }
    @FXML
    private void SprintSelectAct(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();
        Taskindex=4;

        if(SelectedTask!=null){
            SelectedTask.setStyle(null);
        }
        SelectedTask=SprintSelect;
        SelectedTask.setStyle("-fx-background-color: #D3D3D3");
        System.out.println("SprintSelectAct");
        UpdateChartData();
    }
    @FXML
    private void JumpSelectAct(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();
        Taskindex=5;

        if(SelectedTask!=null){
            SelectedTask.setStyle(null);
        }
        SelectedTask=JumpSelect;
        SelectedTask.setStyle("-fx-background-color: #D3D3D3");
        System.out.println("JumpSelectAct");
        UpdateChartData();
    }
    @FXML
    private void HighCrawlSelectAct(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();
        Taskindex=6;

        if(SelectedTask!=null){
            SelectedTask.setStyle(null);
        }
        SelectedTask=HighCrawlSelect;
        SelectedTask.setStyle("-fx-background-color: #D3D3D3");
        System.out.println("HighCrawlSelectAct");
        UpdateChartData();
    }
    @FXML
    private void MarchSUSAct(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();
        Taskindex=7;

        if(SelectedTask!=null){
            SelectedTask.setStyle(null);
        }
        SelectedTask=MarchSUS;
        SelectedTask.setStyle("-fx-background-color: #D3D3D3");
        System.out.println("MarchSUSAct");
        UpdateChartData();
    }
    @FXML
    private void ProneFightingAct(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();
        Taskindex=8;

        if(SelectedTask!=null){
            SelectedTask.setStyle(null);
        }
        SelectedTask=ProneFightingSelect;
        SelectedTask.setStyle("-fx-background-color: #D3D3D3");
        System.out.println("ProneFightingAct");
        UpdateChartData();
    }
    @FXML
    private void ProneSusSelect(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();
        Taskindex=9;

        if(SelectedTask!=null){
            SelectedTask.setStyle(null);
        }
        SelectedTask=ProneSusSelect;
        SelectedTask.setStyle("-fx-background-color: #D3D3D3");
        System.out.println("ProneSusSelect");
        UpdateChartData();
    }
*/
    @FXML
    private void ParticapantChange(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();

        //1->5
       //Particapants[]={false,false,false,false,false};
        Particapants[0]=P1.isSelected();
        Particapants[1]=P2.isSelected();
        Particapants[2]=P3.isSelected();
        Particapants[3]=P4.isSelected();
        Particapants[4]=P5.isSelected();
        Particapants[5]=P6.isSelected();


       UpdateChartData();
    }
    @FXML
    private void JointChange(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();
//spine Sh-r E-r Sh-l E-l H-r kn-r H-l kn-l
        //private boolean Joints[]={false,false,false,false,false,false,false,false,false};

        Joints[0]=Spine.isSelected();
        Joints[1]=ShoulderRight.isSelected();
        Joints[2]=ElbowRight.isSelected();
        Joints[3]=ShoulderLeft.isSelected();
        Joints[4]=ElbowLeft.isSelected();
        Joints[5]=HipRight.isSelected();
        Joints[6]=KneeRight.isSelected();
        Joints[7]=HipLeft.isSelected();
        Joints[8]=KneeLeft.isSelected();


        UpdateChartData();
    }

    //todo
    @FXML
    private void TaskChange(ActionEvent event) {
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        event.consume();


        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus
        //10 42"window 11 50"wall 12 casDrag 13 casDrag vertical
        Task[0]=DLSelect.isSelected();
        Task[1]=DragSelect.isSelected();
        Task[2]=HandReleaseSelect.isSelected();
        Task[3]=KettleBellSelect.isSelected();
        Task[4]=SprintSelect.isSelected();
        Task[5]=JumpSelect.isSelected();
        Task[6]=HighCrawlSelect.isSelected();
        Task[7]=MarchSUS.isSelected();
        Task[8]=ProneFightingSelect.isSelected();
        Task[9]=ProneSusSelect.isSelected();
        Task[10]=Window42Select.isSelected();
        Task[11]=Wall50Select.isSelected();
        Task[12]=CasDragHandleSelect.isSelected();
        Task[13]=CasultyExtractVerticalSelect.isSelected();
        Task[14]=LegTuckSelect.isSelected();


        UpdateChartData();
    }

    @FXML
    private void PositionSelectAct(ActionEvent event) {
        //joint index type pos vel Accel torque
       // private int jtype=0;
        event.consume();
        jtype=0;

        if(SelectedJtype!=null){
            SelectedJtype.setStyle(null);
        }
        SelectedJtype=PositionSelect;
        SelectedJtype.setStyle("-fx-background-color: #D3D3D3");

        System.out.println("PositionSelectAct");
        UpdateChartData();
    }
    @FXML
    private void VelSelectAct(ActionEvent event) {
        //joint index type pos vel Accel torque
        // private int jtype=0;
        event.consume();
        jtype=1;

        if(SelectedJtype!=null){
            SelectedJtype.setStyle(null);
        }
        SelectedJtype=VelSelect;
        SelectedJtype.setStyle("-fx-background-color: #D3D3D3");


        System.out.println("VelSelectAct");
        UpdateChartData();
    }
    @FXML
    private void  AccelSelectAct(ActionEvent event) {
        //joint index type pos vel Accel torque
        // private int jtype=0;
        event.consume();
        jtype=2;

        if(SelectedJtype!=null){
            SelectedJtype.setStyle(null);
        }
        SelectedJtype=AccelSelect;
        SelectedJtype.setStyle("-fx-background-color: #D3D3D3");

        System.out.println("AccelSelectAct");
        UpdateChartData();
    }
    @FXML
    private void TorqueSelectAct(ActionEvent event) {
        //joint index type pos vel Accel torque
        // private int jtype=0;
        event.consume();
        jtype=3;

        if(SelectedJtype!=null){
            SelectedJtype.setStyle(null);
        }
        SelectedJtype=TorqueSelect;
        SelectedJtype.setStyle("-fx-background-color: #D3D3D3");


        System.out.println("TorqueSelectAct");
        UpdateChartData();
    }
    @FXML
    private void UpdateChartDataa(ActionEvent event) {
        //joint index type pos vel Accel torque
        // private int jtype=0;
        event.consume();
        UpdateChartData();
    }

    private void UpdateChartData(){
        var test = allData.GetDaata(Particapants,Joints,Task, jtype,score70.isSelected(),score50.isSelected());
        JointChart.getData().clear();

        //joint index type pos vel Accel torque
        //private int jtype=0;
        if(jtype==0){  JointChart.getYAxis().setLabel("Position Degrees");}
        else if(jtype==1){  JointChart.getYAxis().setLabel("Velocity Degrees/sec");}
        else if(jtype==2){  JointChart.getYAxis().setLabel("Acceleration Degrees/sec^2");}
        else if(jtype==3){  JointChart.getYAxis().setLabel("Torque N*M");}


        for (XYChart.Series series: GetSeriesfromData(test)) {

            JointChart.getData().add(series);
        }
        int x =1;
    }
    private ArrayList< XYChart.Series> GetSeriesfromData(ArrayList<Pair<String,ArrayList<Double>>> TimeLineDatA){
        ArrayList< XYChart.Series> ChartData= new ArrayList<>();

        for (Pair<String,ArrayList<Double>> jointData:TimeLineDatA) {
            XYChart.Series series = new XYChart.Series();
            series.setName(jointData.getKey());

            int index=0;
            for (Double Value:jointData.getValue()) {

                series.getData().add(new XYChart.Data(String.format("%.2f", index*.05), Value));
                index++;
            }
            ChartData.add(series);
        }
        return ChartData;

    }

}
