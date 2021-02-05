import javafx.util.Pair;
import org.apache.commons.collections4.KeyValue;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class DataHandler {

private ArrayList<ArrayList<XSSFWorkbook>> MasterDataSet;
//Highest is P second is Task third is joint
private ArrayList<ArrayList<ArrayList<Pair<String,ArrayList<Double>>>>> TimeLineData;

private ArrayList<ArrayList<ArrayList<Pair<String,ArrayList<Double>>>>> STimeLineData;

public DataHandler(){


        MasterDataSet = new ArrayList<>();
        TimeLineData  = new ArrayList<>();
        STimeLineData= new ArrayList<>();
        for (int i =0;i<5;i++){

        }


        init();
    }

    public ArrayList<Pair<String,ArrayList<Double>>> GetDaata(boolean[] particapants,boolean[] joints, boolean[] Task, int Joint,boolean pos, boolean neg){
        ArrayList<Pair<String,ArrayList<Double>>> DADATA= new ArrayList<>();

        int partindex=0;
        for (boolean partpass:particapants) {
            if(partpass){


                if(partindex==3||(partindex==3&&(Task[10]||Task[11]||Task[12]||Task[13]||Task[14]))) {
                    addparticapantInfoS(joints, Task, Joint, DADATA, pos, neg, partindex);
                }
                if((partindex==0||partindex==1||partindex==2||partindex==5)&&(Task[5]||Task[7]||Task[10]||Task[11]||Task[12]||Task[13]||Task[14])) {
                    addparticapantInfoSP(joints, Task, Joint, DADATA, pos, neg, partindex);
                }

                addparticapantInfo(joints,Task,Joint,TimeLineData.get(partindex),DADATA);
            }


            partindex++;
        }


        return DADATA;
    };
    private void addparticapantInfoS(boolean[] joints, boolean[] Task,int Join,ArrayList<Pair<String,ArrayList<Double>>> datatoaddto,boolean pos, boolean neg,int partindex ){

        //todo
        if(Task[0]&&(pos||neg)){

            if(pos){
                var data =this.STimeLineData.get(0).get(Join+4);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(neg){
                var data =this.STimeLineData.get(0).get(Join);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }

        }
         if(partindex==3){
            if(Task[10]){
                var data =this.STimeLineData.get(0).get(Join+8);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[11]){
                var data =this.STimeLineData.get(0).get(Join+12);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[12]){
                var data =this.STimeLineData.get(0).get(Join+16);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[13]){
                var data =this.STimeLineData.get(0).get(Join+20);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
             if(Task[14]){
                 var data =this.STimeLineData.get(0).get(Join+24);
                 int i=0;
                 for (boolean jointT: joints) {
                     if(jointT)
                     { datatoaddto.add(data.get(i));}
                     i++;
                 }
             }
        }


    }

    private void addparticapantInfoSP(boolean[] joints, boolean[] Task,int Join,ArrayList<Pair<String,ArrayList<Double>>> datatoaddto,boolean pos, boolean neg,int partindex ){


        if(partindex==0){
            if(Task[14]){
                var data =this.STimeLineData.get(0).get(Join+28);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }if(Task[5]){
                var data =this.STimeLineData.get(0).get(Join+40);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[7]){
                var data =this.STimeLineData.get(0).get(Join+44);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[10]){
                var data =this.STimeLineData.get(0).get(Join+48);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[11]){
                var data =this.STimeLineData.get(0).get(Join+52);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[12]){
                var data =this.STimeLineData.get(0).get(Join+56);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[13]){
                var data =this.STimeLineData.get(0).get(Join+60);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }

        }
        if(partindex==1){
            if(Task[14]){
                var data =this.STimeLineData.get(0).get(Join+32);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[10]){
                var data =this.STimeLineData.get(0).get(Join+64);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }if(Task[11]){
                var data =this.STimeLineData.get(0).get(Join+68);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }if(Task[12]){
                var data =this.STimeLineData.get(0).get(Join+72);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }if(Task[13]){
                var data =this.STimeLineData.get(0).get(Join+76);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }

        }
        if(partindex==2){
            if(Task[11]){
                var data =this.STimeLineData.get(0).get(Join+80);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[10]){
                var data =this.STimeLineData.get(0).get(Join+84);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }if(Task[12]){
                var data =this.STimeLineData.get(0).get(Join+88);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }if(Task[13]){
                var data =this.STimeLineData.get(0).get(Join+100);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }

        }
        if(partindex==5){
            if(Task[14]){
                var data =this.STimeLineData.get(0).get(Join+36);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[11]){
                var data =this.STimeLineData.get(0).get(Join+108);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[10]){
                var data =this.STimeLineData.get(0).get(Join+112);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[12]){
                var data =this.STimeLineData.get(0).get(Join+116);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }
            if(Task[13]){
                var data =this.STimeLineData.get(0).get(Join+120);
                int i=0;
                for (boolean jointT: joints) {
                    if(jointT)
                    { datatoaddto.add(data.get(i));}
                    i++;
                }
            }


        }




    }




    private void addparticapantInfo(boolean[] joints,  boolean[] Task, int Join,ArrayList<ArrayList<Pair<String,ArrayList<Double>>>> Particapent,ArrayList<Pair<String,ArrayList<Double>>> datatoaddto){

        for(int i = 0; i< Task.length;i++) {



            if (Task[i] && i * 4 < Particapent.size()) {
                int position = i * 4 + Join;
                var taskSubData = Particapent.get(position);

                int Jointindex = 0;
                for (boolean jointpass : joints) {
                    if (jointpass) {
                        datatoaddto.add(taskSubData.get(Jointindex));
                    }
                    Jointindex++;


                }


            }
        }
    }


    //Rip my life
    private void init(){
        String allDaStuffNAmes[]={
                "BookData\\P1\\ACFT\\P1DeadLiftData.xlsx",
                "BookData\\P1\\ACFT\\P1DragData.xlsx",
                "BookData\\P1\\ACFT\\P1HandReleasePushupData.xlsx",
                "BookData\\P1\\ACFT\\P1KettlebellCarryData.xlsx",
                "BookData\\P1\\ACFT\\P1SprintData.xlsx",
                "BookData\\P1\\ACST\\P1_18WallJumpData.xlsx",
                "BookData\\P1\\ACST\\P1HighCrawlData.xlsx",
                "BookData\\P1\\ACST\\P1MarchingSustainmentLoadData.xlsx",
                "BookData\\P1\\ACST\\P1ProneFightingLoadData.xlsx",
                "BookData\\P1\\ACST\\P1ProneSustainmentLoadData.xlsx",
                "BookData\\P2\\ACFT\\P2DeadliftData.xlsx",
                "BookData\\P2\\ACFT\\P2DragData.xlsx",
                "BookData\\P2\\ACFT\\P2HandReleasePushupData.xlsx",
                "BookData\\P2\\ACFT\\P2KettlebellCarryData.xlsx",
                "BookData\\P2\\ACFT\\P2SprintData.xlsx",
                "BookData\\P2\\ACST\\P2_18WallJumpData.xlsx",
                "BookData\\P2\\ACST\\P2HighCrawlData.xlsx",
                "BookData\\P2\\ACST\\P2MarchingSustainmentLoadData.xlsx",
                "BookData\\P2\\ACST\\P2ProneFightingLoadData.xlsx",
                "BookData\\P2\\ACST\\P2ProneSustainmentLoadData.xlsx",
                "BookData\\P3\\ACFT\\P3DeadliftData.xlsx",
                "BookData\\P3\\ACFT\\P3DragData.xlsx",
                "BookData\\P3\\ACFT\\P3HandReleasePushupData.xlsx",
                "BookData\\P3\\ACFT\\P3KettlebellCarryData.xlsx",
                "BookData\\P3\\ACFT\\P3SprintData.xlsx",
                "BookData\\P3\\ACST\\P3_18WallJumpData.xlsx",
                "BookData\\P3\\ACST\\P3HighCrawlData.xlsx",
                "BookData\\P3\\ACST\\P3MarchingSustainmentLoadData.xlsx",
                "BookData\\P3\\ACST\\P3ProneFightingLoadData.xlsx",
                "BookData\\P3\\ACST\\P3ProneSustainmentLoadData.xlsx",
                "BookData\\P4\\ACFT\\P4DeadliftData.xlsx",
                "BookData\\P4\\ACFT\\P4DragData.xlsx",
                "BookData\\P4\\ACFT\\P4HandReleasePushupData.xlsx",
                "BookData\\P4\\ACFT\\P4KettlebellCarryData.xlsx",
                "BookData\\P4\\ACFT\\P4SprintData.xlsx",
                "BookData\\P4\\ACST\\P4_18WallJumpData.xlsx",
                "BookData\\P4\\ACST\\P4HighCrawlData.xlsx",
                "BookData\\P4\\ACST\\P4MarchingSustainmentLoadData.xlsx",
                "BookData\\P4\\ACST\\P4ProneFightingLoadData.xlsx",
                "BookData\\P4\\ACST\\P4ProneSustainmentLoadData.xlsx",
                "BookData\\P5\\ACFT\\P5DeadliftData.xlsx",
                "BookData\\P5\\ACFT\\P5DragData.xlsx",
                "BookData\\P5\\ACFT\\P5HandReleasePushupData.xlsx",
                "BookData\\P5\\ACFT\\P5KettlebellCarryData.xlsx",
                "BookData\\P5\\ACFT\\P5SprintData.xlsx",
                "BookData\\P5\\ACST\\P5_18WallJumpData.xlsx",
                "BookData\\P5\\ACST\\P5HighCrawlData.xlsx",
                "BookData\\P5\\ACST\\P5MarchingSustainmentLoadData.xlsx",
                "BookData\\P5\\ACST\\P5ProneFightingLoadData.xlsx",
                "BookData\\P5\\ACST\\P5ProneSustainmentLoadData.xlsx",
                "BookData\\P6\\ACFT\\P6DeadliftData.xlsx",
                "BookData\\P6\\ACFT\\P6DragData.xlsx",
                "BookData\\P6\\ACFT\\P6HandReleasePushupData.xlsx",
                "BookData\\P6\\ACFT\\P6KettlebellCarryData.xlsx",
                "BookData\\P6\\ACFT\\P6SprintData.xlsx",
                "BookData\\P6\\ACST\\P6_18WallJumpData.xlsx",
                "BookData\\P6\\ACST\\P6HighCrawlData.xlsx",
                "BookData\\P6\\ACST\\P6MarchingSustainmentLoadData.xlsx",
                "BookData\\P6\\ACST\\P6ProneFightingLoadData.xlsx",
                "BookData\\P6\\ACST\\P6ProneSustainmentLoadData.xlsx"
        };

        int particapant=-1;
        int task=0;
        int i = 0;
        ArrayList<ArrayList<Pair<String,ArrayList<Double>>>> currentP=new ArrayList<>();
        for (String path: allDaStuffNAmes) {

            if(i%10==0){
                currentP= new ArrayList<>();
                TimeLineData.add(currentP);
                particapant++;
                task=0;

            }
            try {
                ReadFile(path,i,task,particapant,currentP);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            task++;
            i++;
        }





        String secondallDaStuffNAmes[]={
                "BookData\\test\\P4SegmentedDeadliftData-130-502.xlsx",
                "BookData\\test\\P4SegmentedDeadliftData-200-70.xlsx",
                "BookData\\P4\\ACST\\P4_42WindowSillData.xlsx",
                "BookData\\P4\\ACST\\P4_50WallData.xlsx",
                "BookData\\P4\\ACST\\P4CasualtyDrag180HorizantalData.xlsx",
                "BookData\\P4\\ACST\\P4CasualtyExtractionVertical180-HorizantalData.xlsx",
                "BookData\\P4\\ACFT\\P4LegTuckData.xlsx",
                "BookData\\P1\\ACFT\\P1LegTuckData.xlsx",
                "BookData\\P2\\ACFT\\P2LegTuckData.xlsx",
                "BookData\\P6\\ACFT\\P6LegtuckData.xlsx",
                "BookData\\P1\\ACST\\P1_18WallJumpData.xlsx",
               // "BookData\\P1\\ACST\\P1HighCrawlData.xlsx",
                "BookData\\P1\\ACST\\P1MarchingSustainmentLoadData.xlsx",
                //"BookData\\P1\\ACST\\P1ProneFightingLoadData.xlsx",
               // "BookData\\P1\\ACST\\P1ProneSustainmentLoadData.xlsx",
                "BookData\\P1\\ACST\\P1_42WindowSillData.xlsx",
                "BookData\\P1\\ACST\\P1_50WallData.xlsx",
                "BookData\\P1\\ACST\\P1CasualtyDrag180HorizantalData.xlsx",
                "BookData\\P1\\ACST\\P1CasualtyExtractionVertical180.xlsx",
                "BookData\\P2\\ACST\\P2_42WindowSillData.xlsx",
                "BookData\\P2\\ACST\\P2_50WallData.xlsx",
                "BookData\\P2\\ACST\\P2CasualtyDrag180HorizantalData.xlsx",
                "BookData\\P2\\ACST\\P2CasualtyExtractionVerticalData.xlsx",
                "BookData\\P3\\ACST\\P3-50WallSillData.xlsx",
                "BookData\\P3\\ACST\\P342WindowSillData.xlsx",
                "BookData\\P3\\ACST\\P3CasExtractData.xlsx",
                "BookData\\P3\\ACST\\P3CasExtractLeft.xlsx", /*92*/
                "BookData\\P3\\ACST\\P3CasExtractRight.xlsx",/*96*/
                "BookData\\P3\\ACST\\P3CasExtractVerticalData.xlsx",
                "BookData\\P3\\ACST\\P3MoveUnderWindowSillData.xlsx",/*104*/
                "BookData\\P6\\ACST\\P6_50WallData.xlsx",
                "BookData\\P6\\ACST\\P6_42WindowSillData.xlsx",
                "BookData\\P6\\ACST\\P6CasualtyDragData.xlsx",
                "BookData\\P6\\ACST\\P6CasualtyDragVerticalData.xlsx",





        };
        ArrayList<ArrayList<Pair<String,ArrayList<Double>>>> currentPP=new ArrayList<>();
        for (String path: secondallDaStuffNAmes) {

            if (path.contains("P4")){particapant=3;}
            if (path.contains("P1")){particapant=0;}
            if (path.contains("P2")){particapant=1;}
            if (path.contains("P3")){particapant=2;}
            if (path.contains("P6")){particapant=5;}

            if(i%10==0){
                currentP= new ArrayList<>();
                STimeLineData.add(currentPP);
                particapant++;
                task=0;

            }
            try {
                if(i==76){
                    var x =0;
                }
                ReadFile(path,i,0,particapant,currentPP);
            } catch (Exception e) {
                e.printStackTrace();
            }
            task++;
            i++;
        }


    }

    private void ReadFile(String ResourcePath, int index,int taskInd,int Partindex,ArrayList<ArrayList<Pair<String,ArrayList<Double>>>> cP) throws FileNotFoundException {
    // angle,vel,accel,torque
        int sheat[]={3,4,5,6};
        if(Partindex==0&&taskInd>4){
            // do nothing
        }
        else{
            try {
                File a = new File(getClass().getResource(ResourcePath).toURI());
                FileInputStream b = new FileInputStream(a);
                Workbook workbook = new XSSFWorkbook(b);
                var t =6;

                ArrayList<Pair<String,ArrayList<Double>>> Ctask= new ArrayList<>();
                //go through each relevant sheet
                for(int i=0; i<7 ;i++){

                    if(i==3||i==4||i==5) {
                        Ctask= new ArrayList<>();
                        cP.add(Ctask);
                        ProcessTask(workbook.getSheetAt(i), taskInd, Partindex,false, Ctask, ResourcePath);
                    }
                    else if(i==6){
                        Ctask= new ArrayList<>();
                        cP.add(Ctask);
                        ProcessTask(workbook.getSheetAt(i), taskInd, Partindex,true, Ctask, ResourcePath);
                    }
                }

            } catch (Exception e) {
                System.out.println(ResourcePath);
                e.printStackTrace();
            }

        }


    }

    private void ProcessTask(Sheet TaskSheet,int taskInd,int Partindex,boolean torque,ArrayList<Pair<String,ArrayList<Double>>> Ctask,String ResourcePath){
        //Spine1_2,Shoulder_Right_2,Elbow_Right_1,Shoulder_Left_2,Elbow_Left_1,Hip_Right_2,Knee_Right_1,Hip_Left_2,Knee_Left_1
        Integer LongNamesIndex[]={4,18,20,27,29,39,41,46,48};
        Integer TorqueNames[]={10,24,26,33,35,45,47,52,54};

        ArrayList<Integer> LNames=new ArrayList<>(Arrays.asList(LongNamesIndex));
        ArrayList<Integer> TNames=new ArrayList<>(Arrays.asList(TorqueNames));

        int rowNum=1;
        Iterator<Row> Rowiterator = TaskSheet.iterator();
        while (Rowiterator.hasNext()) {
            Row nextRow = Rowiterator.next();
            if(!torque&&LNames.contains(rowNum)){
                compileRow(nextRow,taskInd,Partindex,rowNum, Ctask,ResourcePath);
            }
            else if(torque&&TNames.contains(rowNum)){
                compileRow(nextRow,taskInd,Partindex,rowNum, Ctask,ResourcePath);
            }

            rowNum++;
        }

    }

    private void compileRow(Row cRow,int taskInd,int Partindex,int jointdex, ArrayList<Pair<String,ArrayList<Double>>> Ctask, String pathName){
        Integer LongNamesIndex[]={4,18,20,27,29,39,41,46,48};
        Integer TorqueNames[]={10,24,26,33,35,45,47,52,54};
        //0DL 1Drag 2HandR 3KB 4sprint 5jump 6highCrawl 7MarchSUS 8ProneFighting 9ProneSus












        String jointName="";
        if(jointdex==4||jointdex==10){
            jointName="P"+(Partindex+1)+"-SpineLow_Ext_Flex";
        }
        else if(jointdex==18||jointdex==24){
            jointName="P"+(Partindex+1)+"-R-Shoulder_Ext_Forward_Flex";
        }
        else if(jointdex==20||jointdex==26){
            jointName="P"+(Partindex+1)+"-R_Elbow_Flex_Ext";
        }
        else if(jointdex==27||jointdex==33){
            jointName="P"+(Partindex+1)+"-L_Shoulder_Ext_Forward_Flex";
        }
        else if(jointdex==29||jointdex==35){
            jointName="P"+(Partindex+1)+"-L_Elbow_Flex_Ext";
        }
        else if(jointdex==39||jointdex==45){
            jointName="P"+(Partindex+1)+"-R_Hip_Flex_Ext";
        }
        else if(jointdex==41||jointdex==47){
            jointName="P"+(Partindex+1)+"-R-Knee_Ext_Flex";
        }
        else if(jointdex==46||jointdex==52){
            jointName="P"+(Partindex+1)+"-L_Hip_Flex_Ext";
        }
        else if(jointdex==48||jointdex==54){
            jointName="P"+(Partindex+1)+"-L_Knee_Ext_Flex";
        }



        Iterator<Cell> cellIterator = cRow.cellIterator();

        ArrayList<Double> TimeLine= new ArrayList<>();

        boolean clipped=false;
        if(Partindex==3){
            clipped=true;
        }



        if(clipped){
            float start= getStart(pathName);
            float end= getEnd(pathName);

            int tick=0;

            while (cellIterator.hasNext()) {

                Cell cell = cellIterator.next();
                switch (cell.getCellType()) {
                    case STRING:
                        break;
                    case NUMERIC:
                        if(tick*.05f>start && tick*.05f<end)
                        {
                            TimeLine.add(cell.getNumericCellValue());
                        }
                        break;
                }
                tick++;
            }

        }
        else
        {
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();

                switch (cell.getCellType()) {
                    case STRING:
                        break;
                    case NUMERIC:

                        TimeLine.add(cell.getNumericCellValue());
                        break;
                }
            }
        }



        Pair<String,ArrayList<Double>> JointInfo = new Pair<>(jointName,TimeLine);
        Ctask.add(JointInfo);

        //Highest is P second is Task third is joint
        //private ArrayList<ArrayList<ArrayList<Pair<String,ArrayList<Double>>>>> TimeLineData;

    }



    private void ProcessTask2(Sheet TaskSheet,int taskInd,int Partindex,boolean torque,ArrayList<Pair<String,ArrayList<Double>>> Ctask,String name){





        //Spine1_2,Shoulder_Right_2,Elbow_Right_1,Shoulder_Left_2,Elbow_Left_1,Hip_Right_2,Knee_Right_1,Hip_Left_2,Knee_Left_1
        Integer LongNamesIndex[]={4,18,20,27,29,39,41,46,48};
        Integer TorqueNames[]={10,24,26,33,35,45,47,52,54};

        ArrayList<Integer> LNames=new ArrayList<>(Arrays.asList(LongNamesIndex));
        ArrayList<Integer> TNames=new ArrayList<>(Arrays.asList(TorqueNames));

        int rowNum=1;
        Iterator<Row> Rowiterator = TaskSheet.iterator();
        while (Rowiterator.hasNext()) {
            Row nextRow = Rowiterator.next();
            if(!torque&&LNames.contains(rowNum)){
                compileRow(nextRow,taskInd,Partindex,rowNum, Ctask,name);
            }
            else if(torque&&TNames.contains(rowNum)){
                compileRow(nextRow,taskInd,Partindex,rowNum, Ctask,name);
            }

            rowNum++;
        }

    }

    private float getStart(String fileName)
    {

        if(fileName.contains("DeadliftData"))
        {
            return 5.6f;
        }
        if(fileName.contains("DragData"))
        {
            return 3.1f;
        }
        if(fileName.contains("HandReleasePushup"))
        {
            return 3.1f;
        }
        if(fileName.contains("Kettlebell"))
        {
            return 3.8f;
        }
        if(fileName.contains("Sprint"))
        {
            return 3.0f;
        }
        if(fileName.contains("WallJump"))
        {
            return 1.7f;
        }
        if(fileName.contains("HighCrawl"))
        {
            return 2.6f;
        }
        if(fileName.contains("MarchingSustainment"))
        {
            return 1.8f;
        }
        if(fileName.contains("ProneFighting"))
        {
            return 1.7f;
        }
        if(fileName.contains("ProneSustainment"))
        {
            return 6.4f;
        }
        if(fileName.contains("42WindowSill"))
        {
            return 2.7f;
        }
        if(fileName.contains("50Wall"))
        {
            return 2.7f;
        }
        if(fileName.contains("CasualtyDrag"))
        {
            return 5.1f;
        }
        if(fileName.contains("CasualtyExtractionVertical"))
        {
            return 4f;
        }
        if(fileName.contains("LegTuck"))
        {
            return 4.0f;
        }

        return -1f;
    }
    private float getEnd(String fileName)
    {
        if(fileName.contains("DeadliftData"))
        {
            return 22.7f;
        }
        if(fileName.contains("DragData"))
        {
            return 6.0f;
        }
        if(fileName.contains("HandReleasePushup"))
        {
            return 19.6f;
        }
        if(fileName.contains("Kettlebell"))
        {
            return 6.4f;
        }
        if(fileName.contains("Sprint"))
        {
            return 4.5f;
        }
        if(fileName.contains("WallJump"))
        {
            return 4.5f;
        }
        if(fileName.contains("HighCrawl"))
        {
            return 14.3f;
        }
        if(fileName.contains("MarchingSustainment"))
        {
            return 6.1f;
        }
        if(fileName.contains("ProneFighting"))
        {
            return 11.5f;
        }
        if(fileName.contains("ProneSustainment"))
        {
            return 16.5f;
        }
        if(fileName.contains("42WindowSill"))
        {
            return 8.4f;
        }
        if(fileName.contains("50Wall"))
        {
            return 6.2f;
        }
        if(fileName.contains("CasualtyDrag"))
        {
            return 11.3f;
        }
        if(fileName.contains("CasualtyExtractionVertical"))
        {
            return 12.6f;
        }
        if(fileName.contains("LegTuck"))
        {
            return 17.4f;
        }
        return -1;
    }


}
